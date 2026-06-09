package br.com.kr.naturassp.services;

import br.com.kr.naturassp.entities.Categoria;
import br.com.kr.naturassp.repositories.CategoriaRepository;
import br.com.kr.naturassp.services.interfaces.ICategoriaService;
import org.springframework.beans.factory.annotation.Autowired;

public class CategoriaService implements ICategoriaService {

    @Autowired
    CategoriaRepository categoriaRepository;

    @Override
    public Categoria inserir(Categoria categoria) throws Exception {
        return categoriaRepository.save(categoria);
    }

}
