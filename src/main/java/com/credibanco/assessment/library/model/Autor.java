
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
@Table(name="Autor")
public class Autor implements Serializable{
    
    @Id
    @Column(name = "Id_Autor")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;
    
    @NotNull(message = "Nombre Autor obligatorio")
    @Column(name="NombreCompleto")
    private String NombreCompleto;
    
    @Column(name="FechaNacimiento")
    private String FechaNacimiento;
    
    @Column(name="Ciudad")
    private String Ciudad;
    
    @Column(name="CorreoAutor")
    private String CorreoAutor;
    
    
}
