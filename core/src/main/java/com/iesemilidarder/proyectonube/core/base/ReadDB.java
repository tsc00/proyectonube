package com.iesemilidarder.proyectonube.core.base;

import com.iesemilidarder.proyectonube.core.dao.Opinions;
import com.iesemilidarder.proyectonube.core.dao.Restaurantes;
import com.iesemilidarder.proyectonube.core.dao.User;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
/**
 * proyectonube
 * com.iesemilidarder.proyectonube.core.base
 * Created by Tomás in 22/2/2018
 * Description:
 **/

/*
Importamos las siguientes librerias para que funcione en programa
*/

/*
Creamos una clase llamada ReadDB y una arrayList para conectarnos a una base de datos de oracle
*/
public class ReadDB {
    public final static String DRIVER = "oracle.jdbc.driver.OracleDriver";
    public final static String THIN_URL = "jdbc:oracle:thin:@35.205.41.45:1521:XE";
    public final static String USER = "usuari";
    public final static String PASSWORD = "usuari";

    private static Restaurantes RestaurantsDB(ResultSet rs) {

    try {
                String codigo = rs.getString("RES_CODI");
                String nombre = rs.getString("RES_NOM");
                String direccion = rs.getString("RES_ADRECA");
                String web = rs.getString("RES_WEB");
                String telefono = rs.getString("RES_TELEFON");
                String imagen = rs.getString("RES_URL_IMG");
                String mitjana = rs.getString("RES_MITJANA");
                String descripcion = rs.getString("TRS_DESCRIPCIO");


                Restaurantes rst = new Restaurantes();
                rst.setCodigo(codigo);
                rst.setNombre(nombre);
                rst.setDireccion(direccion);
                rst.setWeb(web);
                rst.setTelefono(telefono);
                rst.setImagen(imagen);
                rst.setMitjana(mitjana);
                rst.setDescripcion(descripcion);

                //Restaurants rst = new Restaurants();
                //rst.setCodigo(codigo);
                //rst.setNombre(nombre);
                //rst.setDireccion(direccion);
                //rst.setWeb(web);
                //rst.setTelefono(telefono);
                //rst.setImagen(imagen);
                //rst.setMitjana(mitjana);
                //rst.setDescripcion(descripcion);

        return rst;

    } catch (Exception e) {
        return null;
    }
    }

         /*
       en el arraylist readRestaurants le ponemos una string llamado consulta
        */
    public ArrayList readRestaurants(String consulta) {
        ArrayList rl = new ArrayList();
        try {
/*
Decimos que tipo de base de datos nos queremos conectar y a que IP, puerto, usuario y contraseña
*/
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@35.205.41.45:1521:XE", "usuari", "usuari");

            Statement stmt = con.createStatement();
/*
Creamos un select para poder visualizar la tabla y otra select para que encuentre el nnombre del restaurante escrito en el index.jsp
*/

            ResultSet rs;
            /*
            creamos un if y un else con la consulta del arraylist
            */
            if (consulta == null) {
                rs = stmt.executeQuery("SELECT R.RES_CODI, R.RES_NOM, R.RES_ADRECA, R.RES_WEB, R.RES_TELEFON, R.RES_URL_IMG, R.RES_MITJANA, T.TRS_DESCRIPCIO FROM RESTAURANTS R, TRESTAURANTS T WHERE R.RES_TRS_CODI = T.TRS_CODI ORDER BY RES_MITJANA DESC ");
            } else {
                rs = stmt.executeQuery("SELECT R.RES_CODI, R.RES_NOM, R.RES_ADRECA, R.RES_WEB, R.RES_TELEFON, R.RES_URL_IMG, R.RES_MITJANA, T.TRS_DESCRIPCIO FROM RESTAURANTS R, TRESTAURANTS T WHERE R.RES_TRS_CODI = T.TRS_CODI AND LOWER(RES_NOM) LIKE '%" + consulta.toLowerCase() + "%'");

            }
            while (rs.next()) {
                String codigo = rs.getString("RES_CODI");
                String nombre = rs.getString("RES_NOM");
                String direccion = rs.getString("RES_ADRECA");
                String web = rs.getString("RES_WEB");
                String telefono = rs.getString("RES_TELEFON");
                String imagen = rs.getString("RES_URL_IMG");
                String mitjana = rs.getString("RES_MITJANA");
                String descripcion = rs.getString("TRS_DESCRIPCIO");


                Restaurantes rest = new Restaurantes();
                rest.setCodigo(codigo);
                rest.setNombre(nombre);
                rest.setDireccion(direccion);
                rest.setWeb(web);
                rest.setTelefono(telefono);
                rest.setImagen(imagen);
                rest.setMitjana(mitjana);
                rest.setDescripcion(descripcion);

                //rest.setCodigo(codigo);
                //rest.setNombre(nombre);
                //rest.setDireccion(direccion);
                //rest.setWeb(web);
                //rest.setTelefono(telefono);
                //rest.setImagen(imagen);
                //rest.setMitjana(mitjana);
                //rest.setDescripcion(descripcion);

                rl.add(rest);
            }
            stmt.close();
            con.close();

        } catch (Exception e) {
            System.out.println(e.toString());
        }
        return rl;
    }
/*
Creamos un readRestaurant llamada Restaurants y nos conectamos a una base de datos de oracle
*/

