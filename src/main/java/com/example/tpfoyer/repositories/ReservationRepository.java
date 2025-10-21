package com.example.tpfoyer.repositories;


import com.example.tpfoyer.entity.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface ReservationRepository extends JpaRepository<Reservation,String> {

    List<Reservation> findByAnneeUniversitaire(Date annee);
    List<Reservation> findByEstValideTrue(); // Réservations validées
    List<Reservation> findByChambreIdChambre(Long chambreId);
}
