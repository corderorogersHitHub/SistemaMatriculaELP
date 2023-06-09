package proyectofinal.sistemamatricula.api.model;

import jakarta.persistence.*;
import lombok.Data;
@Entity
@Data
@Table(name="cursos")
public class Cursos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idcursos")
    private Integer id;
    private String nombrecurso;
    private Integer credito;
}
