package br.com.api.naturassp.service.impl;

import br.com.api.naturassp.model.Categoria;
import br.com.api.naturassp.repository.CategoriaRepository;
import br.com.api.naturassp.service.ICategoriaService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriaServiceImpl implements ICategoriaService {

    private CategoriaRepository repository;

    public CategoriaServiceImpl(CategoriaRepository repository) {
        this.repository = repository;
    }

    @Override
    public Categoria inserir(Categoria categoria) {
        try {
            return(repository.save(categoria));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Categoria alterar(Categoria categoria) {
        categoria.setId(null);
        try {
            return(repository.save(categoria));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<Categoria> buscarTodas() {
        try {
            return repository.findAll();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Categoria buscarPorId(Integer id) {
        try {
            return repository.findById(id).orElse(null);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<Categoria> buscarPorPalavraChave(String palavraChave) {
        try {
            if (!palavraChave.isEmpty() || !palavraChave.isBlank())
                throw new Exception("Palvra chave não informada!");

            return repository.findByNomeContaining(palavraChave).orElse(null);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
