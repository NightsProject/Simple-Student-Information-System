
package SIS.com.frames;

import SIS.com.objects.Student;
import SIS.Main;
import SIS.com.Write;
import SIS.com.objects.Program;
import java.awt.Color;

import java.awt.event.*;
import java.util.function.Predicate;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
public class MainWindow extends javax.swing.JFrame {

   
    public MainWindow() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        AddCollegeDialog = new javax.swing.JDialog();
        jLabel1 = new javax.swing.JLabel();
        nameFieldC = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        codeFieldC = new javax.swing.JTextField();
        cancelButtonAddC = new javax.swing.JButton();
        addButtonC = new javax.swing.JButton();
        AddProgramDialog = new javax.swing.JDialog();
        jLabel3 = new javax.swing.JLabel();
        nameFieldP = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        codeFieldP = new javax.swing.JTextField();
        cancelButtonAddP = new javax.swing.JButton();
        addButtonP = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        comboBoxCC = new javax.swing.JComboBox<>();
        AddStudentDialog = new javax.swing.JDialog();
        idLabel = new javax.swing.JLabel();
        idLabel1 = new javax.swing.JLabel();
        idLabel2 = new javax.swing.JLabel();
        idLabel3 = new javax.swing.JLabel();
        idLabel4 = new javax.swing.JLabel();
        idLabel5 = new javax.swing.JLabel();
        idLabel6 = new javax.swing.JLabel();
        comboBoxP = new javax.swing.JComboBox<>();
        firstNameField = new javax.swing.JTextField();
        lastNameField = new javax.swing.JTextField();
        male = new javax.swing.JRadioButton();
        female = new javax.swing.JRadioButton();
        comboBoxCCStudent = new javax.swing.JComboBox<>();
        cancelButton = new javax.swing.JButton();
        idFieldNS = new javax.swing.JTextField();
        confirmButton = new javax.swing.JButton();
        comboBoxYL = new javax.swing.JComboBox<>();
        comboBoxY = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        genderGroup = new javax.swing.ButtonGroup();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        ViewCollegeListDialog = new javax.swing.JDialog();
        jPanel4 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        programCodeField4 = new javax.swing.JTextField();
        genderField2 = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        programCodeField2 = new javax.swing.JTextField();
        programCodeField3 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        programCodeField5 = new javax.swing.JTextField();
        genderG = new javax.swing.ButtonGroup();
        jSpinner1 = new javax.swing.JSpinner();
        jMenuItem1 = new javax.swing.JMenuItem();
        jComboBox1 = new javax.swing.JComboBox<>();
        MainMenu = new javax.swing.JPanel();
        SIS = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        studentTable = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        idLabel13 = new javax.swing.JLabel();
        programCodeField = new javax.swing.JTextField();
        collegeCodeField = new javax.swing.JTextField();
        idLabel8 = new javax.swing.JLabel();
        idLabel12 = new javax.swing.JLabel();
        yearLevelField = new javax.swing.JTextField();
        idLabel11 = new javax.swing.JLabel();
        idLabel10 = new javax.swing.JLabel();
        lastNameLabel = new javax.swing.JTextField();
        firstNameLabel = new javax.swing.JTextField();
        idLabel9 = new javax.swing.JLabel();
        idLabel7 = new javax.swing.JLabel();
        idNumberField = new javax.swing.JTextField();
        editButton = new javax.swing.JButton();
        saveButton = new javax.swing.JButton();
        comboBoxCCode = new javax.swing.JComboBox<>();
        comboBoxYearL = new javax.swing.JComboBox<>();
        genderField = new javax.swing.JTextField();
        femaleG = new javax.swing.JRadioButton();
        maleG = new javax.swing.JRadioButton();
        delete = new javax.swing.JButton();
        cancel = new javax.swing.JButton();
        comboBoxSP = new javax.swing.JComboBox<>();
        searchField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        comboBoxSearch = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        searchButton = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        idCheck = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        collegeListPanel = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        collegeTable = new javax.swing.JTable();
        idLabel17 = new javax.swing.JLabel();
        idLabel18 = new javax.swing.JLabel();
        collegeCodeC = new javax.swing.JTextField();
        collegeCodeN = new javax.swing.JTextField();
        cancelCollege = new javax.swing.JButton();
        editCollege = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        programListPanel = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        programTable = new javax.swing.JTable();
        idLabel16 = new javax.swing.JLabel();
        programCodeP = new javax.swing.JTextField();
        idLabel19 = new javax.swing.JLabel();
        programCodeN = new javax.swing.JTextField();
        idLabel15 = new javax.swing.JLabel();
        collegeCodeP = new javax.swing.JTextField();
        deleteProgram = new javax.swing.JButton();
        cancelProgram = new javax.swing.JButton();
        editProgram = new javax.swing.JButton();
        programCodeCheck = new javax.swing.JLabel();
        saveProgram = new javax.swing.JButton();
        menuBar = new javax.swing.JMenuBar();
        SSIS = new javax.swing.JMenu();
        newMenu = new javax.swing.JMenu();
        newStudent = new javax.swing.JMenuItem();
        newProgram = new javax.swing.JMenuItem();
        neweCollege = new javax.swing.JMenuItem();
        reportMenu = new javax.swing.JMenu();
        settings = new javax.swing.JMenu();
        about = new javax.swing.JMenu();

