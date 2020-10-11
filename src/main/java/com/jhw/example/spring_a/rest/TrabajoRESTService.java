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
import java.beans.PropertyChangeListener;
import java.util.List;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Jesus Hernandez Barrios (jhernandezb96@gmail.com)
 */
@RestController
@RequestMapping(value = SpringAConstants.PATH_TRABAJO_GENERAL)
public class TrabajoRESTService implements TrabajoUseCase {

    private final TrabajoUseCase colUC = SpringACoreModule.getInstance().getImplementation(TrabajoUseCase.class);

    @Override
    @ResponseBody
    @RequestMapping(SpringAConstants.PATH_TRABAJO_CREATE)
    public TrabajoDomain create(TrabajoDomain t) throws Exception {
        return colUC.create(t);
    }

    @Override
    @ResponseBody
    @RequestMapping(SpringAConstants.PATH_TRABAJO_EDIT)
    public TrabajoDomain edit(TrabajoDomain t) throws Exception {
        return colUC.edit(t);
    }

    @Override
    @ResponseBody
    @RequestMapping(SpringAConstants.PATH_TRABAJO_DESTROY)
    public TrabajoDomain destroy(TrabajoDomain t) throws Exception {
        return colUC.destroy(t);
    }

    @Override
    @ResponseBody
    @RequestMapping(SpringAConstants.PATH_TRABAJO_DESTROY_ID)
    public TrabajoDomain destroyById(Object o) throws Exception {
        return colUC.destroyById(o);
    }

    @Override
    @ResponseBody
    @RequestMapping(SpringAConstants.PATH_TRABAJO_FIND_BY)
    public TrabajoDomain findBy(Object o) throws Exception {
        return colUC.findBy(o);
    }

    @Override
    @ResponseBody
    @RequestMapping(SpringAConstants.PATH_TRABAJO_FIND_ALL)
    public List<TrabajoDomain> findAll() throws Exception {
        return colUC.findAll();
    }

    @Override
    @ResponseBody
    @RequestMapping(SpringAConstants.PATH_TRABAJO_COUNT)
    public int count() throws Exception {
        return colUC.count();
    }

    @Override
    public void addPropertyChangeListener(PropertyChangeListener pl) {
        colUC.addPropertyChangeListener(pl);
    }

    @Override
    public void removePropertyChangeListener(PropertyChangeListener pl) {
        colUC.removePropertyChangeListener(pl);
    }

}
