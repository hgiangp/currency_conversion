
package exchangeclient;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the exchangeclient package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetExchangeRateResponse_QNAME = new QName("http://exchange/", "getExchangeRateResponse");
    private final static QName _ExchangeCurrency_QNAME = new QName("http://exchange/", "exchangeCurrency");
    private final static QName _GetExchangeRate_QNAME = new QName("http://exchange/", "getExchangeRate");
    private final static QName _ExchangeCurrencyResponse_QNAME = new QName("http://exchange/", "exchangeCurrencyResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: exchangeclient
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetExchangeRate }
     * 
     */
    public GetExchangeRate createGetExchangeRate() {
        return new GetExchangeRate();
    }

    /**
     * Create an instance of {@link ExchangeCurrencyResponse }
     * 
     */
    public ExchangeCurrencyResponse createExchangeCurrencyResponse() {
        return new ExchangeCurrencyResponse();
    }

    /**
     * Create an instance of {@link ExchangeCurrency }
     * 
     */
    public ExchangeCurrency createExchangeCurrency() {
        return new ExchangeCurrency();
    }

    /**
     * Create an instance of {@link GetExchangeRateResponse }
     * 
     */
    public GetExchangeRateResponse createGetExchangeRateResponse() {
        return new GetExchangeRateResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetExchangeRateResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://exchange/", name = "getExchangeRateResponse")
    public JAXBElement<GetExchangeRateResponse> createGetExchangeRateResponse(GetExchangeRateResponse value) {
        return new JAXBElement<GetExchangeRateResponse>(_GetExchangeRateResponse_QNAME, GetExchangeRateResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExchangeCurrency }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://exchange/", name = "exchangeCurrency")
    public JAXBElement<ExchangeCurrency> createExchangeCurrency(ExchangeCurrency value) {
        return new JAXBElement<ExchangeCurrency>(_ExchangeCurrency_QNAME, ExchangeCurrency.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetExchangeRate }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://exchange/", name = "getExchangeRate")
    public JAXBElement<GetExchangeRate> createGetExchangeRate(GetExchangeRate value) {
        return new JAXBElement<GetExchangeRate>(_GetExchangeRate_QNAME, GetExchangeRate.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExchangeCurrencyResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://exchange/", name = "exchangeCurrencyResponse")
    public JAXBElement<ExchangeCurrencyResponse> createExchangeCurrencyResponse(ExchangeCurrencyResponse value) {
        return new JAXBElement<ExchangeCurrencyResponse>(_ExchangeCurrencyResponse_QNAME, ExchangeCurrencyResponse.class, null, value);
    }

}
