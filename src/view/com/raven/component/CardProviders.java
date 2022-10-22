package view.com.raven.component;

import com.estoque.banco.ConexaoBD;
import com.estoque.controller.ControllerProduct;
import com.estoque.controller.ControllerProviders;
import com.estoque.model.Product;
import com.estoque.model.Providers;
import view.com.raven.model.Model_Card;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class CardProviders extends javax.swing.JPanel {

    int id_category, id_product, flag = 0;

    ConexaoBD con = new ConexaoBD();

    ControllerProviders controllerProviders = new ControllerProviders();

    Providers providers = new Providers();

    //  ArrayList<Product> listProduct = new ArrayList<>();
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

    public CardProviders() {
        initComponents();
        setOpaque(false);
        color1 = Color.BLACK;
        color2 = Color.WHITE;
        desabilitarCampos();
        desabilitarBotao();
        //loadProductTable();
    }

    public void limparCampos() {
        fone.setText("");
        email.setText("");
        cnpj.setText("");
        nome.setText("");
        search_product.setText("");
    }

    public final void desabilitarCampos() {
        fone.setEnabled(false);
        email.setEnabled(false);
        cnpj.setEnabled(false);
        nome.setEnabled(false);
    }

    public void habilitarCampos() {
        fone.setEnabled(true);
        email.setEnabled(true);
        cnpj.setEnabled(true);
        nome.setEnabled(true);
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

    public void saveProviders() {
        providers.setCnpj(this.cnpj.getText());
        providers.setName(this.nome.getText());
        providers.setEmail(this.email.getText());
        providers.setPhone(this.fone.getText());

        boolean resultado = controllerProviders.controlSaveProviders(providers);
        if (resultado == true) {
            JOptionPane.showMessageDialog(this, "Salvo com sucesso!!");
            //loadProductTable();
            limparCampos();
            desabilitarCampos();
            desabilitarBotao();
        }

    }

    /* public void updateProduct() {
       
        product.setCategory(this.category_name.getText());
        
        product.setId(this.id_product);
        product.setType(this.type.getText());
        product.setBrand(this.brand.getText());
        product.setType(this.type.getText());
        product.setBrand(this.brand.getText());
        product.setSize(this.size.getText());
        product.setDescription(this.description.getText());
        product.setBar_code(this.bar_code.getText());
        product.setPrice(Float.parseFloat(this.price.getText()));
        product.setQtd(Integer.parseInt(this.qtdproduct.getText()));
        
        boolean resultado = controllerProduct.controlUpdateProduct(product);
        if (resultado == true) {
            JOptionPane.showMessageDialog(this, "Alterado com sucesso!!");
            //loadProductTable();
            limparCampos();
            desabilitarCampos();
            desabilitarBotao();
        }

    }
     */
    public void setData(Model_Card data) {

        /*lbTitle.setText(data.getTitle());
        lbValues.setText(data.getValues());
        lbDescription.setText(data.getDescription());*/
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnRemover = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        cnpj = new javax.swing.JTextField();
        nome = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        descricao = new javax.swing.JLabel();
        fone = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableProduct = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        search_product = new javax.swing.JTextField();
        btnNovo = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();

        btnRemover.setText("Remover");
        btnRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverActionPerformed(evt);
            }
        });

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

        jLabel20.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("CNPJ:");

        descricao.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        descricao.setForeground(new java.awt.Color(255, 255, 255));
        descricao.setText("Fornecedor:");

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Email:");

        tableProduct.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Categoria", "Tipo", "Brand", "Size", "Description", "Bar_code", "Price", "Quantidade"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableProduct.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableProductMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableProduct);

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Phone:");

        email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailActionPerformed(evt);
            }
        });

        search_product.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search_productActionPerformed(evt);
            }
        });

        btnNovo.setText("Novo");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        jButton1.setText("Limpar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnAlterar.setText("Alterar");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(140, 140, 140)
                                .addComponent(search_product, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton1))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 875, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cnpj, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)
                            .addComponent(email))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(descricao, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fone, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(166, 166, 166)
                        .addComponent(btnNovo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSalvar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAlterar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRemover)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCancelar)))
                .addContainerGap(58, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cnpj, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(descricao, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(fone, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvar)
                    .addComponent(btnNovo)
                    .addComponent(btnAlterar)
                    .addComponent(btnRemover)
                    .addComponent(btnCancelar))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(search_product, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRemoverActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        limparCampos();
        desabilitarBotao();
        desabilitarCampos();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        saveProviders();
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailActionPerformed

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        habilitarBotao();
        habilitarCampos();
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        // updateProduct();
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        limparCampos();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void search_productActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_productActionPerformed

        /* try {

            String search_product = ("select c.category_name, p.type, p.brand, p.size, p.description, p.bar_code, p.price, i.qtdproduct from "
                    + "tb_category c inner join tb_product p on c.id = p.id_category "
                    + "inner join tb_inventory i on p.id = i.id_product where bar_code like '" + this.search_product.getText() + "%'");
            con.executarSql(search_product);

            if (con.getResultSet().first()) {
                cnpj.setText(con.getResultSet().getString("bar_code"));
                nome.setText(con.getResultSet().getString("description"));
                email.setText(con.getResultSet().getString("category_name"));
                fone.setText(con.getResultSet().getString("qtdproduct"));
                brand.setText(con.getResultSet().getString("brand"));
                type.setText(con.getResultSet().getString("type"));
                size.setText(con.getResultSet().getString("size"));
                price.setText(con.getResultSet().getString("price"));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro no ao selecionar os dados" + ex);
        }
         */
    }//GEN-LAST:event_search_productActionPerformed

    private void tableProductMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableProductMouseClicked
        /*  String nome = "" + tableProduct.getValueAt(tableProduct.getSelectedRow(), 1);
        con.getConectar();
        con.executarSql("select c.category_name, p.id_category, p.type, p.brand, p.size, p.description, p.bar_code, p.price, i.id_product,i.qtdproduct from "
                + "tb_category c inner join tb_product p on c.id = p.id_category "
                + "inner join tb_inventory i on p.id = i.id_product where category_name ='" + nome + "'");
        try {
            con.getResultSet().first();
            id_category = Integer.parseInt(con.getResultSet().getString("id_category"));
            id_product = Integer.parseInt(con.getResultSet().getString("id_product"));
            cnpj.setText(con.getResultSet().getString("bar_code"));
            nome.setText(con.getResultSet().getString("description"));
            email.setText(con.getResultSet().getString("category_name"));
            brand.setText(con.getResultSet().getString("brand"));
            type.setText(con.getResultSet().getString("type"));
            size.setText(con.getResultSet().getString("size"));
            price.setText(con.getResultSet().getString("price"));
            fone.setText(con.getResultSet().getString("qtdproduct"));

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro no ao selecionar os dados" + ex);
        }
         */
    }//GEN-LAST:event_tableProductMouseClicked

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

    /* public void loadProductTable() {
        listProduct = controllerProduct.returnListProductController();
        DefaultTableModel table = (DefaultTableModel) tableProduct.getModel();
        table.setNumRows(0);
        //Inserir dados na tabela
        int cont = listProduct.size();
        for (int i = 0; i < cont; i++) {
            table.addRow(new Object[]{
                listProduct.get(i).getProduct().getCategory().getId(),
                listProduct.get(i).getProduct().getCategory().getCategory_name(),
                listProduct.get(i).getProduct().getType(),
                listProduct.get(i).getProduct().getBrand(),
                listProduct.get(i).getProduct().getSize(),
                listProduct.get(i).getProduct().getBar_code(),
                listProduct.get(i).getProduct().getPrice(),
                listProduct.get(i).getProduct().getDescription(),
                listProduct.get(i).getQtdproduct()
            });
        }
    }*/

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnRemover;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JTextField cnpj;
    private javax.swing.JLabel descricao;
    private javax.swing.JTextField email;
    private javax.swing.JTextField fone;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nome;
    private javax.swing.JTextField search_product;
    private javax.swing.JTable tableProduct;
    // End of variables declaration//GEN-END:variables
}
