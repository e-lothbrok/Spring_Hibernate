package com.example.controller;

import com.example.pojo.Admin;
import com.example.pojo.Direccion;
import com.example.service.AdminService;
import com.example.service.DireccionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;


@Controller
@SessionAttributes("admin")
public class DireccionController {

    @Autowired
    private AdminService adminService;
    @Autowired
    private DireccionService direccionService;

    @RequestMapping("/direccion/{id}")
    public String getAll(Model model,
                         @ModelAttribute("resultado") String resultado,
                         @PathVariable("id") int id){
        Admin admin = adminService.findById(id);
        model.addAttribute("admin", admin);
        model.addAttribute("direccion", new Direccion());
        model.addAttribute("resultado", resultado);
        model.addAttribute("direcciones", direccionService.findAll(id));
        return "direccion";
    }

    @RequestMapping(value = "/direccion/save", method = RequestMethod.POST)
    public String save(Model model, RedirectAttributes ra,
                       @ModelAttribute("direccion") Direccion direccion,
                       @ModelAttribute("admin") Admin admin){
        direccionService.save(direccion, admin);
        ra.addFlashAttribute("resultado","cambios guardados con exito!");
        return "redirect:/direccion/" + admin.getId();
    }

}
