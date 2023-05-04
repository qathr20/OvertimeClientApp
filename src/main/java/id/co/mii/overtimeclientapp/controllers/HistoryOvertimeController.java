package id.co.mii.overtimeclientapp.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import id.co.mii.overtimeclientapp.models.HistoryOvertime;
import id.co.mii.overtimeclientapp.services.HistoryOvertimeService;
import lombok.AllArgsConstructor;

@Controller
@RequestMapping("/historyovertime")
@AllArgsConstructor
public class HistoryOvertimeController {

    private HistoryOvertimeService historyOvertimeService;

    @GetMapping
    public String index(Model model) {
        List<HistoryOvertime> historyOvertimes = historyOvertimeService.getAll();
        model.addAttribute("historyOvertimes", historyOvertimes);
        return "historyOvertime/index";
    }

    @PostMapping
    public String create(HistoryOvertime historyOvertime) {
        historyOvertimeService.create(historyOvertime);
        return "redirect:/historyOvertime";
    }

    @PutMapping("/{id}")
    public String update(@PathVariable int id, HistoryOvertime historyOvertime) {
        historyOvertimeService.update(id, historyOvertime);
        return "redirect:/historyOvertime";
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable int id) {
        historyOvertimeService.delete(id);
        return "redirect:/historyOvertime";
    }

    
    
}
