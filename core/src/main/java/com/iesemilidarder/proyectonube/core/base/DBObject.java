package com.iesemilidarder.proyectonube.core.base;

 import org.slf4j.Logger;
 import org.slf4j.LoggerFactory;

 import java.util.List;

/**
 * proyectonube
 * com.iesemilidarder.proyectonube.core.base
 * Created by Tomás in 22/2/2018
 * Description:
 **/

public abstract class DBObject implements IDatabaseActions {
    private final Logger log = LoggerFactory.getLogger(DBObject.class);

    protected abstract void beforeSave();

    public void save(){
        try{
            beforeSave();
        }catch (Exception e){
            log.error("Saving data",e);
        }
    }
    public void delete(){
        log.error("Not implemented yet");
    }
    public void update(){
        log.error("Not implemented yet");
    }

    public List<DBObject> getAll() {
        return null;
    }

    /**
     * Logs actions into the system
     * @param txt Dbaction exposed
     */
    protected void doLog(String txt){
        System.out.println("dbOperation:" + txt);
        log.warn(txt);
    }

}
/*
Tomás Sastre Cámara
2n ASIX
*/
