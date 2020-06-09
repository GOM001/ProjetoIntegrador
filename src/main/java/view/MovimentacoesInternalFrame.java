package view;

import controller.movimentacaoController;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Movimentacao;

/**
 *
 * @author caiomoreno
 */
public class MovimentacoesInternalFrame extends javax.swing.JInternalFrame {

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
        return movimentacaoController.buscarClientePeloCPF(cpf);
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
        jFormattedTextField2 = new javax.swing.JFormattedTextField();
        jFormattedTextField3 = new javax.swing.JFormattedTextField();
        jFormattedTextField4 = new javax.swing.JFormattedTextField();
        jFormattedTextField5 = new javax.swing.JFormattedTextField();
        jFormattedTextField6 = new javax.swing.JFormattedTextField();
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
        jButton3 = new javax.swing.JButton();
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

        jFormattedTextField2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jFormattedTextField2.setForeground(new java.awt.Color(51, 51, 255));
        try
        {
            jFormattedTextField2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("R$ 0,00")));
        } catch (java.text.ParseException ex)
        {
            ex.printStackTrace();
        }
        jFormattedTextField2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jFormattedTextField2.setSelectedTextColor(new java.awt.Color(255, 0, 0));

        jFormattedTextField3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        try
        {
            jFormattedTextField3.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("R$ 0,00")));
        } catch (java.text.ParseException ex)
        {
            ex.printStackTrace();
        }
        jFormattedTextField3.setDisabledTextColor(new java.awt.Color(255, 0, 0));
        jFormattedTextField3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N

        jFormattedTextField4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jFormattedTextField4.setForeground(new java.awt.Color(255, 0, 0));
        try
        {
            jFormattedTextField4.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("R$ 0,00")));
        } catch (java.text.ParseException ex)
        {
            ex.printStackTrace();
        }
        jFormattedTextField4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N

        jFormattedTextField5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jFormattedTextField5.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(java.text.NumberFormat.getCurrencyInstance())));
        jFormattedTextField5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N

        jFormattedTextField6.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jFormattedTextField6.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(java.text.NumberFormat.getCurrencyInstance())));
        jFormattedTextField6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addContainerGap(10, Short.MAX_VALUE)
                        .addComponent(jFormattedTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel5))
                    .addComponent(jFormattedTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(31, 31, 31))
                    .addComponent(jFormattedTextField4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jFormattedTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jFormattedTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(16, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jFormattedTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFormattedTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFormattedTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFormattedTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFormattedTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(29, Short.MAX_VALUE))
        );

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(txtNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(lblNome)
                        .addGap(106, 106, 106)))
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtDataVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(15, 15, 15)))
                .addGap(28, 28, 28))
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
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                        .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(txtDataVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                "Cod. Prod", "Nome do produto", "Qtde.", "Desc. %", "Desc. R$", "Total Bruto", "Total Líquido"
            }
        )
        {
            boolean[] canEdit = new boolean []
            {
                true, true, true, true, true, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex)
            {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblVenda);

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
                .addContainerGap(26, Short.MAX_VALUE))
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

        jButton3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-finalizar-pedido-40.png"))); // NOI18N
        jButton3.setText("Finalizar Transacao");

        jButton4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icone-excluir.png"))); // NOI18N
        jButton4.setText("Cancelar Compra");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton4)
                .addGap(85, 85, 85)
                .addComponent(jButton3)
                .addGap(160, 160, 160))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3))
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
                            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(PanelGerarRelatoriodeVendas10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 13, Short.MAX_VALUE)))
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
                .addContainerGap(10, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void btnExcluirProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirProdutoActionPerformed
        // TODO add your handling code here:
        DefaultTableModel tblModelo = (DefaultTableModel)tblVenda.getModel();
        if (tblVenda.getSelectedRow() >= 0){
            tblModelo.removeRow(tblVenda.getSelectedRow());
            tblVenda.setModel(tblModelo);
        }else{
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

        if (nome.trim().equals("")) {
            txtNomeCliente.setText("");
        } else {
            txtNomeCliente.setText(nome);
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnAdicionarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarProdutoActionPerformed
       String nome = cboPlanta.getSelectedItem().toString();
       int qtd =Integer.parseInt(cboQtd.getSelectedItem().toString());
       int qtdEstoque = movimentacaoController.ConsultaEstoque(nome);
       boolean temEstoque = movimentacaoController.verificaSeEMaiorQueOEstoque(qtd, qtdEstoque);
       String mensagem = temEstoque ? "Produto adicionado" : "Quantidade informada e maior do que contem em estoque("+qtdEstoque+")";
       
        DefaultTableModel tabela = (DefaultTableModel) tblVenda.getModel();
        
        tabela.addRow(new Object[]{"7777","Teste","12", "22%","10.00","30.00","20"});
        
       
       JOptionPane.showMessageDialog(this, mensagem);
       
       
       
       
    }//GEN-LAST:event_btnAdicionarProdutoActionPerformed

    private void pesquisaPlanta() {
        try {
            ArrayList<String> listaPlanta = movimentacaoController.pesquisaPlantas();

            for(String planta : listaPlanta)
            {
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelGerarRelatoriodeVendas10;
    private javax.swing.JButton btnAdicionarProduto;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnExcluirProduto;
    private javax.swing.JComboBox cboPlanta;
    private javax.swing.JComboBox cboQtd;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JFormattedTextField jFormattedTextField2;
    private javax.swing.JFormattedTextField jFormattedTextField3;
    private javax.swing.JFormattedTextField jFormattedTextField4;
    private javax.swing.JFormattedTextField jFormattedTextField5;
    private javax.swing.JFormattedTextField jFormattedTextField6;
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
    private javax.swing.JTextField txtNomeCliente;
    // End of variables declaration//GEN-END:variables
}
