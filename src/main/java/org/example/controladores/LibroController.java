package org.example.controladores;

import org.example.modulo.Libro;
import org.example.repositorio.LibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.example.servicio.LibroService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/libro")
@CrossOrigin(origins = "http://localhost:4200")
public class LibroController {
    @Autowired
    private LibroService libroService;


    private LibroRepository libroRepository;
    @PostMapping("/crear")

    public ResponseEntity<Libro> crearLibro(@RequestBody Libro libro) {
        Libro nuevoLibro = libroService.crearLibro(libro);
        if (nuevoLibro != null) {
            return new ResponseEntity<>(nuevoLibro, HttpStatus.CREATED);
        } else {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @PutMapping("/update/{nombre}")
    public ResponseEntity<Libro> editarLibro(@PathVariable String nombre, @RequestBody Libro libroActualizado) {
        Libro libroExistente = libroService.obtenerLibroPorNombre(nombre);

        if (libroExistente != null) {
            libroExistente.setNombre(libroActualizado.getNombre());
            libroExistente.setAutor(libroActualizado.getAutor());
            libroExistente.setCategoria(libroActualizado.getCategoria());
            libroExistente.setPrecio(libroActualizado.getPrecio());
            libroExistente.setEstado(libroActualizado.getEstado());

            Libro libroEditado = libroService.editarLibro(libroExistente);

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
    //incluir el metodo de eliminar
    @DeleteMapping("/eliminar/{nombre}")
    public ResponseEntity<Libro> eliminarLibro(@PathVariable String nombre) {
        Libro libroEliminado = libroService.eliminarLibro(nombre);
        if (libroEliminado != null) {
            return new ResponseEntity<>(libroEliminado, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }


}
