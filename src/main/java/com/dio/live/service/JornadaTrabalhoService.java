package com.dio.live.service;

import com.dio.live.model.JornadaTrabalho;
import com.dio.live.repository.JornadaTrabalhoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class JornadaTrabalhoService {

    private final JornadaTrabalhoRepository jornadaTrabalhoRepository;

    public JornadaTrabalho save(JornadaTrabalho jornadaTrabalho) {
        return this.jornadaTrabalhoRepository.save(jornadaTrabalho);
    }

    public List<JornadaTrabalho> list() {
        return this.jornadaTrabalhoRepository.findAll();
    }

    public Optional<JornadaTrabalho> getById(Long id) {
        return this.jornadaTrabalhoRepository.findById(id);
    }

    public JornadaTrabalho update(JornadaTrabalho jornadaTrabalho) {
        return this.jornadaTrabalhoRepository.save(jornadaTrabalho);
    }

    public void delete(Long id) {
        this.jornadaTrabalhoRepository.deleteById(id);
    }

}
