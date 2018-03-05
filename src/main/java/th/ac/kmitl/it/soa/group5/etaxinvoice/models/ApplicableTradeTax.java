package th.ac.kmitl.it.soa.group5.etaxinvoice.models;

public class ApplicableTradeTax {

    public String typeCode;
    public float calculatedRate;
    public float basisAmount;
    public float calculatedAmount;

    public ApplicableTradeTax() {
    }

    public String getTypeCode() {
        return typeCode;
    }

    public void setTypeCode(String typeCode) {
        this.typeCode = typeCode;
    }

    public float getCalculatedRate() {
        return calculatedRate;
    }

    public void setCalculatedRate(float calculatedRate) {
        this.calculatedRate = calculatedRate;
    }

    public float getBasisAmount() {
        return basisAmount;
    }

    public void setBasisAmount(float basisAmount) {
        this.basisAmount = basisAmount;
    }

    public float getCalculatedAmount() {
        return calculatedAmount;
    }

    public void setCalculatedAmount(float calculatedAmount) {
        this.calculatedAmount = calculatedAmount;
    }
}