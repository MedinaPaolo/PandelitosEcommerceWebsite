/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pandelitosecommercewebsite;

/**
 *
 * @author Paolo
 */
public class PandelitosEcommerceWebsite
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        HomePage h = new HomePage();
        SignUpPage s = new SignUpPage();
        LogInPage l = new LogInPage();
        ViewProductsPage vp = new ViewProductsPage();
        ViewProductsPageNotLoggedIn vpnl = new ViewProductsPageNotLoggedIn();
        PaymentPage p = new PaymentPage();
        PaymentMethodCard pc = new PaymentMethodCard();
        ConfirmationPage c = new ConfirmationPage();
        pc.show();
    }
    
}
