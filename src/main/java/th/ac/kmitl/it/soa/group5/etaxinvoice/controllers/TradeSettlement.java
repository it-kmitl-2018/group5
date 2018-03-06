package th.ac.kmitl.it.soa.group5.etaxinvoice.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import th.ac.kmitl.it.soa.group5.etaxinvoice.models.TradeSettlementMonetarySummation;

@Controller
public class TradeSettlement {

    @GetMapping("create/settlement")
    public String create(Model model) {
        model.addAttribute("tradeSettlementMonetarySummation",new TradeSettlementMonetarySummation());
        return "createtradesettlement";
    }

    @PostMapping("create/settlement")
    public String create(@ModelAttribute TradeSettlementMonetarySummation tradeSettlementMonetarySummation) {
        return "showtradesettlement";
    }
}
