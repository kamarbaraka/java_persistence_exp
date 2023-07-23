package persistent_objects;

import org.hibernate.Transaction;
import org.junit.jupiter.api.Test;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * test unit class for item persistence.
 * @author kamar baraka.
 * @since 23/07/2023*/
class ItemTest {

    /**
     * tests the persistence of item objects*/
    @Test
    public void itemTest(){

        /*construct an entity manager factory from which construct an entity manager*/
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory(
                "inventory_management"
        );

        try
        {
            /*construct an entity manager and from it construct an entity transaction*/
            EntityManager entityManager = entityManagerFactory.createEntityManager();
            EntityTransaction transaction = entityManager.getTransaction();

            /*construct four items for persistence*/
            Item spoon = new Item("spoon", 45.0);
            Item plate = new Item("plate", 65.0);
            Item pencil = new Item("pencil", 15.0);
            Item book= new Item("book", 85.0);

            /*begin transaction*/
            transaction.begin();

            /*transactional operations (persist items)*/
            entityManager.persist(spoon);
            entityManager.persist(plate);
            entityManager.persist(pencil);
            entityManager.persist(book);

            /*commit the transaction*/
            transaction.commit();


        }
        finally {
            /*close the entity manager factory*/
            entityManagerFactory.close();
        }
    }

    @Test
    public void itemRetrievalTest(){

        /*construct an entity manager factory*/
        EntityManagerFactory factory = Persistence.createEntityManagerFactory(
                "inventory_management"
        );

        /*construct an entity manager from the entity manager factory*/
        try {
            /*construct entity manager from which you get the transaction*/
            EntityManager manager = factory.createEntityManager();
            EntityTransaction transaction = manager.getTransaction();

            /*construct a container to hold the retrieved data*/
            List<Item> itemList;

            /*begin the transaction to retrieve data*/
            transaction.begin();

            /*perform transactional operations*/
            itemList = manager.createQuery("select item from Item item where itemName='spoon'",
                    Item.class).getResultList();

            /*commit the transaction and print the result*/
            transaction.commit();
            itemList.forEach(System.out::println);

        }
        finally {
            /*close the entity manager factory*/
            factory.close();
        }
    }
}