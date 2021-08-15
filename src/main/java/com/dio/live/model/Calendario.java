package com.dio.live.model;

import lombok.*;

import javax.persistence.*;
import java.time.ZonedDateTime;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
public class Calendario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private TipoData tipoData;
    private String descricao;
    private ZonedDateTime dataEspecial;
}
