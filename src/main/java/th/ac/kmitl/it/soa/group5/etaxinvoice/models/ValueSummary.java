package th.ac.kmitl.it.soa.group5.etaxinvoice.models;

public class ValueSummary {
    private float lineTotalAmount;
    private float taxBasisTotalAmount;
    private float taxTotalAmount;
    private float grandTotalAmount;
    private float allowanceTotalAmount;
    private float chargeTotalAmount;

    public ValueSummary() {
    }

    public float getLineTotalAmount() {
        return lineTotalAmount;
    }

    public void setLineTotalAmount(float lineTotalAmount) {
        this.lineTotalAmount = lineTotalAmount;
    }

    public float getTaxBasisTotalAmount() {
        return taxBasisTotalAmount;
    }

    public void setTaxBasisTotalAmount(float taxBasisTotalAmount) {
        this.taxBasisTotalAmount = taxBasisTotalAmount;
    }

    public float getTaxTotalAmount() {
        return taxTotalAmount;
    }

    public void setTaxTotalAmount(float taxTotalAmount) {
        this.taxTotalAmount = taxTotalAmount;
    }

    public float getGrandTotalAmount() {
        return grandTotalAmount;
    }

    public void setGrandTotalAmount(float grandTotalAmount) {
        this.grandTotalAmount = grandTotalAmount;
    }

    public float getAllowanceTotalAmount() {
        return allowanceTotalAmount;
    }

    public void setAllowanceTotalAmount(float allowanceTotalAmount) {
        this.allowanceTotalAmount = allowanceTotalAmount;
    }

    public float getChargeTotalAmount() {
        return chargeTotalAmount;
    }

    public void setChargeTotalAmount(float chargeTotalAmount) {
        this.chargeTotalAmount = chargeTotalAmount;
    }
}
