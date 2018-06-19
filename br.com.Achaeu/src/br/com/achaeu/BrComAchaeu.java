/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.achaeu;

import autenticacao.UsuarioManager;
import controller.IEntidadeController;
import controller.LocalController;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import model.IEntidade;
import model.Local;
import java.awt.Window;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.ItemListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import model.Usuario;
import view.FrmLogon;
import view.FrmNovoUsuario;
import view.FrmNovoLocal;
import view.FrmUsuario;

/**
 *
 * @author jonathan
 */
public class BrComAchaeu extends javax.swing.JFrame {

    private IEntidadeController controller = new LocalController();

    private LocalController controller = new LocalController();
    /**
     * Creates new form BrComAchaeu
     */
    public BrComAchaeu() {
        initComponents();
        carregarLocais();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbLocais = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        txtConsulta = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        mnuMain = new javax.swing.JMenuBar();
        mnuUsuario = new javax.swing.JMenu();
        mnuLogon = new javax.swing.JMenuItem();
        mnuAlterar = new javax.swing.JMenuItem();
        mnuCriarNovaConta = new javax.swing.JMenuItem();
        mnuUsuarioSpr1 = new javax.swing.JPopupMenu.Separator();
        mnuLogoff = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("AchaEu!");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados"));

        tbLocais.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Telefone"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbLocais.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbLocaisMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbLocais);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 586, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Faça sua busca!"));

        jButton1.setText("Buscar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtConsulta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        mnuUsuario.setText("Usuário");

        mnuLogon.setText("Logon");
        mnuLogon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuLogonActionPerformed(evt);
            }
        });
        mnuUsuario.add(mnuLogon);

        mnuAlterar.setText("Alterar usuário...");
        mnuAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuAlterarActionPerformed(evt);
            }
        });
        mnuUsuario.add(mnuAlterar);

        mnuCriarNovaConta.setText("Criar nova conta...");
        mnuCriarNovaConta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuCriarNovaContaActionPerformed(evt);
            }
        });
        mnuUsuario.add(mnuCriarNovaConta);
        mnuUsuario.add(mnuUsuarioSpr1);

        mnuLogoff.setText("Logoff");
        mnuLogoff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuLogoffActionPerformed(evt);
            }
        });
        mnuUsuario.add(mnuLogoff);

        mnuMain.add(mnuUsuario);

        jMenu1.setText("Locais");

        jMenuItem1.setText("Novo local");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        mnuMain.add(jMenu1);

        setJMenuBar(mnuMain);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void definirVisibilidadeDosItensDeMenu() {
        boolean visivel = UsuarioManager.isUserLogged();

        if (visivel) {
            try {
                Usuario usuario = UsuarioManager.obterLogado();
                mnuUsuario.setText(usuario.getNome());
            } catch (Exception ex) {
                Logger.getLogger(BrComAchaeu.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            mnuUsuario.setText("Usuário");
        }
        mnuLogon.setVisible(!visivel);
        mnuCriarNovaConta.setVisible(!visivel);
        mnuAlterar.setVisible(visivel);
        mnuUsuarioSpr1.setVisible(visivel);
        mnuLogoff.setVisible(visivel);
    }

    public void fecharTodosOsDialogos() {
        Window[] diags = this.getOwnedWindows();
        for (Window w : diags) {
            w.dispose();
        }
    }

    private void mnuLogonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuLogonActionPerformed
        UsuarioManager.logOff();
        FrmLogon frmLogon = new FrmLogon(this, true);
        frmLogon.setLocationRelativeTo(this);
        frmLogon.setVisible(true);

        if (frmLogon.loginComSucesso()) {
            this.definirVisibilidadeDosItensDeMenu();
        }
    }//GEN-LAST:event_mnuLogonActionPerformed

    private void mnuLogoffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuLogoffActionPerformed
        if (JOptionPane.showConfirmDialog(this, "Deseja mesmo fazer logoff?", "Logoff", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            UsuarioManager.logOff();
            this.fecharTodosOsDialogos();
            this.definirVisibilidadeDosItensDeMenu();
        }

    }//GEN-LAST:event_mnuLogoffActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        if (JOptionPane.showConfirmDialog(this,
                "Deseja realmente encerrar o AchaEu!?", "Sair da aplicação",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION) {
            UsuarioManager.logOff();
            System.exit(0);
        }

    }//GEN-LAST:event_formWindowClosing

    private void mnuAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuAlterarActionPerformed
        FrmUsuario frmUsuario = new FrmUsuario(this, false);
        frmUsuario.setLocationRelativeTo(null);
        frmUsuario.setVisible(true);
    }//GEN-LAST:event_mnuAlterarActionPerformed

    private void mnuCriarNovaContaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuCriarNovaContaActionPerformed
        FrmNovoUsuario frmUsuario = new FrmNovoUsuario(this, false);
        frmUsuario.setLocationRelativeTo(null);
        frmUsuario.setVisible(true);
    }//GEN-LAST:event_mnuCriarNovaContaActionPerformed
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        carregarLocais();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        try {
            FrmNovoLocal fnl = new FrmNovoLocal(this, true, null);
            fnl.setVisible(true);
        } catch (Exception ex) {
            Logger.getLogger(BrComAchaeu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void tbLocaisMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbLocaisMouseClicked
        if (evt.getClickCount() == 2) {
            try {
                DefaultTableModel dtm = (DefaultTableModel) tbLocais.getModel();
                Integer idLocal = (Integer)dtm.getValueAt(tbLocais.getSelectedRows()[0], 0);
                FrmNovoLocal fnl = new FrmNovoLocal(this, true, idLocal);
                fnl.setVisible(true);
            } catch (Exception ex) {
                Logger.getLogger(BrComAchaeu.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }//GEN-LAST:event_tbLocaisMouseClicked

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
            java.util.logging.Logger.getLogger(BrComAchaeu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BrComAchaeu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BrComAchaeu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BrComAchaeu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                BrComAchaeu main = new BrComAchaeu();
                main.setExtendedState(JFrame.MAXIMIZED_BOTH);
                main.definirVisibilidadeDosItensDeMenu();
                main.setVisible(true);
            }
        });
    }

    public void carregarLocais() {
        List<IEntidade> locais = controller.obterTodos();
    
    public void carregarLocais(){
        List<IEntidade> locais =  controller.consultarLocal(txtConsulta.getText());
        DefaultTableModel dtm = (DefaultTableModel) tbLocais.getModel();
        dtm.setNumRows(0);

        for (IEntidade obj : locais) {
            Local local = (Local) obj;
            dtm.addRow(new Object[]{local.getId(), local.getNome(), local.getTelefone1()});
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuItem mnuAlterar;
    private javax.swing.JMenuItem mnuCriarNovaConta;
    private javax.swing.JMenuItem mnuLogoff;
    private javax.swing.JMenuItem mnuLogon;
    private javax.swing.JMenuBar mnuMain;
    private javax.swing.JMenu mnuUsuario;
    private javax.swing.JPopupMenu.Separator mnuUsuarioSpr1;
    private javax.swing.JTable tbLocais;
    private javax.swing.JTextField txtConsulta;
    // End of variables declaration//GEN-END:variables
}
