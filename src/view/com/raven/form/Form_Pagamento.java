package view.com.raven.form;

import javax.swing.ImageIcon;
import view.com.raven.model.Model_Card;

public class Form_Pagamento extends javax.swing.JPanel {
    
    public Form_Pagamento() {
         initComponents();
         cardPagamentos1.setData(new Model_Card(new ImageIcon(getClass().getResource("/com/raven/icon/stock.png")), "Stock Total", "$200000", "Increased by 60%"));
    }
    

 
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cardPagamentos1 = new view.com.raven.component.CardPagamentos();

        setBackground(new java.awt.Color(242, 238, 238));
        setLayout(null);

        cardPagamentos1.setColor1(new java.awt.Color(142, 142, 250));
        cardPagamentos1.setColor2(new java.awt.Color(123, 123, 245));
        add(cardPagamentos1);
        cardPagamentos1.setBounds(0, 0, 580, 375);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private view.com.raven.component.CardPagamentos cardPagamentos1;
    // End of variables declaration//GEN-END:variables
}