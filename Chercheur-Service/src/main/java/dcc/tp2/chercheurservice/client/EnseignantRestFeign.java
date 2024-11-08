package dcc.tp2.chercheurservice.client;


import dcc.tp2.chercheurservice.module.Enseignant;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "ENSEIGNANT-SERVICE")//créer facilement un client HTTP pour communiquer avec un autre microservice via une interface
public interface EnseignantRestFeign {

    @GetMapping("/Enseignants/{id}")
    Enseignant Enseignant_ByID(@PathVariable Long id);

}
