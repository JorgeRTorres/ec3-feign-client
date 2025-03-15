package pe.edu.idat.ec3_feign_client.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.idat.ec3_feign_client.service.IPersonajeService;

@RestController
@RequestMapping("/api/v1/personaje")
public class PersonajeController {

    private final IPersonajeService iPersonajeService;

}
