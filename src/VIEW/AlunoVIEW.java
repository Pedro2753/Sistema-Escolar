/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package VIEW;

import DAO.AlunoDAO;
import DAO.Conexao;
import DAO.CursoDAO;
import DTO.Aluno;
import DTO.Curso;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Admin
 */
public class AlunoVIEW extends javax.swing.JFrame {

    /**
     * Creates new form AlunoVIEW
     */
    public AlunoVIEW() {

        initComponents();
        ListarValores();
        ListarValoresCurso();
        restaurarDadoscmcCurso();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtData_de_nascimento = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtMatricula = new javax.swing.JTextField();
        btnCadastrar = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblAluno = new javax.swing.JTable();
        btnCarregarCampos = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        cmbCurso = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblCurso = new javax.swing.JTable();
        btnLimpar = new javax.swing.JButton();
        txtPesquisarNomeAluno = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtPesquisarNomeCurso = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Sistema Escola - Alunos");
        setForeground(new java.awt.Color(0, 0, 0));
        setResizable(false);

        jLabel1.setText("Nome");

        jLabel2.setText("Data de Nascimento");

        jLabel3.setText("Matricula");

        txtMatricula.setEnabled(false);

        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        btnAlterar.setText("Alterar");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        tblAluno.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Matricula", "Nome", "Data de Nacimento", "Id_Curso"
            }
        ));
        tblAluno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tblAlunoKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tblAluno);

        btnCarregarCampos.setText("Carregar Campos");
        btnCarregarCampos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarregarCamposActionPerformed(evt);
            }
        });

        jLabel4.setText("ID_Curso");

        cmbCurso.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecionar" }));

        tblCurso.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Id_curso", "Nome"
            }
        ));
        tblCurso.setEnabled(false);
        tblCurso.setFocusable(false);
        jScrollPane2.setViewportView(tblCurso);

        btnLimpar.setText("  Limpar Campos");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        txtPesquisarNomeAluno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPesquisarNomeAlunoKeyReleased(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/16x16.png"))); // NOI18N

        txtPesquisarNomeCurso.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPesquisarNomeCursoKeyReleased(evt);
            }
        });

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/16x16.png"))); // NOI18N

        jLabel7.setText("Pesquisar Curso:");

        jLabel8.setText("Pesquisar Aluno:");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText("ALUNOS");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPesquisarNomeAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCarregarCampos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLimpar))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(146, 146, 146)
                                .addComponent(jLabel9))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cmbCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNome)
                                    .addComponent(txtData_de_nascimento)
                                    .addComponent(txtMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtPesquisarNomeCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(19, 19, 19))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtPesquisarNomeCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7)
                        .addComponent(jLabel9))
                    .addComponent(jLabel5))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtData_de_nascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(cmbCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAlterar)
                            .addComponent(btnCadastrar)
                            .addComponent(btnExcluir)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPesquisarNomeAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnCarregarCampos)
                        .addComponent(btnLimpar)))
                .addGap(30, 30, 30))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        Cadastrar();
        LimparCampos();
        ListarValores();
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        // TODO add your handling code here:
        Alterar();
        ListarValores();
        LimparCampos();
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        // TODO add your handling code here:
        Excluir();
        ListarValores();
        LimparCampos();
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnCarregarCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarregarCamposActionPerformed
        // TODO add your handling code here:
        CarregarCampos();
    }//GEN-LAST:event_btnCarregarCamposActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        // TODO add your handling code here:
        LimparCampos();
    }//GEN-LAST:event_btnLimparActionPerformed

    private void tblAlunoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblAlunoKeyReleased
        // TODO add your handling code here:
        
    }//GEN-LAST:event_tblAlunoKeyReleased

    private void txtPesquisarNomeAlunoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesquisarNomeAlunoKeyReleased
        // TODO add your handling code here:
        Pesquisar_Aluno();
    }//GEN-LAST:event_txtPesquisarNomeAlunoKeyReleased

    private void txtPesquisarNomeCursoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesquisarNomeCursoKeyReleased
        // TODO add your handling code here:
        Pesquisar_Curso();
    }//GEN-LAST:event_txtPesquisarNomeCursoKeyReleased

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
            java.util.logging.Logger.getLogger(AlunoVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AlunoVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AlunoVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AlunoVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AlunoVIEW().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnCarregarCampos;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JComboBox<String> cmbCurso;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblAluno;
    private javax.swing.JTable tblCurso;
    private javax.swing.JTextField txtData_de_nascimento;
    private javax.swing.JTextField txtMatricula;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtPesquisarNomeAluno;
    private javax.swing.JTextField txtPesquisarNomeCurso;
    // End of variables declaration//GEN-END:variables
private void ListarValores() {

        try {
            AlunoDAO objalunodao = new AlunoDAO();

            DefaultTableModel model = (DefaultTableModel) tblAluno.getModel();
            model.setNumRows(0);

            ArrayList<Aluno> lista = objalunodao.PesquisarAluno();

            for (int num = 0; num < lista.size(); num++) {
                model.addRow(new Object[]{
                    lista.get(num).getMatricula(),
                    lista.get(num).getNome_aluno(),
                    lista.get(num).getData_de_nascimento(),
                    lista.get(num).getId_curso(),});
            }
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Listar valores AlunoVIEW" + erro);
        }
    }

    private void ListarValoresCurso() {
        try {

            CursoDAO objcursodao = new CursoDAO();
            DefaultTableModel model = (DefaultTableModel) tblCurso.getModel();
            model.setNumRows(0);

            ArrayList<Curso> lista = objcursodao.PesquisarCurso();

            for (int num = 0; num < lista.size(); num++) {
                model.addRow(new Object[]{
                    lista.get(num).getId_curso(),
                    lista.get(num).getNome_curso(),});
            }
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Listar valores AlunoVIEW" + erro);
        }
    }

    private void Pesquisar_Aluno() {
    String sql = "select * from aluno where nome_aluno like ?";
    Connection conn;
    PreparedStatement pstm;
    ResultSet  rs;
        conn = new Conexao().conectaBD();
        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, txtPesquisarNomeAluno.getText() + "%");
            rs=pstm.executeQuery();
            
            tblAluno.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception erro) {
        JOptionPane.showMessageDialog(null, "Listar valores AlunoVIEW" + erro);
        }
    }
    
    private void Pesquisar_Curso(){
    String sql = "select * from curso where nome_curso like ?";
    Connection conn;
    PreparedStatement pstm;
    ResultSet  rs;
        conn = new Conexao().conectaBD();
          try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, txtPesquisarNomeCurso.getText() + "%");
            rs=pstm.executeQuery();
            
            tblCurso.setModel(DbUtils.resultSetToTableModel(rs));
          } catch (Exception erro) {
              JOptionPane.showMessageDialog(null, "Listar valores AlunoVIEW" + erro);
          }
    }

    private void CarregarCampos() {
        int setar = tblAluno.getSelectedRow();

        txtMatricula.setText(tblAluno.getModel().getValueAt(setar, 0).toString());
        txtNome.setText(tblAluno.getModel().getValueAt(setar, 1).toString());
        txtData_de_nascimento.setText(tblAluno.getModel().getValueAt(setar, 2).toString());
        cmbCurso.setSelectedItem(tblAluno.getModel().getValueAt(setar, 3).toString());

    }

    private void Cadastrar() {
        String nome_aluno, data_de_nascimento;
        int id_curso;

        nome_aluno = txtNome.getText();
        data_de_nascimento = (String) txtData_de_nascimento.getText();
        id_curso = codcurso.get(cmbCurso.getSelectedIndex() - 1);

        Aluno objaluno = new Aluno();
        objaluno.setNome_aluno(nome_aluno);
        objaluno.setData_de_nascimento(data_de_nascimento);
        objaluno.setId_curso(id_curso);

        AlunoDAO objalunodao = new AlunoDAO();
        objalunodao.cadastrarAluno(objaluno);
        JOptionPane.showMessageDialog(null, "Cadastro Realizado");
    }

    private void LimparCampos() {
        txtMatricula.setText("");
        txtNome.setText("");
        txtData_de_nascimento.setText("");
        cmbCurso.setSelectedIndex(0);
    }

    private void Alterar() {
        int matricula, id_curso;
        String nome_aluno, data_de_nascimento;

        matricula = Integer.parseInt(txtMatricula.getText());
        nome_aluno = txtNome.getText();
        data_de_nascimento = txtData_de_nascimento.getText();
        id_curso = codcurso.get(cmbCurso.getSelectedIndex() - 1);

        Aluno objaluno = new Aluno();
        objaluno.setMatricula(matricula);
        objaluno.setNome_aluno(nome_aluno);
        objaluno.setData_de_nascimento(data_de_nascimento);
        objaluno.setId_curso(id_curso);

        AlunoDAO objalunodao = new AlunoDAO();
        objalunodao.AlterarAluno(objaluno);

    }

    private void Excluir() {

        int matricula = Integer.parseInt(txtMatricula.getText());

        Aluno objaluno = new Aluno();
        objaluno.setMatricula(matricula);

        AlunoDAO objalunodao = new AlunoDAO();
        objalunodao.ExcluirAluno(objaluno);
    }

    Vector<Integer> codcurso = new Vector<Integer>();

    public void restaurarDadoscmcCurso() {

        try {
            AlunoDAO objalunodao = new AlunoDAO();
            ResultSet rs = objalunodao.listarCurso();

            while (rs.next()) {
                codcurso.addElement(rs.getInt(1));
                cmbCurso.addItem(rs.getString(1));
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "");
        }

    }

}