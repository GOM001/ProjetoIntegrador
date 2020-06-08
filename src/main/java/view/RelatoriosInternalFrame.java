package view;

import javax.swing.JOptionPane;

/**
 *
 * @author caiomoreno
 */
public class RelatoriosInternalFrame extends javax.swing.JInternalFrame {

    public RelatoriosInternalFrame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelGerarRelatoriodeVendas = new javax.swing.JPanel();
        lblTituloMovimentacoes = new javax.swing.JLabel();
        PanelGerarRelatoriodeVendas1 = new javax.swing.JPanel();
        lblDataInicial = new javax.swing.JLabel();
        lblDataFinal = new javax.swing.JLabel();
        btnPesquisar = new javax.swing.JButton();
        jdcInicial = new com.toedter.calendar.JDateChooser();
        jdcFinal = new com.toedter.calendar.JDateChooser();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblRelatorioVendas = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblRelatorioVendasProduto = new javax.swing.JTable();
        LabelMovimentacoes1 = new javax.swing.JLabel();
        LabelMovimentacoes3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        lblTextQuantidadeVendas = new javax.swing.JLabel();
        lblQtdVendas = new javax.swing.JLabel();
        lblTextValorTotalVendido = new javax.swing.JLabel();
        lblTotalVendido = new javax.swing.JLabel();

        setClosable(true);
        setResizable(true);
        setPreferredSize(new java.awt.Dimension(800, 602));

        PanelGerarRelatoriodeVendas.setBackground(new java.awt.Color(204, 204, 204));

