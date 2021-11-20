/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exchangeclient;
import java.util.Scanner; 
//import exchangeclient.*; 

/**
 *
 * @author jenna
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in); 
        ExchangeService s = new ExchangeService_Service().getExchangeServicePort();
        Double amount = in.nextDouble(); 
        System.out.println("amount " + amount);
        String fromCurrency = in.nextLine(); 
        fromCurrency = fromCurrency.replace(" ", ""); 
        System.out.println("fromCurrency " + fromCurrency); 
        String toCurrency = in.nextLine();
        toCurrency = toCurrency.replace(" ", ""); 
        System.out.println("toCurrency " + toCurrency); 

        
        System.out.println(amount +" "+ fromCurrency + " is " + s.exchangeCurrency(amount, fromCurrency, toCurrency) + toCurrency); 
        in.close(); 
    }
    
}
