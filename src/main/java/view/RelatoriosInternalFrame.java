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
        LabelMovimentacoes = new javax.swing.JLabel();
        PanelGerarRelatoriodeVendas1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnPesquisar = new javax.swing.JButton();
        jcInicial = new com.toedter.calendar.JDateChooser();
        jcFinal = new com.toedter.calendar.JDateChooser();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TabelaVendas = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        TabelaVendas1 = new javax.swing.JTable();
        LabelMovimentacoes1 = new javax.swing.JLabel();
        LabelMovimentacoes3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        LabelMovimentacoes2 = new javax.swing.JLabel();
        LabelMovimentacoes4 = new javax.swing.JLabel();
        LabelMovimentacoes5 = new javax.swing.JLabel();
        LabelMovimentacoes6 = new javax.swing.JLabel();

        setClosable(true);
        setResizable(true);
        setPreferredSize(new java.awt.Dimension(800, 602));

        PanelGerarRelatoriodeVendas.setBackground(new java.awt.Color(204, 204, 204));

        LabelMovimentacoes.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        LabelMovimentacoes.setForeground(new java.awt.Color(60, 63, 65));
        LabelMovimentacoes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelMovimentacoes.setText("Relatório de Vendas");
        LabelMovimentacoes.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout PanelGerarRelatoriodeVendasLayout = new javax.swing.GroupLayout(PanelGerarRelatoriodeVendas);
        PanelGerarRelatoriodeVendas.setLayout(PanelGerarRelatoriodeVendasLayout);
        PanelGerarRelatoriodeVendasLayout.setHorizontalGroup(
            PanelGerarRelatoriodeVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelGerarRelatoriodeVendasLayout.createSequentialGroup()
                .addGap(275, 275, 275)
                .addComponent(LabelMovimentacoes)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelGerarRelatoriodeVendasLayout.setVerticalGroup(
            PanelGerarRelatoriodeVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelGerarRelatoriodeVendasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LabelMovimentacoes)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        PanelGerarRelatoriodeVendas1.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel1.setText("Data Inicial: ");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel2.setText("Data Final: ");

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
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jcInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jcFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnPesquisar)
                .addGap(43, 43, 43))
        );
        PanelGerarRelatoriodeVendas1Layout.setVerticalGroup(
            PanelGerarRelatoriodeVendas1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelGerarRelatoriodeVendas1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnPesquisar))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelGerarRelatoriodeVendas1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PanelGerarRelatoriodeVendas1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jcInicial, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcFinal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel5.setBackground(new java.awt.Color(204, 204, 204));

        TabelaVendas.setAutoCreateRowSorter(true);
        TabelaVendas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"", null, "", "", "", ""}
            },
            new String [] {
                "Código da Venda", "Data", "Desconto", "Valor Total", "Código do Cliente", "Cliente"
            }
        ));
        jScrollPane1.setViewportView(TabelaVendas);

        TabelaVendas1.setAutoCreateRowSorter(true);
        TabelaVendas1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"", "", ""}
            },
            new String [] {
                "Código do Produto", "Quantidade Vendido", "Preço de Venda"
            }
        ));
        jScrollPane2.setViewportView(TabelaVendas1);

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
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 741, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 741, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(LabelMovimentacoes3)
                .addGap(357, 357, 357))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(LabelMovimentacoes1)
                .addGap(362, 362, 362))
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

        LabelMovimentacoes2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        LabelMovimentacoes2.setForeground(new java.awt.Color(0, 0, 204));
        LabelMovimentacoes2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelMovimentacoes2.setText("Quantidade de Vendas:");
        LabelMovimentacoes2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        LabelMovimentacoes4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        LabelMovimentacoes4.setForeground(new java.awt.Color(0, 0, 204));
        LabelMovimentacoes4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelMovimentacoes4.setText("0");
        LabelMovimentacoes4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        LabelMovimentacoes5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        LabelMovimentacoes5.setForeground(new java.awt.Color(0, 0, 204));
        LabelMovimentacoes5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelMovimentacoes5.setText("Valor total vendido: R$");
        LabelMovimentacoes5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        LabelMovimentacoes6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        LabelMovimentacoes6.setForeground(new java.awt.Color(0, 0, 204));
        LabelMovimentacoes6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelMovimentacoes6.setText("0,00");
        LabelMovimentacoes6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(LabelMovimentacoes2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LabelMovimentacoes4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(LabelMovimentacoes5)
                .addGap(37, 37, 37)
                .addComponent(LabelMovimentacoes6)
                .addGap(122, 122, 122))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelMovimentacoes2)
                    .addComponent(LabelMovimentacoes4)
                    .addComponent(LabelMovimentacoes5)
                    .addComponent(LabelMovimentacoes6))
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
        java.util.Date dtInicial = jcInicial.getDate();
        java.util.Date dtFinal = jcFinal.getDate();

        if (dtFinal.before(dtInicial)) {
            JOptionPane.showMessageDialog(this, "Data final não pode ser anterior à data inicial.", "Aviso!", JOptionPane.WARNING_MESSAGE);
        } else {
            //Método de query ao banco
        }
    }//GEN-LAST:event_btnPesquisarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelMovimentacoes;
    private javax.swing.JLabel LabelMovimentacoes1;
    private javax.swing.JLabel LabelMovimentacoes2;
    private javax.swing.JLabel LabelMovimentacoes3;
    private javax.swing.JLabel LabelMovimentacoes4;
    private javax.swing.JLabel LabelMovimentacoes5;
    private javax.swing.JLabel LabelMovimentacoes6;
    private javax.swing.JPanel PanelGerarRelatoriodeVendas;
    private javax.swing.JPanel PanelGerarRelatoriodeVendas1;
    private javax.swing.JTable TabelaVendas;
    private javax.swing.JTable TabelaVendas1;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private com.toedter.calendar.JDateChooser jcFinal;
    private com.toedter.calendar.JDateChooser jcInicial;
    // End of variables declaration//GEN-END:variables
}
