package many_to_many;


import many_to_many.entity.Child;
import many_to_many.entity.Section;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ManyToMany {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Child.class)
                .addAnnotatedClass(Section.class)
                .buildSessionFactory();
        Session session = null;
        try {
            session = sessionFactory.getCurrentSession();
            //Section section = new Section("test");
            //Section section1 = new Section("test1");
            //Child child = new Child("test", 5);
            //Child child1 = new Child("test1", 6);
            //Child child2 = new Child("test2", 7);
            //section.addChild(child);
            //section.addChild(child1);
            //section.addChild(child2);
            //section1.addChild(child2);
            //section1.addChild(child);
            session.beginTransaction();
            int idSection = 1;
            Section section = session.get(Section.class, idSection);
            session.delete(section);
            int idChild = 4;
            Child child = session.get(Child.class, idChild);
            session.delete(child);
            //session.persist(section);
            //session.persist(section1);
            session.getTransaction().commit();
        } finally {
            session.close();
            sessionFactory.close();
        }
    }
}