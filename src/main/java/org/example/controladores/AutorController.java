package org.example.controladores;

import org.example.modulo.Autor;
import org.example.repositorio.AutorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/autor")
public class AutorController {
    @Autowired
    private AutorRepository autorRepository;

    @GetMapping
    public ResponseEntity<List<Autor>> obtenerTodosLosAutores() {
        List<Autor> autores = autorRepository.findAll();
        return new ResponseEntity<>(autores, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Autor> obtenerAutorPorId(@PathVariable int id) {
        Optional<Autor> autor = autorRepository.findById(id);
        return autor.map(value -> new ResponseEntity<>(value, HttpStatus.OK)).orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }
}
