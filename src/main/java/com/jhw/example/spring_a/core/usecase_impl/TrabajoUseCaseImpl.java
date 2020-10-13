package com.jhw.example.spring_a.core.usecase_impl;

import com.clean.core.app.usecase.DefaultCRUDUseCase;
import com.jhw.example.spring_a.core.domain.TrabajoDomain;
import com.jhw.example.spring_a.core.module.SpringACoreModule;
import com.jhw.example.spring_a.core.repo_def.TrabajoRepo;
import com.jhw.example.spring_a.core.usecase_def.TrabajoUseCase;
import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;

public class TrabajoUseCaseImpl extends DefaultCRUDUseCase<TrabajoDomain> implements TrabajoUseCase {

    private final TrabajoRepo repo = SpringACoreModule.getInstance().getImplementation(TrabajoRepo.class);

    public TrabajoUseCaseImpl() {
        super.setRepo(repo);
    }

    @Override
    public List<TrabajoDomain> upperBasico() throws Exception {
        return findAll().stream().filter((TrabajoDomain t)
                -> t.getSalarioMinimo().compareTo(BigDecimal.TEN) >= 0
        ).collect(Collectors.toList());
    }
}
