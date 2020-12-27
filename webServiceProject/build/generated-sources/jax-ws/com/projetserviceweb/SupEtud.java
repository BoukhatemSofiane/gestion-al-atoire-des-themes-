
package com.projetserviceweb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour supEtud complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="supEtud">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="selectedTheme" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "supEtud", propOrder = {
    "selectedTheme"
})
public class SupEtud {

    protected String selectedTheme;

    /**
     * Obtient la valeur de la propriété selectedTheme.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSelectedTheme() {
        return selectedTheme;
    }

    /**
     * Définit la valeur de la propriété selectedTheme.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSelectedTheme(String value) {
        this.selectedTheme = value;
    }

}
