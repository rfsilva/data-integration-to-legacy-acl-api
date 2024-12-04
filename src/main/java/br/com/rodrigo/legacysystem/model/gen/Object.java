//
// Este arquivo foi gerado pela Eclipse Implementation of JAXB, v3.0.0 
// Consulte https://eclipse-ee4j.github.io/jaxb-ri 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2024.12.03 às 05:55:49 PM BRT 
//


package br.com.rodrigo.legacysystem.model.gen;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de object complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="object"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="correlationId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="mainData" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="option" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="conversionStatus" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="channel" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="stepCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="networkIpAddress" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "object", propOrder = {
    "description",
    "correlationId",
    "mainData",
    "option",
    "conversionStatus",
    "channel",
    "stepCode",
    "networkIpAddress"
})
public class Object {

    @XmlElement(required = true)
    protected String description;
    @XmlElement(required = true)
    protected String correlationId;
    @XmlElement(required = true)
    protected String mainData;
    @XmlElement(required = true)
    protected String option;
    @XmlElement(required = true)
    protected String conversionStatus;
    @XmlElement(required = true)
    protected String channel;
    @XmlElement(required = true)
    protected String stepCode;
    @XmlElement(required = true)
    protected String networkIpAddress;

    /**
     * Obtém o valor da propriedade description.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Define o valor da propriedade description.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Obtém o valor da propriedade correlationId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorrelationId() {
        return correlationId;
    }

    /**
     * Define o valor da propriedade correlationId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorrelationId(String value) {
        this.correlationId = value;
    }

    /**
     * Obtém o valor da propriedade mainData.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMainData() {
        return mainData;
    }

    /**
     * Define o valor da propriedade mainData.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMainData(String value) {
        this.mainData = value;
    }

    /**
     * Obtém o valor da propriedade option.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOption() {
        return option;
    }

    /**
     * Define o valor da propriedade option.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOption(String value) {
        this.option = value;
    }

    /**
     * Obtém o valor da propriedade conversionStatus.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConversionStatus() {
        return conversionStatus;
    }

    /**
     * Define o valor da propriedade conversionStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConversionStatus(String value) {
        this.conversionStatus = value;
    }

    /**
     * Obtém o valor da propriedade channel.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChannel() {
        return channel;
    }

    /**
     * Define o valor da propriedade channel.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChannel(String value) {
        this.channel = value;
    }

    /**
     * Obtém o valor da propriedade stepCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStepCode() {
        return stepCode;
    }

    /**
     * Define o valor da propriedade stepCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStepCode(String value) {
        this.stepCode = value;
    }

    /**
     * Obtém o valor da propriedade networkIpAddress.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNetworkIpAddress() {
        return networkIpAddress;
    }

    /**
     * Define o valor da propriedade networkIpAddress.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNetworkIpAddress(String value) {
        this.networkIpAddress = value;
    }

}
