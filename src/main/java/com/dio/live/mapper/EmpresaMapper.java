package com.dio.live.mapper;

import com.dio.live.model.Empresa;
import com.dio.live.requests.EmpresaPostRequestBody;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public abstract  class EmpresaMapper {

    public static final EmpresaMapper INSTANCE = Mappers.getMapper(EmpresaMapper.class);

    public abstract Empresa toEmpresa(EmpresaPostRequestBody empresaPostRequestBody);

    // public abstract Empresa toEmpresa(AnimePutRequestBody animePutRequestBody);
}
