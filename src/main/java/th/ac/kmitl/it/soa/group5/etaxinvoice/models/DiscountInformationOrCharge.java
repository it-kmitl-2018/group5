package th.ac.kmitl.it.soa.group5.etaxinvoice.models;

import lombok.Data;

@Data
public class DiscountInformationOrCharge {

    public boolean chargeIndicator;
    public float actualAmount;
    public String reasonOfDiscountOrCharge;
    public String reasonOfDiscountOrChargeCode;
}