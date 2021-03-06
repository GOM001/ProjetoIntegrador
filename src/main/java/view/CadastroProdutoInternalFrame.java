package view;

import controller.ProdutoController;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author pedrogomes
 */
public class CadastroProdutoInternalFrame extends javax.swing.JInternalFrame {

    String intCaracteres = "0987654321";

    public CadastroProdutoInternalFrame() {
        initComponents();
    }

    private boolean validarCampos() {
        boolean valido = true;
        String mensagem = "";

        JTextField[] vetorCampos = {
            txtNomeProduto, txtQuantidade, txtFornecedor, txtPrecoCompra, txtPrecoVenda, txtCodProduto
        };

        for (JTextField campoTexto : vetorCampos) {
            if (campoTexto.getText().trim().equals("0")) {
                mensagem = "Um dos campos não pode ser zero.\n";
                valido = false;
            }

            if (campoTexto.getText().trim().isEmpty()) {
                mensagem = "Há campos vazios.";
                valido = false;
            }
        }

        if (!valido) {
            JOptionPane.showMessageDialog(null, mensagem, "Aviso!", JOptionPane.WARNING_MESSAGE);
        }

        return valido;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        LabelMovimentacoes = new javax.swing.JLabel();
        LabelAdicionarExcluir = new javax.swing.JPanel();
        btnCancelar = new javax.swing.JButton();
        lblNome = new javax.swing.JLabel();
        txtNomeProduto = new javax.swing.JTextField();
        lblTipoProduto = new javax.swing.JLabel();
        lblFornecedor = new javax.swing.JLabel();
        lblCodProduto = new javax.swing.JLabel();
        lblPrecoCompra = new javax.swing.JLabel();
        lblPrecoVenda = new javax.swing.JLabel();
        txtCodProduto = new javax.swing.JTextField();
        txtFornecedor = new javax.swing.JTextField();
        cbTipoPlanta = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        imgCadastroProduto = new javax.swing.JLabel();
        lblQuantidade = new javax.swing.JLabel();
        txtQuantidade = new javax.swing.JTextField();
        txtPrecoCompra = new javax.swing.JFormattedTextField();
        txtPrecoVenda = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnCadastrar = new javax.swing.JButton();

        setClosable(true);
        setResizable(true);
        setToolTipText("");

        LabelMovimentacoes.setBackground(new java.awt.Color(228, 228, 228));
        LabelMovimentacoes.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        LabelMovimentacoes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelMovimentacoes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/novo-produto.png"))); // NOI18N
        LabelMovimentacoes.setText("Cadastro de Produtos");
        LabelMovimentacoes.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        LabelMovimentacoes.setOpaque(true);

        LabelAdicionarExcluir.setBackground(new java.awt.Color(228, 228, 228));
        LabelAdicionarExcluir.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnCancelar.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Flor_triste.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.setMaximumSize(new java.awt.Dimension(129, 33));
        btnCancelar.setMinimumSize(new java.awt.Dimension(129, 33));
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        lblNome.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblNome.setText("Nome:");

        lblTipoProduto.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblTipoProduto.setText("Tipo:");

        lblFornecedor.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblFornecedor.setText("Fornecedor:");

        lblCodProduto.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblCodProduto.setText("Código do produto:");

        lblPrecoCompra.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblPrecoCompra.setText("Preço/Compra:");

        lblPrecoVenda.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblPrecoVenda.setText("Preço/Venda:");

        txtCodProduto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCodProdutoKeyTyped(evt);
            }
        });

        cbTipoPlanta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Flor", "Cacto", "Suculenta" }));

        jPanel3.setLayout(null);

        imgCadastroProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/margarida 2.jpg"))); // NOI18N
        imgCadastroProduto.setText("jLabel7");
        jPanel3.add(imgCadastroProduto);
        imgCadastroProduto.setBounds(0, 0, 240, 210);

        lblQuantidade.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblQuantidade.setText("Quantidade:");

        txtQuantidade.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtQuantidadeKeyTyped(evt);
            }
        });

        txtPrecoCompra.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        txtPrecoCompra.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPrecoCompraKeyTyped(evt);
            }
        });

        txtPrecoVenda.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        txtPrecoVenda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPrecoVendaKeyPressed(evt);
            }
        });

        jLabel1.setText("R$");

        jLabel2.setText("R$");

        btnCadastrar.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        btnCadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/petals.png"))); // NOI18N
        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout LabelAdicionarExcluirLayout = new javax.swing.GroupLayout(LabelAdicionarExcluir);
        LabelAdicionarExcluir.setLayout(LabelAdicionarExcluirLayout);
        LabelAdicionarExcluirLayout.setHorizontalGroup(
            LabelAdicionarExcluirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LabelAdicionarExcluirLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(LabelAdicionarExcluirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(LabelAdicionarExcluirLayout.createSequentialGroup()
                        .addComponent(lblTipoProduto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbTipoPlanta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(LabelAdicionarExcluirLayout.createSequentialGroup()
                        .addComponent(lblQuantidade)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(LabelAdicionarExcluirLayout.createSequentialGroup()
                        .addGroup(LabelAdicionarExcluirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(LabelAdicionarExcluirLayout.createSequentialGroup()
                                .addComponent(lblCodProduto)
                                .addGap(12, 12, 12))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LabelAdicionarExcluirLayout.createSequentialGroup()
                                .addGroup(LabelAdicionarExcluirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblPrecoCompra)
                                    .addComponent(lblPrecoVenda))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(LabelAdicionarExcluirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(LabelAdicionarExcluirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCodProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(LabelAdicionarExcluirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtPrecoVenda, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                                .addComponent(txtPrecoCompra, javax.swing.GroupLayout.Alignment.LEADING))))
                    .addGroup(LabelAdicionarExcluirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(LabelAdicionarExcluirLayout.createSequentialGroup()
                            .addComponent(lblNome)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txtNomeProduto))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, LabelAdicionarExcluirLayout.createSequentialGroup()
                            .addComponent(lblFornecedor)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txtFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 197, Short.MAX_VALUE)
                .addGroup(LabelAdicionarExcluirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(LabelAdicionarExcluirLayout.createSequentialGroup()
                        .addComponent(btnCadastrar)
                        .addGap(18, 18, 18)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
        );
        LabelAdicionarExcluirLayout.setVerticalGroup(
            LabelAdicionarExcluirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LabelAdicionarExcluirLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(LabelAdicionarExcluirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(LabelAdicionarExcluirLayout.createSequentialGroup()
                        .addGroup(LabelAdicionarExcluirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNomeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(LabelAdicionarExcluirLayout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(lblNome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(22, 22, 22)
                        .addGroup(LabelAdicionarExcluirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTipoProduto)
                            .addComponent(cbTipoPlanta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16)
                        .addGroup(LabelAdicionarExcluirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblQuantidade)
                            .addComponent(txtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(LabelAdicionarExcluirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblFornecedor)
                            .addComponent(txtFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addGroup(LabelAdicionarExcluirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCodProduto)
                            .addComponent(txtCodProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(LabelAdicionarExcluirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPrecoCompra)
                            .addComponent(txtPrecoCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(LabelAdicionarExcluirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPrecoVenda)
                            .addComponent(txtPrecoVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)))
                    .addGroup(LabelAdicionarExcluirLayout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(LabelAdicionarExcluirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LabelMovimentacoes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 762, Short.MAX_VALUE)
                    .addComponent(LabelAdicionarExcluir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LabelMovimentacoes, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(LabelAdicionarExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(80, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(153, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        setBounds(0, 0, 800, 602);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void txtQuantidadeKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_txtQuantidadeKeyTyped
    {//GEN-HEADEREND:event_txtQuantidadeKeyTyped
        if (txtQuantidade.getText().length() > 4 || !intCaracteres.contains(evt.getKeyChar() + "")) {
            evt.consume();
        }
    }//GEN-LAST:event_txtQuantidadeKeyTyped

    private void txtCodProdutoKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_txtCodProdutoKeyTyped
    {//GEN-HEADEREND:event_txtCodProdutoKeyTyped
        if (txtCodProduto.getText().length() > 4 || !intCaracteres.contains(evt.getKeyChar() + "")) {
            evt.consume();
        }

    }//GEN-LAST:event_txtCodProdutoKeyTyped

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        boolean dadosValidos, cadastrou;

        dadosValidos = validarCampos();

        if (dadosValidos) {

            String nomeProduto = txtNomeProduto.getText().trim();
            String tipo = cbTipoPlanta.getSelectedItem().toString();
            String fornecedor = txtFornecedor.getText().trim();
            int quantidade = Integer.parseInt(txtQuantidade.getText().trim());
            int codProduto = Integer.parseInt(txtCodProduto.getText().trim());
            double precoCompra = Double.parseDouble(txtPrecoCompra.getText().trim());
            double precoVenda = Double.parseDouble(txtPrecoVenda.getText().trim());

            cadastrou = ProdutoController.cadastrar(nomeProduto, tipo, quantidade, fornecedor, codProduto, precoCompra, precoVenda);

            if (cadastrou) {
                JOptionPane.showMessageDialog(null, "Produto cadastrado com sucesso!", "Registro realizado", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Produto não cadastrado!", "Falha", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void txtPrecoCompraKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecoCompraKeyTyped
        if (!intCaracteres.contains(evt.getKeyChar() + "")) {
            evt.consume();
        }
    }//GEN-LAST:event_txtPrecoCompraKeyTyped

    private void txtPrecoVendaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecoVendaKeyPressed
        if (!intCaracteres.contains(evt.getKeyChar() + "")) {
            evt.consume();
        }
    }//GEN-LAST:event_txtPrecoVendaKeyPressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel LabelAdicionarExcluir;
    private javax.swing.JLabel LabelMovimentacoes;
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JComboBox<String> cbTipoPlanta;
    private javax.swing.JLabel imgCadastroProduto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lblCodProduto;
    private javax.swing.JLabel lblFornecedor;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblPrecoCompra;
    private javax.swing.JLabel lblPrecoVenda;
    private javax.swing.JLabel lblQuantidade;
    private javax.swing.JLabel lblTipoProduto;
    private javax.swing.JTextField txtCodProduto;
    private javax.swing.JTextField txtFornecedor;
    private javax.swing.JTextField txtNomeProduto;
    private javax.swing.JFormattedTextField txtPrecoCompra;
    private javax.swing.JFormattedTextField txtPrecoVenda;
    private javax.swing.JTextField txtQuantidade;
    // End of variables declaration//GEN-END:variables
}
