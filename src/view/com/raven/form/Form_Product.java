package view.com.raven.form;

import com.estoque.banco.ConexaoBD;
import com.estoque.controller.ControllerProduct;
import com.estoque.model.Category;
import com.estoque.model.Inventory;
import com.estoque.model.Product;
import com.estoque.tabelas.ProductsTable;

import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;

public class Form_Product extends javax.swing.JPanel {

    ConexaoBD con = new ConexaoBD();

    ControllerProduct controllerProduct = new ControllerProduct();
    Category category = new Category();
    Product product = new Product();
    Inventory inventory = new Inventory();

    public Form_Product() {
        initComponents();
        desabilitarCampos();
        desabilitarBotao();
        con.getConectar();
        loadStudentsTable("call sp_list_products()");
    }

    public void limparCampos() {
        qtdproduct.setText("");
        category_name.setText("");
        type.setText("");
        brand.setText("");
        size.setText("");
        price.setText("");
        bar_code.setText("");
        description.setText("");
        search_product.setText("");
    }

    public final void desabilitarCampos() {
        qtdproduct.setEnabled(false);
        category_name.setEnabled(false);
        type.setEnabled(false);
        brand.setEnabled(false);
        size.setEnabled(false);
        price.setEnabled(false);
        bar_code.setEnabled(false);
        description.setEnabled(false);
    }

    public void habilitarCampos() {
        qtdproduct.setEnabled(true);
        category_name.setEnabled(true);
        type.setEnabled(true);
        brand.setEnabled(true);
        size.setEnabled(true);
        price.setEnabled(true);
        bar_code.setEnabled(true);
        description.setEnabled(true);
    }

    public final void desabilitarBotao() {
        btnAlterar.setEnabled(false);
        btnNovo.setEnabled(true);
        btnCancelar.setEnabled(false);
        btnRemover.setEnabled(false);
        btnSalvar.setEnabled(false);
    }

    public void habilitarBotao() {
        btnAlterar.setEnabled(true);
        btnCancelar.setEnabled(true);
        btnNovo.setEnabled(false);
        btnRemover.setEnabled(true);
        btnSalvar.setEnabled(true);
    }

