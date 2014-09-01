
package br.com.curso.webservices.cliente;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.com.curso.webservices.cliente package. 
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

    private final static QName _ProcuraCpfResponse_QNAME = new QName("http://webservices.curso.com.br/", "procuraCpfResponse");
    private final static QName _InserirCpf_QNAME = new QName("http://webservices.curso.com.br/", "inserirCpf");
    private final static QName _ProcuraCpf_QNAME = new QName("http://webservices.curso.com.br/", "procuraCpf");
    private final static QName _InserirCpfResponse_QNAME = new QName("http://webservices.curso.com.br/", "inserirCpfResponse");
    private final static QName _ExcluirCpfResponse_QNAME = new QName("http://webservices.curso.com.br/", "excluirCpfResponse");
    private final static QName _ExcluirCpf_QNAME = new QName("http://webservices.curso.com.br/", "excluirCpf");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.com.curso.webservices.cliente
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link InserirCpf }
     * 
     */
    public InserirCpf createInserirCpf() {
        return new InserirCpf();
    }

    /**
     * Create an instance of {@link ProcuraCpf }
     * 
     */
    public ProcuraCpf createProcuraCpf() {
        return new ProcuraCpf();
    }

    /**
     * Create an instance of {@link ProcuraCpfResponse }
     * 
     */
    public ProcuraCpfResponse createProcuraCpfResponse() {
        return new ProcuraCpfResponse();
    }

    /**
     * Create an instance of {@link ExcluirCpf }
     * 
     */
    public ExcluirCpf createExcluirCpf() {
        return new ExcluirCpf();
    }

    /**
     * Create an instance of {@link InserirCpfResponse }
     * 
     */
    public InserirCpfResponse createInserirCpfResponse() {
        return new InserirCpfResponse();
    }

    /**
     * Create an instance of {@link ExcluirCpfResponse }
     * 
     */
    public ExcluirCpfResponse createExcluirCpfResponse() {
        return new ExcluirCpfResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProcuraCpfResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.curso.com.br/", name = "procuraCpfResponse")
    public JAXBElement<ProcuraCpfResponse> createProcuraCpfResponse(ProcuraCpfResponse value) {
        return new JAXBElement<ProcuraCpfResponse>(_ProcuraCpfResponse_QNAME, ProcuraCpfResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InserirCpf }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.curso.com.br/", name = "inserirCpf")
    public JAXBElement<InserirCpf> createInserirCpf(InserirCpf value) {
        return new JAXBElement<InserirCpf>(_InserirCpf_QNAME, InserirCpf.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProcuraCpf }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.curso.com.br/", name = "procuraCpf")
    public JAXBElement<ProcuraCpf> createProcuraCpf(ProcuraCpf value) {
        return new JAXBElement<ProcuraCpf>(_ProcuraCpf_QNAME, ProcuraCpf.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InserirCpfResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.curso.com.br/", name = "inserirCpfResponse")
    public JAXBElement<InserirCpfResponse> createInserirCpfResponse(InserirCpfResponse value) {
        return new JAXBElement<InserirCpfResponse>(_InserirCpfResponse_QNAME, InserirCpfResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExcluirCpfResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.curso.com.br/", name = "excluirCpfResponse")
    public JAXBElement<ExcluirCpfResponse> createExcluirCpfResponse(ExcluirCpfResponse value) {
        return new JAXBElement<ExcluirCpfResponse>(_ExcluirCpfResponse_QNAME, ExcluirCpfResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExcluirCpf }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.curso.com.br/", name = "excluirCpf")
    public JAXBElement<ExcluirCpf> createExcluirCpf(ExcluirCpf value) {
        return new JAXBElement<ExcluirCpf>(_ExcluirCpf_QNAME, ExcluirCpf.class, null, value);
    }

}
