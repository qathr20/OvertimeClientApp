package id.co.mii.overtimeclientapp.controllers;

import java.util.List;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import id.co.mii.overtimeclientapp.models.Employee;
import id.co.mii.overtimeclientapp.models.dto.requests.UserRequest;
import id.co.mii.overtimeclientapp.services.EmployeeService;
import id.co.mii.overtimeclientapp.services.RegisterService;
import lombok.AllArgsConstructor;

@Controller
@RequestMapping("/employee")
@AllArgsConstructor
@PreAuthorize("hasRole('HRD')")
public class EmployeeController {

    private EmployeeService employeeService;
    private RegisterService registerService;

    @GetMapping
    public String index(Model model) {
        List<Employee> employees = employeeService.getAll();
        model.addAttribute("employees", employees);
        return "employee/index";
    }

    @GetMapping("/{id}")
    public String indexId(@PathVariable int id, Model model) {
        model.addAttribute("employee", employeeService.getById(id));
        return "employee/detail-form";
    }
    
    @GetMapping("/create")
    public String createView(UserRequest userRequest, Model model) {
        return "employee/create-form";
    }

    @PostMapping
    public String create(UserRequest userRequest) {
        registerService.create(userRequest);
        return "redirect:/employee";
    }

    @GetMapping("/update/{id}")
    public String updateView(@PathVariable int id, Model model) {
        model.addAttribute("employee", employeeService.getById(id));
        return "employee/update-form";
    }

    @PutMapping("/{id}")
    public String update(@PathVariable int id, Employee employee){
       employeeService.update(id, employee);
        return "redirect:/employee";
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable int id){
        employeeService.delete(id);
        return "redirect:/employee";
    }

}
