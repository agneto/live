package com.dio.live.requests;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class EmpresaPostRequestBody {

    private String descricao;
    @NotEmpty(message = "The cnpj cannot be empty")
    private String cnpj;
    private String endereco;
    private String bairro;
    private String cidade;
    private String estado;
    private String telefone;
}
