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
        LogInPage p = new LogInPage();
        PaymentPage pm = new PaymentPage();
        PaymentMethodCard pmc = new PaymentMethodCard();
        ConfirmationPage c = new ConfirmationPage();
        c.show();
    }
    
}