    public static Restaurantes readRestaurant(String id) {
        Restaurantes restaurante = null;
        try {
/*
Decimos que tipo de base de datos nos queremos conectar y a que IP, puerto, usuario y contraseña
*/
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@35.205.41.45:1521:XE", "usuari", "usuari");

            Statement stmt = con.createStatement();
/*
Creamos un select para poder visualizar la tabla y que se visualice en el mostrar.jsp
*/

            ResultSet rs;
            /*
            Ejecutamos la query que necesitemos
            */


            rs = stmt.executeQuery("SELECT R.RES_CODI, R.RES_NOM, R.RES_ADRECA, R.RES_WEB, R.RES_TELEFON,\n" + "  R.RES_URL_IMG, R.RES_MITJANA, R.RES_LATITUD, R.RES_LONGITUD, T.TRS_DESCRIPCIO\n" + "FROM RESTAURANTS R\n" + "  JOIN TRESTAURANTS T ON R.RES_TRS_CODI=T.TRS_CODI\n" + "WHERE R.RES_CODI = " + id + "");

            if (rs.next()) {
                String codigo = rs.getString("RES_CODI");
                String nombre = rs.getString("RES_NOM");
                String direccion = rs.getString("RES_ADRECA");
                String web = rs.getString("RES_WEB");
                String telefono = rs.getString("RES_TELEFON");
                String imagen = rs.getString("RES_URL_IMG");
                String mitjana = rs.getString("RES_MITJANA");
                String latitud = rs.getString("RES_LATITUD");
                String longitud = rs.getString("RES_LONGITUD");
                String descripcion = rs.getString("TRS_DESCRIPCIO");


                restaurante = new Restaurantes();
                restaurante.setCodigo(codigo);
                restaurante.setNombre(nombre);
                restaurante.setDireccion(direccion);
                restaurante.setWeb(web);
                restaurante.setTelefono(telefono);
                restaurante.setImagen(imagen);
                restaurante.setMitjana(mitjana);
                restaurante.setLatitud(latitud);
                restaurante.setLongitud(longitud);
                restaurante.setDescripcion(descripcion);

                rs = stmt.executeQuery("SELECT O.OPI_OBSERVACIO, O.OPI_PUNTUACIO, U.USU_NOM FROM OPINIONS O JOIN USUARIS U ON U.USU_CODI = O.OPI_USU_CODI JOIN RESTAURANTS R ON O.OPI_RES_CODI = R.RES_CODI WHERE R.RES_CODI =" + id + "");

                //restaurante = new Restaurants();
                //restaurante.setCodigo(codigo);
                //restaurante.setNombre(nombre);
                //restaurante.setDireccion(direccion);
                //restaurante.setWeb(web);
                //restaurante.setTelefono(telefono);
                //restaurante.setImagen(imagen);
                //restaurante.setMitjana(mitjana);
                //restaurante.setLatitud(latitud);
                //restaurante.setLongitud(longitud);
                //restaurante.getOpiniones().add(op);
                //restaurante.setDescripcion(descripcion);

            }
            stmt.close();
            con.close();

        } catch (Exception e) {
            System.out.println(e.toString());
        }
        return restaurante;
    }
    /*
    Creamos la ArrayList readOpiniones para que se vea las opiniones que han escrito los usuarios sobre los restaurantes
    */
    public ArrayList readOpiniones(String id) {

        ArrayList arrayOpiniones = new ArrayList();

        try {
             /*
            Ejecutamos la query que necesitemos
            */

            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@35.205.41.45:1521:XE", "usuari", "usuari");

            Statement stmt = con.createStatement();

            ResultSet rs;
            rs = stmt.executeQuery("SELECT O.OPI_OBSERVACIO, O.OPI_PUNTUACIO, U.USU_NOM FROM OPINIONS O JOIN USUARIS U ON U.USU_CODI = O.OPI_USU_CODI JOIN RESTAURANTS R ON O.OPI_RES_CODI = R.RES_CODI\n WHERE R.RES_CODI = " + id + "");

            while (rs.next()) {

                String observacion = rs.getString("OPI_OBSERVACIO");
                String puntuacion = rs.getString("OPI_PUNTUACIO");
                String usuario = rs.getString("USU_NOM");

                //Opinions op = new Opinions();
                //op.setObservacion(observacion);
                //op.setPuntuacion(puntuacion);
                //op.setUsuario(usuario);

                Opinions op = new Opinions();
                op.setObservacion(observacion);
                op.setPuntuacion(puntuacion);
                op.setUsuario(usuario);
                arrayOpiniones.add(op);

            }
            stmt.close();
            con.close();

        } catch (Exception e) {
            System.out.println(e.toString());
        }
        return arrayOpiniones;
    }

