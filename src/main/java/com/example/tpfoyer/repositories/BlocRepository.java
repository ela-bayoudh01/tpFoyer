package com.example.tpfoyer.repositories;


import com.example.tpfoyer.entity.Bloc;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BlocRepository extends JpaRepository<Bloc,Long> {

    // Trouver tous les blocs d'un foyer donné (via la relation ManyToOne)
    List<Bloc> findByFoyerIdFoyer(Long foyerId);

    // Trouver les blocs dont le nom contient une chaîne (recherche partielle)
    List<Bloc> findByNomBlocContainingIgnoreCase(String nomBloc);

    // Compter les blocs d'un foyer donné
    Long countByFoyerIdFoyer(Long foyerId);

    // Trouver les blocs avec une capacité supérieure à une valeur
    List<Bloc> findByCapaciteBlocGreaterThan(Long capacite);
}
