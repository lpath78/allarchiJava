package com.allarchi.allarchi.model.dao;

import com.allarchi.allarchi.model.enities.ParticipantMairie;
import com.allarchi.allarchi.model.enities.Projet;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ParticipantMairieRepository extends CrudRepository<ParticipantMairie, Integer> {
}
