package id.co.mii.overtimeclientapp.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import id.co.mii.overtimeclientapp.models.Overtime;
import id.co.mii.overtimeclientapp.models.dto.requests.OvertimeRequest;
import id.co.mii.overtimeclientapp.services.OvertimeService;
import lombok.AllArgsConstructor;

@Controller
@RequestMapping("/overtime")
@AllArgsConstructor
public class OvertimeController {
    
    private OvertimeService overtimeService;

    @GetMapping
    public String index(Model model) {
        List<Overtime> overtimes = overtimeService.getAll();
        model.addAttribute("overtimes", overtimes);
        return "overtime/index";
    }

    @GetMapping("/{id}")
    public String indexId(@PathVariable int id, Model model) {
        model.addAttribute("overtime", overtimeService.getById(id));
        return "overtime/detail-form";
    }

    @GetMapping("/create")
    public String createView(OvertimeRequest overtimeRequest) {
        return "overtime/create-form";
    }

    @PostMapping
    public String create(OvertimeRequest overtimeRequest) {
        overtimeService.create(overtimeRequest);
        return "redirect:/overtime";
    }

    @GetMapping("/update/{id}")
    public String updateView(@PathVariable int id, Model model) {
        model.addAttribute("overtime", overtimeService.getById(id));
        return "overtime/update-form";
    }

    @PutMapping("/{id}")
    public String update(@PathVariable int id, Overtime overtime) {
        overtimeService.update(id, overtime);
        return "redirect:/overtime";
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable int id) {
        overtimeService.delete(id);
        return "redirect:/overtime";
    }}
