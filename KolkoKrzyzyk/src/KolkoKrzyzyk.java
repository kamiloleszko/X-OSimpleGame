
import java.awt.Graphics;
import java.awt.LayoutManager;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;


/**
 *
 * @author fmkam
 */
public class KolkoKrzyzyk extends javax.swing.JFrame {




    
    /**
     * Creates new form KolkoKrzyzyk
     */
    public KolkoKrzyzyk() {
        initComponents();
    }
    
    public void kolejnaGra(){
        String [] tablica = {"TAK", "NIE"};
        String wybor = (String) JOptionPane.showInputDialog(null, "Czy chcesz zagrac ponownie ?", 
             "Twoj wybor",
             JOptionPane.QUESTION_MESSAGE,
             null,
             tablica,
             tablica[0]);
        
          if (wybor.equals("TAK")) {
              odNowa();
             StartActionPerformed(Start);
              Uzytkownik1.setText("");
              Uzytkownik2.setText("");
              Gracz.setText("");
           
              ustawGraczy();
            
          }
    }
    
    private void ustawGraczy(){
        String user1 = JOptionPane.showInputDialog(null, "Podaj pierwszego gracza");
        String user2 = JOptionPane.showInputDialog(null, "Podaj drugiego gracza");
        Uzytkownik1.setText(user1);
        Uzytkownik2.setText(user2);
        Gracz.setText(user1);
    }

