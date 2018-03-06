package th.ac.kmitl.it.soa.group5.etaxinvoice;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import th.ac.kmitl.it.soa.group5.etaxinvoice.controllers.IndexController;
import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.assertj.core.api.Assertions.assertThat;


@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
public class HtmlRequestTests {

    @Autowired
    private IndexController indexController;

    @Test
    public void contexLoads(){
        assertThat(indexController).isNotNull();
    }

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void versionInIndex() throws Exception {
        this.mockMvc.perform(get("/")).andDo(print()).andExpect(status().isOk())
                .andExpect(content().string(containsString("ETax-Invoice")));
    }

    @Test
    public void requestVersion() throws Exception {
        this.mockMvc.perform(get("/version")).andDo(print()).andExpect(status().isOk())
                .andExpect(content().string(containsString("Version")));
    }
}




