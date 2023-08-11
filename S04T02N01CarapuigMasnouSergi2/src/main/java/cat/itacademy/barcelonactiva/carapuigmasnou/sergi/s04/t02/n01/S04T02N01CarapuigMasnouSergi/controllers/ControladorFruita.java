package cat.itacademy.barcelonactiva.carapuigmasnou.sergi.s04.t02.n01.S04T02N01CarapuigMasnouSergi.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import cat.itacademy.barcelonactiva.carapuigmasnou.sergi.s04.t02.n01.S04T02N01CarapuigMasnouSergi.model_domain.Fruita;
import cat.itacademy.barcelonactiva.carapuigmasnou.sergi.s04.t02.n01.S04T02N01CarapuigMasnouSergi.model_services.GestioFruita;
import cat.itacademy.barcelonactiva.carapuigmasnou.sergi.s04.t02.n01.S04T02N01CarapuigMasnouSergi.model_services.ServeiFruita;

@RestController
@RequestMapping("/fruita")
public class ControladorFruita implements ControladorGestioFruita {

    @Autowired
    private GestioFruita gestioFruita;
    
    @Override
    @PostMapping("/add")
    public Fruita afegirFruita(@RequestBody Fruita fruita) {
    	return gestioFruita.afegirFruita(fruita);
    }
    
    @Override
    @PostMapping("/update/{id}")
    public Fruita actualitzarFruita(@PathVariable Long id,@RequestBody Fruita fruita) {
    	return gestioFruita.actualitzarFruita(fruita);
    }
    
    @Override
    @GetMapping("/delete/{id}")
    public void eliminarFruita(@PathVariable("id") Long id) {
    	gestioFruita.eliminarFruita(id);
    }
    
    @Override
    @GetMapping("/getOne/{id}")
    public Fruita obtenirFruitaPerId(@PathVariable Long id) {
        return gestioFruita.obtenirFruitaPerId(id);
    }
    
    @Override
    @GetMapping("/getAll")
    public List<Fruita> obtenirTotesLesFruites() {
        return gestioFruita.obtenirTotesLesFruites();
    }
}
