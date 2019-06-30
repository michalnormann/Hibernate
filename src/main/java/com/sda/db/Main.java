package com.sda.db;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {

        Configuration configuration = new Configuration();
        configuration.configure("hibernate.cfg.xml");
        SessionFactory sessionFactory = configuration.buildSessionFactory();

        Cat c = new Cat("Rys",2000,"Bordo");
        Cat c2 = new Cat("Kotlin",1999,"Black");

        CatManager catManager = new CatManager();
        catManager.createCats(sessionFactory.openSession(),c);
        catManager.createCats(sessionFactory.openSession(),c2);



    }
}
