package th.ac.kmitl.it.soa.group5.etaxinvoice.models;

import org.joda.time.DateTime;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProductInformationTests {

    private String productId = "ABCDEFGHIJKLMNOPQRST123456789012345";
    private String productGlobalId = "12345678901234";
    private String productName = "Potato chips";
    private String productBatchId = "01234";
    private DateTime productExpiryDate = new DateTime( "2019-01-01T12:00:00+01:00" );

    @Test
    public void getValuesFromProductInformationModel() {

        ProductInformation.Builder builder = new ProductInformation.Builder();
        ProductInformation exdoc = builder
                .productId(this.productId)
                .productGlobalId(this.productGlobalId)
                .productName(this.productName)
                .productBatchId(this.productBatchId)
                .productExpiryDate(this.productExpiryDate)
                .build();

        assertEquals(this.productId, exdoc.productId);
        assertEquals(this.productGlobalId, exdoc.productGlobalId);
        assertEquals(this.productName, exdoc.productName);
        assertEquals(this.productBatchId, exdoc.productBatchId);
        assertEquals(this.productExpiryDate, exdoc.productExpiryDate);
    }
}
