/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */


package pandelitosecommercewebsite;

import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author Paolo
 */
public class ProductInformation1 extends javax.swing.JFrame
{

    /**
     * Creates new form ProductInformation
     */
    public ProductInformation1()
    {
        initComponents();
        setTitle("Product Information");
        ImageIcon icon = new ImageIcon(getClass().getResource("/pandelitosecommercewebsite/Images/Pandesal.jpg"));
        Image newImage = (icon).getImage().getScaledInstance(productImage.getWidth(), productImage.getHeight(), Image.SCALE_SMOOTH);
        icon = new ImageIcon(newImage);
        productImage.setIcon(icon);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        productName = new javax.swing.JLabel();
        productDescription = new javax.swing.JLabel();
        addToCart = new javax.swing.JButton();
        productPrice = new javax.swing.JLabel();
        productImage = new javax.swing.JLabel();
        backButton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        Homepage = new javax.swing.JButton();
        Pandelitos = new javax.swing.JButton();
        Pandelitos1 = new javax.swing.JButton();
        goToCart = new javax.swing.JButton();
        productAmount = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(950, 550));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        productName.setFont(new java.awt.Font("Serif", 1, 36)); // NOI18N
        productName.setText("Pandesal");
        getContentPane().add(productName, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 130, -1, 50));

        productDescription.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        productDescription.setText("Freshly baked pandesal that is a soft and fluffy bread roll.");
        getContentPane().add(productDescription, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 200, -1, -1));

        addToCart.setText("Add to Cart");
        addToCart.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addToCart.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                addToCartActionPerformed(evt);
            }
        });
        getContentPane().add(addToCart, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 420, -1, -1));

        productPrice.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        productPrice.setText("₱ 3.00 per piece");
        getContentPane().add(productPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 320, -1, -1));

        productImage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(productImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, 300, 280));

        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                backButtonActionPerformed(evt);
            }
        });
        getContentPane().add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 430, -1, -1));

        jPanel1.setBackground(new java.awt.Color(255, 144, 0));

        Homepage.setBackground(new java.awt.Color(255, 144, 0));
        Homepage.setForeground(new java.awt.Color(255, 144, 0));
        Homepage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pandelitosecommercewebsite/Images/SmallPandelitos.jpg"))); // NOI18N
        Homepage.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Homepage.setBorderPainted(false);
        Homepage.setContentAreaFilled(false);
        Homepage.setMaximumSize(new java.awt.Dimension(100, 100));
        Homepage.setMinimumSize(new java.awt.Dimension(100, 100));
        Homepage.setPreferredSize(new java.awt.Dimension(100, 100));
        Homepage.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                HomepageActionPerformed(evt);
            }
        });

        Pandelitos.setBackground(new java.awt.Color(255, 144, 0));
        Pandelitos.setFont(new java.awt.Font("Serif", 1, 28)); // NOI18N
        Pandelitos.setForeground(new java.awt.Color(0, 0, 0));
        Pandelitos.setText("Pandelitos");
        Pandelitos.setBorder(null);
        Pandelitos.setBorderPainted(false);
        Pandelitos.setContentAreaFilled(false);
        Pandelitos.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                PandelitosActionPerformed(evt);
            }
        });

        Pandelitos1.setBackground(new java.awt.Color(255, 144, 0));
        Pandelitos1.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        Pandelitos1.setForeground(new java.awt.Color(0, 0, 0));
        Pandelitos1.setText("Freshly Baked Hand Rolled Pandesal");
        Pandelitos1.setBorder(null);
        Pandelitos1.setBorderPainted(false);
        Pandelitos1.setContentAreaFilled(false);
        Pandelitos1.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                Pandelitos1ActionPerformed(evt);
            }
        });

        goToCart.setText("Go to Cart");
        goToCart.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        goToCart.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                goToCartActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(Homepage, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Pandelitos1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Pandelitos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 523, Short.MAX_VALUE)
                        .addComponent(goToCart)
                        .addGap(55, 55, 55))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Homepage, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Pandelitos)
                    .addComponent(goToCart))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Pandelitos1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        productAmount.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                productAmountActionPerformed(evt);
            }
        });
        getContentPane().add(productAmount, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 370, 90, 40));

        jLabel1.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        jLabel1.setText("Amount:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 350, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addToCartActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_addToCartActionPerformed
    {//GEN-HEADEREND:event_addToCartActionPerformed
        // TODO add your handling code here:
        int productAmount = Integer.parseInt(this.productAmount.getText());
        String productName = "Pandesal";
        double productPrice = 3.00;
        
        CartItem newItem = new CartItem(productName, productPrice, productAmount);
        Cart.products.add(newItem);
    }//GEN-LAST:event_addToCartActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_backButtonActionPerformed
    {//GEN-HEADEREND:event_backButtonActionPerformed
        this.setVisible(false);
        new ViewProductsPage().setVisible(true);
    }//GEN-LAST:event_backButtonActionPerformed

    private void goToCartActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_goToCartActionPerformed
    {//GEN-HEADEREND:event_goToCartActionPerformed
        this.setVisible(false);
        new Cart().setVisible(true);
    }//GEN-LAST:event_goToCartActionPerformed

    private void HomepageActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_HomepageActionPerformed
    {//GEN-HEADEREND:event_HomepageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_HomepageActionPerformed

    private void PandelitosActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_PandelitosActionPerformed
    {//GEN-HEADEREND:event_PandelitosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PandelitosActionPerformed

    private void Pandelitos1ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_Pandelitos1ActionPerformed
    {//GEN-HEADEREND:event_Pandelitos1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Pandelitos1ActionPerformed

    private void productAmountActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_productAmountActionPerformed
    {//GEN-HEADEREND:event_productAmountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_productAmountActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(ProductInformation1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(ProductInformation1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(ProductInformation1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(ProductInformation1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new ProductInformation1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Homepage;
    private javax.swing.JButton Pandelitos;
    private javax.swing.JButton Pandelitos1;
    private javax.swing.JButton addToCart;
    private javax.swing.JButton backButton;
    private javax.swing.JButton goToCart;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField productAmount;
    private javax.swing.JLabel productDescription;
    private javax.swing.JLabel productImage;
    private javax.swing.JLabel productName;
    private javax.swing.JLabel productPrice;
    // End of variables declaration//GEN-END:variables
}
