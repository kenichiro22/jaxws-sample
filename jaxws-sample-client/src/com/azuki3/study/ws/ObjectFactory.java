
package com.azuki3.study.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.azuki3.study.ws package. 
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

    private final static QName _SayHello2_QNAME = new QName("http://ws.study.azuki3.com/", "sayHello2");
    private final static QName _Exception_QNAME = new QName("http://ws.study.azuki3.com/", "Exception");
    private final static QName _SayHello2Response_QNAME = new QName("http://ws.study.azuki3.com/", "sayHello2Response");
    private final static QName _SayHello3_QNAME = new QName("http://ws.study.azuki3.com/", "sayHello3");
    private final static QName _HelloException_QNAME = new QName("http://ws.study.azuki3.com/", "HelloException");
    private final static QName _SayHello_QNAME = new QName("http://ws.study.azuki3.com/", "sayHello");
    private final static QName _SayHelloResponse_QNAME = new QName("http://ws.study.azuki3.com/", "sayHelloResponse");
    private final static QName _SayHello3Response_QNAME = new QName("http://ws.study.azuki3.com/", "sayHello3Response");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.azuki3.study.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SayHello3Response }
     * 
     */
    public SayHello3Response createSayHello3Response() {
        return new SayHello3Response();
    }

    /**
     * Create an instance of {@link SayHello3 }
     * 
     */
    public SayHello3 createSayHello3() {
        return new SayHello3();
    }

    /**
     * Create an instance of {@link Exception }
     * 
     */
    public Exception createException() {
        return new Exception();
    }

    /**
     * Create an instance of {@link SayHelloResponse }
     * 
     */
    public SayHelloResponse createSayHelloResponse() {
        return new SayHelloResponse();
    }

    /**
     * Create an instance of {@link SayHello }
     * 
     */
    public SayHello createSayHello() {
        return new SayHello();
    }

    /**
     * Create an instance of {@link SayHello2 }
     * 
     */
    public SayHello2 createSayHello2() {
        return new SayHello2();
    }

    /**
     * Create an instance of {@link SayHello2Response }
     * 
     */
    public SayHello2Response createSayHello2Response() {
        return new SayHello2Response();
    }

    /**
     * Create an instance of {@link HelloException }
     * 
     */
    public HelloException createHelloException() {
        return new HelloException();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SayHello2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.study.azuki3.com/", name = "sayHello2")
    public JAXBElement<SayHello2> createSayHello2(SayHello2 value) {
        return new JAXBElement<SayHello2>(_SayHello2_QNAME, SayHello2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Exception }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.study.azuki3.com/", name = "Exception")
    public JAXBElement<Exception> createException(Exception value) {
        return new JAXBElement<Exception>(_Exception_QNAME, Exception.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SayHello2Response }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.study.azuki3.com/", name = "sayHello2Response")
    public JAXBElement<SayHello2Response> createSayHello2Response(SayHello2Response value) {
        return new JAXBElement<SayHello2Response>(_SayHello2Response_QNAME, SayHello2Response.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SayHello3 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.study.azuki3.com/", name = "sayHello3")
    public JAXBElement<SayHello3> createSayHello3(SayHello3 value) {
        return new JAXBElement<SayHello3>(_SayHello3_QNAME, SayHello3 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HelloException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.study.azuki3.com/", name = "HelloException")
    public JAXBElement<HelloException> createHelloException(HelloException value) {
        return new JAXBElement<HelloException>(_HelloException_QNAME, HelloException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SayHello }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.study.azuki3.com/", name = "sayHello")
    public JAXBElement<SayHello> createSayHello(SayHello value) {
        return new JAXBElement<SayHello>(_SayHello_QNAME, SayHello.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SayHelloResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.study.azuki3.com/", name = "sayHelloResponse")
    public JAXBElement<SayHelloResponse> createSayHelloResponse(SayHelloResponse value) {
        return new JAXBElement<SayHelloResponse>(_SayHelloResponse_QNAME, SayHelloResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SayHello3Response }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.study.azuki3.com/", name = "sayHello3Response")
    public JAXBElement<SayHello3Response> createSayHello3Response(SayHello3Response value) {
        return new JAXBElement<SayHello3Response>(_SayHello3Response_QNAME, SayHello3Response.class, null, value);
    }

}
