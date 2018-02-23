package com.iesemilidarder.proyectonube.core.dao;

import java.util.ArrayList;
import javax.persistence.Column;
import javax.persistence.Entity;
import com.iesemilidarder.proyectonube.core.base.DBObject;

/*
Creamos la clase restaurants con los string privadas y sus getters y setters
*/
/*
Creamos la clase restaurants con los string privadas y sus getters y setters ademas creamos un array list de opiniones y una clase publica de restaurantes para la array list
*/
@Entity
public class Restaurantes extends DBObject {
    @Column(name = "RES_CODI")
    private String codigo;
    @Column(name = "RES_NOM")
    private String nombre;
    @Column(name = "RES_ADRECA")
    private String direccion;
    @Column(name = "RES_WEB")
    private String web;
    @Column(name = "RES_TELEFON")
    private String telefono;
    @Column(name = "TRS_DESCRIPCIO")
    private String descripcion;
    @Column(name = "RES_URL_IMG")
    private String imagen;
    @Column(name = "RES_MITJANA")
    private String mitjana;
    @Column(name = "RES_LATITUD")
    private String latitud;
    @Column(name = "RES_LONGITUD")
    private String longitud;

    private ArrayList<Opinions> opiniones;

    public Restaurantes() {
        this.opiniones = new ArrayList<Opinions>();
    }

    public ArrayList<Opinions> getOpiniones() {
        return opiniones;
    }

    public void setOpiniones(ArrayList<Opinions> opiniones) {
        this.opiniones = opiniones;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getWeb() {
        return web;
    }

    public void setWeb(String web) {
        this.web = web;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getMitjana() {
        return mitjana;
    }

    public void setMitjana(String mitjana) {
        this.mitjana = mitjana;
    }

    public String getLatitud() {
        return latitud;
    }

    public void setLatitud(String latitud) {
        this.latitud = latitud;
    }

    public String getLongitud() {
        return longitud;
    }

    public void setLongitud(String longitud) {
        this.longitud = longitud;
    }

    @Override
    protected void beforeSave() {
        doLog(String.format("Saving %s", this.getClass().getCanonicalName()));
        System.out.println("Saving users");
    }
}
/*
Tomás Sastre Cámara
2n ASIX
*/
