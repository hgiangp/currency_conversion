
package exchange;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.8
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "ExchangeService", targetNamespace = "http://exchange/", wsdlLocation = "http://localhost:8080/ExchangeService/ExchangeService?WSDL")
public class ExchangeService_Service
    extends Service
{

    private final static URL EXCHANGESERVICE_WSDL_LOCATION;
    private final static WebServiceException EXCHANGESERVICE_EXCEPTION;
    private final static QName EXCHANGESERVICE_QNAME = new QName("http://exchange/", "ExchangeService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/ExchangeService/ExchangeService?WSDL");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        EXCHANGESERVICE_WSDL_LOCATION = url;
        EXCHANGESERVICE_EXCEPTION = e;
    }

    public ExchangeService_Service() {
        super(__getWsdlLocation(), EXCHANGESERVICE_QNAME);
    }

    public ExchangeService_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), EXCHANGESERVICE_QNAME, features);
    }

    public ExchangeService_Service(URL wsdlLocation) {
        super(wsdlLocation, EXCHANGESERVICE_QNAME);
    }

    public ExchangeService_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, EXCHANGESERVICE_QNAME, features);
    }

    public ExchangeService_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ExchangeService_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns ExchangeService
     */
    @WebEndpoint(name = "ExchangeServicePort")
    public ExchangeService getExchangeServicePort() {
        return super.getPort(new QName("http://exchange/", "ExchangeServicePort"), ExchangeService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ExchangeService
     */
    @WebEndpoint(name = "ExchangeServicePort")
    public ExchangeService getExchangeServicePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://exchange/", "ExchangeServicePort"), ExchangeService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (EXCHANGESERVICE_EXCEPTION!= null) {
            throw EXCHANGESERVICE_EXCEPTION;
        }
        return EXCHANGESERVICE_WSDL_LOCATION;
    }

}