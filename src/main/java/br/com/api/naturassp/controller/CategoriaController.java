package br.com.api.naturassp.controller;

import br.com.api.naturassp.model.Categoria;
import br.com.api.naturassp.service.ICategoriaService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/categorias")
public class CategoriaController {

    private ICategoriaService service;

    public CategoriaController(ICategoriaService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<Object> inserir(@RequestBody Categoria categoria) {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(service.inserir(categoria));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
        }
    }

    @GetMapping
    public ResponseEntity<?> buscarTodas() {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(service.buscarTodas());
        } catch(Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
        }
    }

}
