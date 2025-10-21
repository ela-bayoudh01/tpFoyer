package com.example.tpfoyer.repositories;


import com.example.tpfoyer.entity.Foyer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FoyerRepository extends JpaRepository<Foyer,Long> {

    List<Foyer> findByNomFoyerContainingIgnoreCase(String nom);
    Long countByCapaciteFoyerGreaterThan(Long capacite);
}