  private void zmienGracza() {
      if (Gracz.getText().equals(Uzytkownik1.getText())){
            Gracz.setText(Uzytkownik2.getText());
         } else  if(Gracz.getText() == null ? Uzytkownik2.getText() == null : Gracz.getText().equals(Uzytkownik2.getText())){
            Gracz.setText(Uzytkownik1.getText());
        }
                
                
  }  
  private void odNowa(){
        b1.setEnabled(true);
        b2.setEnabled(true);
        b3.setEnabled(true);
        b4.setEnabled(true);
        b5.setEnabled(true);
        b6.setEnabled(true);
        b7.setEnabled(true);
        b8.setEnabled(true);
        b9.setEnabled(true);
        b1.setText("");
        b2.setText("");
        b3.setText("");
        b4.setText("");
        b5.setText("");
        b6.setText("");
        b7.setText("");
        b8.setText("");
        b9.setText("");
        b1.setEnabled(true);
        b2.setEnabled(true);
        b3.setEnabled(true);
        b4.setEnabled(true);
        b5.setEnabled(true);
        b6.setEnabled(true);
        b7.setEnabled(true);
        b8.setEnabled(true);
        b9.setEnabled(true);
        b1.setText("");
        b2.setText("");
        b3.setText("");
        b4.setText("");
        b5.setText("");
        b6.setText("");
        b7.setText("");
        b8.setText("");
        b9.setText("");
        Start.setEnabled(true);
  }  
    
    
  private void wygrana (){
      
      boolean x1 = b1.getText().equals("X") || b1.getText().equals("O");
      boolean x2 = b2.getText().equals("X") || b2.getText().equals("O");
      boolean x3 = b3.getText().equals("X") || b3.getText().equals("O");
      boolean x4 = b4.getText().equals("X") || b4.getText().equals("O");
      boolean x5 = b5.getText().equals("X") || b5.getText().equals("O");
      boolean x6 = b6.getText().equals("X") || b6.getText().equals("O");
      boolean x7 = b7.getText().equals("X") || b7.getText().equals("O");
      boolean x8 = b8.getText().equals("X") || b8.getText().equals("O");
      boolean x9 = b9.getText().equals("X") || b9.getText().equals("O");
      boolean warunekSprawdzenia = x1 && x2 && x3 && x4 && x5 && x6 && x7 && x8 && x9;
      
      
      boolean w1 = (b1.getText().equals("X")|| b1.getText().equals("O")) && b1.getText().equals(b2.getText()) && b1.getText().equals(b3.getText());
      boolean w2 = (b4.getText().equals("X")|| b4.getText().equals("O")) && b4.getText().equals(b5.getText()) && b4.getText().equals(b6.getText());
      boolean w3 = (b7.getText().equals("X")|| b7.getText().equals("O")) && b7.getText().equals(b8.getText()) && b7.getText().equals(b9.getText());
      boolean w4 = (b1.getText().equals("X")|| b1.getText().equals("O")) && b1.getText().equals(b4.getText()) && b1.getText().equals(b7.getText());
      boolean w5 = (b2.getText().equals("X")|| b2.getText().equals("O")) && b2.getText().equals(b5.getText()) && b2.getText().equals(b8.getText());
      boolean w6 = (b3.getText().equals("X")|| b3.getText().equals("O")) && b3.getText().equals(b6.getText()) && b3.getText().equals(b9.getText());
      boolean w7 = (b1.getText().equals("X")|| b1.getText().equals("O")) && b1.getText().equals(b5.getText()) && b1.getText().equals(b9.getText());
      boolean w8 = (b3.getText().equals("X")|| b3.getText().equals("O")) && b3.getText().equals(b5.getText()) && b3.getText().equals(b7.getText());
      
      
      
      
      
      
      
      
      //if (warunekSprawdzenia) {
        if (w1) { 
              String zwyciezca;
              if (b1.getText().equals("X")){
                    zwyciezca = Uzytkownik1.getText();
              } else {
                    zwyciezca = Uzytkownik2.getText();
              }
              JOptionPane.showMessageDialog(null, "Wygrywa gracz " + zwyciezca);
              kolejnaGra();
          } else 
        if (w2) { 
              String zwyciezca;
              if (b4.getText().equals("X")){
                    zwyciezca = Uzytkownik1.getText();
              } else {
                    zwyciezca = Uzytkownik2.getText();
              }
              JOptionPane.showMessageDialog(null, "Wygrywa gracz " + zwyciezca);
              kolejnaGra();
          }   else   
        if (w3) { 
              String zwyciezca;
              if (b7.getText().equals("X")){
                    zwyciezca = Uzytkownik1.getText();
              } else {
                    zwyciezca = Uzytkownik2.getText();
              }
              JOptionPane.showMessageDialog(null, "Wygrywa gracz " + zwyciezca);
              kolejnaGra();
          } else
        if (w4) { 
              String zwyciezca;
              if (b1.getText().equals("X")){
                    zwyciezca = Uzytkownik1.getText();
              } else {
                    zwyciezca = Uzytkownik2.getText();
              }
              JOptionPane.showMessageDialog(null, "Wygrywa gracz " + zwyciezca);
              kolejnaGra();
          } else
        if (w5) { 
              String zwyciezca;
              if (b2.getText().equals("X")){
                    zwyciezca = Uzytkownik1.getText();
              } else {
                    zwyciezca = Uzytkownik2.getText();
              }
              JOptionPane.showMessageDialog(null, "Wygrywa gracz " + zwyciezca);
              kolejnaGra();                      
          } else
        if (w6) { 
              String zwyciezca;
              if (b3.getText().equals("X")){
                    zwyciezca = Uzytkownik1.getText();
              } else {
                    zwyciezca = Uzytkownik2.getText();
              }
              JOptionPane.showMessageDialog(null, "Wygrywa gracz " + zwyciezca);
              kolejnaGra();
          } else 
        if (w7) { 
              String zwyciezca;
              if (b1.getText().equals("X")){
                    zwyciezca = Uzytkownik1.getText();
              } else {
                    zwyciezca = Uzytkownik2.getText();
              }
              JOptionPane.showMessageDialog(null, "Wygrywa gracz " + zwyciezca);
              kolejnaGra();
          } else
        if (w8) { 
              String zwyciezca;
              if (b3.getText().equals("X")){
                    zwyciezca = Uzytkownik1.getText();
              } else {
                    zwyciezca = Uzytkownik2.getText();
              }
              JOptionPane.showMessageDialog(null, "Wygrywa gracz " + zwyciezca);
              kolejnaGra();
          } else if (warunekSprawdzenia){
              JOptionPane.showMessageDialog(null, "Mecz zakonczyl sie remisem"); 
              kolejnaGra();
        }
        
          
 
      //}
      
  }

      
    
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Uzytkownik1 = new javax.swing.JLabel();
        Uzytkownik2 = new javax.swing.JLabel();
        b1 = new javax.swing.JButton();
        b4 = new javax.swing.JButton();
        b3 = new javax.swing.JButton();
        b5 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        b6 = new javax.swing.JButton();
        b2 = new javax.swing.JButton();
        b9 = new javax.swing.JButton();
        b7 = new javax.swing.JButton();
        b8 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Gracz = new javax.swing.JLabel();
        Start = new javax.swing.JButton();
        Gra = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        Uzytkownik1.setText("jLabel2");

