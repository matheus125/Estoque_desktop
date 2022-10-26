package com.estoque.dao;

import com.estoque.banco.ConexaoBD;
import com.estoque.model.Client;
import com.estoque.model.Sales;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
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

    public List<Sales> listarSalesForPeriod(LocalDate data_inicio, LocalDate data_fim) {
        this.getConectar();
        try {

            List<Sales> lista = new ArrayList<>();
            String sql = "select v.id, v.sale_date, c.name, v.value_total, v.type_payment\n"
                    + " from tb_sales as v inner join tb_client as c on (v.id_client = c.id) \n"
                    + " where v.sale_date between ? and ?";

            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, data_inicio.toString());
            stmt.setString(2, data_fim.toString());

            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Sales sales = new Sales();
                Client client = new Client();
                
                sales.setId(rs.getInt("v.id"));
                sales.setSale_date(rs.getString("v.sale_date"));
                client.setName(rs.getString("c.name"));
                sales.setValue_total(rs.getDouble("v.value_total"));
                sales.setType_payment(rs.getString("v.type_payment"));
                sales.setClient(client);
                lista.add(sales);

            }
            return lista;
        } catch (SQLException e) {
            return null;
        }
    }
}
