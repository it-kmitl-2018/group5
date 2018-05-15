package th.ac.kmitl.it.soa.group5.etaxinvoice.models;

import lombok.experimental.Builder;

@Builder(builderClassName = "Builder")
public class ProductInformation {

    public String productID;
    public String productGlobalID;
    public String productDetails;
    public String batchID;
    public String expiryDate;
    public String originCITradeCountry;
    public String informationCISubject;
    public String informationCIContent;
}
