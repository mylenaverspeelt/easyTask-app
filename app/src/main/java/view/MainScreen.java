package view;

//classe mainscreen que extende do componente javaswing, tem o metodo construtor, tem o metodo de quando é clicado no icone de novo projeto, tem o metodo de quando é clicado numa nova tarefa, tem o médoto para estilizar coisas que não dão pra ser estilizadas na interface gráfica.
//no metodo construtor coloca todos os metodos que devem rodar ao inicializar o componente.
//pra carregar as info do bd pra um componente javaswing, ai utiliza um objeto model que já vem default do java.
import controller.ProjectController;
import controller.TaskController;
import java.awt.Color;
import java.awt.Font;
import java.util.List;
import javax.swing.DefaultListModel;
import model.Project;

public class MainScreen extends javax.swing.JFrame {

    ProjectController projectController;
    TaskController taskController;
    DefaultListModel projectModel;

    public MainScreen() {
        initComponents();
        decorateTableTask();
        initDataController();
        initComponentsModel();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        noTasksScreen = new javax.swing.JPanel();
        noTasksIcon = new javax.swing.JLabel();
        noTasksTitle = new javax.swing.JLabel();
        noTasksSubtitle = new javax.swing.JLabel();
        header = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        subtitle = new javax.swing.JLabel();
        projects = new javax.swing.JPanel();
        projectsLabel = new javax.swing.JLabel();
        projectsIcon = new javax.swing.JLabel();
        tasks = new javax.swing.JPanel();
        tasksLabel = new javax.swing.JLabel();
        tasksIcon = new javax.swing.JLabel();
        sidebar = new javax.swing.JPanel();
        scrollpanel = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        main = new javax.swing.JPanel();
        tasksDescription = new javax.swing.JScrollPane();
        tasksDescriptionTable = new javax.swing.JTable();

        noTasksScreen.setBackground(new java.awt.Color(255, 255, 255));

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

        javax.swing.GroupLayout noTasksScreenLayout = new javax.swing.GroupLayout(noTasksScreen);
        noTasksScreen.setLayout(noTasksScreenLayout);
        noTasksScreenLayout.setHorizontalGroup(
            noTasksScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, noTasksScreenLayout.createSequentialGroup()
                .addGroup(noTasksScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(noTasksSubtitle, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 423, Short.MAX_VALUE)
                    .addComponent(noTasksTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(noTasksIcon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        noTasksScreenLayout.setVerticalGroup(
            noTasksScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, noTasksScreenLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(noTasksIcon)
                .addGap(18, 18, 18)
                .addComponent(noTasksTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(noTasksSubtitle)
                .addGap(100, 100, 100))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(700, 600));

        header.setBackground(new java.awt.Color(0, 153, 102));

        title.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        title.setForeground(new java.awt.Color(255, 255, 255));
        title.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tick.png"))); // NOI18N
        title.setText(" Easy Task");

        subtitle.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        subtitle.setForeground(new java.awt.Color(255, 255, 255));
        subtitle.setText("It has never been easier to accomplish a task!");

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(subtitle, javax.swing.GroupLayout.DEFAULT_SIZE, 656, Short.MAX_VALUE)
                    .addComponent(title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(51, 51, 51))
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(title)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(subtitle)
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
                .addComponent(tasksIcon)
                .addGap(23, 23, 23))
            .addGroup(tasksLayout.createSequentialGroup()
                .addComponent(tasksLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        sidebar.setBackground(java.awt.Color.white);
        sidebar.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jList1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { " " };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jList1.setFixedCellHeight(40);
        jList1.setSelectionBackground(new java.awt.Color(0, 153, 102));
        scrollpanel.setViewportView(jList1);

        javax.swing.GroupLayout sidebarLayout = new javax.swing.GroupLayout(sidebar);
        sidebar.setLayout(sidebarLayout);
        sidebarLayout.setHorizontalGroup(
            sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sidebarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrollpanel)
                .addContainerGap())
        );
        sidebarLayout.setVerticalGroup(
            sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidebarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrollpanel, javax.swing.GroupLayout.DEFAULT_SIZE, 476, Short.MAX_VALUE)
                .addContainerGap())
        );

        main.setBackground(java.awt.Color.white);
        main.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tasksDescriptionTable.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tasksDescriptionTable.setModel(new javax.swing.table.DefaultTableModel(
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
        tasksDescriptionTable.setGridColor(new java.awt.Color(204, 204, 204));
        tasksDescriptionTable.setRowHeight(50);
        tasksDescriptionTable.setSelectionBackground(new java.awt.Color(204, 255, 204));
        tasksDescriptionTable.setShowHorizontalLines(true);
        tasksDescription.setViewportView(tasksDescriptionTable);

        javax.swing.GroupLayout mainLayout = new javax.swing.GroupLayout(main);
        main.setLayout(mainLayout);
        mainLayout.setHorizontalGroup(
            mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tasksDescription)
                .addContainerGap())
        );
        mainLayout.setVerticalGroup(
            mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tasksDescription)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(projects, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(sidebar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tasks, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(main, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(projects, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tasks, javax.swing.GroupLayout.PREFERRED_SIZE, 52, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(main, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(sidebar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

//EVENTO DE CLICK QUANDO É CLICADO NO ICONE DE NOVO PROJETO, QUE ABRE A TELA DE CADASTRO DE PROJETOS
    private void projectsIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_projectsIconMouseClicked
        ProjectDialogScreen projectDialogScreen = new ProjectDialogScreen(this, rootPaneCheckingEnabled);
        projectDialogScreen.setVisible(true);

    }//GEN-LAST:event_projectsIconMouseClicked

//além de abrir a tela, tambem seta qual o projeto referente aquela tarefa
    private void tasksIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tasksIconMouseClicked

        TaskDialogScreen taskDialogScreen = new TaskDialogScreen(this, rootPaneCheckingEnabled);
//        taskDialogScreen.setProject(null);
        taskDialogScreen.setVisible(true);

    }//GEN-LAST:event_tasksIconMouseClicked

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
    private javax.swing.JPanel header;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel main;
    private javax.swing.JLabel noTasksIcon;
    private javax.swing.JPanel noTasksScreen;
    private javax.swing.JLabel noTasksSubtitle;
    private javax.swing.JLabel noTasksTitle;
    private javax.swing.JPanel projects;
    private javax.swing.JLabel projectsIcon;
    private javax.swing.JLabel projectsLabel;
    private javax.swing.JScrollPane scrollpanel;
    private javax.swing.JPanel sidebar;
    private javax.swing.JLabel subtitle;
    private javax.swing.JPanel tasks;
    private javax.swing.JScrollPane tasksDescription;
    private javax.swing.JTable tasksDescriptionTable;
    private javax.swing.JLabel tasksIcon;
    private javax.swing.JLabel tasksLabel;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables

//costumizando os nomes das colunas da tabela e colocou a opção de possibilitar ordenar os itens
    public void decorateTableTask() {
        tasksDescriptionTable.getTableHeader().setFont(new Font("Segoi UI", Font.BOLD, 14));
        tasksDescriptionTable.getTableHeader().setBackground(new Color(0, 153, 102));
        tasksDescriptionTable.getTableHeader().setForeground(new Color(255, 255, 255));

        tasksDescriptionTable.setAutoCreateRowSorter(true);
    }

//MÉTODO PRA INICIALIZAR OS OBJETOS LOCAIS MODELO DE PROJETO E TAREFA
    public void initDataController() {
        projectController = new ProjectController();
        taskController = new TaskController();
    }

//METODO QUE CRIA A ESTRUTURA QUE GUARDA ESSES PROJETOS LOCALMENTE, QUE É ESSA LISTA DEFAULT
// DEPOIS DE CRIADA, ELA CHAMA A FUNÇÃO QUE VAI POPULAR ESSA LISTA LOCAL
    public void initComponentsModel() {
        projectModel = new DefaultListModel();
        loadProjects();
    }

//MÉTODO QUE PEGA OS PROJETOS DO BD E POPULA A LISTA CRIADA LOCALMENTE (que depois vai ser renderizada pro usuario)
     public void loadProjects() {
        List<Project> projects = projectController.getAll();
        projectModel.clear();

        for (int i = 0; i < projects.size(); i++) {
            Project project = projects.get(i);
            projectModel.addElement(project);
        }
        jListProjects.setModel(projectModel);
    }
}
