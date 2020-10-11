/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jhw.example.spring_a.rest;

import com.jhw.example.spring_a.core.module.SpringACoreModule;
import com.jhw.example.spring_a.repo.module.SpringARepoModule;
import org.springframework.stereotype.Component;

/**
 *
 * @author Jesus Hernandez Barrios (jhernandezb96@gmail.com)
 */
@Component
public class A_SpringA {

    public static final String BASE_PACKAGE = "com.jhw.example.spring_a";

    static {
        SpringACoreModule.init(SpringARepoModule.init());
    }
}
