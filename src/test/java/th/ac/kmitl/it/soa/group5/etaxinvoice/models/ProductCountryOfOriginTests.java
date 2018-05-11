package th.ac.kmitl.it.soa.group5.etaxinvoice.models;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProductCountryOfOriginTests {

    private String country = "Thailand";
    private int countryId = 66;

    @Test
    public void getValuesFromProductCountryOfOriginModel() {

        ProductCountryOfOrigin.Builder builder = new ProductCountryOfOrigin.Builder();
        ProductCountryOfOrigin exdoc = builder
                .country(this.country)
                .countryId(this.countryId)
                .build();

        assertEquals(this.country, exdoc.country);
        assertEquals(this.countryId, exdoc.countryId);
    }
}
