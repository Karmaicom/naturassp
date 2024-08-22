package br.com.api.naturassp.service.impl;

import br.com.api.naturassp.model.Categoria;
import br.com.api.naturassp.repository.CategoriaRepository;
import br.com.api.naturassp.service.ICategoriaService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CategoriaServiceImpl implements ICategoriaService {

    private CategoriaRepository repository;

    public CategoriaServiceImpl(CategoriaRepository repository) {
        this.repository = repository;
    }

    @Override
    public Categoria inserir(Categoria categoria) {
        return null;
    }

    @Override
    public Categoria alterar(Categoria categoria) {
        return null;
    }

    @Override
    public List<Categoria> buscarTodas() {
        return List.of();
    }

    @Override
    public Categoria buscarPorId(Integer id) {
        return null;
    }

    @Override
    public List<Categoria> buscarPorPalavraChave(String palavraChave) {
        return List.of();
    }
}
