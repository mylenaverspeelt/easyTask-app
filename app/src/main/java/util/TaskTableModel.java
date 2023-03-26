package util;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.Task;

//CLASSE PRA DEFINIR A TABELA DE TAREFAS QUE VAO SER EXIBIDAS
//ESSA CLASSE É FILHA DESSA DEFAULT, DAI JÁ VEM OS 3 PRIMEIROS METODOS OBRIGATORIOS.
public class TaskTableModel extends AbstractTableModel {

    String[] columns = {"Name", "Description", "Deadline", "Completed", "Edit", "Delete"};
    List<Task> tasks = new ArrayList();

// retorna o tanto de tarefas que tiver na lista, que serão as linhas da tabela
    @Override
    public int getRowCount() {
        return tasks.size();
    }

// retorna as colunas 
    @Override
    public int getColumnCount() {
        return columns.length;
    }

//metodo pra aparecer os nomes das colunas
    @Override
    public String getColumnName(int columnIndex) {
    return columns[columnIndex];
    }

//metodo pra pegar as informações de cada item da linha
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return tasks.get(rowIndex).getName();
            case 1:
                return tasks.get(rowIndex).getDescription();
            case 2:
                return tasks.get(rowIndex).getDeadline();
            case 3:
                return tasks.get(rowIndex).isIsCompleted();
            case 4:
                return "";
            case 5:
                return "";
            default:
                return "Dado não encontrado";
        }
    }

    public String[] getColumns() {
        return columns;
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
    }

}