        AddCollegeDialog.setTitle("New College");
        AddCollegeDialog.setMinimumSize(new java.awt.Dimension(266, 160));
        AddCollegeDialog.setType(java.awt.Window.Type.UTILITY);
        AddCollegeDialog.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("College Code");
        AddCollegeDialog.getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, 30));
        AddCollegeDialog.getContentPane().add(nameFieldC, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, 100, 30));

        jLabel2.setText("College Name");
        AddCollegeDialog.getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, -1, 30));
        AddCollegeDialog.getContentPane().add(codeFieldC, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, 100, 30));

        cancelButtonAddC.setText("CANCEL");
        cancelButtonAddC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelButtonAddCMouseClicked(evt);
            }
        });
        AddCollegeDialog.getContentPane().add(cancelButtonAddC, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, -1, -1));

        addButtonC.setText("ADD");
        addButtonC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addButtonCMouseClicked(evt);
            }
        });
        AddCollegeDialog.getContentPane().add(addButtonC, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, 80, -1));

        AddProgramDialog.setTitle("New Program");
        AddProgramDialog.setMinimumSize(new java.awt.Dimension(286, 201));
        AddProgramDialog.setModal(true);
        AddProgramDialog.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setText("Program Code");
        AddProgramDialog.getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, 30));
        AddProgramDialog.getContentPane().add(nameFieldP, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, 100, 30));

        jLabel4.setText("Program Name");
        AddProgramDialog.getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, -1, 30));
        AddProgramDialog.getContentPane().add(codeFieldP, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, 100, 30));

        cancelButtonAddP.setText("CANCEL");
        cancelButtonAddP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelButtonAddPMouseClicked(evt);
            }
        });
        AddProgramDialog.getContentPane().add(cancelButtonAddP, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, -1, -1));

        addButtonP.setText("ADD");
        addButtonP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addButtonPMouseClicked(evt);
            }
        });
        AddProgramDialog.getContentPane().add(addButtonP, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 160, 80, -1));

        jLabel5.setText("College Code");
        AddProgramDialog.getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, -1, -1));

        comboBoxCC.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        AddProgramDialog.getContentPane().add(comboBoxCC, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 103, 100, 30));

        AddStudentDialog.setMinimumSize(new java.awt.Dimension(426, 408));
        AddStudentDialog.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        idLabel.setFont(new java.awt.Font("sansserif", 0, 13)); // NOI18N
        idLabel.setText("ID NUMBER");
        AddStudentDialog.getContentPane().add(idLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 40, 120, 30));

        idLabel1.setText("COLLEGE CODE");
        AddStudentDialog.getContentPane().add(idLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, 120, 20));

        idLabel2.setText("FIRST NAME");
        AddStudentDialog.getContentPane().add(idLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 120, 10));

        idLabel3.setText("LAST NAME");
        AddStudentDialog.getContentPane().add(idLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, 120, 20));

        idLabel4.setText("YEAR LEVEL");
        AddStudentDialog.getContentPane().add(idLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 120, 120, 10));

        idLabel5.setText("GENDER");
        AddStudentDialog.getContentPane().add(idLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 190, 110, 20));

        idLabel6.setText("PROGRAM CODE");
        AddStudentDialog.getContentPane().add(idLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 260, 120, 20));

        comboBoxP.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));
        comboBoxP.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboBoxPItemStateChanged(evt);
            }
        });
        comboBoxP.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                comboBoxPFocusLost(evt);
            }
        });
        AddStudentDialog.getContentPane().add(comboBoxP, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 280, 150, 30));
        AddStudentDialog.getContentPane().add(firstNameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 150, 30));
        AddStudentDialog.getContentPane().add(lastNameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 150, 30));

        genderGroup.add(male);
        male.setSelected(true);
        male.setText("Male");
        AddStudentDialog.getContentPane().add(male, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 210, -1, 30));

        genderGroup.add(female);
        female.setText("female");
        AddStudentDialog.getContentPane().add(female, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 210, -1, 30));

        comboBoxCCStudent.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));
        comboBoxCCStudent.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboBoxCCStudentItemStateChanged(evt);
            }
        });
        AddStudentDialog.getContentPane().add(comboBoxCCStudent, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, 150, 30));

        cancelButton.setText("CANCEL");
        cancelButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelButtonMouseClicked(evt);
            }
        });
        AddStudentDialog.getContentPane().add(cancelButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 350, 90, -1));

        idFieldNS.setEditable(false);
        idFieldNS.setFocusable(false);
        AddStudentDialog.getContentPane().add(idFieldNS, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 70, 150, 30));

        confirmButton.setText("CONFIRM");
        confirmButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                confirmButtonMouseClicked(evt);
            }
        });
        AddStudentDialog.getContentPane().add(confirmButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 350, 90, -1));

        comboBoxYL.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1st Year", "2nd Year", "3rd Year", "4th Year" }));
        AddStudentDialog.getContentPane().add(comboBoxYL, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 140, 150, 30));

        comboBoxY.setEditable(true);
        comboBoxY.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2024", "2025", "2026" }));
        comboBoxY.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboBoxYItemStateChanged(evt);
            }
        });
        AddStudentDialog.getContentPane().add(comboBoxY, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 150, 30));

        jLabel7.setFont(new java.awt.Font("sansserif", 1, 13)); // NOI18N
        jLabel7.setText("ACADEMIC YEAR");
        AddStudentDialog.getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, -1, 30));

        ViewCollegeListDialog.setMinimumSize(new java.awt.Dimension(1051, 478));
        ViewCollegeListDialog.setResizable(false);
        ViewCollegeListDialog.setType(java.awt.Window.Type.UTILITY);
        ViewCollegeListDialog.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setText("COLLEGE NAME");
        jPanel4.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, 30));

        jLabel12.setText("COLLEGE CODE");
        jPanel4.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 30));

        programCodeField4.setEditable(false);
        programCodeField4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        programCodeField4.setFocusable(false);
        jPanel4.add(programCodeField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 130, 30));

        genderField2.setEditable(false);
        genderField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        genderField2.setFocusable(false);
        jPanel4.add(genderField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, 130, 30));

        ViewCollegeListDialog.getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 20, 260, 190));

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setText("COLLEGE CODE");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, 30));

        programCodeField2.setEditable(false);
        programCodeField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        programCodeField2.setFocusable(false);
        jPanel3.add(programCodeField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, 130, 30));

        programCodeField3.setEditable(false);
        programCodeField3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        programCodeField3.setFocusable(false);
        jPanel3.add(programCodeField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, 130, 30));

        jLabel10.setText("PROGRAM NAME");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, 30));

        jLabel9.setText("PROGRAM CODE");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 30));

        programCodeField5.setEditable(false);
        programCodeField5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        programCodeField5.setFocusable(false);
        jPanel3.add(programCodeField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, 130, 30));

        ViewCollegeListDialog.getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 270, 240));

        jMenuItem1.setText("jMenuItem1");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Student Information System");
        setMinimumSize(new java.awt.Dimension(1010, 407));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(new java.awt.GridBagLayout());

        MainMenu.setBackground(new java.awt.Color(23, 58, 43));
        MainMenu.setLayout(new java.awt.GridBagLayout());

        SIS.setFont(new java.awt.Font("DejaVu Serif", 3, 24)); // NOI18N
        SIS.setForeground(new java.awt.Color(215, 243, 220));
        SIS.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SIS.setText("Student Information System");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.ipadx = 12;
        gridBagConstraints.ipady = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 203, 0, 0);
        MainMenu.add(SIS, gridBagConstraints);

        jScrollPane1.setBackground(new java.awt.Color(20, 51, 37));
        jScrollPane1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("sansserif", 0, 13), new java.awt.Color(255, 255, 0))); // NOI18N

        studentTable.setAutoCreateRowSorter(true);
        studentTable.setBackground(new java.awt.Color(20, 51, 37));
        studentTable.setForeground(new java.awt.Color(215, 243, 220));
        studentTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID Number", "First Name", "Last Name", "Gender", "Year Level", "Program Code", "College Code"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        studentTable.setFocusable(false);
        studentTable.setGridColor(new java.awt.Color(7, 27, 20));
        studentTable.setName(""); // NOI18N
        studentTable.setOpaque(false);
        studentTable.setSelectionBackground(new java.awt.Color(0, 0, 0));
        studentTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        studentTable.getTableHeader().setResizingAllowed(false);
        studentTable.getTableHeader().setReorderingAllowed(false);
        studentTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                studentTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(studentTable);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 13;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 844;
        gridBagConstraints.ipady = 320;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(2, 20, 0, 0);
        MainMenu.add(jScrollPane1, gridBagConstraints);

        jPanel1.setBackground(new java.awt.Color(23, 58, 43));
        jPanel1.setMaximumSize(new java.awt.Dimension(260, 310));
        jPanel1.setMinimumSize(new java.awt.Dimension(260, 310));
        jPanel1.setPreferredSize(new java.awt.Dimension(260, 310));
        jPanel1.setLayout(new java.awt.GridBagLayout());

        idLabel13.setFont(new java.awt.Font("sansserif", 1, 13)); // NOI18N
        idLabel13.setForeground(new java.awt.Color(215, 243, 220));
        idLabel13.setText("PROGRAM CODE");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 9;
        gridBagConstraints.ipady = 13;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 20, 0, 0);
        jPanel1.add(idLabel13, gridBagConstraints);

        programCodeField.setBackground(new java.awt.Color(32, 79, 57));
        programCodeField.setForeground(new java.awt.Color(215, 243, 220));
        programCodeField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        programCodeField.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.darkGray, null));
        programCodeField.setFocusable(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 10;
        gridBagConstraints.ipadx = 36;
        gridBagConstraints.ipady = 9;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 20);
        jPanel1.add(programCodeField, gridBagConstraints);

        collegeCodeField.setBackground(new java.awt.Color(32, 79, 57));
        collegeCodeField.setForeground(new java.awt.Color(215, 243, 220));
        collegeCodeField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        collegeCodeField.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.darkGray, null));
        collegeCodeField.setFocusable(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 10;
        gridBagConstraints.ipadx = 36;
        gridBagConstraints.ipady = 9;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 20);
        jPanel1.add(collegeCodeField, gridBagConstraints);

        idLabel8.setFont(new java.awt.Font("sansserif", 1, 13)); // NOI18N
        idLabel8.setForeground(new java.awt.Color(215, 243, 220));
        idLabel8.setText("COLLEGE CODE");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 18;
        gridBagConstraints.ipady = 13;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 20, 0, 0);
        jPanel1.add(idLabel8, gridBagConstraints);

        idLabel12.setBackground(new java.awt.Color(215, 243, 220));
        idLabel12.setFont(new java.awt.Font("sansserif", 1, 13)); // NOI18N
        idLabel12.setForeground(new java.awt.Color(215, 243, 220));
        idLabel12.setText("GENDER");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.ipadx = 49;
        gridBagConstraints.ipady = 13;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 20, 0, 0);
        jPanel1.add(idLabel12, gridBagConstraints);

        yearLevelField.setBackground(new java.awt.Color(32, 79, 57));
        yearLevelField.setForeground(new java.awt.Color(215, 243, 220));
        yearLevelField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        yearLevelField.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.darkGray, null));
        yearLevelField.setFocusable(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 13;
        gridBagConstraints.ipadx = 66;
        gridBagConstraints.ipady = 9;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 120, 0, 20);
        jPanel1.add(yearLevelField, gridBagConstraints);

        idLabel11.setFont(new java.awt.Font("sansserif", 1, 13)); // NOI18N
        idLabel11.setForeground(new java.awt.Color(215, 243, 220));
        idLabel11.setText("YEAR LEVEL");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 32;
        gridBagConstraints.ipady = 13;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 20, 0, 0);
        jPanel1.add(idLabel11, gridBagConstraints);

        idLabel10.setFont(new java.awt.Font("sansserif", 1, 13)); // NOI18N
        idLabel10.setForeground(new java.awt.Color(215, 243, 220));
        idLabel10.setText("LAST NAME");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 37;
        gridBagConstraints.ipady = 13;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 20, 0, 0);
        jPanel1.add(idLabel10, gridBagConstraints);

        lastNameLabel.setBackground(new java.awt.Color(32, 79, 57));
        lastNameLabel.setForeground(new java.awt.Color(215, 243, 220));
        lastNameLabel.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        lastNameLabel.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.darkGray, null));
        lastNameLabel.setFocusable(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 13;
        gridBagConstraints.ipadx = 66;
        gridBagConstraints.ipady = 9;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 120, 0, 20);
        jPanel1.add(lastNameLabel, gridBagConstraints);

        firstNameLabel.setBackground(new java.awt.Color(32, 79, 57));
        firstNameLabel.setForeground(new java.awt.Color(215, 243, 220));
        firstNameLabel.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        firstNameLabel.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.darkGray, null));
        firstNameLabel.setFocusable(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 13;
        gridBagConstraints.ipadx = 66;
        gridBagConstraints.ipady = 9;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 120, 0, 20);
        jPanel1.add(firstNameLabel, gridBagConstraints);

        idLabel9.setFont(new java.awt.Font("sansserif", 1, 13)); // NOI18N
        idLabel9.setForeground(new java.awt.Color(215, 243, 220));
        idLabel9.setText("FIRST NAME");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 32;
        gridBagConstraints.ipady = 13;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 20, 0, 0);
        jPanel1.add(idLabel9, gridBagConstraints);

        idLabel7.setFont(new java.awt.Font("sansserif", 1, 13)); // NOI18N
        idLabel7.setForeground(new java.awt.Color(215, 243, 220));
        idLabel7.setText("ID NUMBER");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 37;
        gridBagConstraints.ipady = 13;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 20, 0, 0);
        jPanel1.add(idLabel7, gridBagConstraints);

        idNumberField.setBackground(new java.awt.Color(32, 79, 57));
        idNumberField.setForeground(new java.awt.Color(215, 243, 220));
        idNumberField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        idNumberField.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.darkGray, null));
        idNumberField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        idNumberField.setFocusable(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 13;
        gridBagConstraints.ipadx = 66;
        gridBagConstraints.ipady = 9;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 120, 0, 20);
        jPanel1.add(idNumberField, gridBagConstraints);

        editButton.setBackground(new java.awt.Color(20, 51, 37));
        editButton.setForeground(new java.awt.Color(215, 243, 220));
        editButton.setText("EDIT");
        editButton.setEnabled(false);
        editButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editButtonMouseClicked(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridwidth = 7;
        gridBagConstraints.ipady = -3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 18, 10, 0);
        jPanel1.add(editButton, gridBagConstraints);

        saveButton.setBackground(new java.awt.Color(20, 51, 37));
        saveButton.setForeground(new java.awt.Color(215, 243, 220));
        saveButton.setText("SAVE");
        saveButton.setEnabled(false);
        saveButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                saveButtonMouseClicked(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridwidth = 7;
        gridBagConstraints.ipady = -3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 18, 10, 0);
        jPanel1.add(saveButton, gridBagConstraints);

        comboBoxCCode.setBackground(new java.awt.Color(32, 79, 57));
        comboBoxCCode.setForeground(new java.awt.Color(215, 243, 220));
        comboBoxCCode.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboBoxCCode.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboBoxCCodeItemStateChanged(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 10;
        gridBagConstraints.ipadx = 24;
        gridBagConstraints.ipady = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 20);
        jPanel1.add(comboBoxCCode, gridBagConstraints);

        comboBoxYearL.setBackground(new java.awt.Color(32, 79, 57));
        comboBoxYearL.setEditable(true);
        comboBoxYearL.setForeground(new java.awt.Color(215, 243, 220));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 13;
        gridBagConstraints.ipadx = 58;
        gridBagConstraints.ipady = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 120, 0, 20);
        jPanel1.add(comboBoxYearL, gridBagConstraints);

        genderField.setBackground(new java.awt.Color(32, 79, 57));
        genderField.setForeground(new java.awt.Color(215, 243, 220));
        genderField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        genderField.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.darkGray, null));
        genderField.setFocusable(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 13;
        gridBagConstraints.ipadx = 66;
        gridBagConstraints.ipady = 9;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 120, 0, 20);
        jPanel1.add(genderField, gridBagConstraints);

        genderG.add(femaleG);
        femaleG.setForeground(new java.awt.Color(215, 243, 220));
        femaleG.setText("Female");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 8;
        gridBagConstraints.ipady = 9;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 28, 0, 20);
        jPanel1.add(femaleG, gridBagConstraints);

        genderG.add(maleG);
        maleG.setForeground(new java.awt.Color(215, 243, 220));
        maleG.setText("Male");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.ipadx = 17;
        gridBagConstraints.ipady = 9;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 120, 0, 0);
        jPanel1.add(maleG, gridBagConstraints);

        delete.setBackground(new java.awt.Color(20, 51, 37));
        delete.setForeground(new java.awt.Color(215, 243, 220));
        delete.setText("DELETE");
        delete.setEnabled(false);
        delete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteMouseClicked(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 2;
        gridBagConstraints.ipady = -3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 70, 10, 0);
        jPanel1.add(delete, gridBagConstraints);

        cancel.setBackground(new java.awt.Color(20, 51, 37));
        cancel.setForeground(new java.awt.Color(215, 243, 220));
        cancel.setText("CANCEL");
        cancel.setEnabled(false);
        cancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelMouseClicked(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.ipady = -3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 70, 10, 0);
        jPanel1.add(cancel, gridBagConstraints);

        comboBoxSP.setBackground(new java.awt.Color(32, 79, 57));
        comboBoxSP.setForeground(new java.awt.Color(215, 243, 220));
        comboBoxSP.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 10;
        gridBagConstraints.ipadx = 24;
        gridBagConstraints.ipady = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 20);
        jPanel1.add(comboBoxSP, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 14;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 16;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.ipady = 30;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(2, 0, 0, 0);
        MainMenu.add(jPanel1, gridBagConstraints);

        searchField.setBackground(new java.awt.Color(32, 79, 57));
        searchField.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.darkGray, null));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 116;
        gridBagConstraints.ipady = 9;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(33, 0, 0, 0);
        MainMenu.add(searchField, gridBagConstraints);

        jLabel6.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(215, 243, 220));
        jLabel6.setText("SEARCH");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 6;
        gridBagConstraints.ipady = 15;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(33, 213, 0, 0);
        MainMenu.add(jLabel6, gridBagConstraints);

        comboBoxSearch.setBackground(new java.awt.Color(32, 79, 57));
        comboBoxSearch.setForeground(new java.awt.Color(215, 243, 220));
        comboBoxSearch.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ID Number", "Firstname", "Lastname", "Year Level", "Gender", "College Code", "Program Code" }));
        comboBoxSearch.setToolTipText("");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 7;
        gridBagConstraints.ipady = -3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 30, 0, 0);
        MainMenu.add(comboBoxSearch, gridBagConstraints);

        jLabel13.setFont(new java.awt.Font("sansserif", 0, 10)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(215, 243, 220));
        jLabel13.setText("SEARCH BY:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipady = -3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(33, 30, 0, 0);
        MainMenu.add(jLabel13, gridBagConstraints);

        searchButton.setBackground(new java.awt.Color(0, 0, 0));
        searchButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchButtonMouseClicked(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = -42;
        gridBagConstraints.ipady = 24;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(33, 0, 0, 0);
        MainMenu.add(searchButton, gridBagConstraints);

        jLabel16.setText("Load All");
        jLabel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel16MouseClicked(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 12;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.ipady = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 43, 0, 0);
        MainMenu.add(jLabel16, gridBagConstraints);

        idCheck.setText("v 1.0.1");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 90, 0, 0);
        MainMenu.add(idCheck, gridBagConstraints);

        jLabel18.setFont(new java.awt.Font("DejaVu Serif", 1, 14)); // NOI18N
        jLabel18.setText("STUDENTS LIST");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 20, 0, 0);
        MainMenu.add(jLabel18, gridBagConstraints);

        jSeparator3.setBackground(new java.awt.Color(0, 51, 0));
        jSeparator3.setForeground(new java.awt.Color(0, 51, 0));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridwidth = 15;
        gridBagConstraints.ipadx = 1109;
        gridBagConstraints.ipady = 9;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 20, 0, 0);
        MainMenu.add(jSeparator3, gridBagConstraints);

        collegeListPanel.setBackground(new java.awt.Color(23, 58, 43));
        collegeListPanel.setLayout(new java.awt.GridBagLayout());

        collegeTable.setAutoCreateRowSorter(true);
        collegeTable.setBackground(new java.awt.Color(20, 51, 37));
        collegeTable.setForeground(new java.awt.Color(215, 243, 220));
        collegeTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "College Code", "College Name"
            }
        ));
        collegeTable.setFocusable(false);
        jScrollPane4.setViewportView(collegeTable);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 514;
        gridBagConstraints.ipady = 110;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(2, 10, 0, 0);
        collegeListPanel.add(jScrollPane4, gridBagConstraints);

        idLabel17.setFont(new java.awt.Font("sansserif", 1, 13)); // NOI18N
        idLabel17.setForeground(new java.awt.Color(215, 243, 220));
        idLabel17.setText("NAME");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 17;
        gridBagConstraints.ipady = 13;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 20, 0, 0);
        collegeListPanel.add(idLabel17, gridBagConstraints);

        idLabel18.setFont(new java.awt.Font("sansserif", 1, 13)); // NOI18N
        idLabel18.setForeground(new java.awt.Color(215, 243, 220));
        idLabel18.setText("COLLEGE CODE");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 8;
        gridBagConstraints.ipady = 13;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(2, 20, 0, 0);
        collegeListPanel.add(idLabel18, gridBagConstraints);

        collegeCodeC.setBackground(new java.awt.Color(32, 79, 57));
        collegeCodeC.setForeground(new java.awt.Color(215, 243, 220));
        collegeCodeC.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        collegeCodeC.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.darkGray, null));
        collegeCodeC.setFocusable(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.ipadx = 46;
        gridBagConstraints.ipady = 9;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(2, 0, 0, 0);
        collegeListPanel.add(collegeCodeC, gridBagConstraints);

        collegeCodeN.setBackground(new java.awt.Color(32, 79, 57));
        collegeCodeN.setForeground(new java.awt.Color(215, 243, 220));
        collegeCodeN.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        collegeCodeN.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.darkGray, null));
        collegeCodeN.setFocusable(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.ipadx = 106;
        gridBagConstraints.ipady = 9;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 0);
        collegeListPanel.add(collegeCodeN, gridBagConstraints);

        cancelCollege.setText("CANCEL");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipady = -3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 70, 0, 0);
        collegeListPanel.add(cancelCollege, gridBagConstraints);

        editCollege.setText("EDIT");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.ipady = -3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 18, 0, 0);
        collegeListPanel.add(editCollege, gridBagConstraints);

        jLabel15.setFont(new java.awt.Font("DejaVu Serif", 1, 14)); // NOI18N
        jLabel15.setText("COLLEGE LIST");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 0);
        collegeListPanel.add(jLabel15, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.gridwidth = 14;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 193, 0, 0);
        MainMenu.add(collegeListPanel, gridBagConstraints);

        programListPanel.setBackground(new java.awt.Color(23, 58, 43));
        programListPanel.setLayout(new java.awt.GridBagLayout());

        programTable.setAutoCreateRowSorter(true);
        programTable.setBackground(new java.awt.Color(20, 51, 37));
        programTable.setForeground(new java.awt.Color(215, 243, 220));
        programTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Program Code", "Program Name"
            }
        ));
        programTable.setFocusable(false);
        programTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                programTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(programTable);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 514;
        gridBagConstraints.ipady = 120;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(2, 10, 0, 0);
        programListPanel.add(jScrollPane2, gridBagConstraints);

        idLabel16.setFont(new java.awt.Font("sansserif", 1, 13)); // NOI18N
        idLabel16.setForeground(new java.awt.Color(215, 243, 220));
        idLabel16.setText("PROGRAM CODE");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.ipadx = 9;
        gridBagConstraints.ipady = 13;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(2, 20, 0, 0);
        programListPanel.add(idLabel16, gridBagConstraints);

        programCodeP.setBackground(new java.awt.Color(32, 79, 57));
        programCodeP.setForeground(new java.awt.Color(215, 243, 220));
        programCodeP.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        programCodeP.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.darkGray, null));
        programCodeP.setFocusable(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.ipadx = 36;
        gridBagConstraints.ipady = 9;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(2, 0, 0, 20);
        programListPanel.add(programCodeP, gridBagConstraints);

        idLabel19.setFont(new java.awt.Font("sansserif", 1, 13)); // NOI18N
        idLabel19.setForeground(new java.awt.Color(215, 243, 220));
        idLabel19.setText("NAME");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 17;
        gridBagConstraints.ipady = 13;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 20, 0, 0);
        programListPanel.add(idLabel19, gridBagConstraints);

        programCodeN.setBackground(new java.awt.Color(32, 79, 57));
        programCodeN.setForeground(new java.awt.Color(215, 243, 220));
        programCodeN.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        programCodeN.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.darkGray, null));
        programCodeN.setFocusable(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 10;
        gridBagConstraints.ipadx = 116;
        gridBagConstraints.ipady = 9;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 70, 0, 20);
        programListPanel.add(programCodeN, gridBagConstraints);

        idLabel15.setFont(new java.awt.Font("sansserif", 1, 13)); // NOI18N
        idLabel15.setForeground(new java.awt.Color(215, 243, 220));
        idLabel15.setText("COLLEGE CODE");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 8;
        gridBagConstraints.ipady = 13;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 20, 0, 0);
        programListPanel.add(idLabel15, gridBagConstraints);

        collegeCodeP.setBackground(new java.awt.Color(32, 79, 57));
        collegeCodeP.setForeground(new java.awt.Color(215, 243, 220));
        collegeCodeP.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        collegeCodeP.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.darkGray, null));
        collegeCodeP.setFocusable(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 8;
        gridBagConstraints.ipadx = 46;
        gridBagConstraints.ipady = 9;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 20);
        programListPanel.add(collegeCodeP, gridBagConstraints);

        deleteProgram.setText("DELETE");
        deleteProgram.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteProgramMouseClicked(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipady = -3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 70, 0, 0);
        programListPanel.add(deleteProgram, gridBagConstraints);

        cancelProgram.setText("CANCEL");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.ipady = -3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 70, 0, 0);
        programListPanel.add(cancelProgram, gridBagConstraints);

        editProgram.setText("EDIT");
        editProgram.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editProgramMouseClicked(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 10;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.ipady = -3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 18, 0, 0);
        programListPanel.add(editProgram, gridBagConstraints);

        programCodeCheck.setFont(new java.awt.Font("DejaVu Serif", 1, 14)); // NOI18N
        programCodeCheck.setText("PROGRAM LIST");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 0);
        programListPanel.add(programCodeCheck, gridBagConstraints);

        saveProgram.setText("SAVE");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 10;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.ipady = -3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 18, 0, 0);
        programListPanel.add(saveProgram, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridwidth = 29;
        gridBagConstraints.ipadx = 20;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 193, 0, 0);
        MainMenu.add(programListPanel, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = -2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 1, 0);
        getContentPane().add(MainMenu, gridBagConstraints);

        menuBar.setBackground(new java.awt.Color(7, 27, 20));
        menuBar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        menuBar.setForeground(new java.awt.Color(215, 243, 220));
        menuBar.setOpaque(true);

        SSIS.setBackground(new java.awt.Color(7, 27, 20));
        SSIS.setText("SSIS");

        newMenu.setText("New");

        newStudent.setText("Student");
        newStudent.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                newStudentMouseReleased(evt);
            }
        });
        newMenu.add(newStudent);

        newProgram.setText("Program");
        newProgram.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                newProgramMouseReleased(evt);
            }
        });
        newMenu.add(newProgram);

        neweCollege.setText("College");
        neweCollege.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                neweCollegeMouseReleased(evt);
            }
        });
        newMenu.add(neweCollege);

        SSIS.add(newMenu);

        menuBar.add(SSIS);

        reportMenu.setText("Reports");
        menuBar.add(reportMenu);

        settings.setText("Settings");
        menuBar.add(settings);

        about.setText("About");
        menuBar.add(about);

        setJMenuBar(menuBar);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cancelButtonAddCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelButtonAddCMouseClicked
        AddCollegeDialog.dispose();
    }//GEN-LAST:event_cancelButtonAddCMouseClicked

    private void cancelButtonAddPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelButtonAddPMouseClicked
        AddProgramDialog.dispose();
    }//GEN-LAST:event_cancelButtonAddPMouseClicked

    private void addButtonCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addButtonCMouseClicked
        
        for(int i = 0; i < Main.college.length; i++){
            
            //check if end then add the college to the object array
            if(Main.END.equals(Main.college[i].getCollegeCode())){
                Main.college[i].setCollegeCode(codeFieldC.getText());
                Main.college[i].setCollegeName(nameFieldC.getText());
                Main.college[i + 1].setCollegeCode(Main.END);
                break;
            }
        }
        
       Write.writeCollege();
       
       AddCollegeDialog.setVisible(false);
       
       
       //this code is added when you click Add New in the student dialog
       //-----------------------------------
       //load to studentdialog
       loadCollegeCom();
       //------------------------------------
       
       
       
       
       //clear the add college jframe
       codeFieldC.setText(null);
       nameFieldC.setText(null);
       AddCollegeDialog.dispose();
      
    }//GEN-LAST:event_addButtonCMouseClicked

    private void addButtonPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addButtonPMouseClicked
        for(int i = 0; i < Main.program.length; i++){
            if(Main.END.equals(Main.program[i].getProgramCode())){
                Main.program[i].setProgramCode(codeFieldP.getText());
                Main.program[i].setProgramName(nameFieldP.getText());
                Main.program[i].setCollegeCode( (String) comboBoxCC.getSelectedItem());
                Main.program[i +1].setProgramCode(Main.END);
                break;
                       
            }
        }
        
        Write.writeProgram();
        
        AddProgramDialog.setVisible(false);
        
        
        //this code is for the programCode in the AddStudentDialog
        //--------------------------
        loadProgramCom();
        //--------------------
        
        //clear
        codeFieldP.setText(null);
        nameFieldP.setText(null);
        comboBoxCC.removeAllItems();
    }//GEN-LAST:event_addButtonPMouseClicked

    private void cancelButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelButtonMouseClicked
       
        firstNameField.setText(null);
        lastNameField.setText(null);
        comboBoxP.removeAllItems();
        AddStudentDialog.dispose();
    }//GEN-LAST:event_cancelButtonMouseClicked

    private void comboBoxPFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_comboBoxPFocusLost
        
    }//GEN-LAST:event_comboBoxPFocusLost

    private void comboBoxCCStudentItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboBoxCCStudentItemStateChanged
      
        if(evt.getStateChange() == ItemEvent.SELECTED){
        
            
            if("Add New".equals((String) comboBoxCCStudent.getSelectedItem())) {
                AddCollegeDialog.setVisible(true);  
            }
            
            comboBoxP.removeAllItems();
            comboBoxP.addItem("");
            for(int i = 0; i < Main.program.length; i++){
            
                if(Main.END.equals(Main.program[i].getProgramCode())){
                    break;
                }
            
                if(comboBoxCCStudent.getSelectedItem().equals(Main.program[i].getCollegeCode())){
                    comboBoxP.addItem(Main.program[i].getProgramCode());
                }       
            
            }
            comboBoxP.addItem("Add New");
       }
        
    }//GEN-LAST:event_comboBoxCCStudentItemStateChanged

    private void confirmButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_confirmButtonMouseClicked

        boolean checkpoint = true;
        
        //unique id check
        if(idFieldNS.getText().length() == 9){
            
                for(int i = 0; i < Main.student.length; i++){
                    if(Main.END.equals(Main.student[i].getIdNum())){
                        break;
                    }
            
                    if(idFieldNS.getText().equals(Main.student[i].getIdNum())){
                    checkpoint = false;
                
                    //notify that the id is not unique
                }
            }
        } else {
            //notify that it should be YYYY-NNNN
            checkpoint = false;
        }
        

       
        //first name check
        String firstname = firstNameField.getText();
        
        if(firstname.length() <= 2){
            checkpoint = false;
            //notify that the first name should be greater than 2
            if(!firstname.matches("[a-zA-Z ]")){
                checkpoint = false;
            //notify that the firstname characters should not contain invalid chars and or should be greater than 2
            }
            
        }
        
    
        //lastname check
        String lastname = lastNameField.getText();
        if(lastname.length() <= 2){
            checkpoint = false;
            //notify that the lastname should be greater that 2
            if(!lastname.matches("[a-zA-Z]")){
            
                checkpoint = false;
                //notify that the firstname characters should not contain invalid chars
            }
    
        }
        

        
        //firstname and lastname check
        for(int i = 0; i < Main.student.length; i++){
            if(Main.END.equals(Main.student[i].getIdNum())){
                break;
            }
            
            if(firstname.equals(Main.student[i].getFirstName()) && lastname.equals(Main.student[i].getLastName())){
                checkpoint = false;
                
                //notify that the name already exists
            }
        }
        

        
        
        //college code and program code check
        String collegeCode = (String) comboBoxCCStudent.getSelectedItem();
        String programCode = (String) comboBoxP.getSelectedItem();
           
        if(collegeCode.equals("")){
            checkpoint = false;
            //notify that there is no college code selected or add a college code
        }
        

        
        if(programCode.equals("")){
            checkpoint = false;
            //notify that there is no program code selected or add a program to the college code
        }

        
        
        //if all input are valid the proceed
        if(checkpoint){
            
            for(int i = 0; i < Main.student.length; i++){
           
            
            if(Main.END.equals(Main.student[i].getIdNum())){
               
                String idNum = idFieldNS.getText();
                Main.student[i].setIdNum(idNum);
                Main.student[i].setFirstName(firstNameField.getText());
                Main.student[i].setLastName(lastNameField.getText());
                Main.student[i].setYearLevel( (String) comboBoxYL.getSelectedItem());
                
                //gender
                if(male.isSelected()){
                      Main.student[i].setGender(male.getText());
                }
                if(female.isSelected()){
                      Main.student[i].setGender(female.getText());
                }
               
                Main.student[i].setCollegeCode( (String) comboBoxCCStudent.getSelectedItem());
                Main.student[i].setProgramCode( (String) comboBoxP.getSelectedItem());
                
                Main.student[i+1].setIdNum(Main.END);
                
                //sort the object array first
                Student.sortObjectArray();
                
                //write the updated student data to the csv
                Write.writeStudent();
                
                firstNameField.setText(null);
                lastNameField.setText(null);
                AddStudentDialog.setVisible(false);
                loadStudentData();
                break;
            }
            
        }
        }
    
    }//GEN-LAST:event_confirmButtonMouseClicked

    private void newStudentMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_newStudentMouseReleased
        showStudentDialog();
    }//GEN-LAST:event_newStudentMouseReleased

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        
        //student Table Part
        saveButton.setVisible(false);
        cancel.setVisible(false);
        editButton.setEnabled(false);
        
        comboBoxCCode.setVisible(false);
        comboBoxYearL.setVisible(false);
        
        //program Table part
        saveProgram.setVisible(false);
        cancelProgram.setVisible(false);
        
        
        
        //college Table Part
        
        

        loadStudentData();
        loadCollegeData();
        loadProgramData();
    }//GEN-LAST:event_formWindowActivated

    private void newProgramMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_newProgramMouseReleased
        AddCollegeDialog.setLocationByPlatform(true);
        loadCollegeToProgramDialog();
    }//GEN-LAST:event_newProgramMouseReleased

    private void neweCollegeMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_neweCollegeMouseReleased
        AddCollegeDialog.setLocationByPlatform(true);
        AddCollegeDialog.setVisible(true);
    }//GEN-LAST:event_neweCollegeMouseReleased

    private void studentTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_studentTableMouseClicked
       getStudentTableRowData();
       editButton.setEnabled(true);
    }//GEN-LAST:event_studentTableMouseClicked

    private void editButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editButtonMouseClicked

        
        editButton.setVisible(false);
        delete.setVisible(false);
        
        saveButton.setVisible(true);
        cancel.setVisible(true);
        saveButton.setEnabled(true);
        cancel.setEnabled(true);

        studentTable.setFocusable(false);
        studentTable.setEnabled(false);
        SSIS.setEnabled(false);

        idNumberField.setEditable(false);
        idNumberField.setFocusable(false);

        firstNameLabel.setEditable(true);
        firstNameLabel.setFocusable(true);

        lastNameLabel.setEditable(true);
        lastNameLabel.setFocusable(true);

        yearLevelField.setEditable(true);
        yearLevelField.setFocusable(true);

        genderField.setEditable(true);
        genderField.setFocusable(true);

        collegeCodeField.setVisible(false);
        programCodeField.setVisible(false);
        yearLevelField.setVisible(false);
        genderField.setVisible(false);
        
        comboBoxCCode.setVisible(true);
        comboBoxSP.setVisible(true);
        comboBoxYearL.setVisible(true);
        maleG.setVisible(true);
        femaleG.setVisible(true);
        
        //load college data in comboBox
        comboBoxCCode.removeAllItems();
        for(int i = 0; i < Main.college.length; i++){
            if(Main.END.equals(Main.college[i].getCollegeCode())){
                break;
            }
            
            comboBoxCCode.addItem(Main.college[i].getCollegeCode());
        }
        
        //load Academic Year
        comboBoxYearL.removeAllItems();
        for(int i = 0; i < Main.YearLevel.length; i++){
         
            if(Main.YearLevel[i] == null){
                break;
            }
            
            comboBoxYearL.addItem(Main.YearLevel[i]);
        }
        
    }//GEN-LAST:event_editButtonMouseClicked

    private void saveButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveButtonMouseClicked

        saveButton.setEnabled(false);
        cancel.setEnabled(false);

        delete.setVisible(true);
        editButton.setVisible(true);
        saveButton.setVisible(false);
        cancel.setVisible(false);
        
        studentTable.setFocusable(true);
        studentTable.setEnabled(true);
        SSIS.setEnabled(true);


        firstNameLabel.setEditable(false);
        firstNameLabel.setFocusable(false);

        lastNameLabel.setEditable(false);
        lastNameLabel.setFocusable(false);

        yearLevelField.setEditable(false);
        yearLevelField.setFocusable(false);

        genderField.setEditable(false);
        genderField.setFocusable(false);

        collegeCodeField.setEditable(false);
        collegeCodeField.setFocusable(false);

        programCodeField.setEditable(false);
        programCodeField.setFocusable(false);
        
        collegeCodeField.setVisible(true);
        programCodeField.setVisible(true);
        yearLevelField.setVisible(true);
        genderField.setVisible(true);
        
        comboBoxCCode.setVisible(false);
        comboBoxSP.setVisible(false);
        comboBoxYearL.setVisible(false);
        maleG.setVisible(false);
        femaleG.setVisible(false);
        
        //get the inputs in the labels and comboBox
        saveEdit();
        Write.writeStudent();
        

        clearStudentFields();
        
        loadStudentData();
    }//GEN-LAST:event_saveButtonMouseClicked

    private void cancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelMouseClicked

        saveButton.setEnabled(false);
        cancel.setEnabled(false);
        saveButton.setVisible(false);
        
        delete.setVisible(true);
        editButton.setVisible(true);
        saveButton.setVisible(false);
        
        studentTable.setFocusable(true);
        studentTable.setEnabled(true);
        SSIS.setEnabled(true);


        firstNameLabel.setEditable(false);
        firstNameLabel.setFocusable(false);

        lastNameLabel.setEditable(false);
        lastNameLabel.setFocusable(false);

        yearLevelField.setEditable(false);
        yearLevelField.setFocusable(false);

        genderField.setEditable(false);
        genderField.setFocusable(false);

        collegeCodeField.setEditable(false);
        collegeCodeField.setFocusable(false);

        programCodeField.setEditable(false);
        programCodeField.setFocusable(false);
        
        collegeCodeField.setVisible(true);
        programCodeField.setVisible(true);
        yearLevelField.setVisible(true);
        genderField.setVisible(true);
        
        
        comboBoxCCode.setVisible(false);
        comboBoxSP.setVisible(false);
        comboBoxYearL.setVisible(false);
        maleG.setVisible(false);
        femaleG.setVisible(false);
        
        getStudentTableRowData();
        
        
    }//GEN-LAST:event_cancelMouseClicked

    private void comboBoxCCodeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboBoxCCodeItemStateChanged
         
        if(evt.getStateChange() == ItemEvent.SELECTED){
        
            comboBoxSP.removeAllItems();
        
            for(int i = 0; i < Main.program.length; i++){
            
                if(Main.END.equals(Main.program[i].getProgramCode())){
                    break;
                }
            
                if(comboBoxCCode.getSelectedItem().equals(Main.program[i].getCollegeCode())){
                    comboBoxSP.addItem(Main.program[i].getProgramCode());
                }       
            
            }
           
       }
    }//GEN-LAST:event_comboBoxCCodeItemStateChanged

    private void comboBoxYItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboBoxYItemStateChanged
        
        if(comboBoxY.getSelectedItem() == null){
            return;
        }
        String year = (String) comboBoxY.getSelectedItem();
        if(year.length() == 4){
            String num = genNum();
            idFieldNS.setText(num);
        }
    
    }//GEN-LAST:event_comboBoxYItemStateChanged

    private void deleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteMouseClicked
        String temp = idNumberField.getText();
        
        for(int i = 0; i < Main.student.length; i++){
            if(Main.END.equals(Main.student[i].getIdNum())){
                return;
            }
            
            if(temp.equals(Main.student[i].getIdNum())){
                Main.student[i].setIdNum(null);
                Student.sortObjectArray();
                loadStudentData();
                Write.writeStudent();
                clearStudentFields();
                delete.setEnabled(false);
                editButton.setEnabled(false);
            }
        }
        

        
      
        
    }//GEN-LAST:event_deleteMouseClicked

    private void searchButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchButtonMouseClicked
        search();
    }//GEN-LAST:event_searchButtonMouseClicked

    private void jLabel16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseClicked
        loadStudentData();
    }//GEN-LAST:event_jLabel16MouseClicked

    private void comboBoxPItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboBoxPItemStateChanged
       //this is the program comboBox in the AddStudentDialog
        if(evt.getStateChange() == ItemEvent.SELECTED){
        
            if("Add New".equals((String) comboBoxP.getSelectedItem())){
                AddProgramDialog.setVisible(false);

                loadCollegeToProgramDialog();
            }
            
           
       }
       
    }//GEN-LAST:event_comboBoxPItemStateChanged

    private void programTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_programTableMouseClicked
        getProgramTableRowData();
    }//GEN-LAST:event_programTableMouseClicked

    private void editProgramMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editProgramMouseClicked
        
        //need to setvisible in avtivate window to false the save and cancel
        
        editProgram.setVisible(false);
        deleteProgram.setVisible(false);
        
        saveProgram.setVisible(true);
        cancelProgram.setVisible(true);
        
        programCodeP.setFocusable(true);
        programCodeN.setFocusable(true);
        collegeCodeP.setFocusable(true);
        
        
    }//GEN-LAST:event_editProgramMouseClicked

    private void deleteProgramMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteProgramMouseClicked
        String temp = programCodeP.getText();
        
        for(int i = 0; i < Main.program.length; i++){
            if(Main.END.equals(Main.program[i].getProgramCode())){
                return;
            }
            
            if(temp.equals(Main.program[i].getProgramCode())){
                Main.program[i].setProgramCode(null);
                Program.sortProgramsByCode();
                
                //popup to notify before proceeding to delete the program: check the student table first if the program exists/used by the students
                
                                
                loadProgramData();
                Write.writeProgram();
                clearProgramFields();
                delete.setVisible(false);
                editButton.setVisible(false);
            }
        }
    }//GEN-LAST:event_deleteProgramMouseClicked

    
    public static void showStudentDialog(){
        AddStudentDialog.setLocationByPlatform(true);
        
        //add the items for Year Level
        comboBoxYL.removeAllItems();
        comboBoxYL.addItem("");
        for(int i = 0; i < Main.YearLevel.length; i++){
            if(Main.YearLevel[i] == null){
                break;
            }
            comboBoxYL.addItem(Main.YearLevel[i]);
        }
        //-----------------
        
        //add the items for College Code
        loadCollegeCom();
        
        //add the items for Academic Year
        comboBoxY.removeAllItems();
        for(int i = 0; i < Main.Years.length; i++){
         
            if(Main.Years[i] == null){
                break;
            }
            
            comboBoxY.addItem(Main.Years[i]);
        }
        //----------------------
        
        //generate number
        String num = genNum();
        idFieldNS.setText(num);
        
        AddStudentDialog.setVisible(true);
    }
    
    
    
    public static void loadCollegeToProgramDialog(){
        //load all available college code in the comboBox
        comboBoxCC.removeAllItems();
        
        for(int i = 0; i < Main.college.length; i++){
            if(Main.END.equals(Main.college[i].getCollegeCode())){
                break;
            }
             comboBoxCC.addItem(Main.college[i].getCollegeCode());
        }
        AddProgramDialog.setVisible(true);
    }
    
    public static void loadProgramCom(){
        
            comboBoxP.removeAllItems();
            comboBoxP.addItem("");
            for(int i = 0; i < Main.program.length; i++){
            
                if(Main.END.equals(Main.program[i].getProgramCode())){
                    break;
                }
            
                if(comboBoxCCStudent.getSelectedItem().equals(Main.program[i].getCollegeCode())){
                    comboBoxP.addItem(Main.program[i].getProgramCode());
                }       
            
            }
            comboBoxP.addItem("Add New");
            
            }
    
    public static void loadCollegeCom(){
         
        //add the items for College Code
        comboBoxCCStudent.removeAllItems();
        comboBoxCCStudent.addItem("");
        for(int i = 0; i < Main.college.length; i++){
            if(Main.END.equals(Main.college[i].getCollegeCode())){
                break;
            }
            comboBoxCCStudent.addItem(Main.college[i].getCollegeCode());
        }
        comboBoxCCStudent.addItem("Add New");
        
        
        AddCollegeDialog.setVisible(false);
                
    }
    
