package th.ac.kmitl.it.soa.group5.etaxinvoice.usecases;

public class NetValueCalculate {
    // TODO

    NetValueCalculate netVal = new NetValueCalculate();
    float totalProductValue = netVal.totalProductValue();
    float discountCalculate = netVal.discountCalculate();
    float chargeCalculate = netVal.chargeCalculate();
    float vatRate = netVal.vatRate();
    float netAmountNoneVat = netVal.netAmountNoneVat();
    float vat = netVal.vat();
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

    public float netAmountNoneVat() {
        float netAmountNoneVat = (totalProductValue - discountCalculate) + chargeCalculate;
        return netAmountNoneVat;
    }

    public float vat() {
        float vat = (vatRate * netAmountNoneVat)/100;
        return vat;
    }

    public float netValueCalculate() {
        float netValueCalculate = netAmountNoneVat + vat;
        return netValueCalculate;
    }
}