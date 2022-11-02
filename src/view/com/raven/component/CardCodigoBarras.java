package view.com.raven.component;

import view.com.raven.model.Model_Card;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JFileChooser;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import jbarcodebean.JBarcodeBean;
import net.sourceforge.jbarcodebean.model.AbstractBarcodeStrategy;
import net.sourceforge.jbarcodebean.model.Codabar;
import net.sourceforge.jbarcodebean.model.Code11;
import net.sourceforge.jbarcodebean.model.Code128;
import net.sourceforge.jbarcodebean.model.Code39;
import net.sourceforge.jbarcodebean.model.Code93;
import net.sourceforge.jbarcodebean.model.Ean13;
import net.sourceforge.jbarcodebean.model.Ean8;
import net.sourceforge.jbarcodebean.model.Interleaved25;
import net.sourceforge.jbarcodebean.model.MSI;

public class CardCodigoBarras extends javax.swing.JPanel {

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
    
    private BufferedImage mImageCB = null;

    public CardCodigoBarras() {
        initComponents();
        setOpaque(false);
        color1 = Color.BLACK;
        color2 = Color.WHITE;

    }

    public void setData(Model_Card data) {
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbTitle = new javax.swing.JLabel();
        lbValues = new javax.swing.JLabel();
        lbDescription = new javax.swing.JLabel();
        pnlCodigoBarrasGenerated = new javax.swing.JPanel();
        lblCB = new javax.swing.JLabel();
        btnGenerar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        cbTipoCodigo = new javax.swing.JComboBox<>();
        txtCodigo = new javax.swing.JTextField();

        setLayout(null);

        lbTitle.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        lbTitle.setForeground(new java.awt.Color(255, 255, 255));
        lbTitle.setText("Código de barras:");
        add(lbTitle);
        lbTitle.setBounds(80, 70, 158, 25);

        lbValues.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        lbValues.setForeground(new java.awt.Color(255, 255, 255));
        lbValues.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbValues.setText("Gerar código de barras");
        add(lbValues);
        lbValues.setBounds(0, 0, 589, 47);

        lbDescription.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        lbDescription.setForeground(new java.awt.Color(255, 255, 255));
        lbDescription.setText("Tipo:");
        add(lbDescription);
        lbDescription.setBounds(320, 70, 124, 25);

        pnlCodigoBarrasGenerated.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout pnlCodigoBarrasGeneratedLayout = new javax.swing.GroupLayout(pnlCodigoBarrasGenerated);
        pnlCodigoBarrasGenerated.setLayout(pnlCodigoBarrasGeneratedLayout);
        pnlCodigoBarrasGeneratedLayout.setHorizontalGroup(
            pnlCodigoBarrasGeneratedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCodigoBarrasGeneratedLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblCB, javax.swing.GroupLayout.DEFAULT_SIZE, 550, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlCodigoBarrasGeneratedLayout.setVerticalGroup(
            pnlCodigoBarrasGeneratedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCodigoBarrasGeneratedLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(lblCB, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
                .addContainerGap())
        );

        add(pnlCodigoBarrasGenerated);
        pnlCodigoBarrasGenerated.setBounds(10, 170, 570, 210);

        btnGenerar.setText("Gerar");
        btnGenerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarActionPerformed(evt);
            }
        });
        add(btnGenerar);
        btnGenerar.setBounds(80, 140, 200, 23);

        jButton1.setText("Salvar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1);
        jButton1.setBounds(320, 140, 170, 23);

        cbTipoCodigo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Code11", "Code39", "Code93", "Code128", "Codabar", "Ean8", "Ean13", "Interleaved25", "MSI" }));
        add(cbTipoCodigo);
        cbTipoCodigo.setBounds(320, 100, 170, 30);
        add(txtCodigo);
        txtCodigo.setBounds(80, 100, 200, 30);
    }// </editor-fold>//GEN-END:initComponents

    private void btnGenerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarActionPerformed
        String codigoBarras = txtCodigo.getText().trim();

        if (codigoBarras.equals("")) {
            return;
        }

        JBarcodeBean mBarcodeBean = new JBarcodeBean();
        mBarcodeBean.setCodeType(getCodeType(cbTipoCodigo.getSelectedItem().toString()));
        mBarcodeBean.setCode(codigoBarras);

        mImageCB = mBarcodeBean.draw(new BufferedImage(lblCB.getWidth(), lblCB.getHeight(), BufferedImage.TYPE_INT_RGB));

        ImageIcon mIcon = new ImageIcon(new ImageIcon(mImageCB).getImage().getScaledInstance(lblCB.getWidth(), lblCB.getHeight(), 0));

        lblCB.setIcon(mIcon);

    }//GEN-LAST:event_btnGenerarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        guardarCodigoBarras(mImageCB);
    }//GEN-LAST:event_jButton1ActionPerformed

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
    
     private AbstractBarcodeStrategy getCodeType(String codeType) {
        AbstractBarcodeStrategy mCodeType = null;
        switch (codeType) {
            case "Code11":
                mCodeType = new Code11();
                break;
            case "Code39":
                mCodeType = new Code39();
                break;
            case "Code93":
                mCodeType = new Code93();
                break;
            case "Code128":
                mCodeType = new Code128();
                break;
            case "Codabar":
                mCodeType = new Codabar();
                break;
            case "Ean8":
                mCodeType = new Ean8();
                break;
            case "Ean13":
                mCodeType = new Ean13();
                break; 
            case "Interleaved25":
                mCodeType = new Interleaved25();
                break;
            case "MSI":
                mCodeType = new MSI();
                break;
            default:
                mCodeType = null;
        }
        return mCodeType;
    }
     
     private boolean guardarCodigoBarras(BufferedImage imagen){
        estiloWindows();
        JFileChooser mChooser = new JFileChooser("codigos de barras");
        int seleccion = mChooser.showSaveDialog(this);
        if (seleccion == JFileChooser.APPROVE_OPTION) {
            File mCBGenerado = mChooser.getSelectedFile();
            if (!mCBGenerado.toString().endsWith(".png")) {
                mCBGenerado = new File(mChooser.getSelectedFile() + ".png"); 
            }
            
            try {
                ImageIO.write(imagen, "png", mCBGenerado);
                return true;
            }catch (IOException e){
                return false;
            }
        }else { return false; }
        
    }
    
     private void estiloWindows() {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {

        }
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGenerar;
    private javax.swing.JComboBox<String> cbTipoCodigo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel lbDescription;
    private javax.swing.JLabel lbTitle;
    private javax.swing.JLabel lbValues;
    private javax.swing.JLabel lblCB;
    private javax.swing.JPanel pnlCodigoBarrasGenerated;
    private javax.swing.JTextField txtCodigo;
    // End of variables declaration//GEN-END:variables
}


