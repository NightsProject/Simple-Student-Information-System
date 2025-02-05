
package SIS.Components.Frames;

import SIS.Main;
import SIS.Components.Write;

import java.awt.event.*;
import javax.swing.ButtonModel;
import javax.swing.table.DefaultTableModel;
public class MainWindow extends javax.swing.JFrame {

   
    public MainWindow() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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
        genderGroup = new javax.swing.ButtonGroup();
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
        genderField = new javax.swing.JTextField();
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
        cancel = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        SSIS = new javax.swing.JMenu();
        newStudent = new javax.swing.JMenuItem();
        newProgram = new javax.swing.JMenuItem();
        neweCollege = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();

        AddCollegeDialog.setTitle("Add College");
        AddCollegeDialog.setMinimumSize(new java.awt.Dimension(266, 160));
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

        AddProgramDialog.setTitle("Add College");
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

        idLabel.setFont(new java.awt.Font("sansserif", 1, 13)); // NOI18N
        idLabel.setText("ID NUMBER");
        AddStudentDialog.getContentPane().add(idLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 120, 20));

        idLabel1.setText("COLLEGE CODE");
        AddStudentDialog.getContentPane().add(idLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, 120, 20));

        idLabel2.setText("FIRST NAME");
        AddStudentDialog.getContentPane().add(idLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 120, 10));

        idLabel3.setText("LAST NAME");
        AddStudentDialog.getContentPane().add(idLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, 120, 20));

        idLabel4.setText("YEAR LEVEL");
        AddStudentDialog.getContentPane().add(idLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 120, 120, 10));

        idLabel5.setText("GENDER");
        AddStudentDialog.getContentPane().add(idLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 190, 110, 20));

        idLabel6.setText("PROGRAM CODE");
        AddStudentDialog.getContentPane().add(idLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 260, 120, 20));

        comboBoxP.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                comboBoxPFocusLost(evt);
            }
        });
        AddStudentDialog.getContentPane().add(comboBoxP, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 280, 150, 30));
        AddStudentDialog.getContentPane().add(firstNameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 150, 30));
        AddStudentDialog.getContentPane().add(lastNameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 150, 30));

        genderGroup.add(male);
        male.setSelected(true);
        male.setText("Male");
        AddStudentDialog.getContentPane().add(male, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 210, -1, 30));

        genderGroup.add(female);
        female.setText("female");
        AddStudentDialog.getContentPane().add(female, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 210, -1, 30));

        comboBoxCCStudent.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
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
        idFieldNS.setText("-");
        idFieldNS.setFocusable(false);
        AddStudentDialog.getContentPane().add(idFieldNS, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, 90, 30));

        confirmButton.setText("CONFIRM");
        confirmButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                confirmButtonMouseClicked(evt);
            }
        });
        AddStudentDialog.getContentPane().add(confirmButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 350, 90, -1));

        comboBoxYL.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1st Year", "2nd Year", "3rd Year", "4th Year" }));
        AddStudentDialog.getContentPane().add(comboBoxYL, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 140, 150, 30));

        comboBoxY.setEditable(true);
        AddStudentDialog.getContentPane().add(comboBoxY, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 63, 110, 40));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Student Information System");
        setMaximumSize(new java.awt.Dimension(1052, 646));
        setMinimumSize(new java.awt.Dimension(1052, 646));
        setPreferredSize(new java.awt.Dimension(1052, 646));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        MainMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        SIS.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        SIS.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SIS.setText("Student Information System");
        MainMenu.add(SIS, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, 330, 50));

        studentTable.setAutoCreateRowSorter(true);
        studentTable.setBorder(javax.swing.BorderFactory.createEtchedBorder());
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
        studentTable.setName(""); // NOI18N
        studentTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                studentTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(studentTable);

        MainMenu.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 140, 710, -1));

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setMaximumSize(new java.awt.Dimension(260, 310));
        jPanel1.setMinimumSize(new java.awt.Dimension(260, 310));
        jPanel1.setPreferredSize(new java.awt.Dimension(260, 310));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        idLabel13.setText("PROGRAM CODE");
        jPanel1.add(idLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 120, 30));

        programCodeField.setEditable(false);
        programCodeField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        programCodeField.setFocusable(false);
        jPanel1.add(programCodeField, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 260, 100, 30));

        collegeCodeField.setEditable(false);
        collegeCodeField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        collegeCodeField.setFocusable(false);
        jPanel1.add(collegeCodeField, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, 100, 30));

        idLabel8.setText("COLLEGE CODE");
        jPanel1.add(idLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 120, 30));

        idLabel12.setText("GENDER");
        jPanel1.add(idLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 110, 30));

        genderField.setEditable(false);
        genderField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        genderField.setFocusable(false);
        jPanel1.add(genderField, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, 130, 30));

        yearLevelField.setEditable(false);
        yearLevelField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        yearLevelField.setFocusable(false);
        jPanel1.add(yearLevelField, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, 130, 30));

        idLabel11.setText("YEAR LEVEL");
        jPanel1.add(idLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 120, 30));

        idLabel10.setText("LAST NAME");
        jPanel1.add(idLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 120, 30));

        lastNameLabel.setEditable(false);
        lastNameLabel.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        lastNameLabel.setFocusable(false);
        jPanel1.add(lastNameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, 130, 30));

        firstNameLabel.setEditable(false);
        firstNameLabel.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        firstNameLabel.setFocusable(false);
        jPanel1.add(firstNameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, 130, 30));

        idLabel9.setText("FIRST NAME");
        jPanel1.add(idLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 120, 30));

        idLabel7.setText("ID NUMBER");
        jPanel1.add(idLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 120, 30));

        idNumberField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(idNumberField, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 130, 30));

        editButton.setText("EDIT");
        editButton.setEnabled(false);
        editButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editButtonMouseClicked(evt);
            }
        });
        jPanel1.add(editButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 310, -1, 20));

        saveButton.setText("SAVE");
        saveButton.setEnabled(false);
        saveButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                saveButtonMouseClicked(evt);
            }
        });
        jPanel1.add(saveButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 310, -1, 20));

        cancel.setText("CANCEL");
        cancel.setEnabled(false);
        cancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelMouseClicked(evt);
            }
        });
        jPanel1.add(cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 310, -1, 20));

        MainMenu.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 260, 340));

        getContentPane().add(MainMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1050, 620));

        SSIS.setText("SSIS");

        newStudent.setText("New Student");
        newStudent.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                newStudentMouseReleased(evt);
            }
        });
        SSIS.add(newStudent);

        newProgram.setText("New Program");
        newProgram.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                newProgramMouseReleased(evt);
            }
        });
        SSIS.add(newProgram);

        neweCollege.setText("New College");
        neweCollege.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                neweCollegeMouseReleased(evt);
            }
        });
        SSIS.add(neweCollege);

        jMenuBar1.add(SSIS);

        jMenu4.setText("Settings");
        jMenuBar1.add(jMenu4);

        jMenu3.setText("About");
        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

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
               
 
       /*
       //wait for 3 seconds
       try {
           Thread.sleep(3000); 
       }catch (InterruptedException e){
           
       }
       */
   
       
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
        
            comboBoxP.removeAllItems();
        
            for(int i = 0; i < Main.program.length; i++){
            
                if(Main.END.equals(Main.program[i].getProgramCode())){
                    break;
                }
            
                if(comboBoxCCStudent.getSelectedItem().equals(Main.program[i].getCollegeCode())){
                    comboBoxP.addItem(Main.program[i].getProgramCode());
                }       
            
            }
           
       }
        
    }//GEN-LAST:event_comboBoxCCStudentItemStateChanged

    private void confirmButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_confirmButtonMouseClicked
        
        for(int i = 0; i < Main.student.length; i++){
           
            
            if(Main.END.equals(Main.student[i].getIdNum())){
               
                String idNum = (String) comboBoxY.getSelectedItem() + idFieldNS.getText();
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
                
                Write.writeStudent();
                
            
                firstNameField.setText(null);
                lastNameField.setText(null);
                comboBoxP.removeAllItems();
                AddStudentDialog.dispose();
                loadStudentData();
                break;
            }
            
        }
    }//GEN-LAST:event_confirmButtonMouseClicked

    private void newStudentMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_newStudentMouseReleased
       
        AddStudentDialog.setLocationByPlatform(true);
        
        //add the items for Year Level
        comboBoxYL.removeAllItems();
        for(int i = 0; i < Main.YearLevel.length; i++){
            if(Main.YearLevel[i] == null){
                break;
            }
            comboBoxYL.addItem(Main.YearLevel[i]);
        }
        //-----------------
        
        //add the items for College Code
        comboBoxCCStudent.removeAllItems();
        for(int i = 0; i < Main.college.length; i++){
            if(Main.END.equals(Main.college[i].getCollegeCode())){
                break;
            }
            comboBoxCCStudent.addItem(Main.college[i].getCollegeCode());
        }
        //-----------------------
        
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
    }//GEN-LAST:event_newStudentMouseReleased

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        saveButton.setVisible(false);
        cancel.setVisible(false);
        loadStudentData();
        
    }//GEN-LAST:event_formWindowActivated

    private void newProgramMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_newProgramMouseReleased
        AddCollegeDialog.setLocationByPlatform(true);
       
        
        //load all available college code in the comboBox
        comboBoxCC.removeAllItems();
        
        for(int i = 0; i < Main.college.length; i++){
            if(Main.END.equals(Main.college[i].getCollegeCode())){
                break;
            }
             comboBoxCC.addItem(Main.college[i].getCollegeCode());
        }
        AddProgramDialog.setVisible(true);
    }//GEN-LAST:event_newProgramMouseReleased

    private void neweCollegeMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_neweCollegeMouseReleased
        AddCollegeDialog.setLocationByPlatform(true);
        AddCollegeDialog.setVisible(true);
    }//GEN-LAST:event_neweCollegeMouseReleased

    private void studentTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_studentTableMouseClicked
       getRowData();
    }//GEN-LAST:event_studentTableMouseClicked

    private void editButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editButtonMouseClicked

        editButton.setVisible(false);
        editButton.setEnabled(false);
        
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

        collegeCodeField.setEditable(true);
        collegeCodeField.setFocusable(true);

        programCodeField.setEditable(true);
        programCodeField.setFocusable(true);
    }//GEN-LAST:event_editButtonMouseClicked

    private void saveButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveButtonMouseClicked

        saveButton.setEnabled(false);
        cancel.setEnabled(false);

        editButton.setVisible(true);
        saveButton.setVisible(false);
        cancel.setVisible(false);
        
        studentTable.setFocusable(true);
        studentTable.setEnabled(true);
        SSIS.setEnabled(true);

        idNumberField.setEditable(true);
        idNumberField.setFocusable(true);

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
    }//GEN-LAST:event_saveButtonMouseClicked

    private void cancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelMouseClicked

        saveButton.setEnabled(false);
        cancel.setEnabled(false);
        saveButton.setVisible(false);
        
        editButton.setVisible(true);
        saveButton.setVisible(false);
        
        studentTable.setFocusable(true);
        studentTable.setEnabled(true);
        SSIS.setEnabled(true);

        idNumberField.setEditable(true);
        idNumberField.setFocusable(true);

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
        getRowData();
    }//GEN-LAST:event_cancelMouseClicked

   
    public static String genNum(){
        String temp = null;
        
        if(Main.student[0].getIdNum() == Main.END){
            return temp = "-0001";
        }
        
        for(int i = 0; i < Main.student.length; i++){
            
            if(Main.END.equals(Main.student[i].getIdNum())){
                
               String[] idNum = Main.student[i-1].getIdNum().split("-");
               
               int num = Integer.parseInt(idNum[1]) + 1; 
                
               if(num < 10){
                   temp = "-000" + Integer.toString(num);
               } else if (num < 100){
                    temp = "-00" + Integer.toString(num);
               } else if(num < 1000){
                    temp = "-0" + Integer.toString(num);
               } else if (num < 10000){
                    temp = "-" + Integer.toString(num);
               }
                
            }
        }
       return temp;
    }
    
    public static void loadStudentData(){
    
         studentTable.getTableHeader().setResizingAllowed(false);
        studentTable.getTableHeader().setReorderingAllowed(false);

        //load the studentData
        

        int count = 0;
        while(count < Main.student.length){
            if(Main.END.equals(Main.student[count].getIdNum())){
                break;
            }
            count++;
        }
        
     
        // [FORMAT]: IdNum/Firstname/Lastname/YearLevel/Gender/CollegeCode/ProgramCode
        String studentFormat[] = { "ID Number", "First Name", "Last Name", "Year Level", "Gender", "College Code", "Program Code"};
        
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
            studentData[i][5] = Main.student[i].getCollegeCode();
            studentData[i][6] = Main.student[i].getProgramCode();
            
        
        }
        
        
        DefaultTableModel model = new DefaultTableModel(studentData, studentFormat);
        studentTable.setModel(model);
        
    
    
}
    
    public static void getRowData(){
         //get the row data to load in the individual label
        int selectedRow = studentTable.getSelectedRow();
        
        if(selectedRow != -1){
            
            editButton.setEnabled(true);
          
            
            idNumberField.setText( (String) studentTable.getValueAt(selectedRow, 0));
            firstNameLabel.setText( (String) studentTable.getValueAt(selectedRow, 1));
            lastNameLabel.setText( (String) studentTable.getValueAt(selectedRow, 2));
            yearLevelField.setText( (String) studentTable.getValueAt(selectedRow, 3));
            genderField.setText( (String) studentTable.getValueAt(selectedRow, 4));
            collegeCodeField.setText( (String) studentTable.getValueAt(selectedRow, 5));
            programCodeField.setText( (String) studentTable.getValueAt(selectedRow, 6));
        }
        
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JDialog AddCollegeDialog;
    public static javax.swing.JDialog AddProgramDialog;
    public static javax.swing.JDialog AddStudentDialog;
    public static javax.swing.JPanel MainMenu;
    public static javax.swing.JLabel SIS;
    public static javax.swing.JMenu SSIS;
    public static javax.swing.JButton addButtonC;
    public static javax.swing.JButton addButtonP;
    public static javax.swing.JButton cancel;
    public static javax.swing.JButton cancelButton;
    public static javax.swing.JButton cancelButtonAddC;
    public static javax.swing.JButton cancelButtonAddP;
    public static javax.swing.JTextField codeFieldC;
    public static javax.swing.JTextField codeFieldP;
    public static javax.swing.JTextField collegeCodeField;
    public static javax.swing.JComboBox<String> comboBoxCC;
    public static javax.swing.JComboBox<String> comboBoxCCStudent;
    public static javax.swing.JComboBox<String> comboBoxP;
    public static javax.swing.JComboBox<String> comboBoxY;
    public static javax.swing.JComboBox<String> comboBoxYL;
    public static javax.swing.JButton confirmButton;
    public static javax.swing.JButton editButton;
    public static javax.swing.JRadioButton female;
    public static javax.swing.JTextField firstNameField;
    public static javax.swing.JTextField firstNameLabel;
    public static javax.swing.JTextField genderField;
    public static javax.swing.ButtonGroup genderGroup;
    public static javax.swing.JTextField idFieldNS;
    public static javax.swing.JLabel idLabel;
    public static javax.swing.JLabel idLabel1;
    public static javax.swing.JLabel idLabel10;
    public static javax.swing.JLabel idLabel11;
    public static javax.swing.JLabel idLabel12;
    public static javax.swing.JLabel idLabel13;
    public static javax.swing.JLabel idLabel2;
    public static javax.swing.JLabel idLabel3;
    public static javax.swing.JLabel idLabel4;
    public static javax.swing.JLabel idLabel5;
    public static javax.swing.JLabel idLabel6;
    public static javax.swing.JLabel idLabel7;
    public static javax.swing.JLabel idLabel8;
    public static javax.swing.JLabel idLabel9;
    public static javax.swing.JTextField idNumberField;
    public static javax.swing.JLabel jLabel1;
    public static javax.swing.JLabel jLabel2;
    public static javax.swing.JLabel jLabel3;
    public static javax.swing.JLabel jLabel4;
    public static javax.swing.JLabel jLabel5;
    public static javax.swing.JMenu jMenu3;
    public static javax.swing.JMenu jMenu4;
    public static javax.swing.JMenuBar jMenuBar1;
    public static javax.swing.JPanel jPanel1;
    public static javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTextField lastNameField;
    public static javax.swing.JTextField lastNameLabel;
    public static javax.swing.JRadioButton male;
    public static javax.swing.JTextField nameFieldC;
    public static javax.swing.JTextField nameFieldP;
    public static javax.swing.JMenuItem newProgram;
    public static javax.swing.JMenuItem newStudent;
    public static javax.swing.JMenuItem neweCollege;
    public static javax.swing.JTextField programCodeField;
    public static javax.swing.JButton saveButton;
    public static javax.swing.JTable studentTable;
    public static javax.swing.JTextField yearLevelField;
    // End of variables declaration//GEN-END:variables
}