//-------------------------------------------------------------------------------------------
   public static void clearStudentFields(){
       

       idNumberField.setText("");
       firstNameLabel.setText("");
       lastNameLabel.setText("");
       yearLevelField.setText("");
       genderField.setText("");
       collegeCodeField.setText("");
       programCodeField.setText("");
   }
//-------------------------------------------------------------------------------------------
   
   public static void clearProgramFields(){
       
       programCodeP.setText("");
       programCodeN.setText("");
       collegeCodeP.setText("");
   }
   
    
//-------------------------------------------------------------------------------------------
   public static void search(){
       
       if(searchField.getText().length() > 0){
           
           String filter = (String) comboBoxSearch.getSelectedItem();
           String search = searchField.getText();
           
           
           if(filter.equals("ID Number")){
               loadFilteredStudentData(s -> search.equals(s.getIdNum()));
           }
           
           if(filter.equals("Firstname")){
               loadFilteredStudentData(s -> search.equals(s.getFirstName()));
           }
           
           if(filter.equals("Lastname")){
               loadFilteredStudentData(s -> search.equals(s.getLastName()));
           }
           
           if(filter.equals("Year Level")){
               loadFilteredStudentData(s -> search.equals(s.getYearLevel()));
           }
           
           if(filter.equals("Gender")){
               loadFilteredStudentData(s -> search.equals(s.getGender()));
           }
           
           if(filter.equals("Program Code")){
               loadFilteredStudentData(s -> search.equals(s.getProgramCode()));
           }
           
           if(filter.equals("College Code")){
               loadFilteredStudentData(s -> search.equals(s.getCollegeCode()));
           }
           
       } else {
           loadStudentData();
       }
    
}
//-------------------------------------------------------------------------------------------
    
   
//This method is for loading Student Data's to the JTable
//-------------------------------------------------------------------------------------------
    public static void loadDataToStudentTable(Object[][] data){
    
        studentTable.getTableHeader().setResizingAllowed(false);
        studentTable.getTableHeader().setReorderingAllowed(false);
        studentTable.setCellSelectionEnabled(false);
        studentTable.setRowSelectionAllowed(true);
        studentTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
     
        // [FORMAT]: IdNum/Firstname/Lastname/YearLevel/Gender/CollegeCode/ProgramCode
        String studentFormat[] = { "ID Number", "First Name", "Last Name", "Year Level", "Gender", "Program Code", "College Code"};
  
        
        
        DefaultTableModel model = new DefaultTableModel(data, studentFormat);
        studentTable.setModel(model);
        
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);
        studentTable.getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
        studentTable.getColumnModel().getColumn(3).setCellRenderer(centerRenderer);
        studentTable.getColumnModel().getColumn(4).setCellRenderer(centerRenderer);
        studentTable.getColumnModel().getColumn(5).setCellRenderer(centerRenderer);
        
        //Color
        Color tableHeaderBg = new Color(7, 27, 20);
        Color tableHeaderFg = new Color(215,240,220);
        studentTable.getTableHeader().setBackground(tableHeaderBg);

        studentTable.getTableHeader().setForeground(tableHeaderFg);
        //make the cell not selectable
        studentTable.setDefaultEditor(Object.class, null);
        
        getStudentTableRowData();
}    
//-------------------------------------------------------------------------------------------

    public static void loadStudentData(){
        
        int count = 0;
        while(count < Main.student.length){
            if(Main.END.equals(Main.student[count].getIdNum())){
                break;
            }
            count++;
        }
        
        Object[][] studentData = new Object[count][Main.STUDENTDATA_FORMAT];
 
        for(int i = 0; i <  Main.student.length; i++){
            
          
            if(Main.END.equals(Main.student[i].getIdNum())){
                break;
            }
            
            studentData[i][0] = Main.student[i].getIdNum();
            studentData[i][1] = Main.student[i].getFirstName();
            studentData[i][2] = Main.student[i].getLastName();
            studentData[i][3] = Main.student[i].getYearLevel();
            studentData[i][4] = Main.student[i].getGender();
            studentData[i][5] = Main.student[i].getProgramCode();
            studentData[i][6] = Main.student[i].getCollegeCode();
            
        
        }
        
        loadDataToStudentTable(studentData);
    }
