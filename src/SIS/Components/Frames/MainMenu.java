
package SIS.Components.Frames;

import SIS.Main;

public class MainMenu extends javax.swing.JFrame {

   
    public MainMenu() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MainMenu = new javax.swing.JPanel();
        SIS = new javax.swing.JLabel();
        addNS = new javax.swing.JButton();
        addNP = new javax.swing.JButton();
        addNC = new javax.swing.JButton();
        settings = new javax.swing.JButton();
        studentList = new javax.swing.JButton();
        programList = new javax.swing.JButton();
        collegeList = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Student Information System");
        setMinimumSize(new java.awt.Dimension(450, 466));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        MainMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        SIS.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        SIS.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SIS.setText("Student Information System");
        MainMenu.add(SIS, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, 330, 50));

        addNS.setText("Add New Student");
        addNS.setFocusable(false);
        addNS.setRequestFocusEnabled(false);
        addNS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addNSMouseClicked(evt);
            }
        });
        MainMenu.add(addNS, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 220, 170, 40));

        addNP.setText("Add New Program");
        addNP.setFocusable(false);
        MainMenu.add(addNP, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 270, 170, 40));

        addNC.setText("Add New College");
        addNC.setFocusable(false);
        MainMenu.add(addNC, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 320, 170, 40));

        settings.setText("Settings");
        settings.setFocusable(false);
        MainMenu.add(settings, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 390, 170, 40));

        studentList.setText("Student List");
        studentList.setFocusable(false);
        MainMenu.add(studentList, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 170, 40));

        programList.setText("Program List");
        programList.setFocusable(false);
        MainMenu.add(programList, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 170, 40));

        collegeList.setText("College List");
        collegeList.setFocusable(false);
        MainMenu.add(collegeList, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, 170, 40));

        getContentPane().add(MainMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 500));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void addNSMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addNSMouseClicked
        Main.showAddStudentForm();
    }//GEN-LAST:event_addNSMouseClicked

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JPanel MainMenu;
    public static javax.swing.JLabel SIS;
    public static javax.swing.JButton addNC;
    public static javax.swing.JButton addNP;
    public static javax.swing.JButton addNS;
    public static javax.swing.JButton collegeList;
    public static javax.swing.JButton programList;
    public static javax.swing.JButton settings;
    public static javax.swing.JButton studentList;
    // End of variables declaration//GEN-END:variables
}
