/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 *
 * @author caiomoreno
 */
public class RelatoriosInternalFrame extends javax.swing.JInternalFrame {

    /**
     * Creates new form MovimentacoesInternalFrame
     */
    public RelatoriosInternalFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelMovimentacoes = new javax.swing.JPanel();
        LabelMovimentacoes = new javax.swing.JLabel();
        PainelAudaPesquisa = new javax.swing.JPanel();
        btnAjuda = new javax.swing.JButton();
        btnPesquisar = new javax.swing.JButton();
        txtPesquisaPlanta = new javax.swing.JTextField();

        setClosable(true);
        setResizable(true);

        PanelMovimentacoes.setBackground(new java.awt.Color(204, 204, 204));

        LabelMovimentacoes.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        LabelMovimentacoes.setForeground(new java.awt.Color(60, 63, 65));
        LabelMovimentacoes.setText("Relatórios");

        javax.swing.GroupLayout PanelMovimentacoesLayout = new javax.swing.GroupLayout(PanelMovimentacoes);
        PanelMovimentacoes.setLayout(PanelMovimentacoesLayout);
        PanelMovimentacoesLayout.setHorizontalGroup(
            PanelMovimentacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelMovimentacoesLayout.createSequentialGroup()
                .addContainerGap(357, Short.MAX_VALUE)
                .addComponent(LabelMovimentacoes)
                .addGap(313, 313, 313))
        );
        PanelMovimentacoesLayout.setVerticalGroup(
            PanelMovimentacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelMovimentacoesLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(LabelMovimentacoes, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        PainelAudaPesquisa.setBackground(new java.awt.Color(204, 204, 204));

        btnAjuda.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        btnAjuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ajuda.png"))); // NOI18N
        btnAjuda.setText("Ajuda");

        btnPesquisar.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        btnPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pesquisa.png"))); // NOI18N
        btnPesquisar.setText("Pesquisar");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        txtPesquisaPlanta.setFont(new java.awt.Font("Ubuntu", 0, 10)); // NOI18N
        txtPesquisaPlanta.setText("Ex. Bromélia");
        txtPesquisaPlanta.setMinimumSize(new java.awt.Dimension(23, 24));
        txtPesquisaPlanta.setOpaque(false);
        txtPesquisaPlanta.setPreferredSize(new java.awt.Dimension(100, 24));
        txtPesquisaPlanta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPesquisaPlantaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PainelAudaPesquisaLayout = new javax.swing.GroupLayout(PainelAudaPesquisa);
        PainelAudaPesquisa.setLayout(PainelAudaPesquisaLayout);
        PainelAudaPesquisaLayout.setHorizontalGroup(
            PainelAudaPesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelAudaPesquisaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnAjuda)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtPesquisaPlanta, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPesquisar)
                .addGap(10, 10, 10))
        );
        PainelAudaPesquisaLayout.setVerticalGroup(
            PainelAudaPesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelAudaPesquisaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PainelAudaPesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAjuda)
                    .addComponent(btnPesquisar)
                    .addComponent(txtPesquisaPlanta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PanelMovimentacoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PainelAudaPesquisa, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PanelMovimentacoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PainelAudaPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(569, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void txtPesquisaPlantaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPesquisaPlantaActionPerformed
        // TODO add your handling code here:

        String a = evt.toString();
        System.out.println(a);
    }//GEN-LAST:event_txtPesquisaPlantaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelMovimentacoes;
    private javax.swing.JPanel PainelAudaPesquisa;
    private javax.swing.JPanel PanelMovimentacoes;
    private javax.swing.JButton btnAjuda;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JTextField txtPesquisaPlanta;
    // End of variables declaration//GEN-END:variables
}
