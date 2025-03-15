package pe.edu.idat.ec3_feign_client.service;

import pe.edu.idat.ec3_feign_client.client.placeholder.iuserservice.Personaje;
import pe.edu.idat.ec3_feign_client.client.placeholder.iuserservice.PersonajeResponse;

import java.util.List;

public interface IPersonajeService {

    PersonajeResponse obtenerPersonaje();
    Personaje obtenerPersonajePorId(Long id);

}
