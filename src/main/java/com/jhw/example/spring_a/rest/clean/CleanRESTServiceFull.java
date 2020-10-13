/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jhw.example.spring_a.rest.clean;

import com.clean.core.app.usecase.CRUDUseCase;
import com.jhw.example.spring_a.core.SpringAConstants;
import java.beans.PropertyChangeListener;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Jesus Hernandez Barrios (jhernandezb96@gmail.com)
 * @param <T>
 */
@RestController
public class CleanRESTServiceFull<T> implements CRUDUseCase<T> {

    protected final CRUDUseCase<T> uc;

    public CleanRESTServiceFull(CRUDUseCase<T> cleanUC) {
        this.uc = cleanUC;
    }

    @Override
    @PostMapping(SpringAConstants.PATH_TRABAJO_CREATE)
    public T create(@RequestBody T t) throws Exception {
        return uc.create(t);
    }

    @Override
    @GetMapping(SpringAConstants.PATH_TRABAJO_FIND_ALL)
    public List<T> findAll() throws Exception {
        return uc.findAll();
    }

    @Override
    @PostMapping(SpringAConstants.PATH_TRABAJO_EDIT)
    public T edit(@RequestBody T t) throws Exception {
        return uc.edit(t);
    }

    @Override
    @PostMapping(SpringAConstants.PATH_TRABAJO_DESTROY)
    public T destroy(@RequestBody T t) throws Exception {
        return uc.destroy(t);
    }

    @Override
    @PostMapping(SpringAConstants.PATH_TRABAJO_DESTROY_ID)
    public T destroyById(@RequestBody Object id) throws Exception {
        return uc.destroyById(id);
    }

    @Override
    @GetMapping(SpringAConstants.PATH_TRABAJO_FIND_BY)
    public T findBy(@PathVariable("id") Object id) throws Exception {
        return uc.findBy(Integer.parseInt(id.toString()));
    }

    @Override
    @GetMapping(SpringAConstants.PATH_TRABAJO_COUNT)
    public int count() throws Exception {
        return uc.count();
    }

    @Override
    public void addPropertyChangeListener(PropertyChangeListener pl) {
        uc.addPropertyChangeListener(pl);
    }

    @Override
    public void removePropertyChangeListener(PropertyChangeListener pl) {
        uc.removePropertyChangeListener(pl);
    }

}