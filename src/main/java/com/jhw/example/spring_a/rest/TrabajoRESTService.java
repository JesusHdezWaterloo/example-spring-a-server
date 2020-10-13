/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jhw.example.spring_a.rest;

import com.jhw.example.spring_a.core.SpringAConstants;
import com.jhw.example.spring_a.core.domain.TrabajoDomain;
import com.jhw.example.spring_a.core.module.SpringACoreModule;
import com.jhw.example.spring_a.core.usecase_def.TrabajoUseCase;
import com.jhw.utils.spring.server.RESTServiceTemplateFull;
import java.util.List;
import org.springframework.web.bind.annotation.*;

/**
 *
 * @author Jesus Hernandez Barrios (jhernandezb96@gmail.com)
 */
@RestController
@RequestMapping(value = SpringAConstants.PATH_TRABAJO_GENERAL)
public class TrabajoRESTService extends RESTServiceTemplateFull<TrabajoDomain> implements TrabajoUseCase {

    private final TrabajoUseCase trabajoUC = SpringACoreModule.getInstance().getImplementation(TrabajoUseCase.class);

    public TrabajoRESTService() {
        setUseCase(trabajoUC);
    }

    @Override
    @GetMapping(SpringAConstants.PATH_TRABAJO_UPPER_BASICO)
    public List<TrabajoDomain> upperBasico() throws Exception {
        return trabajoUC.upperBasico();
    }

}
