package com.allarchi.allarchi.model.dao;

import com.allarchi.allarchi.model.enities.ParticipantEntreprise;
import com.allarchi.allarchi.model.enities.Projet;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ParticipantEntrepriseRepository extends CrudRepository<ParticipantEntreprise, Integer> {
}
