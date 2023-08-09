package cat.itacademy.barcelonactiva.carapuigmasnou.sergi.s04.t02.n01.S04T02N01CarapuigMasnouSergi.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import cat.itacademy.barcelonactiva.carapuigmasnou.sergi.s04.t02.n01.S04T02N01CarapuigMasnouSergi.model_domain.Fruita;
import cat.itacademy.barcelonactiva.carapuigmasnou.sergi.s04.t02.n01.S04T02N01CarapuigMasnouSergi.model_services.ServeiFruita;

@RestController
@RequestMapping("/fruita")
public class ControladorFruita {

    @Autowired
    private ServeiFruita serveiFruita;

    @GetMapping("/add")
    public Fruita afegirFruita(Fruita fruita) {
        if (fruita.getNom() == null) {
            fruita.setNom("Kiwi");
            fruita.setQuantitatQuilos(24);
        }
    	return serveiFruita.afegirFruita(fruita);
    }

    @GetMapping("/update/{id}")
    public Fruita actualitzarFruita(@PathVariable Long id,Fruita fruita) {
        fruita.setId(id);
        
        // Set default values if not provided
        if (fruita.getNom() == null) {
            fruita.setNom("Pressec");
            fruita.setQuantitatQuilos(12);
        }
    	return serveiFruita.actualitzarFruita(fruita);
    }

    @GetMapping("/delete/{id}")
    public void eliminarFruita(@PathVariable("id") Long id) {
        serveiFruita.eliminarFruita(id);
    }

    @GetMapping("/getOne/{id}")
    public Fruita obtenirFruitaPerId(@PathVariable Long id) {
        return serveiFruita.obtenirFruitaPerId(id);
    }

    @GetMapping("/getAll")
    public List<Fruita> obtenirTotesLesFruites() {
        return serveiFruita.obtenirTotesLesFruites();
    }
}
