package br.com.api.naturassp.repository;

import br.com.api.naturassp.model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {
    
}
