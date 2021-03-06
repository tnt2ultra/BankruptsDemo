
package ru.demo.bankrupts.soap.ws.client.generated;

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
 * JAX-WS RI 2.3.2
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "MessageService", targetNamespace = "http://tempuri.org/", wsdlLocation = "https://services.fedresurs.ru/Bankruptcy/MessageServiceDemo/WebService.svc?singleWsdl")
public class MessageService
    extends Service
{

    private final static URL MESSAGESERVICE_WSDL_LOCATION;
    private final static WebServiceException MESSAGESERVICE_EXCEPTION;
    private final static QName MESSAGESERVICE_QNAME = new QName("http://tempuri.org/", "MessageService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("https://services.fedresurs.ru/Bankruptcy/MessageServiceDemo/WebService.svc?singleWsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        MESSAGESERVICE_WSDL_LOCATION = url;
        MESSAGESERVICE_EXCEPTION = e;
    }

    public MessageService() {
        super(__getWsdlLocation(), MESSAGESERVICE_QNAME);
    }

    public MessageService(WebServiceFeature... features) {
        super(__getWsdlLocation(), MESSAGESERVICE_QNAME, features);
    }

    public MessageService(URL wsdlLocation) {
        super(wsdlLocation, MESSAGESERVICE_QNAME);
    }

    public MessageService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, MESSAGESERVICE_QNAME, features);
    }

    public MessageService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public MessageService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns IMessageService
     */
    @WebEndpoint(name = "BasicHttpBinding_IMessageService")
    public IMessageService getBasicHttpBindingIMessageService() {
        return super.getPort(new QName("http://tempuri.org/", "BasicHttpBinding_IMessageService"), IMessageService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns IMessageService
     */
    @WebEndpoint(name = "BasicHttpBinding_IMessageService")
    public IMessageService getBasicHttpBindingIMessageService(WebServiceFeature... features) {
        return super.getPort(new QName("http://tempuri.org/", "BasicHttpBinding_IMessageService"), IMessageService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (MESSAGESERVICE_EXCEPTION!= null) {
            throw MESSAGESERVICE_EXCEPTION;
        }
        return MESSAGESERVICE_WSDL_LOCATION;
    }

}
