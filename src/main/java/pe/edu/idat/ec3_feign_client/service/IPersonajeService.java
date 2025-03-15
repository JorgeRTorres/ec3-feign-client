package pe.edu.idat.ec3_feign_client.service;

import pe.edu.idat.ec3_feign_client.client.placeholder.iuserservice.Personaje;

import java.util.List;

public interface IPersonajeService {

    List<Personaje> obtenerPersonaje();
    Personaje obtenerPersonajePorId(Long id);

}
