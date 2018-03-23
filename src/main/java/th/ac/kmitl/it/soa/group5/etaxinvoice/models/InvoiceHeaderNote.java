package th.ac.kmitl.it.soa.group5.etaxinvoice.models;

import lombok.experimental.Builder;

@Builder(builderClassName = "Builder")
public class InvoiceHeaderNote {

    public String subject;
    public String content;
}
