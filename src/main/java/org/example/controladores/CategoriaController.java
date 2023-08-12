package org.example.controladores;

import org.example.modulo.Autor;
import org.example.modulo.Categoria;
import org.example.repositorio.CategoriaRepository;
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
@RequestMapping("/categoria")
public class CategoriaController {
    @Autowired
    private CategoriaRepository categoriaRepository;
    @GetMapping("/mostrar")
    public ResponseEntity<List<Categoria>> obtenerTodasLasCategorias() {
        List<Categoria> categoria = categoriaRepository.findAll();
        return new ResponseEntity<>(categoria, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Categoria> obtenerCategoriaPorId(@PathVariable int id) {
        Optional<Categoria> categoria = categoriaRepository.findById(id);
        return categoria.map(value -> new ResponseEntity<>(value, HttpStatus.OK)).orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }
}
