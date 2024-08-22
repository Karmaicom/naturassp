package br.com.api.naturassp.service;

import br.com.api.naturassp.model.Categoria;
import org.springframework.stereotype.Service;

import java.util.List;

public interface ICategoriaService {

    public Categoria inserir(Categoria categoria);

    public Categoria alterar(Categoria categoria);

    public List<Categoria> buscarTodas();

    public Categoria buscarPorId(Integer id);

    public List<Categoria> buscarPorPalavraChave(String palavraChave);
}
