package th.ac.kmitl.it.soa.group5.etaxinvoice.models;

import lombok.experimental.Builder;
import java.sql.Timestamp;

@Builder(builderClassName = "Builder")
public class ETaxInvoiceHeader {

    public String id;
    public String name;
    public String typeCode;
    public Timestamp issueDateTime;
    public Timestamp createDateTime;
}
