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
import org.springframework.web.bind.annotation.*;

/**
 *
 * @author Jesus Hernandez Barrios (jhernandezb96@gmail.com)
 */
@RestController
@RequestMapping(value = SpringAConstants.PATH_TRABAJO_GENERAL)
public class TrabajoRESTService implements TrabajoUseCase {

    private final TrabajoUseCase trabajoUC = SpringACoreModule.getInstance().getImplementation(TrabajoUseCase.class);

    @Override
    @PostMapping(SpringAConstants.PATH_TRABAJO_CREATE)
    public TrabajoDomain create(@RequestBody TrabajoDomain t) throws Exception {
        return trabajoUC.create(t);
    }

    @Override
    @GetMapping(SpringAConstants.PATH_TRABAJO_FIND_ALL)
    public List<TrabajoDomain> findAll() throws Exception {
        return trabajoUC.findAll();
    }

    @Override
    @PostMapping(SpringAConstants.PATH_TRABAJO_EDIT)
    public TrabajoDomain edit(@RequestBody TrabajoDomain t) throws Exception {
        return trabajoUC.edit(t);
    }

    @Override
    @PostMapping(SpringAConstants.PATH_TRABAJO_DESTROY)
    public TrabajoDomain destroy(@RequestBody TrabajoDomain t) throws Exception {
        return trabajoUC.destroy(t);
    }

    @Override
    @PostMapping(SpringAConstants.PATH_TRABAJO_DESTROY_ID)
    public TrabajoDomain destroyById(@RequestBody Object id) throws Exception {
        return trabajoUC.destroyById(id);
    }

    @Override
    @GetMapping(SpringAConstants.PATH_TRABAJO_FIND_BY)
    public TrabajoDomain findBy(@PathVariable("id") Object id) throws Exception {
        return trabajoUC.findBy(Integer.parseInt(id.toString()));
    }

    @Override
    @GetMapping(SpringAConstants.PATH_TRABAJO_COUNT)
    public int count() throws Exception {
        return trabajoUC.count();
    }

    @Override
    public void addPropertyChangeListener(PropertyChangeListener pl) {
        trabajoUC.addPropertyChangeListener(pl);
    }

    @Override
    public void removePropertyChangeListener(PropertyChangeListener pl) {
        trabajoUC.removePropertyChangeListener(pl);
    }

}
