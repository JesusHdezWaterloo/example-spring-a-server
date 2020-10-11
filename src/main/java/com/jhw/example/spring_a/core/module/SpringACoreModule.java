package com.jhw.example.spring_a.core.module;

import com.clean.core.app.modules.AbstractModule;
import com.clean.core.app.modules.DefaultAbstractModule;
import com.google.inject.Guice;
import com.google.inject.Injector;

/**
 * Modulo de Kanban-core.
 *
 * @author Jesus Hernandez Barrios (jhernandezb96@gmail.com)
 */
public class SpringACoreModule extends DefaultAbstractModule {

    private final Injector inj = Guice.createInjector(new SpringACoreInjectionConfig());

    private static SpringACoreModule INSTANCE;

    public static SpringACoreModule getInstance() {
        if (INSTANCE == null) {
            throw new NullPointerException("El modulo de Spring A no se ha inicializado");
        }
        return INSTANCE;
    }

    public static SpringACoreModule init(AbstractModule repoModule) {
        INSTANCE = new SpringACoreModule();
        INSTANCE.registerModule(repoModule);
        return getInstance();
    }

    @Override
    protected <T> T getOwnImplementation(Class<T> type) {
        return inj.getInstance(type);
    }

    @Override
    public String getModuleName() {
        return "Kanban Core Module";
    }

}
