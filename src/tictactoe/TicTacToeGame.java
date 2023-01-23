/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package tictactoe;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author dell
 */
public class TicTacToeGame extends javax.swing.JFrame {

    private String startGame="x";
    private int xCount=0;
    private int oCount=0;
    boolean checker;
    public TicTacToeGame() {
        initComponents();
    }

    private void gameScore()
    {
        jpx.setText(String.valueOf(xCount));
        jpo.setText(String.valueOf(oCount));
    }
    
    private void choose_a_player()
    {
        if(startGame.equalsIgnoreCase("x"))
        {
            startGame="o";
        }
        else
        {
            startGame="x";
        }
    }
    
    private void winningGame()
    {
        String b1=jbtnTic1.getText();
        String b2=jbtnTic2.getText();
        String b3=jbtnTic3.getText();
        String b4=jbtnTic4.getText();
        String b5=jbtnTic5.getText();
        String b6=jbtnTic6.getText();
        String b7=jbtnTic7.getText();
        String b8=jbtnTic8.getText();
        String b9=jbtnTic9.getText();
        
        if(b1==("x")&&b2==("x")&&b3==("x"))
        {
            JOptionPane.showMessageDialog(this,"Player x wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            jbtnTic1.setBackground(Color.ORANGE);
            jbtnTic2.setBackground(Color.ORANGE);
            jbtnTic3.setBackground(Color.ORANGE);
            xCount++;
            gameScore();
        }
        if(b4==("x")&&b5==("x")&&b6==("x"))
        {
            JOptionPane.showMessageDialog(this,"Player x wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            jbtnTic4.setBackground(Color.CYAN);
            jbtnTic5.setBackground(Color.CYAN);
            jbtnTic6.setBackground(Color.CYAN);
            xCount++;
            gameScore();
        }
        if(b7==("x")&&b8==("x")&&b9==("x"))
        {
            JOptionPane.showMessageDialog(this,"Player x wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            jbtnTic7.setBackground(Color.GREEN);
            jbtnTic8.setBackground(Color.GREEN);
            jbtnTic9.setBackground(Color.GREEN);
            xCount++;
            gameScore();
        }
        if(b1==("x")&&b4==("x")&&b7==("x"))
        {
            JOptionPane.showMessageDialog(this,"Player x wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            jbtnTic1.setBackground(Color.GRAY);
            jbtnTic4.setBackground(Color.GRAY);
            jbtnTic7.setBackground(Color.GRAY);
            xCount++;
            gameScore();
        }
        if(b2==("x")&&b5==("x")&&b8==("x"))
        {
            JOptionPane.showMessageDialog(this,"Player x wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            jbtnTic2.setBackground(Color.PINK);
            jbtnTic5.setBackground(Color.PINK);
            jbtnTic8.setBackground(Color.PINK);
            xCount++;
            gameScore();
        }
        if(b3==("x")&&b6==("x")&&b9==("x"))
        {
            JOptionPane.showMessageDialog(this,"Player x wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            jbtnTic3.setBackground(Color.darkGray);
            jbtnTic6.setBackground(Color.darkGray);
            jbtnTic9.setBackground(Color.darkGray);
            xCount++;
            gameScore();
        }
        if(b1==("x")&&b5==("x")&&b9==("x"))
        {
            JOptionPane.showMessageDialog(this,"Player x wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            jbtnTic1.setBackground(Color.darkGray);
            jbtnTic5.setBackground(Color.darkGray);
            jbtnTic9.setBackground(Color.darkGray);
            xCount++;
            gameScore();
        }
        if(b3==("x")&&b5==("x")&&b7==("x"))
        {
            JOptionPane.showMessageDialog(this,"Player x wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            jbtnTic3.setBackground(Color.darkGray);
            jbtnTic5.setBackground(Color.darkGray);
            jbtnTic7.setBackground(Color.darkGray);
            xCount++;
            gameScore();
        }
        
        if(b1==("o")&&b2==("o")&&b3==("o"))
        {
            JOptionPane.showMessageDialog(this,"Player o wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            jbtnTic1.setBackground(Color.ORANGE);
            jbtnTic2.setBackground(Color.ORANGE);
            jbtnTic3.setBackground(Color.ORANGE);
            oCount++;
            gameScore();
        }
        if(b4==("o")&&b5==("o")&&b6==("o"))
        {
            JOptionPane.showMessageDialog(this,"Player o wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            jbtnTic4.setBackground(Color.CYAN);
            jbtnTic5.setBackground(Color.CYAN);
            jbtnTic6.setBackground(Color.CYAN);
            oCount++;
            gameScore();
        }
        if(b7==("o")&&b8==("o")&&b9==("o"))
        {
            JOptionPane.showMessageDialog(this,"Player o wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            jbtnTic7.setBackground(Color.GREEN);
            jbtnTic8.setBackground(Color.GREEN);
            jbtnTic9.setBackground(Color.GREEN);
            oCount++;
            gameScore();
        }
        if(b1==("o")&&b4==("o")&&b7==("o"))
        {
            JOptionPane.showMessageDialog(this,"Player o wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            jbtnTic1.setBackground(Color.GRAY);
            jbtnTic4.setBackground(Color.GRAY);
            jbtnTic7.setBackground(Color.GRAY);
            oCount++;
            gameScore();
        }
        if(b2==("o")&&b5==("o")&&b8==("o"))
        {
            JOptionPane.showMessageDialog(this,"Player o wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            jbtnTic2.setBackground(Color.PINK);
            jbtnTic5.setBackground(Color.PINK);
            jbtnTic8.setBackground(Color.PINK);
            oCount++;
            gameScore();
        }
        if(b3==("o")&&b6==("o")&&b9==("o"))
        {
            JOptionPane.showMessageDialog(this,"Player o wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            jbtnTic3.setBackground(Color.darkGray);
            jbtnTic6.setBackground(Color.darkGray);
            jbtnTic9.setBackground(Color.darkGray);
            oCount++;
            gameScore();
        }
        if(b1==("o")&&b5==("o")&&b9==("o"))
        {
            JOptionPane.showMessageDialog(this,"Player o wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            jbtnTic1.setBackground(Color.darkGray);
            jbtnTic5.setBackground(Color.darkGray);
            jbtnTic9.setBackground(Color.darkGray);
            oCount++;
            gameScore();
        }
        if(b3==("o")&&b5==("o")&&b7==("o"))
        {
            JOptionPane.showMessageDialog(this,"Player o wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            jbtnTic3.setBackground(Color.darkGray);
            jbtnTic5.setBackground(Color.darkGray);
            jbtnTic7.setBackground(Color.darkGray);
            oCount++;
            gameScore();
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

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jpx = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jpo = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jbtnTic3 = new javax.swing.JButton();
        jbtnTic4 = new javax.swing.JButton();
        jbtnTic9 = new javax.swing.JButton();
        jbtnTic2 = new javax.swing.JButton();
        jbtnTic5 = new javax.swing.JButton();
        jbtnTic7 = new javax.swing.JButton();
        jbtnTic8 = new javax.swing.JButton();
        jbtnTic1 = new javax.swing.JButton();
        jbtnTic6 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 0));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 5, true));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(51, 153, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(204, 102, 0));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jButton10.setFont(new java.awt.Font("Segoe UI", 3, 48)); // NOI18N
        jButton10.setText("Reset");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton11.setFont(new java.awt.Font("Segoe UI", 3, 48)); // NOI18N
        jButton11.setText("New  Game");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jButton12.setFont(new java.awt.Font("Segoe UI", 3, 48)); // NOI18N
        jButton12.setText("Exit");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 294, -1, -1));

        jPanel5.setBackground(new java.awt.Color(204, 102, 0));
        jPanel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        jLabel1.setText("PLAYER  X :");

        jpx.setBackground(new java.awt.Color(255, 255, 255));
        jpx.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        jpx.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jpx.setText("0");
        jpx.setOpaque(true);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        jLabel4.setText("PLAYER  O :");

        jpo.setBackground(new java.awt.Color(255, 255, 255));
        jpo.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        jpo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jpo.setText("0");
        jpo.setOpaque(true);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jpx, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jpo, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jpx, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jpo, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29))
        );

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 39, 648, -1));

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 230, 740, 620));

        jPanel4.setBackground(new java.awt.Color(0, 0, 153));
        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel4.setForeground(new java.awt.Color(255, 255, 255));

        jLabel5.setFont(new java.awt.Font("Segoe Script", 3, 60)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("        TIC   TAC   TOE   GAME");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(202, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 1167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(193, 193, 193))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel5)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(154, 20, -1, -1));

        jPanel6.setBackground(new java.awt.Color(51, 153, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jbtnTic3.setFont(new java.awt.Font("Segoe UI", 3, 80)); // NOI18N
        jbtnTic3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnTic3ActionPerformed(evt);
            }
        });
        jPanel6.add(jbtnTic3, new org.netbeans.lib.awtextra.AbsoluteConstraints(465, 36, 181, 160));

        jbtnTic4.setFont(new java.awt.Font("Segoe UI", 3, 80)); // NOI18N
        jbtnTic4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnTic4ActionPerformed(evt);
            }
        });
        jPanel6.add(jbtnTic4, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 230, 180, 160));

        jbtnTic9.setFont(new java.awt.Font("Segoe UI", 3, 80)); // NOI18N
        jbtnTic9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnTic9ActionPerformed(evt);
            }
        });
        jPanel6.add(jbtnTic9, new org.netbeans.lib.awtextra.AbsoluteConstraints(465, 423, 180, 160));

        jbtnTic2.setFont(new java.awt.Font("Segoe UI", 3, 80)); // NOI18N
        jbtnTic2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnTic2ActionPerformed(evt);
            }
        });
        jPanel6.add(jbtnTic2, new org.netbeans.lib.awtextra.AbsoluteConstraints(258, 36, 180, 160));

        jbtnTic5.setFont(new java.awt.Font("Segoe UI", 3, 80)); // NOI18N
        jbtnTic5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnTic5ActionPerformed(evt);
            }
        });
        jPanel6.add(jbtnTic5, new org.netbeans.lib.awtextra.AbsoluteConstraints(258, 230, 180, 160));

        jbtnTic7.setFont(new java.awt.Font("Segoe UI", 3, 80)); // NOI18N
        jbtnTic7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnTic7ActionPerformed(evt);
            }
        });
        jPanel6.add(jbtnTic7, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 423, 179, 160));

        jbtnTic8.setFont(new java.awt.Font("Segoe UI", 3, 80)); // NOI18N
        jbtnTic8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnTic8ActionPerformed(evt);
            }
        });
        jPanel6.add(jbtnTic8, new org.netbeans.lib.awtextra.AbsoluteConstraints(258, 423, 180, 160));

        jbtnTic1.setFont(new java.awt.Font("Segoe UI", 3, 80)); // NOI18N
        jbtnTic1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnTic1ActionPerformed(evt);
            }
        });
        jPanel6.add(jbtnTic1, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 36, 180, 160));

        jbtnTic6.setFont(new java.awt.Font("Segoe UI", 3, 80)); // NOI18N
        jbtnTic6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnTic6ActionPerformed(evt);
            }
        });
        jPanel6.add(jbtnTic6, new org.netbeans.lib.awtextra.AbsoluteConstraints(465, 230, 181, 160));

        jPanel2.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(162, 220, 690, 630));

        jLabel6.setBackground(new java.awt.Color(0, 0, 153));
        jLabel6.setFont(new java.awt.Font("Segoe Script", 3, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("  Made by :- Damodar");
        jLabel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        jLabel6.setOpaque(true);
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1375, 890, 477, 72));

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\dell\\OneDrive\\Pictures\\Saved Pictures\\gamer.jpg")); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 1870, 970));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 1900, 990));

        pack();
    }// </editor-fold>//GEN-END:initComponents
