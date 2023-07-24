package persistent_objects;

import org.junit.jupiter.api.Test;

import javax.persistence.*;

import static org.junit.jupiter.api.Assertions.*;

/**
 * a test unit class for the user entity
 * @author kamar baraka*/

class UserTest {

    /**
     * persistence test for the user entity */
    @Test
    public void userPersistenceTest(){

        /*construct an entity manager factory*/
        EntityManagerFactory factory = Persistence.createEntityManagerFactory(
                "users"
        );

        try {
            /*construct an entity manager from the factory*/
            EntityManager manager = factory.createEntityManager();

            /*construct a transaction from the manager*/
            EntityTransaction transaction = manager.getTransaction();

            /*construct objects to be persisted*/
            Address address = new Address("G.kago", "Thika", "Kenya", "250250");
            User kamar = new User();
            kamar.setAddress(address);
            kamar.setUsername("kamarbaraka");
            kamar.setFirstName("kamar");
            kamar.setLastName("baraka");
            kamar.setContact("kamar354baraka@gmail.com");
            kamar.setPassword("kamar254");

            /*begin the persisting transaction with the database*/
            transaction.begin();

            /*transactional operations
            * persist the user kamar*/
            manager.persist(address);
            manager.persist(kamar);

            /*commit the transaction*/
            transaction.commit();

        }
        finally {
            /*close the factory*/
            factory.close();
        }
    }

    /**
     * retrieval test for the user entity*/
    @Test
    public void userRetrievalTest(){

        /*construct the entity manager factory*/
        EntityManagerFactory factory = Persistence.createEntityManagerFactory(
                "users"
        );

        try {
            /*construct entity manager*/
            EntityManager manager = factory.createEntityManager();
            /*construct a transaction*/
            EntityTransaction transaction = manager.getTransaction();

            /*begin the transaction to retrieve data*/
            transaction.begin();

            /*create a query to retrieve data*/
            String userName = "kamarb";
            String rUser;
            try
            {
                rUser = manager.createQuery("select username from User user where username = :userName",
                        String.class).setParameter("userName", userName).getSingleResult();
            }
            catch (NoResultException exception){
                rUser = null;
            }

            /*commit the transaction*/
            transaction.commit();

            /*assert that userName == rUser*/
            assertEquals(userName, rUser, "expected "+ userName+" but got "+ rUser);
        }
        finally {
            /*close the factory*/
            factory.close();
        }
    }
}