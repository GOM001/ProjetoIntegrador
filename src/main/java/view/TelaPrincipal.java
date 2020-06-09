package view;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import java.util.Locale;

/**
 *
 * @author pedrogomes
 */
public class TelaPrincipal extends javax.swing.JFrame {

    public TelaPrincipal() {
        initComponents();
    }

    public void deletarTela() {
        for (JInternalFrame allFrame : PainelPrincipal.getAllFrames()) {
            allFrame.dispose();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        ImageIcon icon = new ImageIcon(getClass().getResource("/img/TelaPrincipal.png"));
        Image image = icon.getImage();
        PainelPrincipal = new javax.swing.JDesktopPane(){

            public void paintComponent(Graphics g){
                g.drawImage(image,0,0,getWidth(),getHeight(),this);
            }

        };
        BarraMenus = new javax.swing.JMenuBar();
        MenuMovimentacoes = new javax.swing.JMenu();
        MenuProduto = new javax.swing.JMenu();
        subMenuConsultaProduto = new javax.swing.JMenuItem();
        subMenuCadastroProduto = new javax.swing.JMenuItem();
        MenuCliente = new javax.swing.JMenu();
        subMenuCadastrarCliente = new javax.swing.JMenuItem();
        subMenuItemConsultarCliente = new javax.swing.JMenuItem();
        MenuRelatorios = new javax.swing.JMenu();
        MenuSobre = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Movimentações");
        setResizable(false);
        setSize(new java.awt.Dimension(800, 600));

        PainelPrincipal.setBackground(new java.awt.Color(51, 51, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(PainelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 602, Short.MAX_VALUE)
                .addContainerGap())
        );

        BarraMenus.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        BarraMenus.setToolTipText("");
        BarraMenus.setDoubleBuffered(true);
        BarraMenus.setFocusable(false);
        BarraMenus.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        BarraMenus.setPreferredSize(new java.awt.Dimension(265, 30));
        BarraMenus.setVerifyInputWhenFocusTarget(false);

        MenuMovimentacoes.setBackground(java.awt.Color.black);
        MenuMovimentacoes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cesta-de-compras-24.png"))); // NOI18N
        MenuMovimentacoes.setText("Movimentações");
        MenuMovimentacoes.setFont(MenuMovimentacoes.getFont().deriveFont(MenuMovimentacoes.getFont().getStyle() | java.awt.Font.BOLD));
        MenuMovimentacoes.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                MenuMovimentacoesMenuSelected(evt);
            }
        });
        BarraMenus.add(MenuMovimentacoes);

        MenuProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-rosa.png"))); // NOI18N
        MenuProduto.setText("Produto");
        MenuProduto.setFont(MenuProduto.getFont().deriveFont(MenuProduto.getFont().getStyle() | java.awt.Font.BOLD));

        subMenuConsultaProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pesquisa.png"))); // NOI18N
        subMenuConsultaProduto.setText("Consultar/Atualizar");
        subMenuConsultaProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subMenuConsultaProdutoActionPerformed(evt);
            }
        });
        MenuProduto.add(subMenuConsultaProduto);

        subMenuCadastroProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-adicionar-24.png"))); // NOI18N
        subMenuCadastroProduto.setText("Inclusão");
        subMenuCadastroProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subMenuCadastroProdutoActionPerformed(evt);
            }
        });
        MenuProduto.add(subMenuCadastroProduto);

        BarraMenus.add(MenuProduto);

        MenuCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/adicionar-usuário-masculino-24.png"))); // NOI18N
        MenuCliente.setText("Cliente");
        MenuCliente.setFont(MenuCliente.getFont().deriveFont(MenuCliente.getFont().getStyle() | java.awt.Font.BOLD));

        subMenuCadastrarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/adicionar-usuário-masculino-24.png"))); // NOI18N
        subMenuCadastrarCliente.setText("Cadastrar");
        subMenuCadastrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subMenuCadastrarClienteActionPerformed(evt);
            }
        });
        MenuCliente.add(subMenuCadastrarCliente);

        subMenuItemConsultarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/procurar-usuário-masculino-24.png"))); // NOI18N
        subMenuItemConsultarCliente.setText("Consultar/Atualizar");
        subMenuItemConsultarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subMenuItemConsultarClienteActionPerformed(evt);
            }
        });
        MenuCliente.add(subMenuItemConsultarCliente);

        BarraMenus.add(MenuCliente);

        MenuRelatorios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/graficoPizza.png"))); // NOI18N
        MenuRelatorios.setText("Relatórios");
        MenuRelatorios.setFont(MenuRelatorios.getFont().deriveFont(MenuRelatorios.getFont().getStyle() | java.awt.Font.BOLD));
        MenuRelatorios.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                MenuRelatoriosMenuSelected(evt);
            }
        });
        BarraMenus.add(MenuRelatorios);

        MenuSobre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/sobre-24.png"))); // NOI18N
        MenuSobre.setText("Sobre");
        MenuSobre.setFont(MenuSobre.getFont().deriveFont(MenuSobre.getFont().getStyle() | java.awt.Font.BOLD));
        MenuSobre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MenuSobreMouseClicked(evt);
            }
        });
        BarraMenus.add(MenuSobre);

        setJMenuBar(BarraMenus);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void MenuMovimentacoesMenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_MenuMovimentacoesMenuSelected
        deletarTela();
        MovimentacoesInternalFrame telaMovimentacoes = new MovimentacoesInternalFrame();
        PainelPrincipal.add(telaMovimentacoes);
        telaMovimentacoes.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_MenuMovimentacoesMenuSelected

    private void subMenuCadastrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subMenuCadastrarClienteActionPerformed
        deletarTela();
        CadastroClienteInternalFrame TelaCadastroCliente = new CadastroClienteInternalFrame();
        PainelPrincipal.add(TelaCadastroCliente);
        TelaCadastroCliente.setVisible(true);
    }//GEN-LAST:event_subMenuCadastrarClienteActionPerformed

    private void MenuSobreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuSobreMouseClicked
        deletarTela();
        JOptionPane.showMessageDialog(null, "Projeto Integrador II - Floricultura\n\nDesenvolvido por:\n- Caio Moreno\n- Gustavo Fonseca\n- João Vitor Alves\n- Paulo Costa\n- Pedro Gomes\n");
    }//GEN-LAST:event_MenuSobreMouseClicked

    private void subMenuConsultaProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subMenuConsultaProdutoActionPerformed
        deletarTela();
        ConsultaProdutonternalFrame TelaConsultaProduto = new ConsultaProdutonternalFrame();
        PainelPrincipal.add(TelaConsultaProduto);
        TelaConsultaProduto.setVisible(true);
    }//GEN-LAST:event_subMenuConsultaProdutoActionPerformed

    private void subMenuItemConsultarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subMenuItemConsultarClienteActionPerformed
        deletarTela();
        ConsultaClienteInternalFrame TelaConsultaCliente = new ConsultaClienteInternalFrame();
        PainelPrincipal.add(TelaConsultaCliente);
        TelaConsultaCliente.setVisible(true);
    }//GEN-LAST:event_subMenuItemConsultarClienteActionPerformed

    private void MenuRelatoriosMenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_MenuRelatoriosMenuSelected
        deletarTela();
        RelatoriosInternalFrame TelaRelatorios = new RelatoriosInternalFrame();
        PainelPrincipal.add(TelaRelatorios);
        TelaRelatorios.setVisible(true);
    }//GEN-LAST:event_MenuRelatoriosMenuSelected

    private void subMenuCadastroProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subMenuCadastroProdutoActionPerformed
        deletarTela();
        CadastroProdutoInternalFrame TelaCadastroProduto = new CadastroProdutoInternalFrame();
        PainelPrincipal.add(TelaCadastroProduto);
        TelaCadastroProduto.setVisible(true);
    }//GEN-LAST:event_subMenuCadastroProdutoActionPerformed

    public static void main(String args[]) {
        Locale.setDefault(Locale.US);

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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new TelaPrincipal().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar BarraMenus;
    private javax.swing.JMenu MenuCliente;
    private javax.swing.JMenu MenuMovimentacoes;
    private javax.swing.JMenu MenuProduto;
    private javax.swing.JMenu MenuRelatorios;
    private javax.swing.JMenu MenuSobre;
    private javax.swing.JDesktopPane PainelPrincipal;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JMenuItem subMenuCadastrarCliente;
    private javax.swing.JMenuItem subMenuCadastroProduto;
    private javax.swing.JMenuItem subMenuConsultaProduto;
    private javax.swing.JMenuItem subMenuItemConsultarCliente;
    // End of variables declaration//GEN-END:variables
}
