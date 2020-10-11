package com.jhw.example.spring_a.core.module;

import com.google.inject.AbstractModule;
import com.google.inject.Singleton;
import com.jhw.example.spring_a.core.usecase_def.TrabajoUseCase;
import com.jhw.example.spring_a.core.usecase_impl.TrabajoUseCaseImpl;

/**
 * Configuracion del injection del modulo de Kanban-core.
 *
 * @author Jesus Hernandez Barrios (jhernandezb96@gmail.com)
 */
public class SpringACoreInjectionConfig extends AbstractModule {

    @Override
    protected void configure() {
        bind(TrabajoUseCase.class).to(TrabajoUseCaseImpl.class).in(Singleton.class);
    }

}
