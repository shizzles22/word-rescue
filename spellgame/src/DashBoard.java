
import java.awt.Color;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author yuan
 */
public class DashBoard extends javax.swing.JFrame {

    /**
     * Creates new form DashBoard
     */
    //private String name;
    private String name;
    public DashBoard(String name) throws FileNotFoundException, IOException, ParseException {
        initComponents();
        setSize(880,540);

        this.name = name;
        boolean studentExist=false;
        try (BufferedReader reader = new BufferedReader(new FileReader("namebook.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                // Process each line here
                if(line.contains(this.name)){studentExist=true;}
                //System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        if(studentExist){
            JSONParser parser = new JSONParser();
            FileReader getInfo=new FileReader(this.name+".json");
            JSONObject obj=(JSONObject) parser.parse(getInfo);
            String n=(String) obj.get("name");
            JSONArray score=(JSONArray) obj.get("score");
            JSONArray mistakes=(JSONArray) obj.get("mistakes");
            getInfo.close();
            int totalS=0;
            for(int i=0;i<5;i++){
                String s= score.get(i).toString();
                int num=Integer.parseInt(s);
                totalS+=num;
                }
            totalScore.setText(String.valueOf(totalS));
            l1score.setText(score.get(0).toString());
            l2score.setText(score.get(1).toString());
            l3score.setText(score.get(2).toString());
            l4score.setText(score.get(3).toString());
            l5score.setText(score.get(4).toString());
            gotWrong.setText(mistakes.toString());
        }
        else{
            totalScore.setText("000");
            l1score.setText("000");
            l2score.setText("000");
            l3score.setText("000");
            l4score.setText("000");
            l5score.setText("000");
            gotWrong.setText("(NO USER INFO FOUND)");
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

        JLabel1 = new javax.swing.JLabel();
        totalScore = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        l1score = new javax.swing.JTextField();
        l2score = new javax.swing.JTextField();
        l3score = new javax.swing.JTextField();
        l4score = new javax.swing.JTextField();
        l5score = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        gotWrong = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        dbReturn = new javax.swing.JButton();
        backgroundImage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JLabel1.setBackground(new java.awt.Color(0, 0, 0));
        JLabel1.setFont(new java.awt.Font("Impact", 3, 18)); // NOI18N
        JLabel1.setForeground(new java.awt.Color(255, 255, 255));
        JLabel1.setText("Current Total Score:");
        JLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(JLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, 146, 52));

        totalScore.setFont(new java.awt.Font("Helvetica Neue", 0, 48)); // NOI18N
        totalScore.setText("000");
        getContentPane().add(totalScore, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, -1, 79));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Impact", 3, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Level 1");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 260, 68, -1));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Impact", 3, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Level 2");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 310, 41, -1));

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Impact", 3, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Level 3");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 360, 76, -1));

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Impact", 3, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Level 4");
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 410, 76, -1));

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setFont(new java.awt.Font("Impact", 3, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Level 5");
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 450, 48, -1));

        l1score.setText("000");
        getContentPane().add(l1score, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 260, -1, -1));

        l2score.setText("000");
        getContentPane().add(l2score, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 310, -1, -1));

        l3score.setText("000");
        getContentPane().add(l3score, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 360, -1, -1));

        l4score.setText("000");
        getContentPane().add(l4score, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 400, -1, -1));

        l5score.setText("000");
        getContentPane().add(l5score, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 450, -1, -1));

        gotWrong.setColumns(20);
        gotWrong.setRows(5);
        jScrollPane1.setViewportView(gotWrong);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 150, 348, 350));

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setFont(new java.awt.Font("Impact", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Wrong answers:");
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 120, -1, -1));

        dbReturn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/user/icons8-back-24.png"))); // NOI18N
        dbReturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dbReturnActionPerformed(evt);
            }
        });
        getContentPane().add(dbReturn, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 30, 50, 50));

        backgroundImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/user/Word.png"))); // NOI18N
        getContentPane().add(backgroundImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 990, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void dbReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dbReturnActionPerformed
        // TODO add your handling code here:
        findStudent findNewStudent = new findStudent();
        findNewStudent.setVisible(true);
        dispose();
    }//GEN-LAST:event_dbReturnActionPerformed

    /**
     * @param args the command line arguments
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JLabel1;
    private javax.swing.JLabel backgroundImage;
    private javax.swing.JButton dbReturn;
    private javax.swing.JTextArea gotWrong;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField l1score;
    private javax.swing.JTextField l2score;
    private javax.swing.JTextField l3score;
    private javax.swing.JTextField l4score;
    private javax.swing.JTextField l5score;
    private javax.swing.JTextField totalScore;
    // End of variables declaration//GEN-END:variables
}