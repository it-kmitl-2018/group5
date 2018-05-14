package th.ac.kmitl.it.soa.group5.etaxinvoice;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.junit.Test;
import th.ac.kmitl.it.soa.group5.etaxinvoice.converter.JsonConverter;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class JsonConverterTest {

    private class Json {

        @JsonProperty("strings")
        private List<String> strings = Arrays.asList("Debit", "Credit", "Tax");
    }

    private String json =
            "{\n" +
                    "    \"strings\" : [\n" +
                    "        \"Debit\",\n" +
                    "        \"Credit\",\n" +
                    "        \"Tax\"\n" +
                    "    ]\n" +
                    "}";

    @Test
    public void shouldGetCorrectJson() {
        JsonConverter jsonConverter = new JsonConverter();

        assertEquals(json, jsonConverter.toJson(new Json()));
    }
}
