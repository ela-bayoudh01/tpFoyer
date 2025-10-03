package com.example.tpfoyer.entity;


import jakarta.persistence.*;

import java.io.Serializable;
import java.util.List;

@Entity
public class Bloc implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idBloc;
    private String nomBloc;
    private Long capaciteBloc;

    @OneToMany(mappedBy = "bloc")
    private List<Chambre> chambres;

    @ManyToOne(cascade = CascadeType.ALL)
    private Foyer foyer;


}
