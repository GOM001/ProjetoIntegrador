package view;

import controller.MovimentacaoController;
import controller.VendaController;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Movimentacao;
import model.Venda;

/**
 *
 * @author caiomoreno
 */
public class MovimentacoesInternalFrame extends javax.swing.JInternalFrame {

    boolean possuiDesconto = false;
    int id_produto_fk = 0, id_cliente_fk = 0;

    public MovimentacoesInternalFrame() {
        initComponents();
        pesquisaPlanta();
        dataAtual();

    }

    private static String buscarCliente(Movimentacao movimentacao) {
        String cpf = movimentacao.getCpf().replace(".", "").replace("-", "").trim();
        if (cpf.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Digite um cpf válido!");
            return "";
        }
        return MovimentacaoController.buscarClientePeloCPF(cpf);
    }

    private static boolean verificaSeEMaiorQueOEstoque(int qtd, int qtdEstoque) {
        return qtd <= qtdEstoque;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtTotalBruto = new javax.swing.JTextField();
        txtTotalDesconto = new javax.swing.JTextField();
        txtLiquido = new javax.swing.JTextField();
        txtTroco = new javax.swing.JTextField();
        txtTotalPago = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lblNome = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNomeCliente = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtCpf = new javax.swing.JFormattedTextField();
        btnBuscar = new javax.swing.JButton();
        txtDataVenda = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblVenda = new javax.swing.JTable();
        btnAdicionarProduto = new javax.swing.JButton();
        btnExcluirProduto = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        cboPlanta = new javax.swing.JComboBox();
        cboQtd = new javax.swing.JComboBox();
        jPanel5 = new javax.swing.JPanel();
        btnFinalizar = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        PanelGerarRelatoriodeVendas10 = new javax.swing.JPanel();
        lblNome1 = new javax.swing.JLabel();

        setClosable(true);
        setResizable(true);
        setPreferredSize(new java.awt.Dimension(800, 608));

        jPanel4.setBackground(new java.awt.Color(187, 187, 187));
        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(60, 63, 65));
        jLabel3.setText("Total Bruto");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(60, 63, 65));
        jLabel4.setText("Total Líquido");

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(60, 63, 65));
        jLabel5.setText("Total Desconto");

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(60, 63, 65));
        jLabel6.setText("Total pago");

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(60, 63, 65));
        jLabel7.setText("Troco");

        txtTotalBruto.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        txtTotalBruto.setForeground(new java.awt.Color(0, 0, 0));

        txtTotalDesconto.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        txtTotalDesconto.setForeground(new java.awt.Color(51, 51, 255));

        txtLiquido.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        txtLiquido.setForeground(new java.awt.Color(51, 255, 51));

        txtTroco.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        txtTroco.setForeground(new java.awt.Color(255, 0, 0));
        txtTroco.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                txtTrocoActionPerformed(evt);
            }
        });

        txtTotalPago.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        txtTotalPago.addFocusListener(new java.awt.event.FocusAdapter()
        {
            public void focusLost(java.awt.event.FocusEvent evt)
            {
                txtTotalPagoFocusLost(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTotalBruto, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel3)))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTotalDesconto, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtLiquido, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(txtTotalPago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTroco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel7)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtLiquido, txtTotalBruto, txtTotalDesconto, txtTotalPago, txtTroco});

        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                        .addComponent(txtTotalBruto)
                        .addComponent(txtTotalDesconto)
                        .addComponent(txtLiquido, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtTroco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtTotalPago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        jPanel4Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txtLiquido, txtTotalBruto, txtTotalDesconto, txtTotalPago, txtTroco});

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel2.setBackground(new java.awt.Color(187, 187, 187));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setFocusTraversalPolicyProvider(true);

        lblNome.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblNome.setForeground(new java.awt.Color(60, 63, 65));
        lblNome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-usuário-24.png"))); // NOI18N
        lblNome.setText("Nome do cliente");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(60, 63, 65));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-roubo-de-identidade-30.png"))); // NOI18N
        jLabel2.setText("Digite o CPF do cliente");

        txtNomeCliente.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(60, 63, 65));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-planejador-30.png"))); // NOI18N
        jLabel1.setText("Data da venda");

        try
        {
            txtCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex)
        {
            ex.printStackTrace();
        }

        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/procurar-usuário-masculino-24.png"))); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnBuscarActionPerformed(evt);
            }
        });

        txtDataVenda.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(lblNome)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtDataVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNome)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtDataVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txtCpf, txtDataVenda, txtNomeCliente});

        jPanel3.setBackground(new java.awt.Color(187, 187, 187));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tblVenda.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {

            },
            new String []
            {
                "Cod. Prod", "Nome do produto", "Qtde.", "Desc. %", "Desc. R$", "Total Bruto", "Total Líquido", "id_produto_fk", "id_cliente_fk"
            }
        )
        {
            boolean[] canEdit = new boolean []
            {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex)
            {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblVenda);
        if (tblVenda.getColumnModel().getColumnCount() > 0)
        {
            tblVenda.getColumnModel().getColumn(7).setMinWidth(0);
            tblVenda.getColumnModel().getColumn(7).setMaxWidth(0);
            tblVenda.getColumnModel().getColumn(8).setMinWidth(0);
            tblVenda.getColumnModel().getColumn(8).setMaxWidth(0);
        }

        btnAdicionarProduto.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnAdicionarProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/adicionarCesta.png"))); // NOI18N
        btnAdicionarProduto.setText("Adicionar");
        btnAdicionarProduto.setBorderPainted(false);
        btnAdicionarProduto.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnAdicionarProdutoActionPerformed(evt);
            }
        });

        btnExcluirProduto.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnExcluirProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/excluirCesta.png"))); // NOI18N
        btnExcluirProduto.setText("Excluir");
        btnExcluirProduto.setBorderPainted(false);
        btnExcluirProduto.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnExcluirProdutoActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(60, 63, 65));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/flowers.png"))); // NOI18N
        jLabel8.setText("Detalhes do Produto");

        jLabel9.setText("Produto:");

        jLabel10.setText("Qtd:");

        cboQtd.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 590, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel10))
                                .addGap(3, 3, 3)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cboPlanta, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cboQtd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(btnAdicionarProduto)
                            .addComponent(btnExcluirProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(264, 264, 264)
                        .addComponent(jLabel8)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cboPlanta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(cboQtd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAdicionarProduto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnExcluirProduto))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel5.setBackground(new java.awt.Color(187, 187, 187));
        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnFinalizar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnFinalizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-finalizar-pedido-40.png"))); // NOI18N
        btnFinalizar.setText("Finalizar Transacao");
        btnFinalizar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnFinalizarActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icone-excluir.png"))); // NOI18N
        jButton4.setText("Cancelar Compra");
        jButton4.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton4)
                .addGap(85, 85, 85)
                .addComponent(btnFinalizar)
                .addGap(160, 160, 160))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFinalizar))
                .addGap(17, 17, 17))
        );

        PanelGerarRelatoriodeVendas10.setBackground(new java.awt.Color(187, 187, 187));
        PanelGerarRelatoriodeVendas10.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblNome1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblNome1.setForeground(new java.awt.Color(60, 63, 65));
        lblNome1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cesta-de-compras-24.png"))); // NOI18N
        lblNome1.setText("Vendas");

        javax.swing.GroupLayout PanelGerarRelatoriodeVendas10Layout = new javax.swing.GroupLayout(PanelGerarRelatoriodeVendas10);
        PanelGerarRelatoriodeVendas10.setLayout(PanelGerarRelatoriodeVendas10Layout);
        PanelGerarRelatoriodeVendas10Layout.setHorizontalGroup(
            PanelGerarRelatoriodeVendas10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelGerarRelatoriodeVendas10Layout.createSequentialGroup()
                .addGap(318, 318, 318)
                .addComponent(lblNome1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelGerarRelatoriodeVendas10Layout.setVerticalGroup(
            PanelGerarRelatoriodeVendas10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelGerarRelatoriodeVendas10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblNome1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(PanelGerarRelatoriodeVendas10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(PanelGerarRelatoriodeVendas10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void btnExcluirProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirProdutoActionPerformed
        // TODO add your handling code here:
        DefaultTableModel tblModelo = (DefaultTableModel) tblVenda.getModel();
        if (tblVenda.getSelectedRow() >= 0) {
            tblModelo.removeRow(tblVenda.getSelectedRow());
            txtTotalBruto.setText(TotalBruto());
            txtTotalDesconto.setText(TotalDesconto());
            txtLiquido.setText(TotalLiquido());
            tblVenda.setModel(tblModelo);
        } else {
            JOptionPane.showMessageDialog(null, "Favor selecionar uma linha");
        }
    }//GEN-LAST:event_btnExcluirProdutoActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnBuscarActionPerformed
    {//GEN-HEADEREND:event_btnBuscarActionPerformed
        
        
        String nome, cpf;
        Movimentacao movimentacao = new Movimentacao();
        cpf = txtCpf.getText();

        movimentacao.SetCpf(cpf);
        nome = buscarCliente(movimentacao);
        String splitNome[] = nome.split(",");

        String nomeCliente = splitNome[0];
       

        if (nomeCliente.trim().equals("")) {
            possuiDesconto = false;
            txtNomeCliente.setText(nome);

        } else {
            possuiDesconto = true;
            id_cliente_fk = Integer.parseInt(splitNome[1]);
            txtNomeCliente.setText(nomeCliente);
            
        
        }
        
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnAdicionarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarProdutoActionPerformed

        DefaultTableModel tabela = (DefaultTableModel) tblVenda.getModel();
        Movimentacao movimentacao;
        
        boolean possuiProduto = false;
        String nomeProduto, Desconto = "10%";
        String nome = cboPlanta.getSelectedItem().toString();
        int qtd = Integer.parseInt(cboQtd.getSelectedItem().toString());
        int qtdEstoque = MovimentacaoController.consultaEstoque(nome);
        id_produto_fk = MovimentacaoController.consultarCodigoProduto(nome);
        boolean temEstoque = verificaSeEMaiorQueOEstoque(qtd, qtdEstoque);
        int qtdLinhas = tabela.getRowCount();
        int linhaParada = 0;
        double valorDesconto = 0.0, valorLiquido, novoBruto = 0.0;

        if (!possuiDesconto) {
            Desconto = "Sem desconto";
            valorDesconto = 0.0;
        }

        String mensagem = temEstoque ? "Produto adicionado" : "Quantidade informada e maior do que contem em estoque(" + qtdEstoque + ")";

        for (int i = 0; i < qtdLinhas; i++) {
            nomeProduto = String.valueOf(tabela.getValueAt(i, 1));

            if (nomeProduto.equals(nome)) {
                possuiProduto = true;
                linhaParada = i;
                break;
            }
        }

        movimentacao = MovimentacaoController.adicionaProduto(nome);

        if (possuiProduto) {
            String quantidade = String.valueOf(tabela.getValueAt(linhaParada, 2));
            String totalBruto = String.valueOf(tabela.getValueAt(linhaParada, 5));

            double totalBrutoD = Double.parseDouble(totalBruto);
            int qtdInt = Integer.parseInt(quantidade);
            double valorUnitario = valorUnitario(totalBrutoD, qtdInt);
            int novaQuantidade = atualizarQtd(qtdInt, qtd);
            double bruto = valorUnitario * qtd;

            if (possuiDesconto) {
                novoBruto = atualizaValorBruto(bruto, totalBrutoD);

                valorDesconto = calcularDesconto(novoBruto);
                valorLiquido = calcularLiquido(valorDesconto, novoBruto);

            } else {
                novoBruto = atualizaValorBruto(bruto, totalBrutoD);
                valorLiquido = novoBruto;
            }

            boolean temMais = verificaSeEMaiorQueOEstoque(novaQuantidade, qtdEstoque);
            if (temMais == false) {
                JOptionPane.showMessageDialog(this, "Quantidade informada e maior do que contem em estoque(" + qtdEstoque + ")");

            } else {
                tabela.removeRow(linhaParada);
                tabela.addRow(new Object[]{movimentacao.getCodProd(), movimentacao.getNomeItem(), novaQuantidade, Desconto, valorDesconto, novoBruto, valorLiquido, id_produto_fk, id_cliente_fk});

                txtTotalBruto.setText(TotalBruto());
                txtTotalDesconto.setText(TotalDesconto());
                txtLiquido.setText(TotalLiquido());

            }

        } else {

            if (possuiDesconto) {
                double valorProduto = movimentacao.getValor();

                valorDesconto = calcularDesconto(valorProduto);
                valorLiquido = valorProduto - valorDesconto;

            } else {
                valorLiquido = movimentacao.getValor();
            }

            if (temEstoque == false) {
                JOptionPane.showMessageDialog(this, mensagem);
            } else {

                tabela.addRow(new Object[]{movimentacao.getCodProd(), movimentacao.getNomeItem(), qtd, Desconto, valorDesconto, movimentacao.getValor(), valorLiquido, id_produto_fk, id_cliente_fk});

                txtTotalBruto.setText(TotalBruto());
                txtTotalDesconto.setText(TotalDesconto());
                txtLiquido.setText(TotalLiquido());
                JOptionPane.showMessageDialog(this, mensagem);
            }
        }


    }//GEN-LAST:event_btnAdicionarProdutoActionPerformed


    private void btnFinalizarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnFinalizarActionPerformed
    {//GEN-HEADEREND:event_btnFinalizarActionPerformed
        boolean vendeu = false;
        try {
            ArrayList<Venda> listaVenda = new ArrayList<Venda>();

            DefaultTableModel tabela = (DefaultTableModel) tblVenda.getModel();
            int qtdLinhas = tblVenda.getRowCount();

            Object[] options = {"Confirmar", "Cancelar"};
            int dadosClicados = JOptionPane.showOptionDialog(null, "Clique Confirmar para confirmar a venda", "Confirmação", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);

            if (dadosClicados == 0) {

                for (int i = 0; i < qtdLinhas; i++) {
                    Venda venda = new Venda();
                    String qtdVendido = String.valueOf(tabela.getValueAt(i, 2));
                    String valorDesc = String.valueOf(tabela.getValueAt(i, 4));
                    String valor = String.valueOf(tabela.getValueAt(i, 6));
                    String id_produto_fk = String.valueOf(tabela.getValueAt(i, 7));
                    String id_cliente_fk = String.valueOf(tabela.getValueAt(i, 8));

                    double valorDescD = Double.parseDouble(valorDesc);
                    double valorD = Double.parseDouble(valor);
                    int id_produto_fkI = Integer.parseInt(id_produto_fk);
                    int id_cliente_fkI = Integer.parseInt(id_cliente_fk);
                    int qtdVendidoI = Integer.parseInt(qtdVendido);

                    venda.setQtd_vendido(qtdVendidoI);
                    venda.setValor_desc(valorDescD);
                    venda.setValor_total(valorD);
                    venda.setDataVenda(txtDataVenda.getText());
                    venda.setId_produto_fk(id_produto_fkI);
                    venda.setId_cliente_fk(id_cliente_fkI);

                    listaVenda.add(venda);

                }

                vendeu = VendaController.inserirVenda(listaVenda);

                if (vendeu) {
                    JOptionPane.showMessageDialog(null, "Compra efetuada");
                    tabela.setRowCount(0);
                    txtLiquido.setText("R$ 0.00");
                    txtTotalBruto.setText("R$ 0.00");
                    txtTotalDesconto.setText("R$ 0.00");
                    txtNomeCliente.setText("");
                    txtCpf.setText("");
                    id_produto_fk = 0;
                    id_cliente_fk = 0;
                } else {
                    JOptionPane.showMessageDialog(null, "ERRO");
                }
            }
        } catch (Exception e) {
        }

    }//GEN-LAST:event_btnFinalizarActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void txtTrocoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTrocoActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_txtTrocoActionPerformed

    private void txtTotalPagoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTotalPagoFocusLost
        try {
            // obtêm a entrada de usuário a partir da JTextField
            String TotalPago = txtTotalPago.getText();
            String TotalLiquido = txtLiquido.getText();

            String replaceTotalPago = TotalPago.replace("R$ ", "");
            String replaceTotalLiquido = TotalLiquido.replace("R$ ", "");

            // converte os valores recebido em string para double
            double num1 = (double) Double.parseDouble(replaceTotalPago);
            double num2 = (double) Double.parseDouble(replaceTotalLiquido);
            double sum = num1 - num2;

            //setar o resultado na JLabel
            //Concatenar com uma String, pois não pode-se colocar diretamente o valor int
            txtTroco.setText("R$ " + String.format("%.2f", sum));
            txtTroco.setEditable(false);
            String a = String.format("%.2f", num1);
            txtTotalPago.setText("R$ " + a);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Caracteres Inválidos no Campo JTextField");
        }
    }//GEN-LAST:event_txtTotalPagoFocusLost

    private void pesquisaPlanta() {
        try {
            ArrayList<String> listaPlanta = MovimentacaoController.pesquisarProdutos();

            for (String planta : listaPlanta) {
                cboPlanta.addItem(planta);
            }

        } catch (Exception e) {
            System.out.println("Erro ao pesquisar produto: " + e.getMessage());
        }
    }

    private void dataAtual() {
        LocalDateTime agora = LocalDateTime.now();

        DateTimeFormatter formatterData = DateTimeFormatter.ofPattern("dd/MM/uuuu");
        String dataFormatada = formatterData.format(agora);

        txtDataVenda.setText(dataFormatada);
        txtDataVenda.setEditable(false);

    }

    private double calcularDesconto(double valorProduto) {
        return valorProduto * 0.1;
    }

    private double calcularLiquido(double valorDesconto, double valorBruto) {
        return valorBruto - valorDesconto;
    }

    private int atualizarQtd(int a, int b) {
        return a + b;
    }

    private double valorUnitario(double valor, int qtd) {
        return ((double) valor / qtd);
    }

    private double atualizaValorBruto(Double a, Double b) {
        return (double) a + b;
    }

    private String TotalBruto() {
        DefaultTableModel tblModelo = (DefaultTableModel) tblVenda.getModel();
        double soma = 0;
        int qtdLinha = tblModelo.getRowCount();
        if (!(qtdLinha == 0)) {
            for (int i = 0; i < qtdLinha; i++) {
                String valorBruto = String.valueOf(tblModelo.getValueAt(i, 5));
                double valorBrutoD = Double.parseDouble(valorBruto);
                soma += valorBrutoD;
            }

            return "R$ " + String.format("%.2f", soma);
        } else {
            return "R$ " + String.format("%.2f", soma);
        }
    }

    private String TotalDesconto() {
        DefaultTableModel tblModelo = (DefaultTableModel) tblVenda.getModel();
        double soma = 0;
        int qtdLinha = tblModelo.getRowCount();

        if (!(qtdLinha == 0)) {
            for (int i = 0; i < qtdLinha; i++) {
                String valorDesc = String.valueOf(tblModelo.getValueAt(i, 4));
                double valorDescD = Double.parseDouble(valorDesc);
                soma += valorDescD;
            }
            return "R$ " + String.format("%.2f", soma);
        } else {

            return "R$ " + String.format("%.2f", soma);
        }
    }

    private String TotalLiquido() {
        DefaultTableModel tblModelo = (DefaultTableModel) tblVenda.getModel();
        double soma = 0;
        int qtdLinha = tblModelo.getRowCount();
        if (!(qtdLinha == 0)) {
            for (int i = 0; i < qtdLinha; i++) {
                String valorDesc = String.valueOf(tblModelo.getValueAt(i, 6));
                double valorDescD = Double.parseDouble(valorDesc);
                soma += valorDescD;
            }
            return "R$ " + String.format("%.2f", soma);
        } else {

            return "R$ " + String.format("%.2f", soma);
        }
    }

    private int id_produto_fk(String nomePlanta) {

        return 1;
    }

    private int id_cliente_fk(String cpf) {

        return 1;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelGerarRelatoriodeVendas10;
    private javax.swing.JButton btnAdicionarProduto;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnExcluirProduto;
    private javax.swing.JButton btnFinalizar;
    private javax.swing.JComboBox cboPlanta;
    private javax.swing.JComboBox cboQtd;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblNome1;
    private javax.swing.JTable tblVenda;
    private javax.swing.JFormattedTextField txtCpf;
    private javax.swing.JTextField txtDataVenda;
    private javax.swing.JTextField txtLiquido;
    private javax.swing.JTextField txtNomeCliente;
    private javax.swing.JTextField txtTotalBruto;
    private javax.swing.JTextField txtTotalDesconto;
    private javax.swing.JTextField txtTotalPago;
    private javax.swing.JTextField txtTroco;
    // End of variables declaration//GEN-END:variables
}
