package th.ac.kmitl.it.soa.group5.etaxinvoice.models;

public class ProductInformation {
    public String productID;
    public String productGlobalID;
    public String productDetails;
    public String batchID;
    public String expiryDate;
    public String originCITradeCountry;
    public String informationCISubject;
    public String informationCIContent;

    public ProductInformation(){
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

    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
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
