/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exchange;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

import exchange.BFS; 

/**
 *
 * @author jenna
 */
@WebService(serviceName = "ExchangeService")
public class ExchangeService {
    
    static BFS bfs = new BFS(); 

    /**
     * Web service operation
     */
    @WebMethod(operationName = "getExchangeRate")
    public Double getExchangeRate(@WebParam(name = "fromCurrency") String fromCurrency, @WebParam(name = "toCurrency") String toCurrency) {
        //TODO write your implementation code here:
        return bfs.getCurrencyRate(fromCurrency, toCurrency); 
    }
    
    /**
     * Web service operation
     */
    @WebMethod(operationName = "exchangeCurrency")
    public Double exchangeCurrency(@WebParam(name = "amount") Double amount, @WebParam(name = "fromCurrency") String fromCurrency, @WebParam(name = "toCurrency") String toCurrency) {
        //TODO write your implementation code here:
        System.out.println("amount = " + amount + "from: " + fromCurrency + "to: " + toCurrency);
        if (getExchangeRate(fromCurrency, toCurrency) != null)
            return amount*getExchangeRate(fromCurrency, toCurrency); 
        return null;
    }
}
