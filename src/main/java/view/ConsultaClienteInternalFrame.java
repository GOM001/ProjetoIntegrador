package view;

import controller.ClienteController;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author caiomoreno
 */
public class ConsultaClienteInternalFrame extends javax.swing.JInternalFrame {

    public ConsultaClienteInternalFrame() {
        initComponents();
        carregarTabela();
    }

    private void carregarTabela() {
        tblClientes = ClienteController.consultarTabela(tblClientes);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelMovimentacoes = new javax.swing.JPanel();
        LabelMovimentacoes = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        PainelAudaPesquisa = new javax.swing.JPanel();
        btnAjuda = new javax.swing.JButton();
        txtFiltro = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        cbFiltroConsulta = new javax.swing.JComboBox<>();
        btnExcluir = new javax.swing.JButton();
        btnAtualizar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblClientes = new javax.swing.JTable();

        setClosable(true);
        setResizable(true);
        setPreferredSize(new java.awt.Dimension(800, 600));

        PanelMovimentacoes.setBackground(new java.awt.Color(204, 204, 204));
        PanelMovimentacoes.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        PanelMovimentacoes.setMaximumSize(null);

        LabelMovimentacoes.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        LabelMovimentacoes.setForeground(new java.awt.Color(60, 63, 65));
        LabelMovimentacoes.setText("Consultar & Atualizar Cadastros de Clientes");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-manutenção-40.png"))); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-procurar-usuário-masculino-40.png"))); // NOI18N

        javax.swing.GroupLayout PanelMovimentacoesLayout = new javax.swing.GroupLayout(PanelMovimentacoes);
        PanelMovimentacoes.setLayout(PanelMovimentacoesLayout);
        PanelMovimentacoesLayout.setHorizontalGroup(
            PanelMovimentacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelMovimentacoesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                .addComponent(LabelMovimentacoes, javax.swing.GroupLayout.PREFERRED_SIZE, 596, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        PanelMovimentacoesLayout.setVerticalGroup(
            PanelMovimentacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelMovimentacoesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PanelMovimentacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
            .addGroup(PanelMovimentacoesLayout.createSequentialGroup()
                .addComponent(LabelMovimentacoes, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );

        PainelAudaPesquisa.setBackground(new java.awt.Color(204, 204, 204));
        PainelAudaPesquisa.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnAjuda.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        btnAjuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ajuda.png"))); // NOI18N
        btnAjuda.setText("Ajuda");
        btnAjuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAjudaActionPerformed(evt);
            }
        });

        txtFiltro.setFont(new java.awt.Font("Ubuntu", 0, 10)); // NOI18N
        txtFiltro.setMinimumSize(new java.awt.Dimension(23, 24));
        txtFiltro.setOpaque(false);
        txtFiltro.setPreferredSize(new java.awt.Dimension(100, 24));
        txtFiltro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFiltroActionPerformed(evt);
            }
        });
        txtFiltro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtFiltroKeyTyped(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Digitar pesquisa por:");

        cbFiltroConsulta.setForeground(new java.awt.Color(0, 0, 0));
        cbFiltroConsulta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nome", "CPF" }));
        cbFiltroConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbFiltroConsultaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PainelAudaPesquisaLayout = new javax.swing.GroupLayout(PainelAudaPesquisa);
        PainelAudaPesquisa.setLayout(PainelAudaPesquisaLayout);
        PainelAudaPesquisaLayout.setHorizontalGroup(
            PainelAudaPesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelAudaPesquisaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnAjuda)
                .addGap(60, 60, 60)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbFiltroConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PainelAudaPesquisaLayout.setVerticalGroup(
            PainelAudaPesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelAudaPesquisaLayout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addGroup(PainelAudaPesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAjuda)
                    .addComponent(txtFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(cbFiltroConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16))
        );

        btnExcluir.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-remover-usuário-masculino-24.png"))); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnAtualizar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnAtualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-alterar-usuário-masculino-24.png"))); // NOI18N
        btnAtualizar.setText("Atualizar");

        tblClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nome", "CPF", "Sexo", "Estado Civil", "E-mail", "Celular"
            }
        ));
        jScrollPane2.setViewportView(tblClientes);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(PanelMovimentacoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(PainelAudaPesquisa, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(233, 233, 233)
                        .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 777, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PanelMovimentacoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PainelAudaPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 102, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtFiltroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFiltroActionPerformed

    }//GEN-LAST:event_txtFiltroActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        DefaultTableModel tblModelo = (DefaultTableModel) tblClientes.getModel();
        String mensagem;
        boolean excluiuCliente = false;

        int linha = tblClientes.getSelectedRow();
        int ClienteID = (Integer) tblClientes.getValueAt(linha, 0);

        if (ClienteID > 0 && linha >= 0) {
            excluiuCliente = ClienteController.deletar(ClienteID);
            if (excluiuCliente) {
                tblModelo.removeRow(linha);
            }
        }
        mensagem = excluiuCliente ? "Cliente removido com sucesso." : "Não foi possível excluir o cliente.";

        JOptionPane.showMessageDialog(this, mensagem);
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void txtFiltroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFiltroKeyTyped
        TableRowSorter<TableModel> selecao = new TableRowSorter<>(((DefaultTableModel) tblClientes.getModel()));
        String campoSelecionado = cbFiltroConsulta.getSelectedItem().toString();

        int pesquisarNaColuna = campoSelecionado.contains("CPF") ? 2 : 1;

        selecao.setRowFilter(RowFilter.regexFilter(txtFiltro.getText().replace(".", ""), pesquisarNaColuna));

        tblClientes.setRowSorter(selecao);
    }//GEN-LAST:event_txtFiltroKeyTyped

    private void cbFiltroConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbFiltroConsultaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbFiltroConsultaActionPerformed

    private void btnAjudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAjudaActionPerformed
        JOptionPane.showMessageDialog(null, "Os dados dos clientes cadastrados aparecem aqui!\n"
                + "Digite no campo de filtro para pesquisar automaticamente na tabela.\n\n"
                + "- Atualize dados dos clientes.\n"
                + "- Selecione um dado e depois clique em Excluir para remover um cliente do sistema.",
                "Sobre", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnAjudaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelMovimentacoes;
    private javax.swing.JPanel PainelAudaPesquisa;
    private javax.swing.JPanel PanelMovimentacoes;
    private javax.swing.JButton btnAjuda;
    private javax.swing.JButton btnAtualizar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JComboBox<String> cbFiltroConsulta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblClientes;
    private javax.swing.JTextField txtFiltro;
    // End of variables declaration//GEN-END:variables
}
