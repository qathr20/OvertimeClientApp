package id.co.mii.overtimeclientapp.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import id.co.mii.overtimeclientapp.models.Reimburse;
import id.co.mii.overtimeclientapp.models.dto.requests.ReimburseRequest;
import id.co.mii.overtimeclientapp.services.ReimburseService;
import lombok.AllArgsConstructor;

@Controller
@RequestMapping("/reimburse")
@AllArgsConstructor
public class ReimburseController {
    
    private ReimburseService reimburseService;

    @GetMapping
    public String index(Model model) {
        List<Reimburse> reimburses = reimburseService.getAll();
        model.addAttribute("reimburses", reimburses);
        return "reimburse/index";
    }

    @GetMapping("/{id}")
    public String indexId(@PathVariable int id, Model model) {
        model.addAttribute("reimburse", reimburseService.getById(id));
        return "reimburse/detail-form";
    }

    @GetMapping("/create")
    public String createView(ReimburseRequest reimburseRequest) {
        return "reimburse/create-form";
    }

    @PostMapping
    public String create(ReimburseRequest reimburseRequest) {
        reimburseService.create(reimburseRequest);
        return "redirect:/reimburse";
    }

    @GetMapping("/update/{id}")
    public String updateView(@PathVariable int id, Model model) {
        model.addAttribute("reimburse", reimburseService.getById(id));
        return "reimburse/update-form";
    }

    @PutMapping("/{id}")
    public String update(@PathVariable int id, Reimburse reimburse) {
        reimburseService.update(id, reimburse);
        return "redirect:/reimburse";
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable int id) {
        reimburseService.delete(id);
        return "redirect:/reimburse";
    }

}
