
package cliente;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "EchoCPF", targetNamespace = "http://controle/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface EchoCPF {


    /**
     * 
     */
    @WebMethod(operationName = "CPF")
    @RequestWrapper(localName = "CPF", targetNamespace = "http://controle/", className = "cliente.CPF")
    @ResponseWrapper(localName = "CPFResponse", targetNamespace = "http://controle/", className = "cliente.CPFResponse")
    @Action(input = "http://controle/EchoCPF/CPFRequest", output = "http://controle/EchoCPF/CPFResponse")
    public void cpf();

}