//-------------------------------------------------------------------------------------------  
    
    public static void loadFilteredStudentData(Predicate<Student> filter) {
        int count = 0;
        while (count < Main.student.length) {
            if (Main.END.equals(Main.student[count].getIdNum())) {
                break;
            }
            count++;
        }

        Object[][] studentData = new Object[count][Main.STUDENTDATA_FORMAT];
        int dataIndex = 0; // Index for studentData array

        for (int i = 0; i < Main.student.length; i++) {
            if (Main.END.equals(Main.student[i].getIdNum())) {
                break;
            }

            // Apply the filter (if provided)
            if (filter == null || filter.test(Main.student[i])) {
                studentData[dataIndex][0] = Main.student[i].getIdNum();
                studentData[dataIndex][1] = Main.student[i].getFirstName();
                studentData[dataIndex][2] = Main.student[i].getLastName();
                studentData[dataIndex][3] = Main.student[i].getYearLevel();
                studentData[dataIndex][4] = Main.student[i].getGender();
                studentData[dataIndex][5] = Main.student[i].getProgramCode();
                studentData[dataIndex][6] = Main.student[i].getCollegeCode();
                dataIndex++;
            }
        }

        // Resize the array to remove empty rows (if any)
        Object[][] finalStudentData = new Object[dataIndex][Main.STUDENTDATA_FORMAT];
        System.arraycopy(studentData, 0, finalStudentData, 0, dataIndex);

        loadDataToStudentTable(finalStudentData);
    }

    
