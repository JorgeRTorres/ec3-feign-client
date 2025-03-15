package pe.edu.idat.ec3_feign_client.service;

import java.util.List;

public interface IPersonajeService {

    List<Personaje> obtenerPersonaje();
    Personaje obtenerPersonajePorId(Long id);
    Personaje guardarPersonaje(Personaje personaje);
}
