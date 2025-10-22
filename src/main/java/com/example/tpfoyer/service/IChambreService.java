package com.example.tpfoyer.service;


import com.example.tpfoyer.entity.Chambre;

import java.util.List;
//CONTIENT LE MENU DES SERVICES DE CHAMBRE

public interface IChambreService {
    public List<Chambre> retrieveAllChambres();

    public Chambre retrieveChambre(Long chambreId);

    public Chambre addChambre(Chambre c);

    public void removeChambre(Long chambreId);

    public Chambre modifyChambre(Chambre chambre);

// just n3arif bi les methodes sans implementation !
// Here we will add later methods calling keywords and methods calling JPQl

}