        lblTituloMovimentacoes.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblTituloMovimentacoes.setForeground(new java.awt.Color(60, 63, 65));
        lblTituloMovimentacoes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTituloMovimentacoes.setText("Relatório de Vendas");
        lblTituloMovimentacoes.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout PanelGerarRelatoriodeVendasLayout = new javax.swing.GroupLayout(PanelGerarRelatoriodeVendas);
        PanelGerarRelatoriodeVendas.setLayout(PanelGerarRelatoriodeVendasLayout);
        PanelGerarRelatoriodeVendasLayout.setHorizontalGroup(
            PanelGerarRelatoriodeVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelGerarRelatoriodeVendasLayout.createSequentialGroup()
                .addGap(292, 292, 292)
                .addComponent(lblTituloMovimentacoes, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelGerarRelatoriodeVendasLayout.setVerticalGroup(
            PanelGerarRelatoriodeVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelGerarRelatoriodeVendasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTituloMovimentacoes, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                .addContainerGap())
        );

        PanelGerarRelatoriodeVendas1.setBackground(new java.awt.Color(204, 204, 204));

        lblDataInicial.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        lblDataInicial.setText("Data Inicial: ");

        lblDataFinal.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        lblDataFinal.setText("Data Final: ");

        btnPesquisar.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        btnPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pesquisa.png"))); // NOI18N
        btnPesquisar.setText("Pesquisar");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelGerarRelatoriodeVendas1Layout = new javax.swing.GroupLayout(PanelGerarRelatoriodeVendas1);
        PanelGerarRelatoriodeVendas1.setLayout(PanelGerarRelatoriodeVendas1Layout);
        PanelGerarRelatoriodeVendas1Layout.setHorizontalGroup(
            PanelGerarRelatoriodeVendas1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelGerarRelatoriodeVendas1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(lblDataInicial)
                .addGap(18, 18, 18)
                .addComponent(jdcInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(lblDataFinal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jdcFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnPesquisar)
                .addGap(43, 43, 43))
        );
        PanelGerarRelatoriodeVendas1Layout.setVerticalGroup(
            PanelGerarRelatoriodeVendas1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnPesquisar)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelGerarRelatoriodeVendas1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelGerarRelatoriodeVendas1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblDataInicial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblDataFinal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(PanelGerarRelatoriodeVendas1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(PanelGerarRelatoriodeVendas1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jdcInicial, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jdcFinal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        jPanel5.setBackground(new java.awt.Color(204, 204, 204));

        tblRelatorioVendas.setAutoCreateRowSorter(true);
        tblRelatorioVendas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"", null, "", "", "", ""}
            },
            new String [] {
                "Código da Venda", "Data", "Código do Cliente", "Cliente", "Desconto", "Valor Total"
            }
        ));
        jScrollPane1.setViewportView(tblRelatorioVendas);

        tblRelatorioVendasProduto.setAutoCreateRowSorter(true);
        tblRelatorioVendasProduto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"", "", ""}
            },
            new String [] {
                "Código do Produto", "Quantidade Vendido", "Preço de Venda"
            }
        ));
        jScrollPane2.setViewportView(tblRelatorioVendasProduto);

        LabelMovimentacoes1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        LabelMovimentacoes1.setForeground(new java.awt.Color(60, 63, 65));
        LabelMovimentacoes1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelMovimentacoes1.setText("Analítico");
        LabelMovimentacoes1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        LabelMovimentacoes3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        LabelMovimentacoes3.setForeground(new java.awt.Color(60, 63, 65));
        LabelMovimentacoes3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelMovimentacoes3.setText("Sintético");
        LabelMovimentacoes3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(LabelMovimentacoes1)
                .addGap(362, 362, 362))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 741, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 741, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(361, 361, 361)
                        .addComponent(LabelMovimentacoes3)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(LabelMovimentacoes3, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LabelMovimentacoes1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7))
        );

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));

        lblTextQuantidadeVendas.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblTextQuantidadeVendas.setForeground(new java.awt.Color(0, 0, 204));
        lblTextQuantidadeVendas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTextQuantidadeVendas.setText("Quantidade de Vendas:");
        lblTextQuantidadeVendas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        lblQtdVendas.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblQtdVendas.setForeground(new java.awt.Color(0, 0, 204));
        lblQtdVendas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblQtdVendas.setText("0");
        lblQtdVendas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        lblTextValorTotalVendido.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblTextValorTotalVendido.setForeground(new java.awt.Color(0, 0, 204));
        lblTextValorTotalVendido.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTextValorTotalVendido.setText("Valor total vendido: R$");
        lblTextValorTotalVendido.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        lblTotalVendido.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblTotalVendido.setForeground(new java.awt.Color(0, 0, 204));
        lblTotalVendido.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTotalVendido.setText("0,00");
        lblTotalVendido.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(lblTextQuantidadeVendas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblQtdVendas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTextValorTotalVendido)
                .addGap(37, 37, 37)
                .addComponent(lblTotalVendido)
                .addGap(79, 79, 79))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTextQuantidadeVendas)
                    .addComponent(lblQtdVendas)
                    .addComponent(lblTextValorTotalVendido)
                    .addComponent(lblTotalVendido))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PanelGerarRelatoriodeVendas1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PanelGerarRelatoriodeVendas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PanelGerarRelatoriodeVendas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PanelGerarRelatoriodeVendas1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        setBounds(0, 0, 800, 602);
    }// </editor-fold>//GEN-END:initComponents

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        java.util.Date dtInicial = jdcInicial.getDate();
        java.util.Date dtFinal = jdcFinal.getDate();

        if (dtFinal.before(dtInicial)) {
            JOptionPane.showMessageDialog(this, "Data final não pode ser anterior à data inicial.", "Aviso!", JOptionPane.WARNING_MESSAGE);
        } else {
            //Método de query ao banco
        }
    }//GEN-LAST:event_btnPesquisarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelMovimentacoes1;
    private javax.swing.JLabel LabelMovimentacoes3;
    private javax.swing.JPanel PanelGerarRelatoriodeVendas;
    private javax.swing.JPanel PanelGerarRelatoriodeVendas1;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private com.toedter.calendar.JDateChooser jdcFinal;
    private com.toedter.calendar.JDateChooser jdcInicial;
    private javax.swing.JLabel lblDataFinal;
    private javax.swing.JLabel lblDataInicial;
    private javax.swing.JLabel lblQtdVendas;
    private javax.swing.JLabel lblTextQuantidadeVendas;
    private javax.swing.JLabel lblTextValorTotalVendido;
    private javax.swing.JLabel lblTituloMovimentacoes;
    private javax.swing.JLabel lblTotalVendido;
    private javax.swing.JTable tblRelatorioVendas;
    private javax.swing.JTable tblRelatorioVendasProduto;
    // End of variables declaration//GEN-END:variables
}
