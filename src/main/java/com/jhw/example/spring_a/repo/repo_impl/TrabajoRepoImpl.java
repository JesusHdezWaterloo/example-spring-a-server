package com.jhw.example.spring_a.repo.repo_impl;

import com.jhw.example.spring_a.core.domain.TrabajoDomain;
import com.jhw.example.spring_a.core.repo_def.TrabajoRepo;
import com.jhw.example.spring_a.repo.entities.Trabajo;
import com.jhw.example.spring_a.repo.utils.ResourcesSpringA;
import com.jhw.utils.jpa.JPACleanCRUDRepo;

public class TrabajoRepoImpl extends JPACleanCRUDRepo<TrabajoDomain, Trabajo> implements TrabajoRepo {

    public TrabajoRepoImpl() {
        super(ResourcesSpringA.EMF, TrabajoDomain.class, Trabajo.class);
    }

}
