package com.example.tpfoyer.repositories;


import com.example.tpfoyer.entity.Universite;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UniversiteRepository extends JpaRepository<Universite,Long> {

    List<Universite> findByNomUniversiteContainingIgnoreCase(String nom);
    Long countByAdresseContaining(String adresse);
}
