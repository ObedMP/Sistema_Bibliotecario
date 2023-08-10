package org.example.controladores;

import org.example.modulo.Libro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.example.servicio.LibroService;

import java.util.List;

@RestController
@RequestMapping("/libro")
@CrossOrigin(origins = "http://localhost:4200")
public class LibroController {
    @Autowired
    private LibroService libroService;
    @PostMapping("/crear")
    public ResponseEntity<Libro> crearLibro(@RequestBody Libro libro) {
        Libro nuevoLibro = libroService.crearLibro(libro);
        if (nuevoLibro != null) {
            return new ResponseEntity<>(nuevoLibro, HttpStatus.CREATED);
        } else {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<Libro> editarLibro(@PathVariable int id, @RequestBody Libro libroActualizado) {
        Libro libroEditado = libroService.editarLibro(id, libroActualizado);
        if (libroEditado != null) {
            return new ResponseEntity<>(libroEditado, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<Libro> obtenerLibroPorId(@PathVariable int id) {
        Libro libro = libroService.obtenerLibroPorId(id);
        if (libro != null) {
            return new ResponseEntity<>(libro, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/mostrar")
    public ResponseEntity<List<Libro>> obtenerTodosLosLibros() {
        List<Libro> libros = libroService.obtenerTodosLosLibros();
        return new ResponseEntity<>(libros, HttpStatus.OK);
    }


}
