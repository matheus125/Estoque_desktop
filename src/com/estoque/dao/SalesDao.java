package com.estoque.dao;

import com.estoque.banco.ConexaoBD;
import com.estoque.model.Sales;
import java.awt.HeadlessException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class SalesDao extends ConexaoBD {

    Sales sales = new Sales();

    public void cadastrarVenda(Sales sales) {
        this.getConectar();
        try {
            String sql = "insert into tb_sales (id_client, sale_date, value_total, type_payment) values (?,?,?,?)";
            try (PreparedStatement stmt = con.prepareStatement(sql)) {
                stmt.setInt(1, sales.getClient().getId());
                stmt.setString(2, sales.getSale_date());
                stmt.setDouble(3, sales.getValue_total());
                stmt.setString(4, sales.getType_payment());
                
                stmt.execute();
            }

            JOptionPane.showMessageDialog(null, "Venda Registrada com Sucesso!");

        } catch (HeadlessException | SQLException e) {
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
