
import org.junit.jupiter.api.Test;
import persistent_objects.Message;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MessageTest {

    @Test
    public void persistenceTest(){

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory(
                "customer_management.customer"
        );

        try{
            EntityManager entityManager = entityManagerFactory.createEntityManager();
            var session = entityManager.getTransaction();

            session.begin();

            Message message = new Message();
            message.setText("hello kamar");

            entityManager.persist(message);

            session.commit();

            session.begin();

            String messageSaved = entityManager.createQuery(
                    "select text from Message where id = 1", String.class
            ).getSingleResult();
            session.commit();

            assertAll(
                    () -> assertEquals("hello kamar", messageSaved)
            );

            entityManager.close();
        }
        finally {
            entityManagerFactory.close();
        }
    }

    @Test
    public void retrievalTest(){
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory(
                "customer_management.customer"
        );

        try {

            EntityManager entityManager = entityManagerFactory.createEntityManager();

            EntityTransaction session = entityManager.getTransaction();

            session.begin();
            List<Message> messages = entityManager.createQuery(
                    "select message from Message message", Message.class
            ).getResultList();

            messages.get(messages.size() - 1).setText("hello kamar my name is evans");
            session.commit();

            assertAll(
                    () -> assertEquals(1, messages.size()),
                    () -> assertEquals("hello kamar my name is evans", messages.get(0).getText())
            );

            entityManager.close();
        }
        finally {
            entityManagerFactory.close();
        }
    }
}
