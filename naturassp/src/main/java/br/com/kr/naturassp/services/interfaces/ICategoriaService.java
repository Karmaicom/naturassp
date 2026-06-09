package br.com.kr.naturassp.services.interfaces;

import br.com.kr.naturassp.entities.Categoria;
import org.springframework.stereotype.Service;

@Service
public interface ICategoriaService {

    Categoria inserir(Categoria categoria) throws Exception;

}
