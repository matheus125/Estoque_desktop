package view.com.raven.form;


import javax.swing.ImageIcon;
import view.com.raven.model.Model_Card;

public class Form_CodigoBarras extends javax.swing.JPanel {

    public Form_CodigoBarras() {
        initComponents();
        cardCodigoBarras1.setData(new Model_Card(new ImageIcon(getClass().getResource("/com/raven/icon/stock.png")), "Stock Total", "$200000", "Increased by 60%"));

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cardCodigoBarras1 = new view.com.raven.component.CardCodigoBarras();

        setBackground(new java.awt.Color(242, 238, 238));

        cardCodigoBarras1.setColor1(new java.awt.Color(142, 142, 250));
        cardCodigoBarras1.setColor2(new java.awt.Color(123, 123, 245));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cardCodigoBarras1, javax.swing.GroupLayout.DEFAULT_SIZE, 1060, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cardCodigoBarras1, javax.swing.GroupLayout.DEFAULT_SIZE, 596, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private view.com.raven.component.CardCodigoBarras cardCodigoBarras1;
    // End of variables declaration//GEN-END:variables
}
