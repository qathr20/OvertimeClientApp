package id.co.mii.overtimeclientapp.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import id.co.mii.overtimeclientapp.models.Type;
import id.co.mii.overtimeclientapp.services.TypeService;
import lombok.AllArgsConstructor;

@Controller
@RequestMapping("/type")
@AllArgsConstructor
public class TypeController {
    
    private TypeService typeService;

    @GetMapping
    public String index(Model model) {
        List<Type> types = typeService.getAll();
        model.addAttribute("types", types);
        return "type/index";
    }

    @PostMapping
    public String create(Type type) {
        typeService.create(type);
        return "redirect:/type";
    }

    @PutMapping("/{id}")
    public String update(@PathVariable int id, Type type) {
        typeService.update(id, type);
        return "redirect:/type";
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable int id) {
        typeService.delete(id);
        return "redirect:/type";
    }
}
