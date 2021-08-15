package com.dio.live.model;

import lombok.*;
import org.hibernate.envers.Audited;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.ZonedDateTime;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Audited
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private CategoriaUsuario categoriaUsuario;
    private String nome;
    @ManyToOne
    private Empresa empresa;
    @ManyToOne
    private NivelAcesso nivelAcesso;
    @ManyToOne
    private JornadaTrabalho jornadaTrabalho;
    private BigDecimal tolerancia;
    private ZonedDateTime inicioJornada;
    private ZonedDateTime finalJornada;
}
