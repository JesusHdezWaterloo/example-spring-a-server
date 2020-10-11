/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jhw.example.spring_a.repo.utils;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Jesus Hernandez Barrios (jhernandezb96@gmail.com)
 */
public class ResourcesSpringA {

    public static final String SCHEMA = "test_a";

    public static EntityManagerFactory EMF;

    public static void initEMF() {
        try {
            //EMF = Persistence.createEntityManagerFactory("example-spring-a-serverPU", MySQLHandler.propertiesMap(SCHEMA));
            EMF = Persistence.createEntityManagerFactory("example-spring-a-serverPU");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
