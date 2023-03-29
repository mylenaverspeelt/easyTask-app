package view;
//metodo construtor, metodo de iniciar os componentes, metodo de salvar uma nova tarefa ao icone ser clicado, metodo pra pegar o id do projeto ao qual a tarefa é referente

//criou-se um task controller no construtor, é ele quem cria um novo objeto task pra ser adicionado no BD (olhar na pasta controller).
import controller.TaskController;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import model.Project;
import model.Task;

public class TaskDialogScreen extends javax.swing.JDialog {

    TaskController controller;
    Project project;

    public TaskDialogScreen(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();

        controller = new TaskController();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scrollbar1 = new java.awt.Scrollbar();
        header = new javax.swing.JPanel();
        headerLabel = new javax.swing.JLabel();
        headerIcon = new javax.swing.JLabel();
        main = new javax.swing.JPanel();
        nameLabel = new javax.swing.JLabel();
        inputName = new javax.swing.JTextField();
        descriptionLabel = new javax.swing.JLabel();
        scrollPaneDescription = new javax.swing.JScrollPane();
        inputDescription = new javax.swing.JTextArea();
        deadlineLabel = new javax.swing.JLabel();
        inputDeadline = new javax.swing.JFormattedTextField();
        notesLabel = new javax.swing.JLabel();
        ScrollPaneNotes = new javax.swing.JScrollPane();
        inputNotes = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        header.setBackground(new java.awt.Color(0, 153, 102));
        header.setForeground(new java.awt.Color(0, 153, 102));

        headerLabel.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        headerLabel.setForeground(new java.awt.Color(255, 255, 255));
        headerLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        headerLabel.setText("Task");

        headerIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        headerIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/check.png"))); // NOI18N
        headerIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                headerIconMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(headerLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(headerIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(headerIcon, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
                    .addComponent(headerLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        main.setBackground(new java.awt.Color(255, 255, 255));

        nameLabel.setText("Name");

        descriptionLabel.setText("Description");

        inputDescription.setColumns(20);
        inputDescription.setRows(5);
        scrollPaneDescription.setViewportView(inputDescription);

        deadlineLabel.setText("Deadline");

        inputDeadline.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));

        notesLabel.setText("Notes");

        inputNotes.setColumns(20);
        inputNotes.setRows(5);
        ScrollPaneNotes.setViewportView(inputNotes);

        javax.swing.GroupLayout mainLayout = new javax.swing.GroupLayout(main);
        main.setLayout(mainLayout);
        mainLayout.setHorizontalGroup(
            mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainLayout.createSequentialGroup()
                        .addComponent(inputDeadline, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(mainLayout.createSequentialGroup()
                        .addGroup(mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(notesLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, mainLayout.createSequentialGroup()
                                .addGroup(mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, mainLayout.createSequentialGroup()
                                        .addComponent(deadlineLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(1, 1, 1))
                                    .addComponent(ScrollPaneNotes, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(14, 14, 14)))
                        .addGap(7, 7, 7))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainLayout.createSequentialGroup()
                        .addGroup(mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(descriptionLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(scrollPaneDescription, javax.swing.GroupLayout.DEFAULT_SIZE, 343, Short.MAX_VALUE))
                        .addGap(22, 22, 22))
                    .addGroup(mainLayout.createSequentialGroup()
                        .addGroup(mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(nameLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(inputName, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(20, 20, 20))))
        );
        mainLayout.setVerticalGroup(
            mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(nameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(descriptionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollPaneDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(deadlineLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputDeadline, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(notesLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ScrollPaneNotes, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                .addGap(36, 36, 36))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(main, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(main, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void headerIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerIconMouseClicked

        try {
            Task task = new Task();
            task.setIdProject(19);
//            task.setIdProject(project.getId());
            task.setName(inputName.getText());
            task.setDescription(inputDescription.getText());
            task.setIsCompleted(false);
//é necessário formatar a data pra o formato escolhido lá no formaterFactory do componente, depois passa a data formatada pro objeto e salva a tarefa no controller.
            task.setNotes(inputNotes.getText());
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyy");
            Date deadline = null;
            deadline = dateFormat.parse(inputDeadline.getText());
            task.setDeadline(deadline);
            controller.save(task);
            JOptionPane.showMessageDialog(rootPane, "Tarefa salva com sucesso!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage());

        }

        this.dispose();


    }//GEN-LAST:event_headerIconMouseClicked

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Java swing".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TaskDialogScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TaskDialogScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TaskDialogScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TaskDialogScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                TaskDialogScreen dialog = new TaskDialogScreen(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane ScrollPaneNotes;
    private javax.swing.JLabel deadlineLabel;
    private javax.swing.JLabel descriptionLabel;
    private javax.swing.JPanel header;
    private javax.swing.JLabel headerIcon;
    private javax.swing.JLabel headerLabel;
    private javax.swing.JFormattedTextField inputDeadline;
    private javax.swing.JTextArea inputDescription;
    private javax.swing.JTextField inputName;
    private javax.swing.JTextArea inputNotes;
    private javax.swing.JPanel main;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JLabel notesLabel;
    private javax.swing.JScrollPane scrollPaneDescription;
    private java.awt.Scrollbar scrollbar1;
    // End of variables declaration//GEN-END:variables

//METODO PRA PEGAR O ID DO PROJETO (E SETAR NUMA TASK LÁ NO EVENTO DE CLICK)
    public void setProject(Project project) {
        this.project = project;
    }

}