//-------------------------------------------------------------------------------------------    
    
    
//-------------------------------------------------------------------------------------------
    public static void loadCollegeData(){
        
        collegeTable.getTableHeader().setResizingAllowed(false);
        collegeTable.getTableHeader().setReorderingAllowed(false);
 
        collegeTable.setCellSelectionEnabled(false);
        collegeTable.setRowSelectionAllowed(true);
        collegeTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        
        
        
        //load the collegetData
       
        int count = 0;
        while(count < Main.college.length){
            if(Main.END.equals(Main.college[count].getCollegeCode())){
                break;
            }
            count++;
        }
        
     
        // [FORMAT]: Code/Name
        String collegeFormat[] = {"College Code", "College Name"};
        
        Object[][] collegeData = new Object[count][Main.COLLEGEDATA_FORMAT];
 
        for(int i = 0; i <  Main.college.length; i++){
            
          
            if(Main.END.equals(Main.college[i].getCollegeCode())){
                break;
            }
            
           collegeData[i][0] = Main.college[i].getCollegeCode();
           collegeData[i][1] = Main.college[i].getCollegeName();             
                  
        }
        
        
        DefaultTableModel model = new DefaultTableModel(collegeData, collegeFormat);
        collegeTable.setModel(model);
        
        collegeTable.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        int size = collegeTable.getSize().width;
        
        float one = size * .3f;
        float two = size * .701f;
        
        collegeTable.getColumnModel().getColumn(0).setPreferredWidth((int) one);
        collegeTable.getColumnModel().getColumn(1).setPreferredWidth((int) two);
       
           
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);
        collegeTable.getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
        
        Color tableHeaderBg = new Color(7, 27, 20);
        Color tableHeaderFg = new Color(215,240,220);
        collegeTable.getTableHeader().setBackground(tableHeaderBg);

        collegeTable.getTableHeader().setForeground(tableHeaderFg);
        
        
        
        //make the cell not selectable
        collegeTable.setDefaultEditor(Object.class, null);
        
    }
    
