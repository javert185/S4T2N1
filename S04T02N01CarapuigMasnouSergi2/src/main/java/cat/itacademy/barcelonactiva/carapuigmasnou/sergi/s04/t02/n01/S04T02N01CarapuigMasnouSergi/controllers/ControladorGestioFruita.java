package cat.itacademy.barcelonactiva.carapuigmasnou.sergi.s04.t02.n01.S04T02N01CarapuigMasnouSergi.controllers;

import cat.itacademy.barcelonactiva.carapuigmasnou.sergi.s04.t02.n01.S04T02N01CarapuigMasnouSergi.model_domain.Fruita;

import java.util.List;

public interface ControladorGestioFruita {
    Fruita afegirFruita(Fruita fruita);

    Fruita actualitzarFruita(Long id, Fruita fruita);

    void eliminarFruita(Long id);

    Fruita obtenirFruitaPerId(Long id);

    List<Fruita> obtenirTotesLesFruites();
}