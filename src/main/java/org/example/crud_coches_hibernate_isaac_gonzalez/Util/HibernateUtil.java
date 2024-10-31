package org.example.crud_coches_hibernate_isaac_gonzalez.Util;

import org.example.crud_coches_hibernate_isaac_gonzalez.Model.Coche;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
//clase para conectar a la base de datos
public class HibernateUtil {
    static SessionFactory factory;
    static {
        Configuration cfg = new Configuration();
        //obtengo los datos de la conexion desde el fichero de configuracion
        cfg.configure("configuration/hibernate.cfg.xml");

        cfg.addAnnotatedClass(Coche.class);

        factory = cfg.buildSessionFactory();
    }

    public static SessionFactory getSessionFactory() {
        return factory;
    }

    public static Session getSession() {
        return factory.openSession();
    }
}
