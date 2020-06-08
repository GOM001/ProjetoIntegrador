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

        consultaTodos();
    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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
        cboTipoConsulta = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProduto = new javax.swing.JTable();
        btnAlterar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        txtQtdLinhasTabela = new javax.swing.JLabel();
        txtRegistroLinhas = new javax.swing.JLabel();

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
        btnAjuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAjudaActionPerformed(evt);
            }
        });

        btnPesquisar.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        btnPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pesquisa.png"))); // NOI18N
        btnPesquisar.setText("Pesquisar");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        txtPesquisaPlanta.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtPesquisaPlanta.setMinimumSize(new java.awt.Dimension(23, 24));
        txtPesquisaPlanta.setOpaque(false);
        txtPesquisaPlanta.setPreferredSize(new java.awt.Dimension(100, 24));
        txtPesquisaPlanta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPesquisaPlantaActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Consultar por:");

        cboTipoConsulta.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cboTipoConsulta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Código", "Nome", "Fornecedor" }));

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
                .addComponent(cboTipoConsulta, 0, 144, Short.MAX_VALUE)
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
            new Object [][] {

            },
            new String [] {
                "Código", "Produto", "Fornecedor", "Quantidade"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Byte.class, java.lang.String.class, java.lang.String.class, java.lang.Byte.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblProduto);

        btnAlterar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icone_alterar.png"))); // NOI18N
        btnAlterar.setText("Alterar");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        btnExcluir.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icone-excluir.png"))); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        txtQtdLinhasTabela.setText("0");

        txtRegistroLinhas.setText("registro(s) encontrado(s)");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addComponent(PanelMovimentacoes, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PainelAudaPesquisa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(txtQtdLinhasTabela)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtRegistroLinhas)))
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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtQtdLinhasTabela)
                    .addComponent(txtRegistroLinhas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 172, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        setBounds(0, 0, 800, 602);
    }// </editor-fold>//GEN-END:initComponents

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed

        if (txtPesquisaPlanta.getText().trim().isEmpty()) {
            consultaTodos();
        } else {
            consultaTodosComFiltro(cboTipoConsulta.getSelectedItem().toString(), txtPesquisaPlanta.getText());
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
        if (linha == -1) {
            JOptionPane.showMessageDialog(this, "Nenhum item selecionado");
        } else {
            int produtoID = (Integer) tblProduto.getValueAt(linha, 0); //Necessário posicionar o ID na primeira coluna da tabela.

            if (produtoID > 0 && linha >= 0) {
                excluiuProduto = ProdutoController.excluir(produtoID);

                if (excluiuProduto) {
                    tblModelo.removeRow(linha);
                }
            }
            mensagem = excluiuProduto ? "Produto e todo o seu estoque removido." : "Não foi possível excluir.";

            JOptionPane.showMessageDialog(this, mensagem);
        }

        int linhas = tblProduto.getRowCount();
        String strLinhas = String.valueOf(linhas);
        txtQtdLinhasTabela.setText(strLinhas);
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnAlterarActionPerformed
    {//GEN-HEADEREND:event_btnAlterarActionPerformed
        ArrayList<Produto> listaAtualizada = new ArrayList<>();
        String dadosPesquisados = txtPesquisaPlanta.getText();
        String tipoPesquisa = cboTipoConsulta.getSelectedItem().toString();
        boolean passouDados = true;
        boolean atualizou = false;

        int qtdLinhas = tblProduto.getRowCount();

        if (qtdLinhas > 0) {

            try {
                for (int i = 0; i < qtdLinhas; i++) {

                    //Recebe objeto da tabela e converte para String
                    String ProdutoId = String.valueOf(tblProduto.getValueAt(i, 0));
                    String nome = String.valueOf(tblProduto.getValueAt(i, 1).toString());
                    String tipo = String.valueOf(tblProduto.getValueAt(i, 2));
                    String strCodigo = String.valueOf(tblProduto.getValueAt(i, 3));
                    String precoCompra = String.valueOf(tblProduto.getValueAt(i, 4));
                    String precoVenda = String.valueOf(tblProduto.getValueAt(i, 5));
                    String quantidade = String.valueOf(tblProduto.getValueAt(i, 6));
                    String fornecedor = String.valueOf(tblProduto.getValueAt(i, 7));

                    int codigo = Integer.parseInt(strCodigo);
                    double precoCompraDouble = Double.parseDouble(precoCompra);
                    double precoVendaDouble = Double.parseDouble(precoVenda);
                    int quantidadeInt = Integer.parseInt(quantidade);
                    int ProdutoIdInt = Integer.parseInt(ProdutoId);

                    Produto p = new Produto(ProdutoIdInt, nome, tipo, codigo, precoCompraDouble, precoVendaDouble, quantidadeInt, fornecedor);

                    listaAtualizada.add(p);
                }

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Ocorreu um erro ao converter dados:" + e.getMessage());
                System.out.println(e.getMessage());
                passouDados = false;
            }catch(Exception e)
            {
             System.out.println(e.getMessage());   
            };
            
            if (passouDados) {
                atualizou = ProdutoController.atualizar(listaAtualizada);
            }

            String msgDados = atualizou ? "Os dados foram atualizados!" : "Nenhum dado foi atualizado.";

            JOptionPane.showMessageDialog(this, msgDados);

        }

        if (dadosPesquisados.trim().isEmpty()) {
            consultaTodos();
        } else {
            consultaTodosComFiltro(tipoPesquisa, dadosPesquisados);
        }
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnAjudaActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnAjudaActionPerformed
    {//GEN-HEADEREND:event_btnAjudaActionPerformed
        JOptionPane.showMessageDialog(this, "Para alterar dados de uma tabela voce deverá mudar os valores na coluna e depois clicar em alterar.");
    }//GEN-LAST:event_btnAjudaActionPerformed

    private void consultaTodos() {
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
        tmProdutos.setRowCount(0);

        ArrayList<Produto> listaProdutos = ProdutoController.pesquisar_all();

        if (listaProdutos != null) {
            listaProdutos.forEach((p) -> {
                //_loggerProduto(p);
                tmProdutos.addRow(new Object[]{p.getId_produto(), p.getNome(), p.getTipo(), p.getCodigo(), p.getPrecoCompra(), p.getPrecoVenda(), p.getQuantidade(), p.getFornecedor()});
            });
        }

        int linhas = tblProduto.getRowCount();
        String strLinhas = String.valueOf(linhas);
        txtQtdLinhasTabela.setText(strLinhas);
    }

    private void consultaTodosComFiltro(String tipo, String dadosPesquisados) {
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
        tmProdutos.setRowCount(0);

        ArrayList<Produto> listaProdutos = ProdutoController.pesquisar(tipo, dadosPesquisados);

        if (listaProdutos != null) {
            listaProdutos.forEach((p) -> {
                tmProdutos.addRow(new Object[]{p.getId_produto(), p.getNome(), p.getTipo(), p.getCodigo(), p.getPrecoCompra(), p.getPrecoVenda(), p.getQuantidade(), p.getFornecedor()});
            });
        }

        int qtdLinhas = tblProduto.getRowCount();
        String qtdLinha = String.valueOf(qtdLinhas);
        txtQtdLinhasTabela.setText(qtdLinha);

    }

    private void _loggerProduto(Produto p) {
        System.out.printf("%s %s %s %s %s %s %s %s", p.getId_produto(), p.getNome(), p.getTipo(), p.getCodigo(), p.getPrecoCompra(), p.getPrecoVenda(), p.getQuantidade(), p.getFornecedor());
    }

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
    private javax.swing.JLabel txtQtdLinhasTabela;
    private javax.swing.JLabel txtRegistroLinhas;
    // End of variables declaration//GEN-END:variables
}
