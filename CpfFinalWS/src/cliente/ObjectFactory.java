
package cliente;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the cliente package. 
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

    private final static QName _CPF_QNAME = new QName("http://controle/", "CPF");
    private final static QName _CPFResponse_QNAME = new QName("http://controle/", "CPFResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: cliente
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CPF }
     * 
     */
    public CPF createCPF() {
        return new CPF();
    }

    /**
     * Create an instance of {@link CPFResponse }
     * 
     */
    public CPFResponse createCPFResponse() {
        return new CPFResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CPF }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://controle/", name = "CPF")
    public JAXBElement<CPF> createCPF(CPF value) {
        return new JAXBElement<CPF>(_CPF_QNAME, CPF.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CPFResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://controle/", name = "CPFResponse")
    public JAXBElement<CPFResponse> createCPFResponse(CPFResponse value) {
        return new JAXBElement<CPFResponse>(_CPFResponse_QNAME, CPFResponse.class, null, value);
    }

}
