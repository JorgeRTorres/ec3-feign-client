package pe.edu.idat.ec3_feign_client.service;

import org.springframework.stereotype.Service;
import pe.edu.idat.ec3_feign_client.client.placeholder.iuserservice.Personaje;
import pe.edu.idat.ec3_feign_client.client.placeholder.iuserservice.PersonajeClient;
import pe.edu.idat.ec3_feign_client.client.placeholder.iuserservice.PersonajeResponse;

import java.util.List;

@Service
public class PersonajeService implements IPersonajeService {

    private final PersonajeClient personajeClient;

    public PersonajeService(PersonajeClient personajeClient) {
        this.personajeClient = personajeClient;
    }


    @Override
    public PersonajeResponse obtenerPersonaje() {
        return personajeClient.findAll();
    }

    @Override
    public Personaje obtenerPersonajePorId(Long id) {
        return personajeClient.findById(id);
    }
}
