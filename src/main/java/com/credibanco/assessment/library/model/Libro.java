package com.credibanco.assessment.library.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.Data;
import javax.validation.constraints.NotNull;
/**
 *
 * @author Jhonny Guarnizo
 */

@Entity
@Data
@Table(name="Libro")
public class Libro implements Serializable{
    
    @Id
    @Column(name = "Id_Libro")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;
    
    @NotNull(message = "Titulo obligatorio")
    @Column(name="Titulo")
    private String Titulo;
    
    @Column(name="Fecha")
    private String Fecha;
    
    @NotNull(message = "Genero obligatorio")
    @Column(name="Genero")
    private String Genero;
    
    @NotNull(message = "NumeroPaginas obligatorio")
    @Column(name="NumeroPaginas")
    private String NumeroPaginas;
    
    @Column(name="FKEditorial")
    private Integer FkEditorial;
    
    @NotNull(message = "Codigo Autor obligatorio")
    @Column(name="FKAutor")
    private Integer FkAutor;
    
}
