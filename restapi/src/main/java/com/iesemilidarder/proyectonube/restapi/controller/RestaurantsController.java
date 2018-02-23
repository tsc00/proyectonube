package com.iesemilidarder.proyectonube.restapi.controller;

import com.iesemilidarder.proyectonube.core.base.ReadDB;
import com.iesemilidarder.proyectonube.core.dao.Restaurantes;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * proyectonube
 * com.iesemilidarder.proyectonube.restapi.controller
 * Created by Tomás in 22/2/2018
 * Description:**/

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
/*
Tomás Sastre Cámara
2n ASIX
*/