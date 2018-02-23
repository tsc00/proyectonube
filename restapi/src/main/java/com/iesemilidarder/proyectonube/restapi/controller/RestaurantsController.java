package com.iesemilidarder.proyectonube.restapi.controller;

import com.iesemilidarder.proyectonube.core.base.ReadDB;
import com.iesemilidarder.proyectonube.core.dao.Restaurantes;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/rest/api/v1")
public class RestaurantsController {

    @RequestMapping(path = "/restaurants")//, method = RequestMethod.GET)
    public List<Restaurantes> getAll(@RequestParam(value = "name", defaultValue = "") String name) {
        ReadDB dbManager = new ReadDB();
        List<Restaurantes> readRestaurants = dbManager.ReadRestaurantsAPI();
        return readRestaurants;
    }
}
