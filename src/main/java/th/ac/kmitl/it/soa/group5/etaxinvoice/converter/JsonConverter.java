package th.ac.kmitl.it.soa.group5.etaxinvoice.converter;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.util.DefaultIndenter;
import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonConverter {

    private ObjectMapper mapper;
    private DefaultPrettyPrinter.Indenter indenter;
    private DefaultPrettyPrinter printer;

    public JsonConverter() {

        mapper = new ObjectMapper();
        indenter = new DefaultIndenter("    ", "\n");
        printer = new DefaultPrettyPrinter();

        printer.indentObjectsWith(indenter);
        printer.indentArraysWith(indenter);
    }

    public String toJson(Object model) {
        try {
            return mapper.writer(printer).writeValueAsString(model);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
            return null;
        }

    }
}
