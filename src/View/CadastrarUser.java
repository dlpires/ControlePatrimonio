/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import bean.Usuario;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.text.MaskFormatter;

/**
 *
 * @author Neto-PC
 */
public class CadastrarUser extends javax.swing.JFrame {

    String action = "";
    Usuario user = new Usuario();

    /**
     * Creates new form Cadastrar
     */
    public CadastrarUser() {
        initComponents();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);

        action = "cadastrar";

        btnAlterarUsuario.setVisible(false);
        btnExcluirUsuario.setVisible(false);
    }

    public CadastrarUser(Usuario user) {
        initComponents();
        setLocationRelativeTo(null);

        this.user = user;
        inicializarCampos();

        btnOkCadUser.setEnabled(false);
        txtLoginCadUser.setEnabled(false);
        
        action = "alterar";
    }

    private boolean validateForm(){
        if (txtSenhaCadUser.getText().equals("") ||
            txtConfSenhaCadUser.getText().equals("") ||
            txtNomeCadUser.getText().equals("") ||
            txtFuncaoCadUser.getText().equals("") ||
            txtCelCadUser.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Preencha todos os campos!");
            return false;
        }
        
        return true;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToggleButton1 = new javax.swing.JToggleButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtNomeCadUser = new javax.swing.JTextField();
        txtLoginCadUser = new javax.swing.JTextField();
        txtFuncaoCadUser = new javax.swing.JTextField();
        txtCelCadUser = new javax.swing.JTextField();
        btnOkCadUser = new javax.swing.JButton();
        btnLimparCadUser = new javax.swing.JButton();
        btnCancelarCadUser = new javax.swing.JButton();
        cbNivelAcessoCadUser = new javax.swing.JComboBox<>();
        btnExcluirUsuario = new javax.swing.JButton();
        btnAlterarUsuario = new javax.swing.JButton();
        txtSenhaCadUser = new javax.swing.JPasswordField();
        txtConfSenhaCadUser = new javax.swing.JPasswordField();

        jToggleButton1.setText("jToggleButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastrar Usuário");

        jLabel4.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel4.setText("Nome:");

        jLabel5.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel5.setText("Login:");

        jLabel6.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel6.setText("Senha:");

        jLabel7.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel7.setText("Confirmar Senha:");

        jLabel8.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel8.setText("Função:");

        jLabel9.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel9.setText("Nivel Acesso:");

        jLabel10.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel10.setText("Celular:");

        try{
            MaskFormatter mask = new MaskFormatter("(##)#####-####");
            txtCelCadUser = new JFormattedTextField(mask);
        }
        catch(Exception e){

        }

        btnOkCadUser.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnOkCadUser.setForeground(new java.awt.Color(0, 102, 255));
        btnOkCadUser.setText("OK");
        btnOkCadUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOkCadUserActionPerformed(evt);
            }
        });

        btnLimparCadUser.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnLimparCadUser.setText("Limpar");
        btnLimparCadUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparCadUserActionPerformed(evt);
            }
        });

        btnCancelarCadUser.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnCancelarCadUser.setForeground(new java.awt.Color(255, 0, 0));
        btnCancelarCadUser.setText("Cancelar");
        btnCancelarCadUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarCadUserActionPerformed(evt);
            }
        });

        cbNivelAcessoCadUser.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Usuário", "Administrador" }));
        cbNivelAcessoCadUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbNivelAcessoCadUserActionPerformed(evt);
            }
        });

        btnExcluirUsuario.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnExcluirUsuario.setForeground(new java.awt.Color(0, 102, 255));
        btnExcluirUsuario.setText("Excluir");
        btnExcluirUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirUsuarioActionPerformed(evt);
            }
        });

        btnAlterarUsuario.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnAlterarUsuario.setForeground(new java.awt.Color(0, 102, 255));
        btnAlterarUsuario.setText("Alterar");
        btnAlterarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarUsuarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtNomeCadUser)
                                    .addComponent(jLabel6)
                                    .addComponent(txtFuncaoCadUser)
                                    .addComponent(jLabel8)
                                    .addComponent(txtSenhaCadUser, javax.swing.GroupLayout.DEFAULT_SIZE, 393, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel7)
                                    .addComponent(txtLoginCadUser, javax.swing.GroupLayout.DEFAULT_SIZE, 297, Short.MAX_VALUE)
                                    .addComponent(txtCelCadUser)
                                    .addComponent(txtConfSenhaCadUser))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 12, Short.MAX_VALUE)
                        .addComponent(btnExcluirUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnAlterarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbNivelAcessoCadUser, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jLabel9)
                                    .addGap(392, 392, 392))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(btnOkCadUser, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(47, 47, 47)
                                    .addComponent(btnLimparCadUser, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(47, 47, 47)
                                    .addComponent(btnCancelarCadUser, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNomeCadUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtLoginCadUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSenhaCadUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtConfSenhaCadUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFuncaoCadUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCelCadUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbNivelAcessoCadUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnOkCadUser, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimparCadUser, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelarCadUser, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExcluirUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAlterarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarCadUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarCadUserActionPerformed
        /*if (action.equals("alterar")) {
            btnAlterarUsuario.setEnabled(true);
            btnExcluirUsuario.setEnabled(true);
            btnOkCadUser.setEnabled(false);
            inicializarCampos();
        } else {
            this.dispose();
        }*/
        
        this.dispose();

    }//GEN-LAST:event_btnCancelarCadUserActionPerformed

    private void btnOkCadUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOkCadUserActionPerformed

        if(!validateForm()){
            return;
        }
        
        user.setSenhaUsuario(txtSenhaCadUser.getText());
        user.setConfSenhaUsuario(txtConfSenhaCadUser.getText());
        user.setNomeUsuario(txtNomeCadUser.getText());
        user.setFuncaoUsuario(txtFuncaoCadUser.getText());
        user.setNivelAcesso(cbNivelAcessoCadUser.getSelectedIndex() + 4);
        user.setCellUsuario(txtCelCadUser.getText());

        switch (action) {
            case "alterar":
                user.update();
                btnAlterarUsuario.setEnabled(true);
                btnExcluirUsuario.setEnabled(true);
                btnOkCadUser.setEnabled(false);
                JOptionPane.showMessageDialog(null, "Usuário alterado com sucesso!");
                break;
            case "cadastrar":
                user.setLoginUsuario(txtLoginCadUser.getText());
                user.create();
                this.dispose();
                JOptionPane.showMessageDialog(null, "Usuário cadastrado com sucesso!");
                break;
            default:
                this.dispose();
                break;
        }
    }//GEN-LAST:event_btnOkCadUserActionPerformed

    private void btnLimparCadUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparCadUserActionPerformed
        if (action.equals("alterar")) {
            inicializarCampos();
        } else {
            txtLoginCadUser.setText("");
            txtSenhaCadUser.setText("");
            txtNomeCadUser.setText("");
            txtConfSenhaCadUser.setText("");
            txtFuncaoCadUser.setText("");
            txtCelCadUser.setText("");
            cbNivelAcessoCadUser.setSelectedIndex(0);
        }

    }//GEN-LAST:event_btnLimparCadUserActionPerformed

    private void btnExcluirUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirUsuarioActionPerformed
        int escolha = JOptionPane.showConfirmDialog(null, "Deseja realmente excluir esse usuário?", "Confirmar exclusão de usuário", JOptionPane.YES_NO_OPTION);
        if (escolha == JOptionPane.YES_OPTION) {
            user.delete();
            this.dispose();
            JOptionPane.showMessageDialog(null, "Usuário excluido!");
        }
    }//GEN-LAST:event_btnExcluirUsuarioActionPerformed

    private void btnAlterarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarUsuarioActionPerformed
        btnAlterarUsuario.setEnabled(false);
        btnExcluirUsuario.setEnabled(false);
        btnOkCadUser.setEnabled(true);
    }//GEN-LAST:event_btnAlterarUsuarioActionPerformed

    private void cbNivelAcessoCadUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbNivelAcessoCadUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbNivelAcessoCadUserActionPerformed

    private void inicializarCampos() {
        txtLoginCadUser.setText(user.getLoginUsuario());
        txtSenhaCadUser.setText(user.getSenhaUsuario());
        txtConfSenhaCadUser.setText(user.getConfSenhaUsuario());
        txtFuncaoCadUser.setText(user.getFuncaoUsuario());
        txtNomeCadUser.setText(user.getNomeUsuario());
        txtCelCadUser.setText(user.getCellUsuario());
        cbNivelAcessoCadUser.setSelectedIndex(user.getNivelAcesso() - 4);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterarUsuario;
    private javax.swing.JButton btnCancelarCadUser;
    private javax.swing.JButton btnExcluirUsuario;
    private javax.swing.JButton btnLimparCadUser;
    private javax.swing.JButton btnOkCadUser;
    private javax.swing.JComboBox<String> cbNivelAcessoCadUser;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JTextField txtCelCadUser;
    private javax.swing.JPasswordField txtConfSenhaCadUser;
    private javax.swing.JTextField txtFuncaoCadUser;
    private javax.swing.JTextField txtLoginCadUser;
    private javax.swing.JTextField txtNomeCadUser;
    private javax.swing.JPasswordField txtSenhaCadUser;
    // End of variables declaration//GEN-END:variables
}
