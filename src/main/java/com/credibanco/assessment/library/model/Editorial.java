
package com.credibanco.assessment.library.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import lombok.Data;

@Entity
@Data
@Table(name="editorial")
public class Editorial implements Serializable {
    
    @Id
    @Column(name = "id_editorial")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;
    
    @NotNull(message = "Nombre obligatorio")
    @Column(name="Nombre")
    private String Nombre;
    
    @NotNull(message = "Direccion Correspondencia obligatoria")
    @Column(name="DireccionCorrespondencia")
    private String DireccionCorrespondencia;
    
    @NotNull(message = "Telefono obligatorio")
    @Column(name="Telefono")
    private String Telefono;
    
    @Column(name="CorreoEditorial")
    private String CorreoEditorial;
    
    @NotNull(message = "Maximo de libros obligatorio")
    @Column(name="MaxLibros")
    private String MaximoLibros;
    
}
