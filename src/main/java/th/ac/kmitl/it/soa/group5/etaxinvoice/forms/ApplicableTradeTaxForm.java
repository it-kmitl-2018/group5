package th.ac.kmitl.it.soa.group5.etaxinvoice.forms;

import lombok.experimental.Builder;

@Builder(builderClassName = "Builder")
public class ApplicableTradeTaxForm {

    public String typeCode;
    public float calculatedRate;
    public float basisAmount;
    public float calculatedAmount;

    public ApplicableTradeTaxForm() {
    }

    public ApplicableTradeTaxForm(String typeCode, float calculatedRate, float basisAmount, float calculatedAmount) {
        this.typeCode = typeCode;
        this.calculatedRate = calculatedRate;
        this.basisAmount = basisAmount;
        this.calculatedAmount = calculatedAmount;
    }
}
