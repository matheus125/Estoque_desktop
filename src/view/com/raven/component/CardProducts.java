package view.com.raven.component;

import com.estoque.banco.ConexaoBD;
import com.estoque.controller.ControllerProduct;
import com.estoque.dao.ProvidersDao;
import com.estoque.model.Product;
import com.estoque.model.Providers;
import view.com.raven.model.Model_Card;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.HeadlessException;
import java.awt.RenderingHints;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class CardProducts extends javax.swing.JPanel {

    int id_product, flag = 0;

    ConexaoBD con = new ConexaoBD();

    ControllerProduct controllerProduct = new ControllerProduct();

    Product product = new Product();
    Providers providers = new Providers();

    ArrayList<Product> listProduct = new ArrayList<>();

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

    public CardProducts() {
        initComponents();
        con.getConectar();
        setOpaque(false);
        color1 = Color.BLACK;
        color2 = Color.WHITE;
        desabilitarCampos();
        desabilitarBotao();
        loadProductTable();
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
        try {
            product.setType(this.type.getText());
            product.setCategory(this.category_name.getText());
            product.setBrand(this.brand.getText());
            product.setSize(this.size.getText());
            product.setDescription(this.description.getText());
            product.setBar_code(this.bar_code.getText());
            product.setPrice(this.price.getText());
            product.setQtd(Integer.parseInt(this.qtdproduct.getText()));

            boolean resultado = controllerProduct.controlSaveProduct(product);
            if (resultado == true) {
                JOptionPane.showMessageDialog(this, "Salvo com sucesso!!");
                loadProductTable();
                limparCampos();
                desabilitarCampos();
                desabilitarBotao();
            } else {
                JOptionPane.showMessageDialog(this, "Erro ao Salvar!!");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao Salvar: "
                    + "Informe apenas números no campo 'Quantidade'");
        }

    }

    public void updateProduct() {
        try {
            product.setId(this.id_product);
            product.setBrand(this.brand.getText());
            product.setType(this.type.getText());
            product.setCategory(this.category_name.getText());
            product.setSize(this.size.getText());
            product.setDescription(this.description.getText());
            product.setBar_code(this.bar_code.getText());
            product.setPrice(this.price.getText());
            product.setQtd(Integer.parseInt(this.qtdproduct.getText()));

            boolean resultado = controllerProduct.controlUpdateProduct(product);
            if (resultado == true) {
                JOptionPane.showMessageDialog(this, "Alterado com sucesso!!");
                loadProductTable();
                limparCampos();
                desabilitarCampos();
                desabilitarBotao();
            } else {
                JOptionPane.showMessageDialog(this, "Erro ao Salvar!!");
            }
        } catch (HeadlessException | NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Erro ao Salvar: "
                    + "Informe apenas números no campo 'Quantidade'");
        }

    }

    public void excluirProduct() {
        desabilitarCampos();
        int linha = tableProduct.getSelectedRow();
        String tNome = (String) tableProduct.getValueAt(linha, 7);
        int codigo = (int) tableProduct.getValueAt(linha, 0);
        int opcao = JOptionPane.showConfirmDialog(this, "Tem certeza que deseja excluir o Produto: \n"
                + tNome + "?", "Atenção", JOptionPane.YES_NO_OPTION);
        if (opcao == JOptionPane.OK_OPTION) {
            boolean resultado = controllerProduct.controlDeleteCliente(codigo);
            if (resultado == true) {
                JOptionPane.showMessageDialog(this, "Produto Excluido com sucesso!");
                loadProductTable();
                limparCampos();
                desabilitarCampos();
                desabilitarBotao();
                btnNovo.setEnabled(true);
            }
        }
    }

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
        bar_code = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        description = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        tamanho = new javax.swing.JLabel();
        descricao = new javax.swing.JLabel();
        qtdproduct = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableProduct = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        category_name = new javax.swing.JTextField();
        search_product = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btnNovo = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        type = new javax.swing.JTextField();
        btnAlterar = new javax.swing.JButton();
        brand = new javax.swing.JTextField();
        price = new javax.swing.JTextField();
        size = new javax.swing.JTextField();

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

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Marca:");

        jLabel12.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Valor:");

        jLabel20.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Codigo Barras:");

        tamanho.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        tamanho.setForeground(new java.awt.Color(255, 255, 255));
        tamanho.setText("tamanho:");

        descricao.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        descricao.setForeground(new java.awt.Color(255, 255, 255));
        descricao.setText("Descrição:");

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Categoria:");

        tableProduct.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Cor", "Categoria", "Marca", "Tamanho", "Codigo_Barras", "Preço", "Descrição", "Quantidade"
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
        jLabel4.setText("Quantidade:");

        category_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                category_nameActionPerformed(evt);
            }
        });

        search_product.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search_productActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Cor:");

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
                        .addGap(308, 308, 308)
                        .addComponent(btnNovo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSalvar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAlterar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRemover)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCancelar))
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
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(bar_code))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(brand, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(descricao, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(type)
                            .addComponent(description, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tamanho, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(category_name, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(size)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(0, 0, 0)
                                .addComponent(qtdproduct, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(price)))))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(bar_code, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(descricao, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(description, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(category_name, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(qtdproduct, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(price, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(brand, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(type, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tamanho, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(size, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(1, 1, 1)))
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvar)
                    .addComponent(btnNovo)
                    .addComponent(btnAlterar)
                    .addComponent(btnRemover)
                    .addComponent(btnCancelar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(search_product, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(53, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverActionPerformed
        excluirProduct();
    }//GEN-LAST:event_btnRemoverActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        limparCampos();
        desabilitarBotao();
        desabilitarCampos();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        if (flag == 1) {
            saveProduct();
        } else {
            updateProduct();
        };
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void category_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_category_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_category_nameActionPerformed

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        flag = 1;
        habilitarCampos();
        habilitarBotao();
        btnNovo.setEnabled(false);
        btnAlterar.setEnabled(false);
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        flag = 2;
        habilitarCampos();
        habilitarBotao();
        btnNovo.setEnabled(false);
        btnAlterar.setEnabled(false);
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        limparCampos();
        btnAlterar.setEnabled(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void search_productActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_productActionPerformed
        con.getConectar();
        btnAlterar.setEnabled(true);
        String search_product = ("select id, type, category_name, brand, size, description, bar_code, price, qtdproduct\n"
                + "		from tb_product where bar_code like '%" + this.search_product.getText() + "%'");
        con.executarSql(search_product);
        try {
            if (con.getResultSet().first()) {
                bar_code.setText(con.getResultSet().getString("bar_code"));
                description.setText(con.getResultSet().getString("description"));
                category_name.setText(con.getResultSet().getString("category_name"));
                qtdproduct.setText(con.getResultSet().getString("qtdproduct"));
                brand.setText(con.getResultSet().getString("brand"));
                type.setText(con.getResultSet().getString("type"));
                size.setText(con.getResultSet().getString("size"));
                price.setText(con.getResultSet().getString("price"));
                btnAlterar.setEnabled(true);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro no ao selecionar os dados" + ex);
        }
    }//GEN-LAST:event_search_productActionPerformed

    private void tableProductMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableProductMouseClicked
        btnAlterar.setEnabled(true);
        btnRemover.setEnabled(true);
        String nome = "" + tableProduct.getValueAt(tableProduct.getSelectedRow(), 5);
        con.getConectar();
        con.executarSql("select id, type, category_name, brand, size, description, bar_code, price, qtdproduct from tb_product where bar_code = '" + nome + "'");
        try {
            con.getResultSet().first();
            id_product = Integer.parseInt(con.getResultSet().getString("id"));
            type.setText(con.getResultSet().getString("type"));
            category_name.setText(con.getResultSet().getString("category_name"));
            brand.setText(con.getResultSet().getString("brand"));
            size.setText(con.getResultSet().getString("size"));
            description.setText(con.getResultSet().getString("description"));
            bar_code.setText(con.getResultSet().getString("bar_code"));
            price.setText(con.getResultSet().getString("price"));
            qtdproduct.setText(con.getResultSet().getString("qtdproduct"));

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro no ao selecionar os dados" + ex);
        }
        con.getfecharConexao();
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

    public void loadProductTable() {
        listProduct = controllerProduct.returnListProductController();
        DefaultTableModel table = (DefaultTableModel) tableProduct.getModel();
        table.setNumRows(0);
        //Inserir dados na tabela
        int cont = listProduct.size();
        for (int i = 0; i < cont; i++) {
            table.addRow(new Object[]{
                listProduct.get(i).getId(),
                listProduct.get(i).getCategory(),
                listProduct.get(i).getType(),
                listProduct.get(i).getBrand(),
                listProduct.get(i).getSize(),
                listProduct.get(i).getBar_code(),
                listProduct.get(i).getPrice(),
                listProduct.get(i).getDescription(),
                listProduct.get(i).getQtd()
            });
        }
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
