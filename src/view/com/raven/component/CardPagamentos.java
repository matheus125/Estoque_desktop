package view.com.raven.component;

import com.estoque.banco.ConexaoBD;
import com.estoque.dao.ProductDao;
import com.estoque.dao.SalesDao;
import com.estoque.dao.Sales_ItemsDao;
import com.estoque.model.Cliente;
import com.estoque.model.Produto;
import com.estoque.model.Vendas;
import com.estoque.model.Itens_vendas;
import com.estoque.model.User;
import view.com.raven.model.Model_Card;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class CardPagamentos extends javax.swing.JPanel {

    ConexaoBD con = new ConexaoBD();
    User user = new User();
    Cliente client_id = new Cliente();
    Vendas sales = new Vendas();
    SalesDao salesDao = new SalesDao();
    DefaultTableModel carrinho;

    int user_id;

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

    public CardPagamentos() {
        initComponents();
        con.getConectar();
        buscarUserID();
        setOpaque(false);
        color1 = Color.BLACK;
        color2 = Color.WHITE;

        txtcartão.setText("0");
        txtdinheiro.setText("0");
        txtpix.setText("0");
    }

    public void setData(Model_Card data) {
        /* lbIcon.setIcon(data.getIcon());
        lbTitle.setText(data.getTitle());
        lbValues.setText(data.getValues());
        lbDescription.setText(data.getDescription());*/
    }

    public void buscarUserID() {
        con.getConectar();

        try {
            con.executarSql("select * from tb_userslogs order by id_user desc limit 1;");
            con.getResultSet().first();
            user_id = con.getResultSet().getInt("id_user");
        } catch (NumberFormatException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro na Consulta /nErro!" + e);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lb_name = new javax.swing.JLabel();
        lb_login = new javax.swing.JLabel();
        txtcartão = new javax.swing.JTextField();
        txtdinheiro = new javax.swing.JTextField();
        lb_function = new javax.swing.JLabel();
        lb_password = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnFinalizarVenda = new javax.swing.JButton();
        txtpix = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtvltotal = new javax.swing.JTextField();
        txttrocofinal = new javax.swing.JTextField();

        lb_name.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        lb_name.setForeground(new java.awt.Color(255, 255, 255));
        lb_name.setText("DINHEIRO:");

        lb_login.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        lb_login.setForeground(new java.awt.Color(255, 255, 255));
        lb_login.setText("CARTÃO:");

        lb_function.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        lb_function.setForeground(new java.awt.Color(255, 255, 255));
        lb_function.setText("TROCO:");

        lb_password.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        lb_password.setForeground(new java.awt.Color(255, 255, 255));
        lb_password.setText("TOTAL:");

        jLabel6.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("PIX:");

        btnFinalizarVenda.setText("Finalizar Venda");
        btnFinalizarVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinalizarVendaActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Pagamentos");

        txtvltotal.setEnabled(false);

        txttrocofinal.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addComponent(btnFinalizarVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lb_password, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lb_function, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lb_login, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lb_name, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtdinheiro)
                            .addComponent(txtcartão)
                            .addComponent(txtpix)
                            .addComponent(txttrocofinal)
                            .addComponent(txtvltotal))))
                .addGap(147, 147, 147))
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                    .addComponent(lb_name, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtdinheiro, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtcartão, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_login, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtpix, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lb_function, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lb_password, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txttrocofinal, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtvltotal, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 7, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnFinalizarVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnFinalizarVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinalizarVendaActionPerformed
        double pcartao, ppix, pdinheiro, totalpago, totalvenda, troco;

        pcartao = Double.parseDouble(txtcartão.getText());
        ppix = Double.parseDouble(txtpix.getText());
        pdinheiro = Double.parseDouble(txtdinheiro.getText());
        totalvenda = Double.parseDouble(txtvltotal.getText());
        // Calcular o total e troco
        totalpago = pcartao + ppix + pdinheiro;
        // Calcular do troco
        troco = totalpago - totalvenda;
        txttrocofinal.setText(String.valueOf(troco));
        //Dados do cliente e usuario (client_id, user_id)
        User users = new User();
        users.setId(user_id);
        sales.setClient(client_id);
        sales.setUser(users);
        //Pegar a data da venda
        Date data = new Date();
        SimpleDateFormat dataEUA = new SimpleDateFormat("yyyy-MM-dd");
        String dataformatada = dataEUA.format(data);
        sales.setSale_date(dataformatada);
        //Total da venda
        sales.setValue_total(totalvenda);
        //Tipo pagamento
        sales.setType_payment(txtdinheiro.getText());
        salesDao.cadastrarVenda(sales);

        //Retorna o id da ultima venda realizada
        sales.setId(salesDao.retornarUltimaVenda());
        //System.out.println("ID da ultima venda:" +sales.getId());
        //Cadastrando os produtos na tabela itemvendas
        for (int i = 0; i < carrinho.getRowCount(); i++) {

            int qtd_estoque, qtd_comprada, qtd_atualizada;
            Produto product = new Produto();
            ProductDao productDao = new ProductDao();

            Itens_vendas sales_items = new Itens_vendas();

            sales_items.setSales(sales);
            product.setId(Integer.parseInt(carrinho.getValueAt(i, 0).toString()));
            sales_items.setProduct(product);
            sales_items.setQtdproduct(Integer.parseInt(carrinho.getValueAt(i, 3).toString()));
            sales_items.setSubtotal(Double.parseDouble(carrinho.getValueAt(i, 5).toString()));

            //Baixa no estoque
            qtd_estoque = productDao.retornarEstoqueAtual(product.getId());
            qtd_comprada = Integer.parseInt(carrinho.getValueAt(i, 3).toString());
            qtd_atualizada = qtd_estoque - qtd_comprada;
            
            productDao.baixarEstoque(product.getId(), qtd_atualizada);
            
            Sales_ItemsDao sales_ItemsDao = new Sales_ItemsDao();
            sales_ItemsDao.cadastrarItem(sales_items);
        }
        /**
         * **********************************************
         */
        JOptionPane.showMessageDialog(null, "Venda Registrada com Sucesso!");

    }//GEN-LAST:event_btnFinalizarVendaActionPerformed

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
    public javax.swing.JButton btnFinalizarVenda;
    public javax.swing.JLabel jLabel1;
    public javax.swing.JLabel jLabel6;
    public javax.swing.JLabel lb_function;
    public javax.swing.JLabel lb_login;
    public javax.swing.JLabel lb_name;
    public javax.swing.JLabel lb_password;
    public javax.swing.JTextField txtcartão;
    public javax.swing.JTextField txtdinheiro;
    public javax.swing.JTextField txtpix;
    public javax.swing.JTextField txttrocofinal;
    public javax.swing.JTextField txtvltotal;
    // End of variables declaration//GEN-END:variables
}
