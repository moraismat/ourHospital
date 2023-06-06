package com.hospital.ourhospital.repository;

import com.hospital.ourhospital.domain.Entidade;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EntidadeRepository extends JpaRepository<Entidade, Integer> {
}
