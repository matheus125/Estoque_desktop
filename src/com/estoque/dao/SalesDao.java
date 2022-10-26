package com.estoque.dao;

import com.estoque.banco.ConexaoBD;
import com.estoque.model.Sales;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class SalesDao extends ConexaoBD {

    Sales sales = new Sales();

    public void cadastrarVenda(Sales sales) {
        this.getConectar();
        try {
            String sql = "insert into tb_sales (id_client, id_user, sale_date, value_total, type_payment) values (?,?,?,?,?)";
            try (PreparedStatement stmt = con.prepareStatement(sql)) {
                stmt.setInt(1, sales.getClient().getId());
                stmt.setInt(2, sales.getUser().getId());
                stmt.setString(3, sales.getSale_date());
                stmt.setDouble(4, sales.getValue_total());
                stmt.setString(5, sales.getType_payment());

                stmt.execute();
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao Registrar Venda!" + e);
        }
    }

    //Retornar a ultima venda
    public int retornarUltimaVenda() {
        try {
            int idvenda = 0;

            String sql = "select max(id) id from tb_sales";

            PreparedStatement ps = con.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                sales.setId(rs.getInt("id"));

                idvenda = sales.getId();
            }

            return idvenda;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
