package com.hospital.ourhospital.domain;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Evento {
    private static final long serialVersionUID = 1L;

    @Id
    private Integer id;
    @Column(name = "nome")
    private String nome;

    @ManyToOne(optional = false)
    @JoinColumn(name = "entidade_id", nullable = false)
    private Entidade entidade;
}
