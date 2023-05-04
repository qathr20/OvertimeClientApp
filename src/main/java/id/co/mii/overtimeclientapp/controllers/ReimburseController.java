package id.co.mii.overtimeclientapp.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import id.co.mii.overtimeclientapp.models.Reimburse;
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

    @PostMapping
    public String create(Reimburse reimburse) {
        reimburseService.create(reimburse);
        return "redirect:/reimburse";
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
