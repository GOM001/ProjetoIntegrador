/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.ProdutoController;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Produto;

/**
 *
 * @author caiomoreno
 */
public class ConsultaProdutonternalFrame extends javax.swing.JInternalFrame {

    /**
     * Creates new form MovimentacoesInternalFrame
     */
    public ConsultaProdutonternalFrame() {
        initComponents();
        
        DefaultTableModel tmProdutos = new DefaultTableModel();
       tmProdutos.addColumn("id");
       tmProdutos.addColumn("nome");
       tmProdutos.addColumn("tipo");
       tmProdutos.addColumn("codigo");
       tmProdutos.addColumn("preco compra");
       tmProdutos.addColumn("preco venda");
       tmProdutos.addColumn("quantidade");
       tmProdutos.addColumn("fornecedor");
       
       tblProduto.setModel(tmProdutos);
       tblProduto.removeColumn(tblProduto.getColumnModel().getColumn(0));
       tmProdutos.setRowCount(0);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        PanelMovimentacoes = new javax.swing.JPanel();
        LabelMovimentacoes = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        PainelAudaPesquisa = new javax.swing.JPanel();
        btnAjuda = new javax.swing.JButton();
        btnPesquisar = new javax.swing.JButton();
        txtPesquisaPlanta = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        cboTipoConsulta = new javax.swing.JComboBox<String>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProduto = new javax.swing.JTable();
        btnAlterar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();

        setClosable(true);
        setResizable(true);
        setPreferredSize(new java.awt.Dimension(784, 550));

        PanelMovimentacoes.setBackground(new java.awt.Color(204, 204, 204));

        LabelMovimentacoes.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        LabelMovimentacoes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelMovimentacoes.setText("Estoque");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/envio-e-entrega.png"))); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/envio-e-entrega.png"))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel4.setText("Consulta & Alteração");

        javax.swing.GroupLayout PanelMovimentacoesLayout = new javax.swing.GroupLayout(PanelMovimentacoes);
        PanelMovimentacoes.setLayout(PanelMovimentacoesLayout);
        PanelMovimentacoesLayout.setHorizontalGroup(
            PanelMovimentacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelMovimentacoesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGroup(PanelMovimentacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelMovimentacoesLayout.createSequentialGroup()
                        .addGap(175, 175, 175)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelMovimentacoesLayout.createSequentialGroup()
                        .addGap(243, 243, 243)
                        .addComponent(LabelMovimentacoes)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addContainerGap())
        );
        PanelMovimentacoesLayout.setVerticalGroup(
            PanelMovimentacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelMovimentacoesLayout.createSequentialGroup()
                .addGroup(PanelMovimentacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PanelMovimentacoesLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LabelMovimentacoes))
                    .addGroup(PanelMovimentacoesLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(PanelMovimentacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
                            .addGroup(PanelMovimentacoesLayout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );

        PainelAudaPesquisa.setBackground(new java.awt.Color(204, 204, 204));

        btnAjuda.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        btnAjuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ajuda.png"))); // NOI18N
        btnAjuda.setText("Ajuda");

        btnPesquisar.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        btnPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pesquisa.png"))); // NOI18N
        btnPesquisar.setText("Pesquisar");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnPesquisarActionPerformed(evt);
            }
        });

        txtPesquisaPlanta.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtPesquisaPlanta.setMinimumSize(new java.awt.Dimension(23, 24));
        txtPesquisaPlanta.setOpaque(false);
        txtPesquisaPlanta.setPreferredSize(new java.awt.Dimension(100, 24));
        txtPesquisaPlanta.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                txtPesquisaPlantaActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Consultar por:");

        cboTipoConsulta.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cboTipoConsulta.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Código", "Nome", "Fornecedor" }));

        javax.swing.GroupLayout PainelAudaPesquisaLayout = new javax.swing.GroupLayout(PainelAudaPesquisa);
        PainelAudaPesquisa.setLayout(PainelAudaPesquisaLayout);
        PainelAudaPesquisaLayout.setHorizontalGroup(
            PainelAudaPesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelAudaPesquisaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnAjuda)
                .addGap(32, 32, 32)
                .addComponent(jLabel1)
                .addGap(20, 20, 20)
                .addComponent(cboTipoConsulta, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(txtPesquisaPlanta, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(btnPesquisar)
                .addGap(10, 10, 10))
        );
        PainelAudaPesquisaLayout.setVerticalGroup(
            PainelAudaPesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelAudaPesquisaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PainelAudaPesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PainelAudaPesquisaLayout.createSequentialGroup()
                        .addComponent(txtPesquisaPlanta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(3, 3, 3))
                    .addGroup(PainelAudaPesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnAjuda)
                        .addComponent(btnPesquisar)
                        .addComponent(cboTipoConsulta)
                        .addComponent(jLabel1)))
                .addGap(12, 12, 12))
        );

        tblProduto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tblProduto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {

            },
            new String []
            {
                "Código", "Produto", "Fornecedor", "Quantidade"
            }
        )
        {
            Class[] types = new Class []
            {
                java.lang.Byte.class, java.lang.String.class, java.lang.String.class, java.lang.Byte.class
            };

            public Class getColumnClass(int columnIndex)
            {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblProduto);

        btnAlterar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icone_alterar.png"))); // NOI18N
        btnAlterar.setText("Alterar");

        btnExcluir.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icone-excluir.png"))); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnExcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(PanelMovimentacoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PainelAudaPesquisa, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PanelMovimentacoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PainelAudaPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 167, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        setBounds(0, 0, 800, 602);
    }// </editor-fold>//GEN-END:initComponents

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
       
      
       DefaultTableModel tmProdutos = new DefaultTableModel();
       tmProdutos.addColumn("id");
       tmProdutos.addColumn("nome");
       tmProdutos.addColumn("tipo");
       tmProdutos.addColumn("codigo");
       tmProdutos.addColumn("preco compra");
       tmProdutos.addColumn("preco venda");
       tmProdutos.addColumn("quantidade");
       tmProdutos.addColumn("fornecedor");
       
       tblProduto.setModel(tmProdutos);
      // tblProduto.removeColumn(tblProduto.getColumnModel().getColumn(0));
       tmProdutos.setRowCount(0);
       
       
       
       
       String tipo = cboTipoConsulta.getSelectedItem().toString();
       String dadosPesquisados = txtPesquisaPlanta.getText();
       
       ArrayList<Produto> listaProdutos = ProdutoController.pesquisar(tipo, dadosPesquisados);
       
       for(Produto p : listaProdutos)
       {
           System.out.println("1");
           System.out.println(p.getId_produto()+ " " +p.getNome()+ " " +p.getTipo()+ " " +p.getCodigo()+ " " +p.getPrecoCompra()+ " " +p.getPrecoVenda()+ " " +p.getQuantidade()+ " " +p.getFornecedor());
           tmProdutos.addRow(new Object[]{p.getId_produto(),p.getNome(),p.getTipo(),p.getCodigo(),p.getPrecoCompra(),p.getPrecoVenda(),p.getQuantidade(),p.getFornecedor()});
           
       }
       
      
       
       
       
            
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void txtPesquisaPlantaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPesquisaPlantaActionPerformed
        // TODO add your handling code here:

        String a = evt.toString();
        System.out.println(a);
    }//GEN-LAST:event_txtPesquisaPlantaActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        DefaultTableModel tblModelo = (DefaultTableModel) tblProduto.getModel();
        String mensagem;
        boolean excluiuProduto = false;

        int linha = tblProduto.getSelectedRow();
        int ProdutoID = (Integer) tblProduto.getValueAt(linha, 0); //Necessário posicionar o ID na primeira coluna da tabela.
       // int ProdutoID = (Integer) tblProduto.getValueAt(linha, 0);

        if (ProdutoID > 0 && linha >= 0) {
            excluiuProduto = ProdutoController.excluir(ProdutoID);
            if (excluiuProduto) {
                tblModelo.removeRow(linha);
            }
        }
        mensagem = excluiuProduto ? "Produto e todo o seu estoque removido." : "Não foi possível excluir.";

        JOptionPane.showMessageDialog(this, mensagem);
    }//GEN-LAST:event_btnExcluirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelMovimentacoes;
    private javax.swing.JPanel PainelAudaPesquisa;
    private javax.swing.JPanel PanelMovimentacoes;
    private javax.swing.JButton btnAjuda;
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JComboBox<String> cboTipoConsulta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblProduto;
    private javax.swing.JTextField txtPesquisaPlanta;
    // End of variables declaration//GEN-END:variables
}
