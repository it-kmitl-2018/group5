package th.ac.kmitl.it.soa.group5.etaxinvoice.models;

import lombok.Data;
import java.sql.Timestamp;

@Data
public class ExchangedDocument {

    public String id;
    public String name;
    public String typeCode;
    public Timestamp issueDateTime;
    public Timestamp createDateTime;

    public ExchangedDocument() { }

}