        Uzytkownik2.setFont(new java.awt.Font("Stencil", 0, 20)); // NOI18N
        Uzytkownik2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 240, 240));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setForeground(java.awt.Color.orange);
        setMaximumSize(new java.awt.Dimension(720, 550));
        setMinimumSize(new java.awt.Dimension(720, 550));
        getContentPane().setLayout(null);

        b1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        b1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });
        getContentPane().add(b1);
        b1.setBounds(163, 94, 70, 56);

        b4.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        b4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b4ActionPerformed(evt);
            }
        });
        getContentPane().add(b4);
        b4.setBounds(163, 220, 70, 56);

        b3.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        b3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });
        getContentPane().add(b3);
        b3.setBounds(425, 94, 70, 56);

        b5.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        b5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b5ActionPerformed(evt);
            }
        });
        getContentPane().add(b5);
        b5.setBounds(288, 220, 70, 56);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel4.setText("Kolko i Krzyzyk");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(210, 0, 320, 50);

        b6.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        b6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b6ActionPerformed(evt);
            }
        });
        getContentPane().add(b6);
        b6.setBounds(425, 220, 70, 56);

        b2.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        b2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });
        getContentPane().add(b2);
        b2.setBounds(288, 94, 70, 56);

        b9.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        b9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b9ActionPerformed(evt);
            }
        });
        getContentPane().add(b9);
        b9.setBounds(425, 336, 70, 56);

        b7.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        b7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b7ActionPerformed(evt);
            }
        });
        getContentPane().add(b7);
        b7.setBounds(163, 336, 70, 56);

        b8.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        b8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b8ActionPerformed(evt);
            }
        });
        getContentPane().add(b8);
        b8.setBounds(288, 336, 70, 56);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Czyja kolej");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(560, 0, 140, 29);

        Gracz.setFont(new java.awt.Font("Wide Latin", 0, 16)); // NOI18N
        Gracz.setForeground(new java.awt.Color(255, 102, 102));
        getContentPane().add(Gracz);
        Gracz.setBounds(549, 47, 151, 40);

        Start.setText("Start/Nowa gra");
        Start.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Start.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StartActionPerformed(evt);
            }
        });
        getContentPane().add(Start);
        Start.setBounds(537, 385, 137, 35);

        Gra.setText("Resetuj Gre");
        Gra.setToolTipText("");
        Gra.setActionCommand("Gra");
        Gra.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Gra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GraActionPerformed(evt);
            }
        });
        getContentPane().add(Gra);
        Gra.setBounds(537, 438, 137, 35);

        jLabel2.setForeground(new java.awt.Color(204, 255, 204));
        jLabel2.setText("Projected by Kamil Gerard Oleszko");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(231, 484, 360, 16);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/12134.jpg"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 700, 500);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
        
        boolean czyPuste = Gracz.getText().equals("");
        
    if (czyPuste == false) {

        if (Gracz.getText().equals(Uzytkownik1.getText())) {
          b1.setText("X");  
        } else {
          b1.setText("O");
        }
               
        zmienGracza();
        wygrana();
        b1.setEnabled(false);
    } else JOptionPane.showMessageDialog(null, "Nie wybrano graczy. Rozpocznij nowa gre przyciskiem Start/Nowa gra.");
    
        
    }//GEN-LAST:event_b1ActionPerformed

    private void StartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StartActionPerformed
       
        odNowa();
        ustawGraczy();