private JFrame frame;
    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        frame=new JFrame("Exit");
        if(JOptionPane.showConfirmDialog(frame,"Confirm if you want to exit","Tic Tac Toe",
              JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION)
        {
            System.exit(0);
        }
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
       jbtnTic1.setEnabled(true);
       jbtnTic2.setEnabled(true);
       jbtnTic3.setEnabled(true);
       jbtnTic4.setEnabled(true);
       jbtnTic5.setEnabled(true);
       jbtnTic6.setEnabled(true);
       jbtnTic7.setEnabled(true);
       jbtnTic8.setEnabled(true);
       jbtnTic9.setEnabled(true);
       
       jbtnTic1.setText("");
       jbtnTic2.setText("");
       jbtnTic3.setText("");
       jbtnTic4.setText("");
       jbtnTic5.setText("");
       jbtnTic6.setText("");
       jbtnTic7.setText("");
       jbtnTic8.setText("");
       jbtnTic9.setText("");
       
       jbtnTic1.setBackground(Color.LIGHT_GRAY);
       jbtnTic2.setBackground(Color.LIGHT_GRAY);
       jbtnTic3.setBackground(Color.LIGHT_GRAY);
       jbtnTic4.setBackground(Color.LIGHT_GRAY);
       jbtnTic5.setBackground(Color.LIGHT_GRAY);
       jbtnTic6.setBackground(Color.LIGHT_GRAY);
       jbtnTic7.setBackground(Color.LIGHT_GRAY);
       jbtnTic8.setBackground(Color.LIGHT_GRAY);
       jbtnTic9.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
      jbtnTic1.setEnabled(true);
       jbtnTic2.setEnabled(true);
       jbtnTic3.setEnabled(true);
       jbtnTic4.setEnabled(true);
       jbtnTic5.setEnabled(true);
       jbtnTic6.setEnabled(true);
       jbtnTic7.setEnabled(true);
       jbtnTic8.setEnabled(true);
       jbtnTic9.setEnabled(true);
      
       jpx.setText("0");
       jpo.setText("0");
       
       xCount=0;
       oCount=0;
       
       jbtnTic1.setText("");
       jbtnTic2.setText("");
       jbtnTic3.setText("");
       jbtnTic4.setText("");
       jbtnTic5.setText("");
       jbtnTic6.setText("");
       jbtnTic7.setText("");
       jbtnTic8.setText("");
       jbtnTic9.setText("");
       
       jbtnTic1.setBackground(Color.LIGHT_GRAY);
       jbtnTic2.setBackground(Color.LIGHT_GRAY);
       jbtnTic3.setBackground(Color.LIGHT_GRAY);
       jbtnTic4.setBackground(Color.LIGHT_GRAY);
       jbtnTic5.setBackground(Color.LIGHT_GRAY);
       jbtnTic6.setBackground(Color.LIGHT_GRAY);
       jbtnTic7.setBackground(Color.LIGHT_GRAY);
       jbtnTic8.setBackground(Color.LIGHT_GRAY);
       jbtnTic9.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jbtnTic1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnTic1ActionPerformed
       jbtnTic1.setText(startGame);
       
       if(startGame.equalsIgnoreCase("x"))
       {
           checker=false;
       }
       else
       {
           checker=true;
       }
       choose_a_player();
       winningGame();
    }//GEN-LAST:event_jbtnTic1ActionPerformed

    private void jbtnTic2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnTic2ActionPerformed
        jbtnTic2.setText(startGame);
       
       if(startGame.equalsIgnoreCase("x"))
       {
           checker=false;
       }
       else
       {
           checker=true;
       }
       choose_a_player();
       winningGame();
    }//GEN-LAST:event_jbtnTic2ActionPerformed

    private void jbtnTic3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnTic3ActionPerformed
       jbtnTic3.setText(startGame);
       
       if(startGame.equalsIgnoreCase("x"))
       {
           checker=false;
       }
       else
       {
           checker=true;
       }
       choose_a_player();
       winningGame();
    }//GEN-LAST:event_jbtnTic3ActionPerformed

    private void jbtnTic4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnTic4ActionPerformed
       jbtnTic4.setText(startGame);
       
       if(startGame.equalsIgnoreCase("x"))
       {
           checker=false;
       }
       else
       {
           checker=true;
       }
       choose_a_player();
       winningGame();
    }//GEN-LAST:event_jbtnTic4ActionPerformed

    private void jbtnTic5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnTic5ActionPerformed
       jbtnTic5.setText(startGame);
       
       if(startGame.equalsIgnoreCase("x"))
       {
           checker=false;
       }
       else
       {
           checker=true;
       }
       choose_a_player();
       winningGame();
    }//GEN-LAST:event_jbtnTic5ActionPerformed

    private void jbtnTic6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnTic6ActionPerformed
       jbtnTic6.setText(startGame);
       
       if(startGame.equalsIgnoreCase("x"))
       {
           checker=false;
       }
       else
       {
           checker=true;
       }
       choose_a_player();
       winningGame();
    }//GEN-LAST:event_jbtnTic6ActionPerformed

    private void jbtnTic7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnTic7ActionPerformed
        jbtnTic7.setText(startGame);
       
       if(startGame.equalsIgnoreCase("x"))
       {
           checker=false;
       }
       else
       {
           checker=true;
       }
       choose_a_player();
       winningGame();
    }//GEN-LAST:event_jbtnTic7ActionPerformed

    private void jbtnTic8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnTic8ActionPerformed
       jbtnTic8.setText(startGame);
       
       if(startGame.equalsIgnoreCase("x"))
       {
           checker=false;
       }
       else
       {
           checker=true;
       }
       choose_a_player();
       winningGame();
    }//GEN-LAST:event_jbtnTic8ActionPerformed

    private void jbtnTic9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnTic9ActionPerformed
       jbtnTic9.setText(startGame);
       
       if(startGame.equalsIgnoreCase("x"))
       {
           checker=false;
       }
       else
       {
           checker=true;
       }
       choose_a_player();
       winningGame();
    }//GEN-LAST:event_jbtnTic9ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TicTacToeGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TicTacToeGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TicTacToeGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TicTacToeGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TicTacToeGame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JButton jbtnTic1;
    private javax.swing.JButton jbtnTic2;
    private javax.swing.JButton jbtnTic3;
    private javax.swing.JButton jbtnTic4;
    private javax.swing.JButton jbtnTic5;
    private javax.swing.JButton jbtnTic6;
    private javax.swing.JButton jbtnTic7;
    private javax.swing.JButton jbtnTic8;
    private javax.swing.JButton jbtnTic9;
    private javax.swing.JLabel jpo;
    private javax.swing.JLabel jpx;
    // End of variables declaration//GEN-END:variables
}
