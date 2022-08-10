/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import controller.ControllerProdutos;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import model.ModelProdutos;
import util.Formatador;

/**
 *
 * @author emano
 */
public class ViewProduto extends javax.swing.JFrame {

    ArrayList<ModelProdutos> listaModelProduto = new ArrayList<>();
    ControllerProdutos controllerProduto = new ControllerProdutos();
    ModelProdutos modelProduto = new ModelProdutos();
    String salvarAlterar;
    Formatador formatador = new Formatador();

    /**
     * Creates new form ViewProduto
     */
    public ViewProduto() {
        initComponents();
        carregarProdutos();
        setLocationRelativeTo(null);
        habilitarDesabilitarCampos(false);
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
        jLabel1 = new javax.swing.JLabel();
        jtfCodigo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jtfNome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtableProdutos = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jtfPesquisa = new javax.swing.JTextField();
        jbPesquisa = new javax.swing.JButton();
        jbCancelar = new javax.swing.JButton();
        jbNovo = new javax.swing.JButton();
        jbAlterar = new javax.swing.JButton();
        jbExcluir = new javax.swing.JButton();
        jbSalvar = new javax.swing.JButton();
        jtfQuantidade = new javax.swing.JFormattedTextField();
        jtfValor = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Estoque");
        setResizable(false);

        jLabel1.setText("Código:");

        jtfCodigo.setEditable(false);
        jtfCodigo.setEnabled(false);

        jLabel2.setText("Nome:");

        jLabel3.setText("Quantidade:");

        jLabel4.setText("Valor:");

        jtableProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Código", "Nome", "Quantidade", "Valor"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jtableProdutos);
        if (jtableProdutos.getColumnModel().getColumnCount() > 0) {
            jtableProdutos.getColumnModel().getColumn(1).setMinWidth(300);
            jtableProdutos.getColumnModel().getColumn(1).setPreferredWidth(300);
        }

        jLabel5.setText("Pesquisar:");

        jtfPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfPesquisaActionPerformed(evt);
            }
        });

        jbPesquisa.setText("Pesquisar");
        jbPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbPesquisaActionPerformed(evt);
            }
        });

        jbCancelar.setText("Cancelar");
        jbCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCancelarActionPerformed(evt);
            }
        });

        jbNovo.setText("Novo");
        jbNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNovoActionPerformed(evt);
            }
        });

        jbAlterar.setText("Alterar");
        jbAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAlterarActionPerformed(evt);
            }
        });

        jbExcluir.setText("Excluir");
        jbExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbExcluirActionPerformed(evt);
            }
        });

        jbSalvar.setText("Salvar");
        jbSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalvarActionPerformed(evt);
            }
        });

        jtfQuantidade.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        jtfValor.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("0.00"))));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jbCancelar)
                        .addGap(18, 18, 18)
                        .addComponent(jbExcluir)
                        .addGap(18, 18, 18)
                        .addComponent(jbAlterar)
                        .addGap(18, 18, 18)
                        .addComponent(jbNovo)
                        .addGap(147, 147, 147)
                        .addComponent(jbSalvar))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(17, 17, 17)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jtfCodigo, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                                .addComponent(jLabel1)
                                .addComponent(jLabel3)
                                .addComponent(jtfQuantidade))
                            .addGap(43, 43, 43)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jtfNome, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2)
                                .addComponent(jLabel4)
                                .addComponent(jtfValor, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(18, 18, 18)
                            .addComponent(jLabel5)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jtfPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jbPesquisa))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 556, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(2, 2, 2)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jtfPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbPesquisa))
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbCancelar)
                    .addComponent(jbNovo)
                    .addComponent(jbAlterar)
                    .addComponent(jbExcluir)
                    .addComponent(jbSalvar))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void jtfPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfPesquisaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfPesquisaActionPerformed

    private void jbSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalvarActionPerformed
        // TODO add your handling code here:
        if (salvarAlterar == "salvar"){
            salvarProduto();
        }else{
            alterarProduto();
        }
    }//GEN-LAST:event_jbSalvarActionPerformed

    private void jbExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbExcluirActionPerformed
        // Excluir um produto do banco
        int linha = jtableProdutos.getSelectedRow();
        int codigoProduto = (int) jtableProdutos.getValueAt(linha, 0);

        if (controllerProduto.excluirProdutoController(codigoProduto)) {
            JOptionPane.showMessageDialog(this, "Produto excluido com sucesso!", "SUCESSO!", JOptionPane.WARNING_MESSAGE);
            carregarProdutos();
            this.habilitarDesabilitarCampos(false);
        } else {
            JOptionPane.showMessageDialog(this, "Erro ao excluir Produto!", "ERRO", JOptionPane.ERROR_MESSAGE);
        }


    }//GEN-LAST:event_jbExcluirActionPerformed

    private void jbNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNovoActionPerformed
        // TODO add your handling code here:
        this.habilitarDesabilitarCampos(true);
        salvarAlterar = "salvar";
    }//GEN-LAST:event_jbNovoActionPerformed

    private void jbCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelarActionPerformed
        // TODO add your handling code here:
        this.habilitarDesabilitarCampos(false);
        this.limparCampos();
    }//GEN-LAST:event_jbCancelarActionPerformed

    private void jbAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAlterarActionPerformed
        // TODO add your handling code here:
        int linha = this.jtableProdutos.getSelectedRow();
        salvarAlterar = "alterar";
        try {
            int codigoProduto = (int) this.jtableProdutos.getValueAt(linha, 0);
            //recupara os dados do banco
            modelProduto = controllerProduto.getProdutoController(codigoProduto);
            //mostrar na interface
            this.jtfCodigo.setText(String.valueOf(modelProduto.getIdProduto()));
            this.jtfNome.setText(modelProduto.getProNome());
            this.jtfQuantidade.setText(String.valueOf(modelProduto.getProQuantidade()));
            this.jtfValor.setText(String.valueOf(modelProduto.getProValor()));
            this.habilitarDesabilitarCampos(true);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Código inválido ou nenhum registro selecionado", "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jbAlterarActionPerformed

    private void jbPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbPesquisaActionPerformed
        // TODO add your handling code here:
        DefaultTableModel modelo = (DefaultTableModel) this.jtableProdutos.getModel();
        final TableRowSorter<TableModel> classificador = new TableRowSorter(modelo);
        this.jtableProdutos.setRowSorter(classificador);
        String texto = jtfPesquisa.getText();
        classificador.setRowFilter(RowFilter.regexFilter(texto, 1));
        
    }//GEN-LAST:event_jbPesquisaActionPerformed

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
            java.util.logging.Logger.getLogger(ViewProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewProduto().setVisible(true);
            }
        });
    }

    /**
     * Hablita edição dos campos
     *
     * @param condicao
     */
    private void habilitarDesabilitarCampos(boolean condicao) {
        jtfNome.setEnabled(condicao);
        jtfQuantidade.setEnabled(condicao);
        jtfValor.setEnabled(condicao);
    }

    private void salvarProduto() {
        modelProduto.setProNome(this.jtfNome.getText());
        modelProduto.setProQuantidade(Integer.parseInt(this.jtfQuantidade.getText()));
        modelProduto.setProValor(formatador.converterVP(this.jtfValor.getText()));
        if (controllerProduto.salvarProdutoController(modelProduto) > 0) {
            JOptionPane.showMessageDialog(this, "Produto cadastrado com sucesso!", "SUCESSO!", JOptionPane.WARNING_MESSAGE);
            this.carregarProdutos();
            this.limparCampos();
            this.habilitarDesabilitarCampos(false);
        } else {
            JOptionPane.showMessageDialog(this, "Erro ao cadatrar Produto!", "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void alterarProduto() {
        modelProduto.setProNome(this.jtfNome.getText());
        modelProduto.setProQuantidade(Integer.parseInt(this.jtfQuantidade.getText()));
        modelProduto.setProValor(formatador.converterVP(this.jtfValor.getText()));
        if (controllerProduto.atualizarProdutoController(modelProduto)) {
            JOptionPane.showMessageDialog(this, "Produto alterado com sucesso!", "SUCESSO!", JOptionPane.WARNING_MESSAGE);
            this.carregarProdutos();
            this.limparCampos();
            this.habilitarDesabilitarCampos(false);
        } else {
            JOptionPane.showMessageDialog(this, "Erro ao alterar Produto!", "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }

    /**
     * Limpa os campos preenchidos
     */
    private void limparCampos() {
        jtfNome.setText("");
        jtfQuantidade.setText("");
        jtfValor.setText("");
    }

    /**
     * preenche tabela de produtos
     */
    private void carregarProdutos() {
        listaModelProduto = controllerProduto.getListaProdutoController();
        DefaultTableModel modelo = (DefaultTableModel) jtableProdutos.getModel();
        modelo.setNumRows(0);

        int cont = listaModelProduto.size();
        for (int i = 0; i < cont; i++) {
            modelo.addRow(new Object[]{
                listaModelProduto.get(i).getIdProduto(),
                listaModelProduto.get(i).getProNome(),
                listaModelProduto.get(i).getProQuantidade(),
                listaModelProduto.get(i).getProValor()
            });
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbAlterar;
    private javax.swing.JButton jbCancelar;
    private javax.swing.JButton jbExcluir;
    private javax.swing.JButton jbNovo;
    private javax.swing.JButton jbPesquisa;
    private javax.swing.JButton jbSalvar;
    private javax.swing.JTable jtableProdutos;
    private javax.swing.JTextField jtfCodigo;
    private javax.swing.JTextField jtfNome;
    private javax.swing.JTextField jtfPesquisa;
    private javax.swing.JFormattedTextField jtfQuantidade;
    private javax.swing.JFormattedTextField jtfValor;
    // End of variables declaration//GEN-END:variables
}
