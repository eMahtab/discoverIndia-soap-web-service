
package wsclient;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the wsclient package. 
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

    private final static QName _GetCapitalResponse_QNAME = new QName("http://ws.mahtabalam.net/", "getCapitalResponse");
    private final static QName _GetDistricts_QNAME = new QName("http://ws.mahtabalam.net/", "getDistricts");
    private final static QName _GetLanguagesResponse_QNAME = new QName("http://ws.mahtabalam.net/", "getLanguagesResponse");
    private final static QName _GetInterestingFacts_QNAME = new QName("http://ws.mahtabalam.net/", "getInterestingFacts");
    private final static QName _GetPlacesToVisitResponse_QNAME = new QName("http://ws.mahtabalam.net/", "getPlacesToVisitResponse");
    private final static QName _GetCapital_QNAME = new QName("http://ws.mahtabalam.net/", "getCapital");
    private final static QName _GetPlacesToVisit_QNAME = new QName("http://ws.mahtabalam.net/", "getPlacesToVisit");
    private final static QName _GetAirports_QNAME = new QName("http://ws.mahtabalam.net/", "getAirports");
    private final static QName _GetAirportsResponse_QNAME = new QName("http://ws.mahtabalam.net/", "getAirportsResponse");
    private final static QName _GetLanguages_QNAME = new QName("http://ws.mahtabalam.net/", "getLanguages");
    private final static QName _GetDistrictsResponse_QNAME = new QName("http://ws.mahtabalam.net/", "getDistrictsResponse");
    private final static QName _GetInterestingFactsResponse_QNAME = new QName("http://ws.mahtabalam.net/", "getInterestingFactsResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: wsclient
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetCapitalResponse }
     * 
     */
    public GetCapitalResponse createGetCapitalResponse() {
        return new GetCapitalResponse();
    }

    /**
     * Create an instance of {@link GetPlacesToVisitResponse }
     * 
     */
    public GetPlacesToVisitResponse createGetPlacesToVisitResponse() {
        return new GetPlacesToVisitResponse();
    }

    /**
     * Create an instance of {@link GetInterestingFacts }
     * 
     */
    public GetInterestingFacts createGetInterestingFacts() {
        return new GetInterestingFacts();
    }

    /**
     * Create an instance of {@link GetLanguagesResponse }
     * 
     */
    public GetLanguagesResponse createGetLanguagesResponse() {
        return new GetLanguagesResponse();
    }

    /**
     * Create an instance of {@link GetDistricts }
     * 
     */
    public GetDistricts createGetDistricts() {
        return new GetDistricts();
    }

    /**
     * Create an instance of {@link GetLanguages }
     * 
     */
    public GetLanguages createGetLanguages() {
        return new GetLanguages();
    }

    /**
     * Create an instance of {@link GetAirportsResponse }
     * 
     */
    public GetAirportsResponse createGetAirportsResponse() {
        return new GetAirportsResponse();
    }

    /**
     * Create an instance of {@link GetAirports }
     * 
     */
    public GetAirports createGetAirports() {
        return new GetAirports();
    }

    /**
     * Create an instance of {@link GetPlacesToVisit }
     * 
     */
    public GetPlacesToVisit createGetPlacesToVisit() {
        return new GetPlacesToVisit();
    }

    /**
     * Create an instance of {@link GetCapital }
     * 
     */
    public GetCapital createGetCapital() {
        return new GetCapital();
    }

    /**
     * Create an instance of {@link GetInterestingFactsResponse }
     * 
     */
    public GetInterestingFactsResponse createGetInterestingFactsResponse() {
        return new GetInterestingFactsResponse();
    }

    /**
     * Create an instance of {@link GetDistrictsResponse }
     * 
     */
    public GetDistrictsResponse createGetDistrictsResponse() {
        return new GetDistrictsResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCapitalResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mahtabalam.net/", name = "getCapitalResponse")
    public JAXBElement<GetCapitalResponse> createGetCapitalResponse(GetCapitalResponse value) {
        return new JAXBElement<GetCapitalResponse>(_GetCapitalResponse_QNAME, GetCapitalResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDistricts }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mahtabalam.net/", name = "getDistricts")
    public JAXBElement<GetDistricts> createGetDistricts(GetDistricts value) {
        return new JAXBElement<GetDistricts>(_GetDistricts_QNAME, GetDistricts.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetLanguagesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mahtabalam.net/", name = "getLanguagesResponse")
    public JAXBElement<GetLanguagesResponse> createGetLanguagesResponse(GetLanguagesResponse value) {
        return new JAXBElement<GetLanguagesResponse>(_GetLanguagesResponse_QNAME, GetLanguagesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetInterestingFacts }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mahtabalam.net/", name = "getInterestingFacts")
    public JAXBElement<GetInterestingFacts> createGetInterestingFacts(GetInterestingFacts value) {
        return new JAXBElement<GetInterestingFacts>(_GetInterestingFacts_QNAME, GetInterestingFacts.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPlacesToVisitResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mahtabalam.net/", name = "getPlacesToVisitResponse")
    public JAXBElement<GetPlacesToVisitResponse> createGetPlacesToVisitResponse(GetPlacesToVisitResponse value) {
        return new JAXBElement<GetPlacesToVisitResponse>(_GetPlacesToVisitResponse_QNAME, GetPlacesToVisitResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCapital }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mahtabalam.net/", name = "getCapital")
    public JAXBElement<GetCapital> createGetCapital(GetCapital value) {
        return new JAXBElement<GetCapital>(_GetCapital_QNAME, GetCapital.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPlacesToVisit }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mahtabalam.net/", name = "getPlacesToVisit")
    public JAXBElement<GetPlacesToVisit> createGetPlacesToVisit(GetPlacesToVisit value) {
        return new JAXBElement<GetPlacesToVisit>(_GetPlacesToVisit_QNAME, GetPlacesToVisit.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAirports }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mahtabalam.net/", name = "getAirports")
    public JAXBElement<GetAirports> createGetAirports(GetAirports value) {
        return new JAXBElement<GetAirports>(_GetAirports_QNAME, GetAirports.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAirportsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mahtabalam.net/", name = "getAirportsResponse")
    public JAXBElement<GetAirportsResponse> createGetAirportsResponse(GetAirportsResponse value) {
        return new JAXBElement<GetAirportsResponse>(_GetAirportsResponse_QNAME, GetAirportsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetLanguages }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mahtabalam.net/", name = "getLanguages")
    public JAXBElement<GetLanguages> createGetLanguages(GetLanguages value) {
        return new JAXBElement<GetLanguages>(_GetLanguages_QNAME, GetLanguages.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDistrictsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mahtabalam.net/", name = "getDistrictsResponse")
    public JAXBElement<GetDistrictsResponse> createGetDistrictsResponse(GetDistrictsResponse value) {
        return new JAXBElement<GetDistrictsResponse>(_GetDistrictsResponse_QNAME, GetDistrictsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetInterestingFactsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mahtabalam.net/", name = "getInterestingFactsResponse")
    public JAXBElement<GetInterestingFactsResponse> createGetInterestingFactsResponse(GetInterestingFactsResponse value) {
        return new JAXBElement<GetInterestingFactsResponse>(_GetInterestingFactsResponse_QNAME, GetInterestingFactsResponse.class, null, value);
    }

}
