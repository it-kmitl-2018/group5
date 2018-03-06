package th.ac.kmitl.it.soa.group5.etaxinvoice.models;

import java.util.Calendar;

public class ProductInformation {

    public String ciProductInformation;
    public String productID;
    public String productGlobalID;
    public String productDetails;
    public String batchID;
    public String productInstance;
    public Calendar expiryDate;
    public String originCITradeCountry;
    public String originCITradeCountryId;
    public String ciNote;
    public String informationCISubject;
    public String informationCIContent;

    public ProductInformation(){
    }

    public String getCiProductInformation() {
        return ciProductInformation;
    }

    public void setCiProductInformation(String ciProductInformation) {
        this.ciProductInformation = ciProductInformation;
    }

    public String getProductInstance() {
        return productInstance;
    }

    public void setProductInstance(String productInstance) {
        this.productInstance = productInstance;
    }

    public String getOriginCITradeCountryId() {
        return originCITradeCountryId;
    }

    public void setOriginCITradeCountryId(String originCITradeCountryId) {
        this.originCITradeCountryId = originCITradeCountryId;
    }

    public String getCiNote() {
        return ciNote;
    }

    public void setCiNote(String ciNote) {
        this.ciNote = ciNote;
    }

    public String getProductID() {
        return productID;
    }

    public void setProductID(String productID) {
        this.productID = productID;
    }

    public String getProductGlobalID() {
        return productGlobalID;
    }

    public void setProductGlobalID(String productGlobalID) {
        this.productGlobalID = productGlobalID;
    }

    public String getProductDetails() {
        return productDetails;
    }

    public void setProductDetails(String productDetails) {
        this.productDetails = productDetails;
    }

    public String getBatchID() {
        return batchID;
    }

    public void setBatchID(String batchID) {
        this.batchID = batchID;
    }

    public Calendar getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(Calendar expiryDate) {
        this.expiryDate = expiryDate;
    }

    public String getOriginCITradeCountry() {
        return originCITradeCountry;
    }

    public void setOriginCITradeCountry(String originCITradeCountry) {
        this.originCITradeCountry = originCITradeCountry;
    }

    public String getInformationCISubject() {
        return informationCISubject;
    }

    public void setInformationCISubject(String informationCISubject) {
        this.informationCISubject = informationCISubject;
    }

    public String getInformationCIContent() {
        return informationCIContent;
    }

    public void setInformationCIContent(String informationCIContent) {
        this.informationCIContent = informationCIContent;
    }
}
