package util;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.Task;

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

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 1:
                return tasks.get(rowIndex).getName();
            case 2:
                return tasks.get(rowIndex).getDescription();
            case 3:
                return tasks.get(rowIndex).getDeadline();
            case 4:
                return tasks.get(rowIndex).isIsCompleted();
            case 5:
                return "";
            case 6:
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
