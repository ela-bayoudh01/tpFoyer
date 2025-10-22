package com.example.tpfoyer.service;

import com.example.tpfoyer.entity.Chambre;
import com.example.tpfoyer.repositories.ChambreRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
// @AllArgsConstructor
public class ChambreServiceImpl implements IChambreService {
    @Autowired //nestaaml constructeur ou setter  ou bien Autowired ki nji naaml Injection
    ChambreRepository chambreRepository; //c'est une interface repository

    @Override
    public List<Chambre> retrieveAllChambres() {
        return chambreRepository.findAll();//c'est une methode offerte déja genere par le jpa pas la peine tebda mawjouda fi repository , automatiquement majouda
    }
    @Override
    public Chambre retrieveChambre(Long chambreId) {
        return chambreRepository.findById(chambreId).get();
    }
    @Override
    public Chambre addChambre(Chambre c) {
        return chambreRepository.save(c);//sauvegarder un chambre et questionne est ce que l'id existant ou non d'abord
    }
    @Override
    public void removeChambre(Long chambreId) {
        chambreRepository.deleteById(chambreId);
    }
    @Override
    public Chambre modifyChambre(Chambre chambre) {
        return chambreRepository.save(chambre);
    }}
