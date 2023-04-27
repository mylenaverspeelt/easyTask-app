package util;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.Task;

//CLASSE PRA DEFINIR A TABELA DE TAREFAS QUE VAO SER EXIBIDAS
public class TaskTableModel extends AbstractTableModel {

    String[] columns = {"Name", "Description", "Deadline", "Completed", "Edit", "Delete"};
    List<Task> tasks = new ArrayList();

// retorna o tanto de tarefas que tiver na lista, que serão as linhas da tabela
    @Override
    public int getRowCount() {
        return tasks.size();
    }

// retorna o tanto de colunas, que serão as propriedades de cada task
    @Override
    public int getColumnCount() {
        return columns.length;
    }

//metodo pra aparecer os nomes das colunas
    @Override
    public String getColumnName(int columnIndex) {
        return columns[columnIndex];
    }

//metodo pra tornar editavel apenas a coluna 3 que é a do completed
    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return columnIndex == 3;
    }

//retorna qual a classe do dado que ta em determinada coluna e retorna o tipo de dado que ele é. Se a lista tiver vazia retorna um objeto, senao retorna o tipo de dado daquela celula especifica, se é booleano, string, etc...
    @Override
    public Class<?> getColumnClass(int columnIndex) {
        if (tasks.isEmpty()) {
            return Object.class;
        }
        return this.getValueAt(0, columnIndex).getClass();
    }


// ao clicar no check do completed de determinada linha e coluna, seta o valor do booleano 
    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        tasks.get(rowIndex).setIsCompleted((boolean) aValue);
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
                SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
                return dateFormat.format(tasks.get(rowIndex).getDeadline());
            case 3:
                return tasks.get(rowIndex).isCompleted();
            case 4:
                return "";
            case 5:
                return "";
            default:
                return "Not found";
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