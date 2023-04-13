/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pandelitosecommercewebsite;

/**
 *
 * @author Paolo
 */
public class ProductInformation extends javax.swing.JFrame
{

    /**
     * Creates new form ProductInformation
     */
    public ProductInformation()
    {
        initComponents();
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
        goToCart = new javax.swing.JButton();

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
        setPreferredSize(new java.awt.Dimension(950, 550));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        productName.setText("ProductName");
        getContentPane().add(productName, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 130, -1, -1));

        productDescription.setText("ProductDescription");
        getContentPane().add(productDescription, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 170, -1, -1));

        addToCart.setText("Add to Cart");
        addToCart.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                addToCartActionPerformed(evt);
            }
        });
        getContentPane().add(addToCart, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 370, -1, -1));

        productPrice.setText("ProductPrice");
        getContentPane().add(productPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 290, -1, -1));

        productImage.setText("ProductImage");
        getContentPane().add(productImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 230, -1, -1));

        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                backButtonActionPerformed(evt);
            }
        });
        getContentPane().add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 450, -1, -1));

        goToCart.setText("Go to Cart");
        goToCart.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                goToCartActionPerformed(evt);
            }
        });
        getContentPane().add(goToCart, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 70, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addToCartActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_addToCartActionPerformed
    {//GEN-HEADEREND:event_addToCartActionPerformed
        // TODO add your handling code here:
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
            java.util.logging.Logger.getLogger(ProductInformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(ProductInformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(ProductInformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(ProductInformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new ProductInformation().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addToCart;
    private javax.swing.JButton backButton;
    private javax.swing.JButton goToCart;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel productDescription;
    private javax.swing.JLabel productImage;
    private javax.swing.JLabel productName;
    private javax.swing.JLabel productPrice;
    // End of variables declaration//GEN-END:variables
}
