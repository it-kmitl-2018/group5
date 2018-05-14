package th.ac.kmitl.it.soa.group5.etaxinvoice.usecases;

public class NetValueCalculate {
    // TODO

    NetValueCalculate netVal = new NetValueCalculate();
    float totalProductValue = netVal.totalProductValue();
    float discountCalculate = netVal.discountCalculate();
    float chargeCalculate = netVal.chargeCalculate();
    float vatRate = netVal.vatRate();
    float netAmountNoneVatCalculate = netVal.netAmountNoneVatCalculate();
    float vatCalculate = netVal.vatCalculate();
    float netValueCalculate = netVal.netValueCalculate();

    public float totalProductValue() {
        //TODO
        float totalproductValue = 0;
        return totalproductValue;
    }

    public float discountCalculate() {
        // TODO
        float discount = 0;
        float discountCal = (discount * totalProductValue)/100;
        return discountCal;
    }

    public float chargeCalculate() {
        // TODO
        float charge = 0;
        float chargeCal = (charge * totalProductValue)/100;
        return chargeCal;
    }

    public float vatRate() {
        //TODO
        float vatRate = 0;
        return vatRate;
    }

    public float netAmountNoneVatCalculate() {
        float netAmountNoneVatCal = (totalProductValue - discountCalculate) + chargeCalculate;
        return netAmountNoneVatCal;
    }

    public float vatCalculate() {
        float vatCal = (vatRate * netAmountNoneVatCalculate)/100;
        return vatCal;
    }

    public float netValueCalculate() {
        float netValueCalculate = netAmountNoneVatCalculate + vatCalculate;
        return netValueCalculate;
    }
}