//-------------------------------------------------------------------------------------------
    
    
//-------------------------------------------------------------------------------------------
    public static void loadProgramData(){
        
        programTable.getTableHeader().setResizingAllowed(false);
        programTable.getTableHeader().setReorderingAllowed(false);
 
        programTable.setCellSelectionEnabled(false);
        programTable.setRowSelectionAllowed(true);
        programTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        
        
        
        //load the collegetData
        

        int count = 0;
        while(count < Main.program.length){
            if(Main.END.equals(Main.program[count].getProgramCode())){
                break;
            }
            count++;
        }
        
     
        // [FORMAT]: Code/Name
        String programFormat[] = {"Program Code", "Program Name", "College Code"};
        
        Object[][] programData = new Object[count][Main.PROGRAMDATA_FORMAT];
 
        for(int i = 0; i <  Main.program.length; i++){
            
          
            if(Main.END.equals(Main.program[i].getProgramCode())){
                break;
            }
            
           programData[i][0] = Main.program[i].getProgramCode();
           programData[i][1] = Main.program[i].getProgramName();   
           programData[i][2] = Main.program[i].getCollegeCode();
                  
        }
        
        
        DefaultTableModel model = new DefaultTableModel(programData, programFormat);
        programTable.setModel(model);
        
        programTable.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        int size = programTable.getSize().width;
        
        float one = size * .2f;
        float two = size * .603f;
        
        programTable.getColumnModel().getColumn(0).setPreferredWidth((int)one);
        programTable.getColumnModel().getColumn(1).setPreferredWidth((int)two);
        programTable.getColumnModel().getColumn(2).setPreferredWidth((int)one);
        
                   
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);
        programTable.getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
        programTable.getColumnModel().getColumn(2).setCellRenderer(centerRenderer);
        
        Color tableHeaderBg = new Color(7, 27, 20);
        Color tableHeaderFg = new Color(215,240,220);
        programTable.getTableHeader().setBackground(tableHeaderBg);

        programTable.getTableHeader().setForeground(tableHeaderFg);
        
        //make the cell not selectable
        programTable.setDefaultEditor(Object.class, null);
        
        
    }
    
