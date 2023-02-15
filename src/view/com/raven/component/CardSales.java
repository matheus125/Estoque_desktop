package view.com.raven.component;

import com.estoque.banco.ConexaoBD;
import com.estoque.controller.ControllerClient;
import com.estoque.controller.ControllerProduct;
import com.estoque.dao.UserDao;
import com.estoque.model.Cliente;
import com.estoque.model.Produto;
import com.estoque.model.User;
import view.com.raven.model.Model_Card;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.table.DefaultTableModel;
import view.com.login.FormaPagamento;

public class CardSales extends javax.swing.JPanel {
    
    

    ControllerClient controllerClient = new ControllerClient();
    ControllerProduct controllerProduct = new ControllerProduct();

    User user = new User();

    Cliente client = new Cliente();
    Produto product = new Produto();

    ConexaoBD con = new ConexaoBD();

    double total, preco, subtotal;
    int qtd, codUser;

    DefaultTableModel carrinho;

    public Color getColor1() {
        return color1;
    }

    public void setColor1(Color color1) {
        this.color1 = color1;
    }

    public Color getColor2() {
        return color2;
    }

    public void setColor2(Color color2) {
        this.color2 = color2;
    }

    private Color color1;
    private Color color2;

    public CardSales() {
        initComponents();
        setOpaque(false);
        color1 = Color.BLACK;
        color2 = Color.WHITE;

        Date data = new Date();
        SimpleDateFormat dataBr = new SimpleDateFormat("dd/MM/yyyy");
        String dataformatada = dataBr.format(data);
        txtdata.setText(dataformatada);

        txtqtd.setText("1");
        txtidproduct.setVisible(false);
    }

