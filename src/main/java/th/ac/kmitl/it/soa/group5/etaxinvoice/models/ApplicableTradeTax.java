package th.ac.kmitl.it.soa.group5.etaxinvoice.models;

import lombok.experimental.Builder;

@Builder(builderClassName = "Builder")
public class ApplicableTradeTax {

    public String typeCode;
    public float taxRate;
    public float valueExcludingTax;
    public float taxValue;
}