    public static ArrayList<User> readDB (String buscar) {
        ArrayList al = new ArrayList();
        /*
            Se conecta a la base de datos con el usuario y contraseña que le decimos
         */
        try {
            /*
            Decimos que tipo de base de datos nos queremos conectar y a que IP, puerto, usuario y contraseña
            */
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@35.205.41.45:1521:XE", "usuari", "usuari");

            Statement stmt = con.createStatement();
        /*
            Hacemos la consulta deseada con el parametro que le pongamos
        */
            ResultSet rs;
            rs = stmt.executeQuery("SELECT USU_CODI, USU_NOM, USU_ADRECA_ELECTRONICA FROM USUARIS WHERE LOWER(USU_CODI) LIKE '%" + buscar.toLowerCase() + "%'");


            while (rs.next()) {
                Integer code = rs.getInt("USU_CODI");
                String username = rs.getString("USU_NOM");
                String email = rs.getString("USU_ADRECA_ELECTRONICA");

                User users= new User();
                users.setId(code);
                users.setUsername(username);
                users.setEmail(email);

                //User users= new User();
                //users.setCode(code);
                //users.setUsername(username);
                //users.setEmail(email);

                al.add(users);
            }
            con.close();

        }  catch (Exception e) {
            System.out.println(e.toString());
        }
        return al;
    }

/*
Arraylist para proyecto
*/



    public static List ReadRestaurantAPI () {
        ArrayList ReadRestaurantAPI = new ArrayList();

        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@35.205.41.45:1521:XE", "usuari",  "usuari" );

            Statement stmt = con.createStatement();
            ResultSet rs;
            rs = stmt.executeQuery("SELECT RES_CODI, RES_NOM, RES_ADRECA, RES_WEB, RES_TELEFON, RES_URL_IMG FROM RESTAURANTS");

            while (rs.next()) {
                String nombre = rs.getString("RES_NOM");
                String direccion = rs.getString("RES_ADRECA");
                String web = rs.getString("RES_WEB");
                String telefono = rs.getString("RES_TELEFON");
                String imagen = rs.getString("RES_URL_IMG");
                String codigo = rs.getString("RES_CODI");

                Restaurantes restaurants = new Restaurantes();
                restaurants.setNombre(nombre);
                restaurants.setDireccion(direccion);
                restaurants.setWeb(web);
                restaurants.setTelefono(telefono);
                restaurants.setImagen(imagen);
                restaurants.setCodigo(codigo);
                ReadRestaurantAPI.add(restaurants);
            }
            stmt.close();
            con.close();

        } catch (Exception e) {
            System.out.println(e.toString());
        }
        return ReadRestaurantAPI;

    }
    /**
     * Functional Version Alberto
     **/

    public static List ReadRestaurantsAPI() {
        List<Restaurantes> ReadRestaurantsAPI = new ArrayList<>();

        try {
            String sql = "SELECT R.RES_CODI,R.RES_NOM,R.RES_ADRECA,R.RES_WEB,R.RES_TELEFON,R.RES_URL_IMG,R.RES_MITJANA, TR.TRS_DESCRIPCIO " + "FROM RESTAURANTS R,TRESTAURANTS TR " + "WHERE  R.RES_TRS_CODI = TR.TRS_CODI";

            Class.forName(DRIVER);
            Connection con = DriverManager.getConnection(THIN_URL, USER, PASSWORD);
            Statement stmt = con.createStatement();

            ResultSet rs = stmt.executeQuery(sql);
            ResultSetMapper<Restaurantes> mapper = new ResultSetMapper<>();
            ReadRestaurantsAPI = mapper.mapResultSetToObject(rs, Restaurantes.class);
            stmt.close();
            con.close();

        } catch (Exception e) {
            System.out.println(e.toString());
        }

        return ReadRestaurantsAPI;
    }
}

/*
Tomás Sastre Cámara
2n ASIX
*/

