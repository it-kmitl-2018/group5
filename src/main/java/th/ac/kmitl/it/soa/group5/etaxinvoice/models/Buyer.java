package th.ac.kmitl.it.soa.group5.etaxinvoice.models;

import lombok.experimental.Builder;

@Builder(builderClassName = "Buider")
public class Buyer {

    public String taxNumber;
    public String thaiName;
    public String englishName;
    public String email;
    public String telephone;
    public String fax;
}
