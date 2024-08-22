package br.com.api.naturassp.repository;

import br.com.api.naturassp.model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {

    Optional<List<Categoria>> findByNomeContaining(String palavraChave);
}
