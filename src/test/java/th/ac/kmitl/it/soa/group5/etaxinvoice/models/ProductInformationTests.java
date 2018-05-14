package th.ac.kmitl.it.soa.group5.etaxinvoice.models;

import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ProductInformationTests {

    private String productID = "productID";
    private String productGlobalID = "productGlobalID";
    private String productDetails = "productDetails";
    private String batchID = "batchID";
    private String expiryDate = "03/06/2018";
    private String originCITradeCountry = "123.0";
    private String informationCISubject = "informationCISubject";
    private String informationCIContent = "informationCIContent";

    @Test
    public void getValueFromProductInformation() {
        ProductInformation.Builder builder = new ProductInformation.Builder();
        ProductInformation productInformation = builder
                .productID(this.productID)
                .productGlobalID(this.productGlobalID)
                .productDetails(this.productDetails)
                .batchID(this.batchID)
                .expiryDate(this.expiryDate)
                .originCITradeCountry(this.originCITradeCountry)
                .informationCISubject(this.informationCISubject)
                .informationCIContent(this.informationCIContent)
                .build();

        assertEquals(this.productID, productInformation.productID);
        assertEquals(this.productGlobalID, productInformation.productGlobalID);
        assertEquals(this.productDetails, productInformation.productDetails);
        assertEquals(this.batchID, productInformation.batchID);
        assertEquals(this.expiryDate, productInformation.expiryDate);
        assertEquals(this.originCITradeCountry, productInformation.originCITradeCountry);
        assertEquals(this.informationCISubject, productInformation.informationCISubject);
        assertEquals(this.informationCIContent, productInformation.informationCIContent);
    }
}