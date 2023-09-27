package cat.itacademy.barcelonactiva.fara.natalia.s04.t02.n02.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table (name = "fruta")
@Getter
@Setter

public class Entity_Domain {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String nombre;
    @Column
    private int pesoKg;

}
