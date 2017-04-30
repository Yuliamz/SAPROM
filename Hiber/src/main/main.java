package main;

import java.math.BigDecimal;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import logic.Person;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import logic.Position;
import logic.Product;
import org.hibernate.Query;

public class main {

    public static void main(String[] args) {
        Configuration cfg = new Configuration();
        cfg.configure("/main/hibernate.cfg.xml");
        SessionFactory fac = cfg.buildSessionFactory();
        Session sess = fac.openSession();
        Transaction transaction = sess.beginTransaction();
//		Position pos = new Position();
//		Person person = new Person();
//		Product product = new Product();
//		
//		pos.setName("PRESIDENTE");
//		pos.setSalary(new BigDecimal(12000000));
//		
//		person.setName("David");
//		person.setLastName("Verdugo");
//		person.setEmail("ferney.nino@uptc.edu.co");
//		person.setPhone(320995082);
//		person.setJob_id(15);
//		person.setSalary(120000);
//		person.setHire_date(new Date(12, 12, 1995));
//		person.setPositionCode(pos);
//		
//		product.setName("8 pulgadas");
//		product.setPrice("800000");
//		product.setQuality("Bajo");
//		product.setType("Calibre");
//		product.setPersonID(person);
//		
//		sess.persist(pos);
//		sess.persist(person);
//		sess.persist(product);
        transaction.commit();
//                
        System.out.println("Productos");
        List<Product> prod = sess.createQuery("from Product").list();
        prod.stream().forEach((product) -> {
            System.out.println(product.toString());
        });
        System.out.println("Cargos");
        List<Position> pos = sess.createQuery("from Position").list();
        pos.stream().forEach((posi) -> {
            System.out.println(posi.toString());
        });
        System.out.println("Personas");
        List<Person> per = sess.createQuery("from Person").list();
        per.stream().forEach((person) -> {
            System.out.println(person.toString());
        });
        System.out.println("Cargos que ganan mas de 1 millon");
        List<Position> posi = sess.createQuery("from Position where salary>1000000").list();
        posi.stream().forEach((positi) -> {
            System.out.println(positi.toString());
        });
        
        double promedio = (double) sess.createQuery("SELECT avg(p.salary) FROM Position p").uniqueResult();
        System.out.println("Promedio de salarios en cargos: "+promedio);
        
        sess.close();
    }
}
