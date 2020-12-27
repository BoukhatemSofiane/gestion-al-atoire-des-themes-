
package com.projetserviceweb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour ajtEtud complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="ajtEtud">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nomEtud" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="prenomEtud" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="emailEtud" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numTeleEtud" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="username" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mdpEtud" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="addresEtud" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DateEtud" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="path" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ajtEtud", propOrder = {
    "nomEtud",
    "prenomEtud",
    "emailEtud",
    "numTeleEtud",
    "username",
    "mdpEtud",
    "addresEtud",
    "dateEtud",
    "path"
})
public class AjtEtud {

    protected String nomEtud;
    protected String prenomEtud;
    protected String emailEtud;
    protected String numTeleEtud;
    protected String username;
    protected String mdpEtud;
    protected String addresEtud;
    @XmlElement(name = "DateEtud")
    protected String dateEtud;
    protected String path;

    /**
     * Obtient la valeur de la propriété nomEtud.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomEtud() {
        return nomEtud;
    }

    /**
     * Définit la valeur de la propriété nomEtud.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomEtud(String value) {
        this.nomEtud = value;
    }

    /**
     * Obtient la valeur de la propriété prenomEtud.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrenomEtud() {
        return prenomEtud;
    }

    /**
     * Définit la valeur de la propriété prenomEtud.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrenomEtud(String value) {
        this.prenomEtud = value;
    }

    /**
     * Obtient la valeur de la propriété emailEtud.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailEtud() {
        return emailEtud;
    }

    /**
     * Définit la valeur de la propriété emailEtud.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailEtud(String value) {
        this.emailEtud = value;
    }

    /**
     * Obtient la valeur de la propriété numTeleEtud.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumTeleEtud() {
        return numTeleEtud;
    }

    /**
     * Définit la valeur de la propriété numTeleEtud.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumTeleEtud(String value) {
        this.numTeleEtud = value;
    }

    /**
     * Obtient la valeur de la propriété username.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsername() {
        return username;
    }

    /**
     * Définit la valeur de la propriété username.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsername(String value) {
        this.username = value;
    }

    /**
     * Obtient la valeur de la propriété mdpEtud.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMdpEtud() {
        return mdpEtud;
    }

    /**
     * Définit la valeur de la propriété mdpEtud.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMdpEtud(String value) {
        this.mdpEtud = value;
    }

    /**
     * Obtient la valeur de la propriété addresEtud.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddresEtud() {
        return addresEtud;
    }

    /**
     * Définit la valeur de la propriété addresEtud.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddresEtud(String value) {
        this.addresEtud = value;
    }

    /**
     * Obtient la valeur de la propriété dateEtud.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateEtud() {
        return dateEtud;
    }

    /**
     * Définit la valeur de la propriété dateEtud.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateEtud(String value) {
        this.dateEtud = value;
    }

    /**
     * Obtient la valeur de la propriété path.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPath() {
        return path;
    }

    /**
     * Définit la valeur de la propriété path.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPath(String value) {
        this.path = value;
    }

}
