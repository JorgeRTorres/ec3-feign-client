package pe.edu.idat.ec3_feign_client.client.placeholder.iuserservice;

import java.util.List;

public class PersonajeResponse {

    private List<Personaje> results;


    public List<Personaje> getResults() {
        return results;
    }

    public void setResults(List<Personaje> results) {
        this.results = results;
    }
}
