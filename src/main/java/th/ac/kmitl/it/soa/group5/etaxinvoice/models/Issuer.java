package th.ac.kmitl.it.soa.group5.etaxinvoice.models;

import lombok.experimental.Builder;

@Builder(builderClassName = "Builder")
public class Issuer {
    public String issuerID;
    public String globalID;
    public String issuerName;
    public String taxPayerID;
    public String issuerPostCode;
}