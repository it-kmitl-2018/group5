package th.ac.kmitl.it.soa.group5.etaxinvoice;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import th.ac.kmitl.it.soa.group5.etaxinvoice.models.ProductInformation;

import java.util.Calendar;
import java.util.GregorianCalendar;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductInformationTests {

    private String ciProductInformation = "ciProductInformation";
    private String productID = "productID";
    private String productGlobalID = "productGlobalID";
    private String productDetails = "productDetails";
    private String batchID = "batchID";
    private String productInstance = "productInstance";
    private Calendar expiryDate = new GregorianCalendar(2018,2,18);
    private String originCITradeCountry = "originCITradeCountry";
    private String originCITradeCountryId = "123.0";
    private String ciNote = "ciNote";
    private String informationCISubject = "informationCISubject";
    private String informationCIContent = "informationCIContent";

    @Test
    public void allInputInformationPass() {
        ProductInformation productInformation = new ProductInformation();
        productInformation.setCiProductInformation(this.ciProductInformation);
        productInformation.setProductID(this.productID);
        productInformation.setProductGlobalID(this.productGlobalID);
        productInformation.setProductDetails(this.productDetails);
        productInformation.setBatchID(this.batchID);
        productInformation.setProductInstance(this.productInstance);
        productInformation.setExpiryDate(this.expiryDate);
        productInformation.setOriginCITradeCountry(this.originCITradeCountry);
        productInformation.setOriginCITradeCountryId(this.originCITradeCountryId);
        productInformation.setCiNote(this.ciNote);
        productInformation.setInformationCISubject(this.informationCISubject);
        productInformation.setInformationCIContent(this.informationCIContent);

        assertEquals(ciProductInformation, productInformation.getCiProductInformation());
        assertEquals(productID, productInformation.getProductID());
        assertEquals(productGlobalID, productInformation.getProductGlobalID());
        assertEquals(productDetails, productInformation.getProductDetails());
        assertEquals(batchID, productInformation.getBatchID());
        assertEquals(productInstance, productInformation.getProductInstance());
        assertEquals(expiryDate, productInformation.getExpiryDate());
        assertEquals(originCITradeCountry, productInformation.getOriginCITradeCountry());
        assertEquals(originCITradeCountryId, productInformation.getOriginCITradeCountryId());
        assertEquals(ciNote, productInformation.getCiNote());
        assertEquals(informationCISubject, productInformation.getInformationCISubject());
        assertEquals(informationCIContent, productInformation.getInformationCIContent());
    }
}