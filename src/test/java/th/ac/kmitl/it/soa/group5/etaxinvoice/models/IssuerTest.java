package th.ac.kmitl.it.soa.group5.etaxinvoice.models;

import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

public class IssuerTest {

    private String issuerID = "PQRST12345";
    private String globallID = "ABC123";
    private String issuerName = "Natcha";
    private String taxPayerID = "123456789012300000";
    private String issuerPostCode = "10200";
    
    @Test
    public void getValueFromIssuerModel() {

        Issuer.Builder builder = new Issuer.Builder();
        Issuer issuer = builder
                .issuerID(this.issuerID)
                .globallID(this.globallID)
                .issuerName(this.issuerName)
                .taxPayerID(this.taxPayerID)
                .issuerPostCode(this.issuerPostCode)
                .build();

        assertEquals(this.issuerID, issuer.issuerID);
        assertEquals(this.globallID, issuer.globallID);
        assertEquals(this.issuerName, issuer.issuerName);
        assertEquals(this.taxPayerID, issuer.taxPayerID);
        assertEquals(this.issuerPostCode, issuer.issuerPostCode);
    }
}