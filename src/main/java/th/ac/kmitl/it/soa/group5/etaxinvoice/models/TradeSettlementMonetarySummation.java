package th.ac.kmitl.it.soa.group5.etaxinvoice.models;

import lombok.experimental.Builder;

@Builder(builderClassName = "Builder")
public class TradeSettlementMonetarySummation {
    
    public float lineTotalAmount;
    public float taxBasisTotalAmount;
    public float taxTotalAmount;
    public float grandTotalAmount;
    public float allowanceTotalAmount;
    public float chargeTotalAmount;
}