//        String user1 = JOptionPane.showInputDialog(null, "Podaj pierwszego gracza");
//        String user2 = JOptionPane.showInputDialog(null, "Podaj drugiego gracza");
//        Uzytkownik1.setText(user1);
//        Uzytkownik2.setText(user2);
//        Gracz.setText(user1);
        Start.setEnabled(false);
        
        //Uzytkownik1.hide();
        
    }//GEN-LAST:event_StartActionPerformed

    private void GraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GraActionPerformed
      odNowa();
      Uzytkownik1.setText("");
      Uzytkownik2.setText("");
      Gracz.setText("");
            
    }//GEN-LAST:event_GraActionPerformed

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
    boolean czyPuste = Gracz.getText().equals("");
    if (czyPuste == false) {    
        if (Gracz.getText().equals(Uzytkownik1.getText())) {
          b2.setText("X");  
        } else {
          b2.setText("O");
        }
        zmienGracza();
        wygrana();
        b2.setEnabled(false);
    } else JOptionPane.showMessageDialog(null, "Nie wybrano graczy. Rozpocznij nowa gre przyciskiem Start/Nowa gra.");
    }//GEN-LAST:event_b2ActionPerformed

    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b3ActionPerformed
    boolean czyPuste = Gracz.getText().equals("");
    if (czyPuste == false) {        
        
        if (Gracz.getText().equals(Uzytkownik1.getText())) {
          b3.setText("X");  
        } else {
          b3.setText("O");
        }
        wygrana();
        zmienGracza();
        b3.setEnabled(false);
    } else JOptionPane.showMessageDialog(null, "Nie wybrano graczy. Rozpocznij nowa gre przyciskiem Start/Nowa gra.");
    }//GEN-LAST:event_b3ActionPerformed

    private void b4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b4ActionPerformed
    boolean czyPuste = Gracz.getText().equals("");
    if (czyPuste == false) {            
        
        if (Gracz.getText().equals(Uzytkownik1.getText())) {
          b4.setText("X");  
        } else {
          b4.setText("O");
        }
        wygrana();
        zmienGracza();
        b4.setEnabled(false);
    } else JOptionPane.showMessageDialog(null, "Nie wybrano graczy. Rozpocznij nowa gre przyciskiem Start/Nowa gra.");
    }//GEN-LAST:event_b4ActionPerformed

    private void b5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b5ActionPerformed
    boolean czyPuste = Gracz.getText().equals("");
    if (czyPuste == false) {           
        
        if (Gracz.getText().equals(Uzytkownik1.getText())) {
          b5.setText("X");  
        } else {
          b5.setText("O");
        }
         wygrana();
         zmienGracza();
        b5.setEnabled(false);
    } else JOptionPane.showMessageDialog(null, "Nie wybrano graczy. Rozpocznij nowa gre przyciskiem Start/Nowa gra.");
    }//GEN-LAST:event_b5ActionPerformed

    private void b6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b6ActionPerformed
    boolean czyPuste = Gracz.getText().equals("");
    if (czyPuste == false) {                
        
        if (Gracz.getText().equals(Uzytkownik1.getText())) {
          b6.setText("X");  
        } else {
          b6.setText("O");
        }
         wygrana();
         zmienGracza();
        b6.setEnabled(false);
    } else JOptionPane.showMessageDialog(null, "Nie wybrano graczy. Rozpocznij nowa gre przyciskiem Start/Nowa gra.");
    }//GEN-LAST:event_b6ActionPerformed

    private void b7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b7ActionPerformed
          
    boolean czyPuste = Gracz.getText().equals("");
    if (czyPuste == false) {                    
        
        if (Gracz.getText().equals(Uzytkownik1.getText())) {
          b7.setText("X");  
        } else {
          b7.setText("O");
        }
          wygrana();
          zmienGracza();
        b7.setEnabled(false);
    } else JOptionPane.showMessageDialog(null, "Nie wybrano graczy. Rozpocznij nowa gre przyciskiem Start/Nowa gra.");
    
    }//GEN-LAST:event_b7ActionPerformed

    private void b8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b8ActionPerformed
    boolean czyPuste = Gracz.getText().equals("");
    if (czyPuste == false) {              
        
        if (Gracz.getText().equals(Uzytkownik1.getText())) {
          b8.setText("X");  
        } else {
          b8.setText("O");
        }
          wygrana();
          zmienGracza();
        b8.setEnabled(false);
    } else JOptionPane.showMessageDialog(null, "Nie wybrano graczy. Rozpocznij nowa gre przyciskiem Start/Nowa gra.");
    }//GEN-LAST:event_b8ActionPerformed

    private void b9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b9ActionPerformed
        
    boolean czyPuste = Gracz.getText().equals("");
    if (czyPuste == false) {      
        if (Gracz.getText().equals(Uzytkownik1.getText())) {
          b9.setText("X");  
        } else {
          b9.setText("O");
        }
           wygrana();
           zmienGracza();
        b9.setEnabled(false);
    }   else JOptionPane.showMessageDialog(null, "Nie wybrano graczy. Rozpocznij nowa gre przyciskiem Start/Nowa gra.");
    }//GEN-LAST:event_b9ActionPerformed

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
            java.util.logging.Logger.getLogger(KolkoKrzyzyk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KolkoKrzyzyk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KolkoKrzyzyk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KolkoKrzyzyk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KolkoKrzyzyk().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Gra;
    private static javax.swing.JLabel Gracz;
    public javax.swing.JButton Start;
    private javax.swing.JLabel Uzytkownik1;
    private javax.swing.JLabel Uzytkownik2;
    private javax.swing.JButton b1;
    private javax.swing.JButton b2;
    private javax.swing.JButton b3;
    private javax.swing.JButton b4;
    private javax.swing.JButton b5;
    private javax.swing.JButton b6;
    private javax.swing.JButton b7;
    private javax.swing.JButton b8;
    private javax.swing.JButton b9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables

    private void StartActionPerformed(JButton Start) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
