package th.ac.kmitl.it.soa.group5.etaxinvoice.forms;

import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class IssuerFormTest {

    private String issuerID = "PQRST12345";
    private String globalID = "ABC123";
    private String issuerName = "Natcha";
    private String taxPayerID = "123456789012300000";
    private String issuerPostCode = "10200";

    @Test
    public void getValueInfoOfIssuerForm() {
        IssuerForm issuerForm = new IssuerForm.Builder()
                .issuerID(this.issuerID)
                .globalID(this.globalID)
                .issuerName(this.issuerName)
                .taxPayerID(this.taxPayerID)
                .issuerPostCode(this.issuerPostCode)
                .build();

        assertEquals(this.issuerID, issuerForm.issuerID);
        assertEquals(this.globalID, issuerForm.globalID);
        assertEquals(this.issuerName, issuerForm.issuerName);
        assertEquals(this.taxPayerID, issuerForm.taxPayerID);
        assertEquals(this.issuerPostCode, issuerForm.issuerPostCode);
    }
}