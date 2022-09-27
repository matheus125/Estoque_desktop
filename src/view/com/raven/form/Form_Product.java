package view.com.raven.form;

import com.estoque.banco.ConexaoBD;
import com.estoque.controller.ControllerProduct;
import com.estoque.model.Category;
import com.estoque.model.Product;

import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;

public class Form_Product extends javax.swing.JPanel {

    ConexaoBD con = new ConexaoBD();

    ControllerProduct controllerProduct = new ControllerProduct();
    Category category = new Category();
    Product product = new Product();
    

    public Form_Product() {
        initComponents();
        desabilitarCampos();
        desabilitarBotao();
        con.getConectar();
       // carregarTabelaAlunos("call sp_list_alunos()");
    }

    public void limparCampos() {
        color.setText("");
        category_name.setText("");
        type.setText("");
        brand.setText("");
        size.setText("");
        price.setText("");
        bar_code.setText("");
        description.setText("");
    }

    public final void desabilitarCampos() {
        color.setEnabled(false);
        category_name.setEnabled(false);
        type.setEnabled(false);
        brand.setEnabled(false);
        size.setEnabled(false);
        price.setEnabled(false);
        bar_code.setEnabled(false);
        description.setEnabled(false);
    }

    public void habilitarCampos() {
        color.setEnabled(true);
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

    public void gravarAluno() {
        
        
        category.setCategory_name(this.category_name.getText());
        
        product.setType(this.type.getText());
        product.setBrand(this.brand.getText());
        
        product.setType(this.type.getText());
        product.setBrand(this.brand.getText());
        product.setColor(this.color.getText());
        product.setSize(this.size.getText());
        product.setDescription(this.description.getText());
        product.setCode(Integer.parseInt(this.code.getText()));
        product.setBar_code(this.bar_code.getText());
        product.setPrice(Float.parseFloat(this.price.getText()));
   
        boolean resultado = controllerProduct.controlSaveProduct(category, product);
        if (resultado == true) {
            JOptionPane.showMessageDialog(this, "Salvo com sucesso!!");
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
        color = new javax.swing.JTextField();
        size = new javax.swing.JTextField();
        price = new javax.swing.JTextField();
        bar_code = new javax.swing.JTextField();
        description = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        descricao = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableAluno = new javax.swing.JTable();
        btnNovo = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnRemover = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        tamanho = new javax.swing.JLabel();
        code = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(242, 238, 238));

        jLabel1.setText("Categoria:");

        category_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                category_nameActionPerformed(evt);
            }
        });

        jLabel2.setText("Tipo:");

        jLabel20.setText("Codigo Barras:");

        descricao.setText("Complemento:");

        tableAluno.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tableAluno);

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

        jLabel3.setText("Tamanho:");

        jLabel10.setText("Cor:");

        jLabel12.setText("Valor:");

        tamanho.setText("Turma:");

        jLabel4.setText("Codigo:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(category_name, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(type, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(brand, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(code, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(color, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(tamanho, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(size, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(descricao, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(description, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(bar_code, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 741, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnNovo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSalvar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnAlterar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnRemover)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCancelar)
                                .addGap(211, 211, 211))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(price, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(105, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(code, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(type, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(brand, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(category_name, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(color)
                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(bar_code, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(descricao, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(description, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(tamanho, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(size))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(price, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(83, 83, 83)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvar)
                    .addComponent(btnNovo)
                    .addComponent(btnAlterar)
                    .addComponent(btnRemover)
                    .addComponent(btnCancelar))
                .addGap(59, 59, 59)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
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
        gravarAluno();
    }//GEN-LAST:event_btnSalvarActionPerformed
    
  /*  public void carregarTabelaAlunos(String Sql) {
        ArrayList dados = new ArrayList();
        String[] colunas = new String[]{"Nome", "Nome Mãe", "Nome Pai", "Estado Civil", "Data Nascimento", "Sexo"};
        con.getConectar();
        con.executarSql(Sql);

        try {
            con.getResultSet().first();
            do {
                dados.add(new Object[]{
                    con.getResultSet().getString("nome"),
                    con.getResultSet().getString("nome_mae"),
                    con.getResultSet().getString("nome_pai"),
                    con.getResultSet().getString("estado_civil"),
                    con.getResultSet().getString("dt_nascimento"),
                    con.getResultSet().getString("sexo")});
            } while(con.getResultSet().next());
        } catch (SQLException e) {
//            JOptionPane.showMessageDialog(null, "Busque Novamente");
        }
        TabelaAlunos tabelaalunos = new TabelaAlunos(dados, colunas);
        tableAluno.setModel(tabelaalunos);
        tableAluno.getColumnModel().getColumn(0).setPreferredWidth(160);
        tableAluno.getColumnModel().getColumn(0).setResizable(false);
        tableAluno.getColumnModel().getColumn(1).setPreferredWidth(110);
        tableAluno.getColumnModel().getColumn(1).setResizable(false);
        tableAluno.getColumnModel().getColumn(2).setPreferredWidth(80);
        tableAluno.getColumnModel().getColumn(2).setResizable(false);
        tableAluno.getColumnModel().getColumn(3).setPreferredWidth(100);
        tableAluno.getColumnModel().getColumn(3).setResizable(false);
        tableAluno.getColumnModel().getColumn(4).setPreferredWidth(130);
        tableAluno.getColumnModel().getColumn(4).setResizable(false);
        tableAluno.getColumnModel().getColumn(5).setPreferredWidth(130);
        tableAluno.getColumnModel().getColumn(5).setResizable(false);
//        tableAluno.getColumnModel().getColumn(6).setPreferredWidth(160);
//        tableAluno.getColumnModel().getColumn(6).setResizable(false);
//        tableAluno.getColumnModel().getColumn(7).setPreferredWidth(100);
//        tableAluno.getColumnModel().getColumn(7).setResizable(false);

        tableAluno.getTableHeader().setReorderingAllowed(false);
        tableAluno.setAutoResizeMode(tableAluno.AUTO_RESIZE_OFF);
        tableAluno.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

    }*/

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField bar_code;
    private javax.swing.JTextField brand;
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnRemover;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JTextField category_name;
    private javax.swing.JTextField code;
    private javax.swing.JTextField color;
    private javax.swing.JLabel descricao;
    private javax.swing.JTextField description;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField price;
    private javax.swing.JTextField size;
    private javax.swing.JTable tableAluno;
    private javax.swing.JLabel tamanho;
    private javax.swing.JTextField type;
    // End of variables declaration//GEN-END:variables
}
