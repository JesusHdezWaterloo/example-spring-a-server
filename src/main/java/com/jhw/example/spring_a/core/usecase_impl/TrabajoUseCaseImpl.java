package com.jhw.example.spring_a.core.usecase_impl;

import com.clean.core.app.usecase.DefaultCRUDUseCase;
import com.jhw.example.spring_a.core.domain.TrabajoDomain;
import com.jhw.example.spring_a.core.module.SpringACoreModule;
import com.jhw.example.spring_a.core.repo_def.TrabajoRepo;
import com.jhw.example.spring_a.core.usecase_def.TrabajoUseCase;

public class TrabajoUseCaseImpl extends DefaultCRUDUseCase<TrabajoDomain> implements TrabajoUseCase {

    private final TrabajoRepo repo = SpringACoreModule.getInstance().getImplementation(TrabajoRepo.class);

    public TrabajoUseCaseImpl() {
        super.setRepo(repo);
    }

}
