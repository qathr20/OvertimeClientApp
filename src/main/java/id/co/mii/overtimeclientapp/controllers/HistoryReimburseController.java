package id.co.mii.overtimeclientapp.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import id.co.mii.overtimeclientapp.models.HistoryReimburse;
import id.co.mii.overtimeclientapp.services.HistoryReimburseService;
import lombok.AllArgsConstructor;

@Controller
@RequestMapping("/historyreimburse")
@AllArgsConstructor
public class HistoryReimburseController {

    private HistoryReimburseService historyReimburseService;

    @GetMapping
    public String index(Model model) {
        List<HistoryReimburse> historyReimburses = historyReimburseService.getAll();
        model.addAttribute("historyReimburses", historyReimburses);
        return "historyReimburse/index";
    }

    @PostMapping
    public String create(HistoryReimburse historyReimburse) {
        historyReimburseService.create(historyReimburse);
        return "redirect:/historyReimburse";
    }

    @PutMapping("/{id}")
    public String update(@PathVariable int id, HistoryReimburse historyReimburse) {
        historyReimburseService.update(id, historyReimburse);
        return "redirect:/historyReimburse";
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable int id) {
        historyReimburseService.delete(id);
        return "redirect:/historyReimburse";
    }
    
}
