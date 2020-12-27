
package com.projetserviceweb;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.projetserviceweb package. 
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

    private final static QName _GettheRightQuery_QNAME = new QName("http://projetServiceWeb.com/", "gettheRightQuery");
    private final static QName _AjtEtudResponse_QNAME = new QName("http://projetServiceWeb.com/", "ajtEtudResponse");
    private final static QName _UpdatequeryResponse_QNAME = new QName("http://projetServiceWeb.com/", "updatequeryResponse");
    private final static QName _Updatequery_QNAME = new QName("http://projetServiceWeb.com/", "updatequery");
    private final static QName _SupEtud_QNAME = new QName("http://projetServiceWeb.com/", "supEtud");
    private final static QName _ExcutetequeryResponse_QNAME = new QName("http://projetServiceWeb.com/", "excutetequeryResponse");
    private final static QName _AjtEtud_QNAME = new QName("http://projetServiceWeb.com/", "ajtEtud");
    private final static QName _Excutetequery_QNAME = new QName("http://projetServiceWeb.com/", "excutetequery");
    private final static QName _SupEtudResponse_QNAME = new QName("http://projetServiceWeb.com/", "supEtudResponse");
    private final static QName _GetThecoordonne_QNAME = new QName("http://projetServiceWeb.com/", "getThecoordonne");
    private final static QName _GettheRightQueryResponse_QNAME = new QName("http://projetServiceWeb.com/", "gettheRightQueryResponse");
    private final static QName _TheQuery_QNAME = new QName("http://projetServiceWeb.com/", "theQuery");
    private final static QName _TheQueryResponse_QNAME = new QName("http://projetServiceWeb.com/", "theQueryResponse");
    private final static QName _GetThecoordonneResponse_QNAME = new QName("http://projetServiceWeb.com/", "getThecoordonneResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.projetserviceweb
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GettheRightQueryResponse }
     * 
     */
    public GettheRightQueryResponse createGettheRightQueryResponse() {
        return new GettheRightQueryResponse();
    }

    /**
     * Create an instance of {@link TheQuery }
     * 
     */
    public TheQuery createTheQuery() {
        return new TheQuery();
    }

    /**
     * Create an instance of {@link TheQueryResponse }
     * 
     */
    public TheQueryResponse createTheQueryResponse() {
        return new TheQueryResponse();
    }

    /**
     * Create an instance of {@link GetThecoordonneResponse }
     * 
     */
    public GetThecoordonneResponse createGetThecoordonneResponse() {
        return new GetThecoordonneResponse();
    }

    /**
     * Create an instance of {@link AjtEtud }
     * 
     */
    public AjtEtud createAjtEtud() {
        return new AjtEtud();
    }

    /**
     * Create an instance of {@link Excutetequery }
     * 
     */
    public Excutetequery createExcutetequery() {
        return new Excutetequery();
    }

    /**
     * Create an instance of {@link SupEtudResponse }
     * 
     */
    public SupEtudResponse createSupEtudResponse() {
        return new SupEtudResponse();
    }

    /**
     * Create an instance of {@link GetThecoordonne }
     * 
     */
    public GetThecoordonne createGetThecoordonne() {
        return new GetThecoordonne();
    }

    /**
     * Create an instance of {@link Updatequery }
     * 
     */
    public Updatequery createUpdatequery() {
        return new Updatequery();
    }

    /**
     * Create an instance of {@link SupEtud }
     * 
     */
    public SupEtud createSupEtud() {
        return new SupEtud();
    }

    /**
     * Create an instance of {@link ExcutetequeryResponse }
     * 
     */
    public ExcutetequeryResponse createExcutetequeryResponse() {
        return new ExcutetequeryResponse();
    }

    /**
     * Create an instance of {@link GettheRightQuery }
     * 
     */
    public GettheRightQuery createGettheRightQuery() {
        return new GettheRightQuery();
    }

    /**
     * Create an instance of {@link AjtEtudResponse }
     * 
     */
    public AjtEtudResponse createAjtEtudResponse() {
        return new AjtEtudResponse();
    }

    /**
     * Create an instance of {@link UpdatequeryResponse }
     * 
     */
    public UpdatequeryResponse createUpdatequeryResponse() {
        return new UpdatequeryResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GettheRightQuery }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://projetServiceWeb.com/", name = "gettheRightQuery")
    public JAXBElement<GettheRightQuery> createGettheRightQuery(GettheRightQuery value) {
        return new JAXBElement<GettheRightQuery>(_GettheRightQuery_QNAME, GettheRightQuery.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AjtEtudResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://projetServiceWeb.com/", name = "ajtEtudResponse")
    public JAXBElement<AjtEtudResponse> createAjtEtudResponse(AjtEtudResponse value) {
        return new JAXBElement<AjtEtudResponse>(_AjtEtudResponse_QNAME, AjtEtudResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdatequeryResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://projetServiceWeb.com/", name = "updatequeryResponse")
    public JAXBElement<UpdatequeryResponse> createUpdatequeryResponse(UpdatequeryResponse value) {
        return new JAXBElement<UpdatequeryResponse>(_UpdatequeryResponse_QNAME, UpdatequeryResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Updatequery }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://projetServiceWeb.com/", name = "updatequery")
    public JAXBElement<Updatequery> createUpdatequery(Updatequery value) {
        return new JAXBElement<Updatequery>(_Updatequery_QNAME, Updatequery.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SupEtud }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://projetServiceWeb.com/", name = "supEtud")
    public JAXBElement<SupEtud> createSupEtud(SupEtud value) {
        return new JAXBElement<SupEtud>(_SupEtud_QNAME, SupEtud.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExcutetequeryResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://projetServiceWeb.com/", name = "excutetequeryResponse")
    public JAXBElement<ExcutetequeryResponse> createExcutetequeryResponse(ExcutetequeryResponse value) {
        return new JAXBElement<ExcutetequeryResponse>(_ExcutetequeryResponse_QNAME, ExcutetequeryResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AjtEtud }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://projetServiceWeb.com/", name = "ajtEtud")
    public JAXBElement<AjtEtud> createAjtEtud(AjtEtud value) {
        return new JAXBElement<AjtEtud>(_AjtEtud_QNAME, AjtEtud.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Excutetequery }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://projetServiceWeb.com/", name = "excutetequery")
    public JAXBElement<Excutetequery> createExcutetequery(Excutetequery value) {
        return new JAXBElement<Excutetequery>(_Excutetequery_QNAME, Excutetequery.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SupEtudResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://projetServiceWeb.com/", name = "supEtudResponse")
    public JAXBElement<SupEtudResponse> createSupEtudResponse(SupEtudResponse value) {
        return new JAXBElement<SupEtudResponse>(_SupEtudResponse_QNAME, SupEtudResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetThecoordonne }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://projetServiceWeb.com/", name = "getThecoordonne")
    public JAXBElement<GetThecoordonne> createGetThecoordonne(GetThecoordonne value) {
        return new JAXBElement<GetThecoordonne>(_GetThecoordonne_QNAME, GetThecoordonne.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GettheRightQueryResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://projetServiceWeb.com/", name = "gettheRightQueryResponse")
    public JAXBElement<GettheRightQueryResponse> createGettheRightQueryResponse(GettheRightQueryResponse value) {
        return new JAXBElement<GettheRightQueryResponse>(_GettheRightQueryResponse_QNAME, GettheRightQueryResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TheQuery }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://projetServiceWeb.com/", name = "theQuery")
    public JAXBElement<TheQuery> createTheQuery(TheQuery value) {
        return new JAXBElement<TheQuery>(_TheQuery_QNAME, TheQuery.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TheQueryResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://projetServiceWeb.com/", name = "theQueryResponse")
    public JAXBElement<TheQueryResponse> createTheQueryResponse(TheQueryResponse value) {
        return new JAXBElement<TheQueryResponse>(_TheQueryResponse_QNAME, TheQueryResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetThecoordonneResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://projetServiceWeb.com/", name = "getThecoordonneResponse")
    public JAXBElement<GetThecoordonneResponse> createGetThecoordonneResponse(GetThecoordonneResponse value) {
        return new JAXBElement<GetThecoordonneResponse>(_GetThecoordonneResponse_QNAME, GetThecoordonneResponse.class, null, value);
    }

}
