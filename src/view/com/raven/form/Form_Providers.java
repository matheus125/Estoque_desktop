package view.com.raven.form;

import com.estoque.banco.ConexaoBD;
import com.estoque.controller.ControllerProduct;

import com.estoque.model.Produto;
import com.estoque.tabelas.ProductsTable;

import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import view.com.raven.model.Model_Card;

public class Form_Providers extends javax.swing.JPanel {

    public Form_Providers() {
        initComponents();
        cardProviders1.setData(new Model_Card(new ImageIcon(getClass().getResource("/com/raven/icon/stock.png")), "Stock Total", "$200000", "Increased by 60%"));

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cardProviders1 = new view.com.raven.component.CardProviders();

        setBackground(new java.awt.Color(242, 238, 238));

        cardProviders1.setColor1(new java.awt.Color(142, 142, 250));
        cardProviders1.setColor2(new java.awt.Color(123, 123, 245));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cardProviders1, javax.swing.GroupLayout.DEFAULT_SIZE, 1060, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cardProviders1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 596, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private view.com.raven.component.CardProviders cardProviders1;
    // End of variables declaration//GEN-END:variables
}
