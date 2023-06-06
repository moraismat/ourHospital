package com.hospital.ourhospital.domain;

import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Entidade {
    private static final long serialVersionUID = 1L;

    @Id
    private Integer id;
    @Column(name = "nome_fantasia")
    private String nome_fantasia;
    @Column(name = "cnpj")
    private Long cnpj;
}
