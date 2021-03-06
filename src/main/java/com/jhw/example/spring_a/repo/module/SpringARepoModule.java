package com.jhw.example.spring_a.repo.module;

import com.clean.core.app.modules.DefaultAbstractModule;
import com.google.inject.Guice;
import com.google.inject.Injector;
import com.jhw.example.spring_a.repo.utils.ResourcesSpringA;

/**
 * Modulo de Kanban-repo.
 *
 * @author Jesus Hernandez Barrios (jhernandezb96@gmail.com)
 */
public class SpringARepoModule extends DefaultAbstractModule {

    private final Injector inj = Guice.createInjector(new SpringARepoInjectionConfig());

    private static SpringARepoModule INSTANCE;

    private SpringARepoModule() {
        ResourcesSpringA.initEMF();
    }

    public static SpringARepoModule getInstance() {
        if (INSTANCE == null) {
            throw new NullPointerException("El modulo de Spring A no se ha inicializado");
        }
        return INSTANCE;
    }

    public static SpringARepoModule init() {
        INSTANCE = new SpringARepoModule();
        return getInstance();
    }

    @Override
    protected <T> T getOwnImplementation(Class<T> type) {
        return inj.getInstance(type);
    }

    @Override
    public String getModuleName() {
        return "Nomina Repo Module";
    }

}
