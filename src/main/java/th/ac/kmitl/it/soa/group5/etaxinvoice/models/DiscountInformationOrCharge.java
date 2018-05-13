package th.ac.kmitl.it.soa.group5.etaxinvoice.models;

import lombok.experimental.Builder;

@Builder(builderClassName = "Builder")
public class DiscountInformationOrCharge {

    public boolean chargeIndicator;
    public float actualAmount;
    public String reasonOfDiscountOrCharge;
    public String reasonOfDiscountOrChargeCode;
}