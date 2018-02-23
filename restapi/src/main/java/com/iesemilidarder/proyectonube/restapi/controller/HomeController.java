package com.iesemilidarder.proyectonube.restapi.controller;

import com.iesemilidarder.proyectonube.core.base.ReadDB;
import com.iesemilidarder.proyectonube.core.dao.Restaurantes;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;


@Controller
public class HomeController {
    @RequestMapping("/")
    public String index(@ModelAttribute("model") ModelMap model) {
        ReadDB dbManager = new ReadDB();
        List<Restaurantes> leeRestaurants = dbManager.ReadRestaurantsAPI();
        model.addAttribute("list",leeRestaurants);
        return "index";
    }
}
