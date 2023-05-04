package id.co.mii.overtimeclientapp.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import id.co.mii.overtimeclientapp.models.HistoryOvertime;
import id.co.mii.overtimeclientapp.models.dto.requests.HistoryOvertimeRequest;
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

    @GetMapping("/{id}")
    public String indexId(@PathVariable int id, Model model) {
        model.addAttribute("historyOvertime", historyOvertimeService.getById(id));
        return "historyOvertime/detail-form";
    }

    @GetMapping("/create")
    public String createView(HistoryOvertimeRequest historyOvertimeRequest) {
        return "historyOvertime/create-form";
    }

    @PostMapping
    public String create(HistoryOvertimeRequest historyOvertimeRequest) {
        historyOvertimeService.create(historyOvertimeRequest);
        return "redirect:/historyOvertime";
    }

    @GetMapping("/update/{id}")
    public String updateView(@PathVariable int id, Model model) {
        model.addAttribute("historyOvertime", historyOvertimeService.getById(id));
        return "historyOvertime/update-form";
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
