package cat.itacademy.barcelonactiva.carapuigmasnou.sergi.s04.t02.n01.S04T02N01CarapuigMasnouSergi.model_repository;

import org.springframework.data.jpa.repository.JpaRepository;
import cat.itacademy.barcelonactiva.carapuigmasnou.sergi.s04.t02.n01.S04T02N01CarapuigMasnouSergi.model_domain.Fruita;

public interface RepositoriFruita extends JpaRepository<Fruita, Long> {
}
