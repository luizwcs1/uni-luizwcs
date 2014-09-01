
package br.com.curso.webservices.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "inserirCpf", namespace = "http://webservices.curso.com.br/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "inserirCpf", namespace = "http://webservices.curso.com.br/")
public class InserirCpf {

    @XmlElement(name = "cpf", namespace = "")
    private String cpf;

    /**
     * 
     * @return
     *     returns String
     */
    public String getCpf() {
        return this.cpf;
    }

    /**
     * 
     * @param cpf
     *     the value for the cpf property
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

}
