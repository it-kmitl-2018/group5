package th.ac.kmitl.it.soa.group5.etaxinvoice;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import th.ac.kmitl.it.soa.group5.etaxinvoice.models.ProductInformation;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
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
    public void allInputInformationPass() {
        ProductInformation productInformation = new ProductInformation();
        productInformation.setProductID(this.productID);
        productInformation.setProductGlobalID(this.productGlobalID);
        productInformation.setProductDetails(this.productDetails);
        productInformation.setBatchID(this.batchID);
        productInformation.setExpiryDate(this.expiryDate);
        productInformation.setOriginCITradeCountry(this.originCITradeCountry);
        productInformation.setInformationCISubject(this.informationCISubject);
        productInformation.setInformationCIContent(this.informationCIContent);

        assertEquals(productID, productInformation.getProductID());
        assertEquals(productGlobalID, productInformation.getProductGlobalID());
        assertEquals(productDetails, productInformation.getProductDetails());
        assertEquals(batchID, productInformation.getBatchID());
        assertEquals(expiryDate, productInformation.getExpiryDate());
        assertEquals(originCITradeCountry, productInformation.getOriginCITradeCountry());
        assertEquals(informationCISubject, productInformation.getInformationCISubject());
        assertEquals(informationCIContent, productInformation.getInformationCIContent());
    }
}