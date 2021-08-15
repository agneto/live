package com.dio.live.model;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.ZonedDateTime;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
public class Movimentacao {

    @AllArgsConstructor
    @NoArgsConstructor
    @EqualsAndHashCode
    @Embeddable
    public class MovimentacaoId implements Serializable {
        private Long idMovimento;
        private Long idUsuario;
    }

    @EmbeddedId
    private MovimentacaoId id;
    private ZonedDateTime dataEntrada;
    private ZonedDateTime dataSaida;
    private BigDecimal periodo;
    @ManyToOne
    private Ocorrencia ocorrencia;
    @ManyToOne
    private Calendario calendario;
}
