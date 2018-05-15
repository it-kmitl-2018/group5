package th.ac.kmitl.it.soa.group5.etaxinvoice.models;

import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SellerTest {

    private String taxNumber = "0105522017730";
    private String thaiName = "ศุภณัฐ";
    private String englishName = "Supanat";
    private String email = "Supa@gmail.com";
    private String telephone = "0885594040";
    private String fax = "022225525";

    @Test
    public void getValueFromBuyerModel() {

        Seller.Buider buider = new Seller.Buider();
        Seller seller = buider.taxNumber(this.taxNumber)
                .thaiName(this.thaiName)
                .englishName(this.englishName)
                .email(this.email)
                .telephone(this.telephone)
                .fax(this.fax)
                .build();

        assertEquals(this.taxNumber, seller.taxNumber);
        assertEquals(this.thaiName, seller.thaiName);
        assertEquals(this.englishName, seller.englishName);
        assertEquals(this.email, seller.email);
        assertEquals(this.telephone, seller.telephone);
        assertEquals(this.fax, seller.fax);
    }
}