//-------------------------------------------------------------------------------------------
    
    
//-------------------------------------------------------------------------------------------
    public static void getStudentTableRowData(){
        
        if(studentTable.getRowCount() == 1){
            studentTable.setRowSelectionInterval(0, 0);
        }
        
         //get the row data to load in the individual label
        int selectedRow = studentTable.getSelectedRow();
        
      
        if(selectedRow != -1){
            
            editButton.setEnabled(true);
            delete.setEnabled(true);
            
            idNumberField.setText( (String) studentTable.getValueAt(selectedRow, 0));
            firstNameLabel.setText( (String) studentTable.getValueAt(selectedRow, 1));
            lastNameLabel.setText( (String) studentTable.getValueAt(selectedRow, 2));
            yearLevelField.setText( (String) studentTable.getValueAt(selectedRow, 3));
            genderField.setText( (String) studentTable.getValueAt(selectedRow, 4));
            collegeCodeField.setText( (String) studentTable.getValueAt(selectedRow, 5));
            programCodeField.setText( (String) studentTable.getValueAt(selectedRow, 6));
        }
        
    }

//-------------------------------------------------------------------------------------------    

    
    public static void getProgramTableRowData(){
        
        if(programTable.getRowCount() == 1){
            programTable.setRowSelectionInterval(0, 0);
        }
        
        int selectedRow = programTable.getSelectedRow();
        
        if(selectedRow != -1){
            
            editProgram.setEnabled(true);
            //delete
            
            programCodeP.setText( (String) programTable.getValueAt(selectedRow, 0));
            programCodeN.setText((String) programTable.getValueAt(selectedRow, 1));
            collegeCodeP.setText((String) programTable.getValueAt(selectedRow, 2));
            
        }
        
        
    }
    
