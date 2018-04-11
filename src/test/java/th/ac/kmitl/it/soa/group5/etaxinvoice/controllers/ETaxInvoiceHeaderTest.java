package th.ac.kmitl.it.soa.group5.etaxinvoice.controllers;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ETaxInvoiceHeaderTest {

    private String body = "{}";

    private MockMvc mockMvc;

    @InjectMocks
    private ETaxInvoiceHeaderController eTaxInvoiceHeaderController;

    @Before
    public void setUp(){
        mockMvc = MockMvcBuilders.standaloneSetup(eTaxInvoiceHeaderController).build();
    }

    @Test
    public void shouldGetXML() throws Exception{
        mockMvc.perform(post("/header_get_json")
                .accept(MediaType.APPLICATION_JSON)
                .content(body)
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().contentTypeCompatibleWith(MediaType.APPLICATION_JSON));
    }
}
