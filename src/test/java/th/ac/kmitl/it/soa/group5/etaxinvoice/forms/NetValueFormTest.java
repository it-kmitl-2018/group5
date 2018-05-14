package th.ac.kmitl.it.soa.group5.etaxinvoice.forms;

import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class NetValueFormTest {

    private float totalProductValue = (float) 100.00;
    private float discount = (float) 4.00;
    private float charge = (float) 8.00;
    private float vatRate = (float) 7.00;

    @Test
    public void getValueFromNetValueFrom() {
        NetValueForm netValueForm = new NetValueForm.Builder()
                .totalProductValue(this.totalProductValue)
                .discount(this.discount)
                .charge(this.charge)
                .vatRate(this.vatRate)
                .build();

        assertEquals(this.totalProductValue, netValueForm.totalProductValue);
        assertEquals(this.discount, netValueForm.discount);
        assertEquals(this.charge, netValueForm.charge);
        assertEquals(this.vatRate, netValueForm.vatRate);
    }
}