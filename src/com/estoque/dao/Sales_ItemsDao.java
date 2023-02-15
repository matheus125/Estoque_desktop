package com.estoque.dao;

import com.estoque.banco.ConexaoBD;
import com.estoque.model.Itens_vendas;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Sales_ItemsDao extends ConexaoBD {

    public void cadastrarItem(Itens_vendas sales_items) {

        this.getConectar();
        try {
            String sql = "insert into tb_sales_items (id_sales, id_product, qtdproduct, subtotal) values (?,?,?,?)";
            try (PreparedStatement stmt = con.prepareStatement(sql)) {
                stmt.setInt(1, sales_items.getSales().getId());
                stmt.setInt(2, sales_items.getProduct().getId());
                stmt.setInt(3, sales_items.getQtdproduct());
                stmt.setDouble(4, sales_items.getSubtotal());

                stmt.execute();
                stmt.close();
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao Registrar Item!" + e);
        }
    }
}
