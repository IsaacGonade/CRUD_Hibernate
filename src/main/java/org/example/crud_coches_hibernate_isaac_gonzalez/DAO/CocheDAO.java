package org.example.crud_coches_hibernate_isaac_gonzalez.DAO;

import org.example.crud_coches_hibernate_isaac_gonzalez.Model.Coche;
import org.hibernate.Session;

import java.util.List;

public interface CocheDAO {
    void insertarCoche(Coche coche, Session session);

    void modificarCoche(Coche cocheViejo, Coche cocheNuevo, Session session);

    void eliminarCoche(Coche coche, Session session);

    List<Coche> obtenerCoche(Session session);
}
