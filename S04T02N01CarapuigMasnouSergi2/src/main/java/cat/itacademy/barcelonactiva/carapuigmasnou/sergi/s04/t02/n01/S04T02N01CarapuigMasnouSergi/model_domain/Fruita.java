package cat.itacademy.barcelonactiva.carapuigmasnou.sergi.s04.t02.n01.S04T02N01CarapuigMasnouSergi.model_domain;

import jakarta.persistence.*;

@Entity
@Table (name= "fruites")
public class Fruita {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @Column(name = "nom")
	private String nom;
    
    @Column(name = "quantitatQuilos")
    private int quantitatQuilos;

    public Fruita() {
    }

    public Fruita(String nom, int quantitatQuilos) {
        this.nom = nom;
        this.quantitatQuilos = quantitatQuilos;
    }

    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getQuantitatQuilos() {
        return quantitatQuilos;
    }

    public void setQuantitatQuilos(int quantitatQuilos) {
        this.quantitatQuilos = quantitatQuilos;
    }
}