package th.ac.kmitl.it.soa.group5.etaxinvoice.forms;

import lombok.experimental.Builder;

@Builder(builderClassName = "Builder")
public class IssuerForm {

    public String issuerID;
    public String globalID;
    public String issuerName;
    public String taxPayerID;
    public String issuerPostCode;

    public IssuerForm() {
    }

    public IssuerForm(String issuerID, String globalID, String issuerName,
                      String taxPayerID, String issuerPostCode) {
        this.issuerID = issuerID;
        this.globalID = globalID;
        this.issuerName = issuerName;
        this.taxPayerID = taxPayerID;
        this.issuerPostCode = issuerPostCode;
    }
}