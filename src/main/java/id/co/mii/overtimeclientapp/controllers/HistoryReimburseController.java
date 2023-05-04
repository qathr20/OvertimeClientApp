package id.co.mii.overtimeclientapp.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import id.co.mii.overtimeclientapp.models.HistoryReimburse;
import id.co.mii.overtimeclientapp.models.dto.requests.HistoryReimburseRequest;
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

    @GetMapping("/{id}")
    public String indexId(@PathVariable int id, Model model) {
        model.addAttribute("historyReimburse", historyReimburseService.getById(id));
        return "historyReimburse/detail-form";
    }

    @GetMapping("/create")
    public String createView(HistoryReimburseRequest historyReimburseRequest) {
        return "historyReimburse/create-form";
    }

    @PostMapping
    public String create(HistoryReimburseRequest historyReimburseRequest) {
        historyReimburseService.create(historyReimburseRequest);
        return "redirect:/historyReimburse";
    }

    @GetMapping("/update/{id}")
    public String updateView(@PathVariable int id, Model model) {
        model.addAttribute("historyReimburse", historyReimburseService.getById(id));
        return "historyReimburse/update-form";
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
