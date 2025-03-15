package pe.edu.idat.ec3_feign_client.client.placeholder.iuserservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "personajeClient",
        url = "https://rickandmortyapi.com")
public interface PersonajeClient {

    @GetMapping("/api/character")
    List<Personaje> findAll();

    @GetMapping("/api/character/{id}")
    Personaje findById(@PathVariable("id") Long id);
}