//-------------------------------------------------------------------------------------------
    public static void saveEdit(){
    
        //checkpoints
        
        for(int i = 0; i < Main.student.length; i++){
            
            if(Main.END.equals(Main.student[i].getIdNum())){
                break;
            }
            
            if(idNumberField.getText().equals(Main.student[i].getIdNum())){
                
                Main.student[i].setFirstName(firstNameLabel.getText());
                Main.student[i].setLastName(lastNameLabel.getText());
                Main.student[i].setYearLevel( (String) comboBoxYearL.getSelectedItem());
                
                if(maleG.isSelected()){
                      Main.student[i].setGender(maleG.getText());
                }
                if(femaleG.isSelected()){
                      Main.student[i].setGender(femaleG.getText());
                }
             
                Main.student[i].setCollegeCode( (String) comboBoxCCode.getSelectedItem());
                Main.student[i].setProgramCode( (String) comboBoxSP.getSelectedItem());
               
            }
            
        }
   
}
//-----------------------------------------------------------------------------------------------------   
    
    
//-----------------------------------------------------------------------------------------------------
   public static String genNum() {
       
       // Get the academic year
        String academicYear = (String) comboBoxY.getSelectedItem();

        // Check if the array is empty or the first element is null
        if (Main.student == null || Main.student.length == 0 || Main.student[0] == null) {
            return academicYear + "-0001"; // Default first ID for the current year
        }

        // Handle the first element
        String firstIdNum = Main.student[0].getIdNum();
        if (Main.END.equals(firstIdNum)) {
            return academicYear + "-0001"; // If the first element is "END", start from 0001 for the current year
        }

        // Loop through the array to find the next unique ID for the current year
        int maxUniqueId = 0; // Track the maximum unique ID for the current year
        for (int i = 0; i < Main.student.length; i++) {
            String currentIdNum = Main.student[i].getIdNum();

            // Skip null or "END" values
            if (currentIdNum == null || Main.END.equals(currentIdNum)) {
                continue;
            }

            // Split the current ID into year and unique ID
            String[] parts = currentIdNum.split("-");
            if (parts.length != 2) {
                continue; // Skip invalid formats
            }

            // Parse the year and unique ID
            int year;
            int uniqueId;
            try {
                year = Integer.parseInt(parts[0]);
                uniqueId = Integer.parseInt(parts[1]);
            } catch (NumberFormatException e) {
                continue; // Skip if the year or unique ID is not a number
            }

            // Only consider IDs for the current year
            if (year == Integer.parseInt(academicYear)){
                if (uniqueId > maxUniqueId && uniqueId -1 == maxUniqueId) {
                    maxUniqueId = uniqueId;
                } else {
                    int nextUniqueId = maxUniqueId + 1;
                    return academicYear + formatUniqueId(nextUniqueId);
                }
            }
        }

        // Generate the next unique ID for the current year
        int nextUniqueId = maxUniqueId + 1;
        return academicYear + formatUniqueId(nextUniqueId);
}

// Helper method to format the unique ID
    private static String formatUniqueId(int uniqueId) {
        if (uniqueId < 10) {
            return "-000" + uniqueId;
        } else if (uniqueId < 100) {
            return "-00" + uniqueId;
        } else if (uniqueId < 1000) {
            return "-0" + uniqueId;
        } else {
            return "-" + uniqueId;
        }
}
    
    
//-------------------------------------------------------------------------------------------    
  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JDialog AddCollegeDialog;
    public static javax.swing.JDialog AddProgramDialog;
    public static javax.swing.JDialog AddStudentDialog;
    public static javax.swing.JPanel MainMenu;
    public static javax.swing.JLabel SIS;
    public static javax.swing.JMenu SSIS;
    public static javax.swing.JDialog ViewCollegeListDialog;
    public static javax.swing.JMenu about;
    public static javax.swing.JButton addButtonC;
    public static javax.swing.JButton addButtonP;
    public static javax.swing.JButton cancel;
    public static javax.swing.JButton cancelButton;
    public static javax.swing.JButton cancelButtonAddC;
    public static javax.swing.JButton cancelButtonAddP;
    public static javax.swing.JButton cancelProgram;
    public static javax.swing.JTextField codeFieldC;
    public static javax.swing.JTextField codeFieldP;
    public static javax.swing.JTextField collegeCodeField;
    public static javax.swing.JTextField collegeCodeP;
    public static javax.swing.JPanel collegeListPanel;
    public static javax.swing.JTable collegeTable;
    public static javax.swing.JComboBox<String> comboBoxCC;
    public static javax.swing.JComboBox<String> comboBoxCCStudent;
    public static javax.swing.JComboBox<String> comboBoxCCode;
    public static javax.swing.JComboBox<String> comboBoxP;
    public static javax.swing.JComboBox<String> comboBoxSP;
    public static javax.swing.JComboBox<String> comboBoxSearch;
    public static javax.swing.JComboBox<String> comboBoxY;
    public static javax.swing.JComboBox<String> comboBoxYL;
    public static javax.swing.JComboBox<String> comboBoxYearL;
    public static javax.swing.JButton confirmButton;
    public static javax.swing.JButton delete;
    public static javax.swing.JButton deleteProgram;
    public static javax.swing.JButton editButton;
    public static javax.swing.JButton editProgram;
    public static javax.swing.JRadioButton female;
    public static javax.swing.JRadioButton femaleG;
    public static javax.swing.JTextField firstNameField;
    public static javax.swing.JTextField firstNameLabel;
    public static javax.swing.JTextField genderField;
    public static javax.swing.JTextField genderField2;
    public static javax.swing.ButtonGroup genderG;
    public static javax.swing.ButtonGroup genderGroup;
    public static javax.swing.JTextField idFieldNS;
    public static javax.swing.JLabel idLabel;
    public static javax.swing.JLabel idLabel1;
    public static javax.swing.JLabel idLabel10;
    public static javax.swing.JLabel idLabel11;
    public static javax.swing.JLabel idLabel12;
    public static javax.swing.JLabel idLabel13;
    public static javax.swing.JLabel idLabel15;
    public static javax.swing.JLabel idLabel16;
    public static javax.swing.JLabel idLabel17;
    public static javax.swing.JLabel idLabel18;
    public static javax.swing.JLabel idLabel19;
    public static javax.swing.JLabel idLabel2;
    public static javax.swing.JLabel idLabel3;
    public static javax.swing.JLabel idLabel4;
    public static javax.swing.JLabel idLabel5;
    public static javax.swing.JLabel idLabel6;
    public static javax.swing.JLabel idLabel7;
    public static javax.swing.JLabel idLabel8;
    public static javax.swing.JLabel idLabel9;
    public static javax.swing.JTextField idNumberField;
    public static javax.swing.JButton editCollege;
    public static javax.swing.JButton cancelCollege;
    public static javax.swing.JComboBox<String> jComboBox1;
    public static javax.swing.JLabel jLabel1;
    public static javax.swing.JLabel jLabel10;
    public static javax.swing.JLabel jLabel11;
    public static javax.swing.JLabel jLabel12;
    public static javax.swing.JLabel jLabel13;
    public static javax.swing.JLabel idCheck;
    public static javax.swing.JLabel jLabel15;
    public static javax.swing.JLabel jLabel16;
    public static javax.swing.JLabel programCodeCheck;
    public static javax.swing.JLabel jLabel18;
    public static javax.swing.JLabel jLabel2;
    public static javax.swing.JLabel jLabel3;
    public static javax.swing.JLabel jLabel4;
    public static javax.swing.JLabel jLabel5;
    public static javax.swing.JLabel jLabel6;
    public static javax.swing.JLabel jLabel7;
    public static javax.swing.JLabel jLabel8;
    public static javax.swing.JLabel jLabel9;
    public static javax.swing.JMenuItem jMenuItem1;
    public static javax.swing.JPanel jPanel1;
    public static javax.swing.JPanel jPanel3;
    public static javax.swing.JPanel jPanel4;
    public static javax.swing.JPopupMenu jPopupMenu1;
    public static javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JScrollPane jScrollPane2;
    public static javax.swing.JScrollPane jScrollPane4;
    public static javax.swing.JSeparator jSeparator3;
    public static javax.swing.JSpinner jSpinner1;
    public static javax.swing.JTextField lastNameField;
    public static javax.swing.JTextField lastNameLabel;
    public static javax.swing.JRadioButton male;
    public static javax.swing.JRadioButton maleG;
    public static javax.swing.JMenuBar menuBar;
    public static javax.swing.JTextField nameFieldC;
    public static javax.swing.JTextField nameFieldP;
    public static javax.swing.JMenu newMenu;
    public static javax.swing.JMenuItem newProgram;
    public static javax.swing.JMenuItem newStudent;
    public static javax.swing.JMenuItem neweCollege;
    public static javax.swing.JTextField programCodeField;
    public static javax.swing.JTextField programCodeField2;
    public static javax.swing.JTextField programCodeField3;
    public static javax.swing.JTextField programCodeField4;
    public static javax.swing.JTextField programCodeField5;
    public static javax.swing.JTextField collegeCodeN;
    public static javax.swing.JTextField collegeCodeC;
    public static javax.swing.JTextField programCodeN;
    public static javax.swing.JTextField programCodeP;
    public static javax.swing.JPanel programListPanel;
    public static javax.swing.JTable programTable;
    public static javax.swing.JMenu reportMenu;
    public static javax.swing.JButton saveButton;
    public static javax.swing.JButton saveProgram;
    public static javax.swing.JButton searchButton;
    public static javax.swing.JTextField searchField;
    public static javax.swing.JMenu settings;
    public static javax.swing.JTable studentTable;
    public static javax.swing.JTextField yearLevelField;
    // End of variables declaration//GEN-END:variables
}
