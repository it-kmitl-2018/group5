package th.ac.kmitl.it.soa.group5.etaxinvoice.models;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.experimental.Builder;
import java.sql.Timestamp;

@JacksonXmlRootElement(localName = "rsm:ExchangedDocument")
@Builder(builderClassName = "Builder")
public class ETaxInvoiceHeader {

    @JacksonXmlProperty(localName = "ram:ID")
    public String id;

    @JacksonXmlProperty(localName = "ram:Name")
    public String name;

    @JacksonXmlProperty(localName = "TypeCode")
    public String typeCode;

    @JacksonXmlProperty(localName = "IssueDateTime")
    public Timestamp issueDateTime;

    @JacksonXmlProperty(localName = "CreateDateTime")
    public Timestamp createDateTime;
}
