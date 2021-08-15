package com.dio.live.service;

import com.dio.live.exception.BadRequestException;
import com.dio.live.mapper.EmpresaMapper;
import com.dio.live.model.Empresa;
import com.dio.live.repository.EmpresaRepository;
import com.dio.live.requests.EmpresaPostRequestBody;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class EmpresaService {

    private final EmpresaRepository empresaRepository;

    public Empresa findByIdOrThrowBadRequestException(Long id) {
        return this.empresaRepository.findById(id)
                .orElseThrow(() -> new BadRequestException("Empresa ID not found"));
    }

    @Transactional(rollbackFor = Exception.class)
    public Empresa save(EmpresaPostRequestBody empresaPostRequestBody) {
        return this.empresaRepository.save(EmpresaMapper.INSTANCE.toEmpresa(empresaPostRequestBody));
    }

    public void delete(long id) {
        this.empresaRepository.delete(this.findByIdOrThrowBadRequestException(id));
    }

}
