package th.ac.kmitl.it.soa.group5.etaxinvoice.controllers;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ETaxInvoiceHeaderTest {

    @Autowired
    private ETaxInvoiceHeaderController eTaxInvoiceHeaderController;

    @Test
    public void contexLoads() throws Exception{
        assertThat(eTaxInvoiceHeaderController).isNotNull();
    }

}
