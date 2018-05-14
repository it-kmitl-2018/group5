package th.ac.kmitl.it.soa.group5.etaxinvoice.forms;

import lombok.experimental.Builder;

@Builder(builderClassName = "Builder")
public class NetValueForm {

    public float totalProductValue;
    public float discount;
    public float charge;
    public float vatRate;

    public NetValueForm() {
    }

    public NetValueForm(float totalProductValue, float discount, float charge, float vatRate) {
        this.totalProductValue = totalProductValue;
        this.discount = discount;
        this.charge = charge;
        this.vatRate = vatRate;
    }
}