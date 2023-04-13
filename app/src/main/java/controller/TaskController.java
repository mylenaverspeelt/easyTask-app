package controller;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Task;
import util.ConnectionFactory;

public class TaskController {

//salva uma nova tarefa no projeto, tem que passar todos os parametros pro statement e em questão de data, converter pro padrão do sql 
    public void save(Task task) {
        String sql = "INSERT INTO tasks(idProject, name, description, completed, notes, deadline, createdAt, updatedAt) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        Connection connection = null;
        PreparedStatement statement = null;

        try {
            connection = ConnectionFactory.getConnection();
            statement = connection.prepareStatement(sql);
            statement.setInt(1, task.getIdProject());
            statement.setString(2, task.getName());
            statement.setString(3, task.getDescription());
            statement.setBoolean(4, task.isCompleted());
            statement.setString(5, task.getNotes());
            statement.setDate(6, new Date(task.getDeadline().getTime()));
            statement.setDate(7, new Date(task.getCreatedAt().getTime()));
            statement.setDate(8, new Date(task.getUpdatedAt().getTime()));
            statement.execute();
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao salvar a tarefa: " + e.getMessage(), e);
        } finally {
            ConnectionFactory.closeConnection(connection, statement);
        }
    }

//                  
//
    public void update(Task task) {

        String sql = "UPDATE tasks SET idProject = ?, name = ?, description = ? , completed = ?, notes = ?, deadline = ?,  createdAt = ?, updatedAt = ? WHERE id = ?";
        Connection connection = null;
        PreparedStatement statement = null;

        try {
            connection = ConnectionFactory.getConnection();
            statement = connection.prepareStatement(sql);
            statement.setInt(1, task.getIdProject());
            statement.setString(2, task.getName());
            statement.setString(3, task.getDescription());
            statement.setBoolean(4, task.isCompleted());
            statement.setString(5, task.getNotes());
            statement.setDate(6, new java.sql.Date(task.getDeadline().getTime()));
            statement.setDate(7, new java.sql.Date(task.getCreatedAt().getTime()));
            statement.setDate(8, new java.sql.Date(task.getUpdatedAt().getTime()));
            statement.setInt(9, task.getId());
            statement.execute();
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao atualizar a tarefa: " + e.getMessage(), e);
        } finally {
            ConnectionFactory.closeConnection(connection, statement);
        }

    }

//faz uma conexao com o banco, passa o statement substituindo o ? pelo id do parametro, executa, se der erro trata ele e depois fecha a conexão.
    public void removeById(int taskId) throws SQLException {
        String sql = "DELETE FROM tasks WHERE id = ?";
        Connection connection = null;
        PreparedStatement statement = null;
        try {
            connection = ConnectionFactory.getConnection();
            statement = connection.prepareStatement(sql);
            statement.setInt(1, taskId);
            statement.execute();
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao deletar a tarefa: " + e.getMessage(), e);
        } finally {
            ConnectionFactory.closeConnection(connection, statement);
        }

    }

//busca todas as tarefas de determinado projeto pelo id dele. no caso é um select na tabela, dai tudo que retornar desse select fica no resultSet. tambem criouma lista pra ser exibida quando o getAll for chamado. nesse while é como se fosse copiando linha a linha da tabela e setando no objeto task pra botar eles nalista, tipo uma lista copia da tabela.
    public List<Task> getAll(int idProject) {

        String sql = "SELECT * FROM tasks";
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        List<Task> tasks = new ArrayList<>();

        try {
            connection = ConnectionFactory.getConnection();
            statement = connection.prepareStatement(sql);
            resultSet = statement.executeQuery();

            while (resultSet.next()) {     //enquanto ouver outro registro na tabela
                Task task = new Task();
                task.setId(resultSet.getInt("id"));
                task.setIdProject(resultSet.getInt("idProject"));
                task.setName(resultSet.getString("name"));
                task.setDescription(resultSet.getString("description"));
                task.setIsCompleted(resultSet.getBoolean("completed"));
                task.setNotes(resultSet.getString("notes"));
                task.setDeadline(resultSet.getDate("deadline"));
                task.setCreatedAt(resultSet.getDate("createdAt"));
                task.setUpdatedAt(resultSet.getDate("updatedAt"));

                tasks.add(task);
            }

        } catch (SQLException e) {
            throw new RuntimeException("Erro ao mostrar as tarefas: " + e.getMessage(), e);
        } finally {
            ConnectionFactory.closeConnection(connection, statement, resultSet);
        }

        return tasks;
    }
}
