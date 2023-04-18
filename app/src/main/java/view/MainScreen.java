package view;

//classe mainscreen que extende do componente javaswing, tem o metodo construtor, tem o metodo de quando é clicado no icone de novo projeto, tem o metodo de quando é clicado numa nova tarefa, tem o médoto para estilizar coisas que não dão pra ser estilizadas na interface gráfica.
//no metodo construtor coloca todos os metodos que devem rodar ao inicializar o componente.
//pra carregar as info do bd pra um componente javaswing, ai utiliza um objeto model que já vem default do java.
import controller.ProjectController;
import controller.TaskController;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.List;
import javax.swing.DefaultListModel;
import model.Project;
import model.Task;
import util.TaskTableModel;

public class MainScreen extends javax.swing.JFrame {

//cria todas as variaveis de controller, de projetos, tarefas e o model da tabela de tarefas e a lista de projetos.
    ProjectController projectController;
    TaskController taskController;
    DefaultListModel projectsModel;
    TaskTableModel taskModel;

//metodo construtor
    public MainScreen() {
        initComponents();
        decorateTableTask();
        initDataController();
        initComponentsModel();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tasksScrollPane = new javax.swing.JScrollPane();
        jTableTasks = new javax.swing.JTable();
        headerPanel = new javax.swing.JPanel();
        headerTitle = new javax.swing.JLabel();
        headerSubtitle = new javax.swing.JLabel();
        projects = new javax.swing.JPanel();
        projectsLabel = new javax.swing.JLabel();
        projectsIcon = new javax.swing.JLabel();
        tasks = new javax.swing.JPanel();
        tasksLabel = new javax.swing.JLabel();
        tasksIcon = new javax.swing.JLabel();
        sidebarPanel = new javax.swing.JPanel();
        projectsScrollPanel = new javax.swing.JScrollPane();
        projectsList = new javax.swing.JList<>();
        mainPanel = new javax.swing.JPanel();
        emptyTasksList = new javax.swing.JPanel();
        noTasksIcon = new javax.swing.JLabel();
        noTasksTitle = new javax.swing.JLabel();
        noTasksSubtitle = new javax.swing.JLabel();

        jTableTasks.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTableTasks.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Name", "Description", "Deadline", "Completed"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableTasks.setGridColor(new java.awt.Color(204, 204, 204));
        jTableTasks.setRowHeight(50);
        jTableTasks.setSelectionBackground(new java.awt.Color(204, 255, 204));
        jTableTasks.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTableTasks.setShowHorizontalLines(true);
        jTableTasks.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableTasksMouseClicked(evt);
            }
        });
        tasksScrollPane.setViewportView(jTableTasks);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(700, 600));

        headerPanel.setBackground(new java.awt.Color(0, 153, 102));

        headerTitle.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        headerTitle.setForeground(new java.awt.Color(255, 255, 255));
        headerTitle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tick.png"))); // NOI18N
        headerTitle.setText(" Easy Task");

        headerSubtitle.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        headerSubtitle.setForeground(new java.awt.Color(255, 255, 255));
        headerSubtitle.setText("It has never been easier to accomplish a task!");

        javax.swing.GroupLayout headerPanelLayout = new javax.swing.GroupLayout(headerPanel);
        headerPanel.setLayout(headerPanelLayout);
        headerPanelLayout.setHorizontalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerPanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(headerSubtitle, javax.swing.GroupLayout.DEFAULT_SIZE, 656, Short.MAX_VALUE)
                    .addComponent(headerTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(51, 51, 51))
        );
        headerPanelLayout.setVerticalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerPanelLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(headerTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(headerSubtitle)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        projects.setBackground(new java.awt.Color(255, 255, 255));
        projects.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        projectsLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        projectsLabel.setForeground(new java.awt.Color(0, 153, 102));
        projectsLabel.setText("Projects");

        projectsIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/add.png"))); // NOI18N
        projectsIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                projectsIconMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout projectsLayout = new javax.swing.GroupLayout(projects);
        projects.setLayout(projectsLayout);
        projectsLayout.setHorizontalGroup(
            projectsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(projectsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(projectsLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(projectsIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        projectsLayout.setVerticalGroup(
            projectsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(projectsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(projectsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(projectsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(projectsIcon))
                .addContainerGap(10, Short.MAX_VALUE))
        );

        tasks.setBackground(java.awt.Color.white);
        tasks.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tasksLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tasksLabel.setForeground(new java.awt.Color(0, 153, 102));
        tasksLabel.setText("Tasks");

        tasksIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/add.png"))); // NOI18N
        tasksIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tasksIconMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout tasksLayout = new javax.swing.GroupLayout(tasks);
        tasks.setLayout(tasksLayout);
        tasksLayout.setHorizontalGroup(
            tasksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tasksLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tasksLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tasksIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        tasksLayout.setVerticalGroup(
            tasksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tasksLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(tasksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tasksIcon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tasksLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(23, 23, 23))
        );

        sidebarPanel.setBackground(java.awt.Color.white);
        sidebarPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        projectsList.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        projectsList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { " " };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        projectsList.setFixedCellHeight(40);
        projectsList.setSelectionBackground(new java.awt.Color(0, 153, 102));
        projectsList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                projectsListMouseClicked(evt);
            }
        });
        projectsScrollPanel.setViewportView(projectsList);

        javax.swing.GroupLayout sidebarPanelLayout = new javax.swing.GroupLayout(sidebarPanel);
        sidebarPanel.setLayout(sidebarPanelLayout);
        sidebarPanelLayout.setHorizontalGroup(
            sidebarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sidebarPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(projectsScrollPanel)
                .addContainerGap())
        );
        sidebarPanelLayout.setVerticalGroup(
            sidebarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidebarPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(projectsScrollPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 476, Short.MAX_VALUE)
                .addContainerGap())
        );

        mainPanel.setBackground(java.awt.Color.white);
        mainPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        emptyTasksList.setBackground(new java.awt.Color(255, 255, 255));

        noTasksIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        noTasksIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lists.png"))); // NOI18N

        noTasksTitle.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        noTasksTitle.setForeground(new java.awt.Color(0, 153, 102));
        noTasksTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        noTasksTitle.setText("There are no tasks yet :)");

        noTasksSubtitle.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        noTasksSubtitle.setForeground(new java.awt.Color(153, 153, 153));
        noTasksSubtitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        noTasksSubtitle.setText("click button \"+\" to add a new task");

        javax.swing.GroupLayout emptyTasksListLayout = new javax.swing.GroupLayout(emptyTasksList);
        emptyTasksList.setLayout(emptyTasksListLayout);
        emptyTasksListLayout.setHorizontalGroup(
            emptyTasksListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, emptyTasksListLayout.createSequentialGroup()
                .addGroup(emptyTasksListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(noTasksSubtitle, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 533, Short.MAX_VALUE)
                    .addComponent(noTasksTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(noTasksIcon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        emptyTasksListLayout.setVerticalGroup(
            emptyTasksListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, emptyTasksListLayout.createSequentialGroup()
                .addContainerGap(98, Short.MAX_VALUE)
                .addComponent(noTasksIcon, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(noTasksTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(noTasksSubtitle)
                .addGap(100, 100, 100))
        );

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(emptyTasksList, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(mainPanelLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(emptyTasksList, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(headerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(projects, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(sidebarPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tasks, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(headerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(projects, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tasks, javax.swing.GroupLayout.PREFERRED_SIZE, 52, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sidebarPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

//EVENTO DE CLICK QUANDO É CLICADO NO ICONE DE NOVO PROJETO, QUE ABRE A TELA DE CADASTRO DE PROJETOS. AO FECHAR A JANELA A LISTA DE PROJETOS É ATUALIZADA
    private void projectsIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_projectsIconMouseClicked
        ProjectDialogScreen projectDialogScreen = new ProjectDialogScreen(this, rootPaneCheckingEnabled);
        projectDialogScreen.setVisible(true);

//esse listener é pra atualizar a lista de projetos assim que a janela for fechada
        projectDialogScreen.addWindowListener(new WindowAdapter() {

            public void windowClosed(WindowEvent e) {
                loadProjects();
            }
        });

    }//GEN-LAST:event_projectsIconMouseClicked

//além de abrir a tela, tambem seta qual o projeto referente aquela tarefa
    private void tasksIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tasksIconMouseClicked

        TaskDialogScreen taskDialogScreen = new TaskDialogScreen(this, rootPaneCheckingEnabled);
//        taskDialogScreen.setProject(null);
        taskDialogScreen.setVisible(true);

    }//GEN-LAST:event_tasksIconMouseClicked

// quando há um click nessa tabela esse metodo verifica em que ponto da tela foi o evento de click. caso tenha sido na coluna 3, ele localiza em qual linha foi o evento e seta pro controller salvar no bd. 
    private void jTableTasksMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableTasksMouseClicked
        int rowIndex = jTableTasks.rowAtPoint(evt.getPoint());
        int columnIndex = jTableTasks.columnAtPoint(evt.getPoint());

        switch (columnIndex) {
            case 3:
                Task task = taskModel.getTasks().get(rowIndex);
                taskController.update(task);
                break;
            default:
                throw new AssertionError();
        }


    }//GEN-LAST:event_jTableTasksMouseClicked

//metodo pra quando um projeto for clicado, exibir se ele tem tarefas ou nao
    private void projectsListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_projectsListMouseClicked

        int projectIndex = projectsList.getSelectedIndex();
        Project project = (Project) projectsModel.get(projectIndex);
        loadTasks(project.getId());

    }//GEN-LAST:event_projectsListMouseClicked

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Java swing".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel emptyTasksList;
    private javax.swing.JPanel headerPanel;
    private javax.swing.JLabel headerSubtitle;
    private javax.swing.JLabel headerTitle;
    private javax.swing.JTable jTableTasks;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JLabel noTasksIcon;
    private javax.swing.JLabel noTasksSubtitle;
    private javax.swing.JLabel noTasksTitle;
    private javax.swing.JPanel projects;
    private javax.swing.JLabel projectsIcon;
    private javax.swing.JLabel projectsLabel;
    private javax.swing.JList<String> projectsList;
    private javax.swing.JScrollPane projectsScrollPanel;
    private javax.swing.JPanel sidebarPanel;
    private javax.swing.JPanel tasks;
    private javax.swing.JLabel tasksIcon;
    private javax.swing.JLabel tasksLabel;
    private javax.swing.JScrollPane tasksScrollPane;
    // End of variables declaration//GEN-END:variables

//costumizando os nomes das colunas da tabela e colocou a opção de possibilitar ordenar os itens
    public void decorateTableTask() {
        jTableTasks.getTableHeader().setFont(new Font("Segoi UI", Font.BOLD, 14));
        jTableTasks.getTableHeader().setBackground(new Color(0, 153, 102));
        jTableTasks.getTableHeader().setForeground(new Color(255, 255, 255));

        jTableTasks.setAutoCreateRowSorter(true);
    }

//MÉTODO PRA INICIALIZAR OS OBJETOS LOCAIS MODELO DE PROJETO E TAREFA
    public void initDataController() {
        projectController = new ProjectController();
        taskController = new TaskController();
    }

//METODO QUE CRIA/INICIA A ESTRUTURA QUE GUARDA ESSES PROJETOS LOCALMENTE, QUE É ESSA LISTA DEFAULT E A TABLE MODEL
// DEPOIS DE CRIADA, ELA CHAMA A FUNÇÃO QUE VAI POPULAR ESSA LISTA LOCAL
    public void initComponentsModel() {
        projectsModel = new DefaultListModel();
        loadProjects();

        taskModel = new TaskTableModel();
        jTableTasks.setModel(taskModel);

        if (!projectsModel.isEmpty()) {
            projectsList.setSelectedIndex(0);
            int projectIndex = projectsList.getSelectedIndex();
            Project project = (Project) projectsModel.get(projectIndex);
            loadTasks(project.getId());
        }
    }

//PEGA TODAS AS TAREFAS DO BD REFERENTES AO ID DO PROJETO QUE ELAS PERTENCEM E POPULA A LISTA LOCALMENTE
    public void loadTasks(int idProject) {

        List<Task> tasks = taskController.getFindTaskByIdproject(idProject);
        taskModel.setTasks(tasks);

        showTableTasks(!tasks.isEmpty());
    }

//MÉTODO QUE PEGA OS PROJETOS DO BD E POPULA A LISTA CRIADA LOCALMENTE (que depois vai ser renderizada pro usuario)
    public void loadProjects() {
        List<Project> projects = projectController.getAll();
        projectsModel.clear();

        for (int i = 0; i < projects.size(); i++) {
            Project project = projects.get(i);
            projectsModel.addElement(project);
        }
        projectsList.setModel(projectsModel);
    }

//metodo que decide qual tela vai ser exibida no panel "main", se a tela vazia ou tela com as tarefas 
    private void showTableTasks(boolean hasTasks) {
//se o componente de lista vazia estiver visivel, remove essa visibilidade dele e remove o componente de emptylist do main
//adiciona o componente de scrollpane que dentro tem a lista de tarefas, deixa visivel e redimensiona de acordo com o tamanho da tela
//faz o contrario, removendo a lista de tarefas e adicionando a tela de lista vazia
        if (hasTasks) {
            if (emptyTasksList.isVisible()) {
                emptyTasksList.setVisible(false);
                mainPanel.remove(emptyTasksList);
            }
            mainPanel.add(tasksScrollPane);
            tasksScrollPane.setVisible(true);
            tasksScrollPane.setSize(mainPanel.getWidth(), mainPanel.getHeight());
        } else {
            if (tasksScrollPane.isVisible()) {
                tasksScrollPane.setVisible(false);
                mainPanel.remove(tasksScrollPane);
            }
            mainPanel.add(emptyTasksList);
            emptyTasksList.setVisible(true);
            emptyTasksList.setSize(mainPanel.getWidth(), mainPanel.getHeight());
        }

    }

}