    public void saveProduct() {
        category.setCategory_name(this.category_name.getText());

        product.setType(this.type.getText());
        product.setBrand(this.brand.getText());

        product.setType(this.type.getText());
        product.setBrand(this.brand.getText());
        product.setSize(this.size.getText());
        product.setDescription(this.description.getText());
        product.setBar_code(this.bar_code.getText());
        product.setPrice(Float.parseFloat(this.price.getText()));

        inventory.setQtdproduct(Integer.parseInt(this.qtdproduct.getText()));
        boolean resultado = controllerProduct.controlSaveProduct(category, product, inventory);
        if (resultado == true) {
            JOptionPane.showMessageDialog(this, "Salvo com sucesso!!");
            loadStudentsTable("call sp_list_products()");
            limparCampos();
            desabilitarCampos();
            desabilitarBotao();
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        category_name = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        type = new javax.swing.JTextField();
        brand = new javax.swing.JTextField();
        size = new javax.swing.JTextField();
        price = new javax.swing.JTextField();
        bar_code = new javax.swing.JTextField();
        description = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        descricao = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableProduct = new javax.swing.JTable();
        btnNovo = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnRemover = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        tamanho = new javax.swing.JLabel();
        qtdproduct = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        search_product = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(242, 238, 238));

        jLabel1.setText("Categoria:");

        category_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                category_nameActionPerformed(evt);
            }
        });

        jLabel2.setText("Tipo:");

        jLabel20.setText("Codigo Barras:");

        descricao.setText("Descrição:");

        tableProduct.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tableProduct.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableProductMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableProduct);

        btnNovo.setText("Novo");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        btnAlterar.setText("Alterar");

        btnRemover.setText("Remover");

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        jLabel3.setText("Marca:");

        jLabel12.setText("Valor:");

        tamanho.setText("tamanho:");

        jLabel4.setText("Quantidade:");

        search_product.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search_productActionPerformed(evt);
            }
        });

        jButton1.setText("Limpar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(bar_code, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(descricao, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(description, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(category_name)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(brand, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(type, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(tamanho, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(size, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(price, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(qtdproduct, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 875, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(search_product, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 19, Short.MAX_VALUE)))
                .addGap(93, 93, 93))
            .addGroup(layout.createSequentialGroup()
                .addGap(308, 308, 308)
                .addComponent(btnNovo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnSalvar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAlterar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRemover)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCancelar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(bar_code, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(descricao, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(description, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(category_name, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(brand, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(qtdproduct, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(type, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tamanho, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(size, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(price, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvar)
                    .addComponent(btnNovo)
                    .addComponent(btnAlterar)
                    .addComponent(btnRemover)
                    .addComponent(btnCancelar))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(search_product, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(208, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void category_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_category_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_category_nameActionPerformed

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        habilitarBotao();
        habilitarCampos();
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        limparCampos();
        desabilitarBotao();
        desabilitarCampos();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        saveProduct();
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void tableProductMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableProductMouseClicked
        String nome = "" + tableProduct.getValueAt(tableProduct.getSelectedRow(), 0);
        con.getConectar();
        con.executarSql("select c.category_name, p.type, p.brand, p.size, p.description, p.bar_code, p.price, i.qtdproduct from "
                + "tb_category c inner join tb_product p on c.id = p.id_category "
                + "inner join tb_inventory i on p.id = i.id_product where category_name ='" + nome + "'");
        try {
            con.getResultSet().first();
            bar_code.setText(con.getResultSet().getString("bar_code"));
            description.setText(con.getResultSet().getString("description"));
            category_name.setText(con.getResultSet().getString("category_name"));
            brand.setText(con.getResultSet().getString("brand"));
            type.setText(con.getResultSet().getString("type"));
            size.setText(con.getResultSet().getString("size"));
            price.setText(con.getResultSet().getString("price"));
            qtdproduct.setText(con.getResultSet().getString("qtdproduct"));

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro no ao selecionar os dados" + ex);
        }
    }//GEN-LAST:event_tableProductMouseClicked

    private void search_productActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_productActionPerformed

        try {

            String search_product = ("select c.category_name, p.type, p.brand, p.size, p.description, p.bar_code, p.price, i.qtdproduct from "
                    + "tb_category c inner join tb_product p on c.id = p.id_category "
                    + "inner join tb_inventory i on p.id = i.id_product where bar_code like '" + this.search_product.getText() + "%'");
            con.executarSql(search_product);
            
            if (con.getResultSet().first()) {
                bar_code.setText(con.getResultSet().getString("bar_code"));
                description.setText(con.getResultSet().getString("description"));
                category_name.setText(con.getResultSet().getString("category_name"));
                brand.setText(con.getResultSet().getString("brand"));
                type.setText(con.getResultSet().getString("type"));
                size.setText(con.getResultSet().getString("size"));
                price.setText(con.getResultSet().getString("price"));
                qtdproduct.setText(con.getResultSet().getString("qtdproduct"));
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro no ao selecionar os dados" + ex);
        }
    }//GEN-LAST:event_search_productActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        limparCampos();
    }//GEN-LAST:event_jButton1ActionPerformed

    public void loadStudentsTable(String Sql) {
        ArrayList dados = new ArrayList();
        String[] colunas = new String[]{"Categoria", "Tipo", "Marca", "Tamanho", "Descrição", "Preço", "Quantidade"};
        con.getConectar();
        con.executarSql(Sql);

        try {
            con.getResultSet().first();
            do {
                dados.add(new Object[]{
                    con.getResultSet().getString("category_name"),
                    con.getResultSet().getString("type"),
                    con.getResultSet().getString("brand"),
                    con.getResultSet().getString("size"),
                    con.getResultSet().getString("description"),
                    con.getResultSet().getFloat("price"),
                    con.getResultSet().getInt("qtdproduct"),});
            } while (con.getResultSet().next());
        } catch (SQLException e) {
//            JOptionPane.showMessageDialog(null, "Busque Novamente");
        }
        ProductsTable productsTable = new ProductsTable(dados, colunas);
        tableProduct.setModel(productsTable);
        tableProduct.getColumnModel().getColumn(0).setPreferredWidth(160);
        tableProduct.getColumnModel().getColumn(0).setResizable(false);
        tableProduct.getColumnModel().getColumn(1).setPreferredWidth(110);
        tableProduct.getColumnModel().getColumn(1).setResizable(false);
        tableProduct.getColumnModel().getColumn(2).setPreferredWidth(80);
        tableProduct.getColumnModel().getColumn(2).setResizable(false);
        tableProduct.getColumnModel().getColumn(3).setPreferredWidth(100);
        tableProduct.getColumnModel().getColumn(3).setResizable(false);
        tableProduct.getColumnModel().getColumn(4).setPreferredWidth(130);
        tableProduct.getColumnModel().getColumn(4).setResizable(false);
        tableProduct.getColumnModel().getColumn(5).setPreferredWidth(130);
        tableProduct.getColumnModel().getColumn(5).setResizable(false);
        tableProduct.getColumnModel().getColumn(6).setPreferredWidth(160);
        tableProduct.getColumnModel().getColumn(6).setResizable(false);

        tableProduct.getTableHeader().setReorderingAllowed(false);
        tableProduct.setAutoResizeMode(tableProduct.AUTO_RESIZE_OFF);
        tableProduct.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField bar_code;
    private javax.swing.JTextField brand;
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnRemover;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JTextField category_name;
    private javax.swing.JLabel descricao;
    private javax.swing.JTextField description;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField price;
    private javax.swing.JTextField qtdproduct;
    private javax.swing.JTextField search_product;
    private javax.swing.JTextField size;
    private javax.swing.JTable tableProduct;
    private javax.swing.JLabel tamanho;
    private javax.swing.JTextField type;
    // End of variables declaration//GEN-END:variables
}
