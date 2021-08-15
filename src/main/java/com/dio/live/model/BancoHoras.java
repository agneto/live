package com.dio.live.model;

import lombok.*;

import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.ZonedDateTime;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
public class BancoHoras {

    @AllArgsConstructor
    @NoArgsConstructor
    @EqualsAndHashCode
    @Embeddable
    public class BancoHorasId implements Serializable {
        private Long idBancoHoras;
        private Long idMovimentacao;
        private Long idUsuario;
    }

    @EmbeddedId
    private BancoHorasId id;
    private ZonedDateTime dataTrabalhada;
    private BigDecimal quantidadeHoras;
    private BigDecimal saldoHoras;
}
