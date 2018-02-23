package com.iesemilidarder.proyectonube.core.base;
import java.util.List;

/**
 * proyectonube
 * com.iesemilidarder.proyectonube.core.base
 * Created by Tomás in 22/2/2018
 * Description:
 **/
public interface IDatabaseActions {
    public void save();
    public void delete();
    public void update();
    public List<DBObject> getAll();
}
/*
Tomás Sastre Cámara
2n ASIX
*/