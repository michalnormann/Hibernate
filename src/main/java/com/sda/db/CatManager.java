package com.sda.db;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class CatManager {

    private static final String INSERT_INTO_CATS_NAME_BIRTH_YEAR_COLOUR_VALUES = "INSERT INTO cats(name, birth_year, colour) VALUES (?, ?, ? )";

    public void createCats(Session session, Cat cat) {
        System.out.println("Saving Cat");
        Transaction transaction = session.getTransaction();
        transaction.begin();
        session.save(cat);
        transaction.commit();
        session.close();
    }

}
