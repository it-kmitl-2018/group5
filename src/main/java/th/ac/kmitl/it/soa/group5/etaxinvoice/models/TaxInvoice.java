package th.ac.kmitl.it.soa.group5.etaxinvoice.models;

import lombok.experimental.Builder;

@Builder(builderClassName = "Builder")
public class TaxInvoice {

    public String typeCode;
    public float calculatedRate;
    public float basisAmount;
    public float calculatedAmount;

}