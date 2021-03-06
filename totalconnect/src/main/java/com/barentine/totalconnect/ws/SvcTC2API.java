
package com.barentine.totalconnect.ws;

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
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "svcTC2API", targetNamespace = "https://services.alarmnet.com/TC2/", wsdlLocation = "file:/D:/Source/barentine-apis/test/TC2.wsdl")
public class SvcTC2API
    extends Service
{

    private final static URL SVCTC2API_WSDL_LOCATION;
    private final static WebServiceException SVCTC2API_EXCEPTION;
    private final static QName SVCTC2API_QNAME = new QName("https://services.alarmnet.com/TC2/", "svcTC2API");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            //url = new URL("file:/D:/Source/barentine-apis/test/TC2.wsdl");
            url = SvcTC2API.class.getClassLoader().getResource("TC2.wsdl");
        } catch (Exception ex) {
            e = new WebServiceException(ex);
        }
        SVCTC2API_WSDL_LOCATION = url;
        SVCTC2API_EXCEPTION = e;
    }

    public SvcTC2API() {
        super(__getWsdlLocation(), SVCTC2API_QNAME);
    }

    public SvcTC2API(WebServiceFeature... features) {
        super(__getWsdlLocation(), SVCTC2API_QNAME, features);
    }

    public SvcTC2API(URL wsdlLocation) {
        super(wsdlLocation, SVCTC2API_QNAME);
    }

    public SvcTC2API(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, SVCTC2API_QNAME, features);
    }

    public SvcTC2API(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public SvcTC2API(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns SvcTC2APISoap
     */
    @WebEndpoint(name = "svcTC2APISoap")
    public SvcTC2APISoap getSvcTC2APISoap() {
        return super.getPort(new QName("https://services.alarmnet.com/TC2/", "svcTC2APISoap"), SvcTC2APISoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns SvcTC2APISoap
     */
    @WebEndpoint(name = "svcTC2APISoap")
    public SvcTC2APISoap getSvcTC2APISoap(WebServiceFeature... features) {
        return super.getPort(new QName("https://services.alarmnet.com/TC2/", "svcTC2APISoap"), SvcTC2APISoap.class, features);
    }

    /**
     * 
     * @return
     *     returns SvcTC2APISoap
     */
    @WebEndpoint(name = "svcTC2APISoap12")
    public SvcTC2APISoap getSvcTC2APISoap12() {
        return super.getPort(new QName("https://services.alarmnet.com/TC2/", "svcTC2APISoap12"), SvcTC2APISoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns SvcTC2APISoap
     */
    @WebEndpoint(name = "svcTC2APISoap12")
    public SvcTC2APISoap getSvcTC2APISoap12(WebServiceFeature... features) {
        return super.getPort(new QName("https://services.alarmnet.com/TC2/", "svcTC2APISoap12"), SvcTC2APISoap.class, features);
    }

    /**
     * 
     * @return
     *     returns SvcTC2APIHttpGet
     */
    @WebEndpoint(name = "svcTC2APIHttpGet")
    public SvcTC2APIHttpGet getSvcTC2APIHttpGet() {
        return super.getPort(new QName("https://services.alarmnet.com/TC2/", "svcTC2APIHttpGet"), SvcTC2APIHttpGet.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns SvcTC2APIHttpGet
     */
    @WebEndpoint(name = "svcTC2APIHttpGet")
    public SvcTC2APIHttpGet getSvcTC2APIHttpGet(WebServiceFeature... features) {
        return super.getPort(new QName("https://services.alarmnet.com/TC2/", "svcTC2APIHttpGet"), SvcTC2APIHttpGet.class, features);
    }

    /**
     * 
     * @return
     *     returns SvcTC2APIHttpPost
     */
    @WebEndpoint(name = "svcTC2APIHttpPost")
    public SvcTC2APIHttpPost getSvcTC2APIHttpPost() {
        return super.getPort(new QName("https://services.alarmnet.com/TC2/", "svcTC2APIHttpPost"), SvcTC2APIHttpPost.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns SvcTC2APIHttpPost
     */
    @WebEndpoint(name = "svcTC2APIHttpPost")
    public SvcTC2APIHttpPost getSvcTC2APIHttpPost(WebServiceFeature... features) {
        return super.getPort(new QName("https://services.alarmnet.com/TC2/", "svcTC2APIHttpPost"), SvcTC2APIHttpPost.class, features);
    }

    private static URL __getWsdlLocation() {
        if (SVCTC2API_EXCEPTION!= null) {
            throw SVCTC2API_EXCEPTION;
        }
        return SVCTC2API_WSDL_LOCATION;
    }

}
