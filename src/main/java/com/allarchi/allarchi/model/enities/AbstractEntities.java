package com.allarchi.allarchi.model.enities;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
@MappedSuperclass
@NoArgsConstructor
public class AbstractEntities {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Getter
    private Integer id;
}