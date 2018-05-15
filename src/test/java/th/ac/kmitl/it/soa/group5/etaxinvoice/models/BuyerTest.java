package th.ac.kmitl.it.soa.group5.etaxinvoice.models;

import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BuyerTest {

    private String taxNumber = "0105522022883";
    private String thaiName = "ภัทรวดี";
    private String englishName = "Pattarawadee";
    private String email = "patt@gmail.com";
    private String telephone = "0888884040";
    private String fax = "022222222";

    @Test
    public void getValueFromBuyerModel() {

        Buyer.Buider buider = new Buyer.Buider();
        Buyer buyer = buider.taxNumber(this.taxNumber)
                .thaiName(this.thaiName)
                .englishName(this.englishName)
                .email(this.email)
                .telephone(this.telephone)
                .fax(this.fax)
                .build();

        assertEquals(this.taxNumber, buyer.taxNumber);
        assertEquals(this.thaiName, buyer.thaiName);
        assertEquals(this.englishName, buyer.englishName);
        assertEquals(this.email, buyer.email);
        assertEquals(this.telephone, buyer.telephone);
        assertEquals(this.fax, buyer.fax);
    }
}
