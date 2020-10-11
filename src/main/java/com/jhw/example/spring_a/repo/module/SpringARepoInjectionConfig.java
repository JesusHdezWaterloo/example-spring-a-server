package com.jhw.example.spring_a.repo.module;

import com.google.inject.AbstractModule;
import com.google.inject.Singleton;
import com.jhw.example.spring_a.core.repo_def.*;
import com.jhw.example.spring_a.repo.repo_impl.*;

/**
 * Configuracion del injection del modulo de Kanban-repo.
 *
 * @author Jesus Hernandez Barrios (jhernandezb96@gmail.com)
 */
public class SpringARepoInjectionConfig extends AbstractModule {

    @Override
    protected void configure() {
        bind(TrabajoRepo.class).to(TrabajoRepoImpl.class).in(Singleton.class);
    }

}
