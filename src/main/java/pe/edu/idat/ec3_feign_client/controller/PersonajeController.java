package pe.edu.idat.ec3_feign_client.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.idat.ec3_feign_client.client.placeholder.iuserservice.Personaje;
import pe.edu.idat.ec3_feign_client.client.placeholder.iuserservice.PersonajeResponse;
import pe.edu.idat.ec3_feign_client.service.IPersonajeService;

import java.util.List;

@RestController
@RequestMapping("/api/v1/personaje")
public class PersonajeController {

    private final IPersonajeService iPersonajeService;

    public PersonajeController(IPersonajeService iPersonajeService) {
        this.iPersonajeService = iPersonajeService;
    }

    @GetMapping
    public PersonajeResponse getPersonaje(){
        return iPersonajeService.obtenerPersonaje();
    }

    @GetMapping("{id}")
    public Personaje getPersonajeById(@PathVariable Long id){
        return iPersonajeService.obtenerPersonajePorId(id);
    }


}
