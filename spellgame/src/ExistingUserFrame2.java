/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */


import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import org.json.simple.parser.ParseException;

/**
 *
 * @author shainatodi
 */
public class ExistingUserFrame2 extends javax.swing.JFrame {

    /**
     * Creates new form ExistingUserFrame2
     */
    //private ArrayList<User> allUsers;
    private String chosenOne="";
    private ArrayList<User> allUsers;
    DefaultListModel<String> existingUsers;
    //DefaultListModel<String> existingUsers;
    public ExistingUserFrame2() throws IOException, FileNotFoundException, ParseException {
        initComponents();
        setSize(880,540);
        existingUsers=new DefaultListModel<>();
        ExistingPlayers ep=new ExistingPlayers();
        allUsers=ep.getList();
       // System.out.println(ep.getList().size());
        for(int i=0;i<ep.getList().size();i++){
            //System.out.println("666");
            existingUsers.addElement(ep.getList().get(i).getName());
        }
        jList1.setModel(existingUsers);
        jList1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        jList1.addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent event) {
                if (!event.getValueIsAdjusting()) {
                    int selectedIndex = jList1.getSelectedIndex();
                    if (selectedIndex != -1) {
                        String selectedItem = existingUsers.getElementAt(selectedIndex);
                        callMenu(selectedItem);
                        //System.out.println("Selected Item: " + selectedItem);
                    }
                }
            }
        });
        
        
                
    }
    public void callMenu(String n){
        for(int i=0;i<allUsers.size();i++){
            if(allUsers.get(i).getName().contains(n)){
                new menu(allUsers.get(i)).setVisible(true);
                dispose();
            }
        }
    }
    
    
        
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        back_button = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        jList1.setBackground(new java.awt.Color(152, 121, 101));
        jList1.setFont(new java.awt.Font("Impact", 0, 13)); // NOI18N
        jList1.setForeground(new java.awt.Color(255, 255, 255));
        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jList1.setAlignmentX(1.5F);
        jList1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane1.setViewportView(jList1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(380, 180, 160, 260);

        jLabel1.setFont(new java.awt.Font("Impact", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Choose Existing User:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(350, 100, 230, 30);

        back_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/user/icons8-back-24.png"))); // NOI18N
        back_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_buttonActionPerformed(evt);
            }
        });
        getContentPane().add(back_button);
        back_button.setBounds(820, 30, 45, 55);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/user/game_background.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, -30, 970, 600);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void back_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_buttonActionPerformed
        // TODO add your handling code here:
        this.dispose();
        try {
            new ProfilesFrame().setVisible(true);
        } catch (IOException ex) {
            Logger.getLogger(ExistingUserFrame2.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(ExistingUserFrame2.class.getName()).log(Level.SEVERE, null, ex);
        }
        dispose();
        // new ProfilesFrame().setVisible(true);
    }//GEN-LAST:event_back_buttonActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back_button;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
