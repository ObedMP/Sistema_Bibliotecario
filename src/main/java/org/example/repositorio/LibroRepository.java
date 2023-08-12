package org.example.repositorio;

import org.example.modulo.Libro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LibroRepository extends JpaRepository<Libro, Integer> {

    Libro findByNombre(String nombre);


}
