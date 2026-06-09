package br.com.kr.naturassp.entities;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.TenantId;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "categoria")
@Data
public class Categoria {

    @Id
    private UUID id;

    @Column(name = "nome", length = 100, nullable = false, unique = true)
    private String nome;

    @Column(name = "data_criacao")
    @Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime dataCriacao = LocalDateTime.now();

    @Column(name = "data_atualizacao")
    @Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime dataAtualizacao;

    @Column(name = "data_exclusao")
    @Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime dataExclusao;

}
