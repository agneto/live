package com.dio.live.controller;

import com.dio.live.model.JornadaTrabalho;
import com.dio.live.service.JornadaTrabalhoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.NoSuchElementException;

@RequiredArgsConstructor
@RestController
@RequestMapping("/jornada")
public class JornadaTrabalhoController {

    private final JornadaTrabalhoService jornadaTrabalhoService;

    @PostMapping(value = "/create")
    public JornadaTrabalho createJornada(@RequestBody @Valid JornadaTrabalho jornadaTrabalho) {
        return this.jornadaTrabalhoService.save(jornadaTrabalho);
    }

    @GetMapping(value = "/list")
    public List<JornadaTrabalho> getJornadaList() {
        return this.jornadaTrabalhoService.list();
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<JornadaTrabalho> getJornadaById(@PathVariable("id") Long id) {
        return ResponseEntity.ok(this.jornadaTrabalhoService.getById(id).orElseThrow( () -> new NoSuchElementException("Not Found")));
    }

    @PutMapping(value = "/update")
    public JornadaTrabalho updateJornada(@RequestBody @Valid JornadaTrabalho jornadaTrabalho) {
        return this.jornadaTrabalhoService.update(jornadaTrabalho);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable("id") Long id) {
        this.jornadaTrabalhoService.delete(id);
        return (ResponseEntity<Void>) ResponseEntity.noContent();
    }

}
