package th.ac.kmitl.it.soa.group5.etaxinvoice.models;

import lombok.Data;
import java.sql.Timestamp;

@Data
public class ExchangedDocument {

    public String id;
    public String name;
    public String typeCode;
    public Timestamp issueDateTime = new Timestamp(System.currentTimeMillis());
    public Timestamp createDateTime = new Timestamp(System.currentTimeMillis());

    public ExchangedDocument() { }
}
