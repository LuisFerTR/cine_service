//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.2 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.10.17 a las 09:04:29 PM CDT 
//


package com.cine.salaService.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Sala" type="{http://com.cine}Sala"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "sala"
})
@XmlRootElement(name = "salaCreator")
public class SalaCreator {

    @XmlElement(name = "Sala", required = true)
    protected Sala sala;

    /**
     * Obtiene el valor de la propiedad sala.
     * 
     * @return
     *     possible object is
     *     {@link Sala }
     *     
     */
    public Sala getSala() {
        return sala;
    }

    /**
     * Define el valor de la propiedad sala.
     * 
     * @param value
     *     allowed object is
     *     {@link Sala }
     *     
     */
    public void setSala(Sala value) {
        this.sala = value;
    }

}
