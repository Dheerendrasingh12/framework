package com.arzds;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.arzds.model.Laptop;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        EntityManagerFactory emf=Persistence.createEntityManagerFactory("");
        EntityManager eM=emf.createEntityManager();
        
        Laptop laptop=eM.find(Laptop.class, 1);
    }
}
