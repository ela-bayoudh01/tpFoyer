package com.example.tpfoyer.repositories;


import com.example.tpfoyer.entity.Chambre;
import com.example.tpfoyer.entity.TypeChambre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ChambreRepository extends JpaRepository<Chambre,Long> {


    // Trouver les chambres par type
    List<Chambre> findByTypeC(TypeChambre type);

    // Trouver les chambres avec un numéro supérieur à une valeur
    List<Chambre> findByNumeroChambreGreaterThan(Long numero);

    // Compter les chambres d'un bloc
    Long countByBlocIdBloc(Long blocId);


}
