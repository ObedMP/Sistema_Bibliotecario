package org.example.servicio;

import org.example.modulo.Libro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.example.repositorio.LibroRepository;

import java.util.List;

@Service
public class LibroService {
    @Autowired
    private LibroRepository libroRepository;
    //implementar metodo para hacer un crud
    public Libro crearLibro(Libro libro) {
        return libroRepository.save(libro);
    }

    public Libro editarLibro(int id, Libro libroActualizado) {
        Libro libroExistente = obtenerLibroPorId(id);

        if (libroExistente != null) {
            libroExistente.setNombre(libroActualizado.getNombre());
            libroExistente.setAutor(libroActualizado.getAutor());
            libroExistente.setCategoria(libroActualizado.getCategoria());
            libroExistente.setPrecio(libroActualizado.getPrecio());
            libroExistente.setEstado(libroActualizado.getEstado());

            return libroRepository.save(libroExistente);
        }

        return null;
    }

    public Libro obtenerLibroPorId(int id) {
        return libroRepository.findById(id).orElse(null);
    }

    public List<Libro> obtenerTodosLosLibros() {
        return libroRepository.findAll();
    }

}