    public void setData(Model_Card data) {

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnPagamento = new javax.swing.JButton();
        btnAdicionarItem2 = new javax.swing.JButton();
        lbTitle5 = new javax.swing.JLabel();
        lbTitle4 = new javax.swing.JLabel();
        txtnomecliente = new javax.swing.JTextField();
        txtcpfCliente = new javax.swing.JFormattedTextField();
        lbTitle6 = new javax.swing.JLabel();
        btnPesquisarCliente = new javax.swing.JButton();
        txtdata = new javax.swing.JTextField();
        lbTitle2 = new javax.swing.JLabel();
        btnPesquisarProduto = new javax.swing.JButton();
        txtproduto = new javax.swing.JTextField();
        lbTitle = new javax.swing.JLabel();
        lbTitle3 = new javax.swing.JLabel();
        txtpreco = new javax.swing.JTextField();
        btnAdicionarItem = new javax.swing.JButton();
        txtqtd = new javax.swing.JTextField();
        lbValues = new javax.swing.JLabel();
        txtValorTotal = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TabelaCarrinhoVendas = new javax.swing.JTable();
        txtcodigoProduto = new javax.swing.JTextField();
        lbTitle7 = new javax.swing.JLabel();
        txtidproduct = new javax.swing.JTextField();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CAIXA");

        btnPagamento.setText("PAGAMENTO");
        btnPagamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPagamentoActionPerformed(evt);
            }
        });

        btnAdicionarItem2.setText("CANCELAR VENDA");

        lbTitle5.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        lbTitle5.setForeground(new java.awt.Color(255, 255, 255));
        lbTitle5.setText("CPF:");

        lbTitle4.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        lbTitle4.setForeground(new java.awt.Color(255, 255, 255));
        lbTitle4.setText("Nome:");

        txtnomecliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtnomeclienteKeyPressed(evt);
            }
        });

        txtcpfCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtcpfClienteKeyPressed(evt);
            }
        });

        lbTitle6.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        lbTitle6.setForeground(new java.awt.Color(255, 255, 255));
        lbTitle6.setText("DATA:");

        btnPesquisarCliente.setText("Pesquisar");
        btnPesquisarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarClienteActionPerformed(evt);
            }
        });

        txtdata.setEditable(false);
        txtdata.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        lbTitle2.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        lbTitle2.setForeground(new java.awt.Color(255, 255, 255));
        lbTitle2.setText("Código:");

        btnPesquisarProduto.setText("Pesquisar");
        btnPesquisarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarProdutoActionPerformed(evt);
            }
        });

        lbTitle.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        lbTitle.setForeground(new java.awt.Color(255, 255, 255));
        lbTitle.setText("Produto:");

        lbTitle3.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        lbTitle3.setForeground(new java.awt.Color(255, 255, 255));
        lbTitle3.setText("Preço:");

        btnAdicionarItem.setText("Adicionar Item");
        btnAdicionarItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarItemActionPerformed(evt);
            }
        });

        lbValues.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        lbValues.setForeground(new java.awt.Color(255, 255, 255));
        lbValues.setText("TOTAL DA VENDA:");

        txtValorTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtValorTotalActionPerformed(evt);
            }
        });

        TabelaCarrinhoVendas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Código", "Produto", "Qtd", "Preço", "Subtotal"
            }
        ));
        jScrollPane1.setViewportView(TabelaCarrinhoVendas);

        txtcodigoProduto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtcodigoProdutoKeyPressed(evt);
            }
        });

        lbTitle7.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        lbTitle7.setForeground(new java.awt.Color(255, 255, 255));
        lbTitle7.setText("Qtd:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lbTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbTitle2, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, 0)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtcodigoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtproduto, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btnPesquisarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbTitle5, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbTitle4, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, 0)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtcpfCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lbTitle6, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtnomecliente, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, 0)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtdata, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnPesquisarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbTitle3, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtpreco, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addComponent(lbTitle7, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtqtd, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtidproduct, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(52, 52, 52)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(193, 193, 193)
                .addComponent(btnAdicionarItem, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbValues)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(134, 134, 134))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAdicionarItem2)
                .addGap(154, 154, 154))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbTitle5)
                            .addComponent(txtcpfCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbTitle6)
                            .addComponent(txtdata, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbTitle4)
                            .addComponent(txtnomecliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnPesquisarCliente))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbTitle2)
                            .addComponent(btnPesquisarProduto)
                            .addComponent(txtcodigoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbTitle)
                            .addComponent(txtproduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbTitle3)
                            .addComponent(txtpreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtqtd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbTitle7)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(btnAdicionarItem))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbValues, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAdicionarItem2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtidproduct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(64, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtValorTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtValorTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtValorTotalActionPerformed

    private void txtcpfClienteKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcpfClienteKeyPressed
        // buscar cliente por cpf
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            client = controllerClient.controlBuscarCpf(txtcpfCliente.getText());
            txtnomecliente.setText(client.getName());
        }
    }//GEN-LAST:event_txtcpfClienteKeyPressed

    private void btnPesquisarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarClienteActionPerformed
        client = controllerClient.controlBuscarCpf(txtcpfCliente.getText());
        txtnomecliente.setText(client.getName());
    }//GEN-LAST:event_btnPesquisarClienteActionPerformed

    private void txtnomeclienteKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnomeclienteKeyPressed

    }//GEN-LAST:event_txtnomeclienteKeyPressed

    private void txtcodigoProdutoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcodigoProdutoKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            product = controllerProduct.controlBuscarProdutoPorID(txtcodigoProduto.getText());
            txtidproduct.setText(String.valueOf(product.getId()));
            txtproduto.setText(product.getDescription());
            txtpreco.setText(String.valueOf(product.getPrice()));

            qtd = Integer.parseInt(txtqtd.getText());
            preco = Double.parseDouble(txtpreco.getText());

            subtotal = qtd * preco;

            total += subtotal;
            txtValorTotal.setText(String.valueOf(total));

            //Adicionar o produto no carrinho
            carrinho = (DefaultTableModel) TabelaCarrinhoVendas.getModel();

            carrinho.addRow(new Object[]{
                txtidproduct.getText(),
                txtcodigoProduto.getText(),
                txtproduto.getText(),
                txtqtd.getText(),
                txtpreco.getText(),
                subtotal
            });
        }
    }//GEN-LAST:event_txtcodigoProdutoKeyPressed

    private void btnPesquisarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarProdutoActionPerformed
        product = controllerProduct.controlBuscarProdutoPorID(txtcodigoProduto.getText());
        txtidproduct.setText(String.valueOf(product.getId()));
        txtproduto.setText(product.getDescription());
        txtpreco.setText(String.valueOf(product.getPrice()));
    }//GEN-LAST:event_btnPesquisarProdutoActionPerformed

    private void btnAdicionarItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarItemActionPerformed
        qtd = Integer.parseInt(txtqtd.getText());
        preco = Double.parseDouble(txtpreco.getText());

        subtotal = qtd * preco;

        total += subtotal;
        txtValorTotal.setText(String.valueOf(total));

        //Adicionar o produto no carrinho
        carrinho = (DefaultTableModel) TabelaCarrinhoVendas.getModel();

        carrinho.addRow(new Object[]{
            txtidproduct.getText(),
            txtcodigoProduto.getText(),
            txtproduto.getText(),
            txtqtd.getText(),
            txtpreco.getText(),
            subtotal
        });

    }//GEN-LAST:event_btnAdicionarItemActionPerformed

    private void btnPagamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPagamentoActionPerformed
        FormaPagamento formaPagamento = new FormaPagamento();
        formaPagamento.cardPagamentos1.txtvltotal.setText(String.valueOf(total));
        formaPagamento.cardPagamentos1.client_id = client;
        formaPagamento.setVisible(true);
        formaPagamento.cardPagamentos1.carrinho = carrinho;
        this.dispose();
    }//GEN-LAST:event_btnPagamentoActionPerformed

    @Override
    protected void paintComponent(Graphics grphcs) {
        Graphics2D g2 = (Graphics2D) grphcs;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        GradientPaint g = new GradientPaint(0, 0, color1, 0, getHeight(), color2);
        g2.setPaint(g);
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), 15, 15);
        g2.setColor(new Color(255, 255, 255, 50));
        g2.fillOval(getWidth() - (getHeight() / 2), 10, getHeight(), getHeight());
        g2.fillOval(getWidth() - (getHeight() / 2) - 20, getHeight() / 2 + 20, getHeight(), getHeight());
        super.paintComponent(grphcs);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TabelaCarrinhoVendas;
    private javax.swing.JButton btnAdicionarItem;
    private javax.swing.JButton btnAdicionarItem2;
    private javax.swing.JButton btnPagamento;
    private javax.swing.JButton btnPesquisarCliente;
    private javax.swing.JButton btnPesquisarProduto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbTitle;
    private javax.swing.JLabel lbTitle2;
    private javax.swing.JLabel lbTitle3;
    private javax.swing.JLabel lbTitle4;
    private javax.swing.JLabel lbTitle5;
    private javax.swing.JLabel lbTitle6;
    private javax.swing.JLabel lbTitle7;
    private javax.swing.JLabel lbValues;
    private javax.swing.JTextField txtValorTotal;
    private javax.swing.JTextField txtcodigoProduto;
    private javax.swing.JFormattedTextField txtcpfCliente;
    private javax.swing.JTextField txtdata;
    private javax.swing.JTextField txtidproduct;
    private javax.swing.JTextField txtnomecliente;
    private javax.swing.JTextField txtpreco;
    private javax.swing.JTextField txtproduto;
    private javax.swing.JTextField txtqtd;
    // End of variables declaration//GEN-END:variables

    private void dispose() {

    }
}
