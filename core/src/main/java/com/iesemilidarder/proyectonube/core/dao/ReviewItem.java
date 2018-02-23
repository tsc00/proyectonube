package com.iesemilidarder.proyectonube.core.dao;

import com.iesemilidarder.proyectonube.core.base.DBObject;

/**
 * proyectonube
 * com.iesemilidarder.proyectonube.core.dao
 * Created by Tomás in 22/2/2018
 * Description:
 **/
public class ReviewItem extends DBObject {
    private int id;
    private String name;
    private String location;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    protected void beforeSave() {
        doLog("todo!");
    }
}
/*
Tomás Sastre Cámara
2n ASIX
*/
