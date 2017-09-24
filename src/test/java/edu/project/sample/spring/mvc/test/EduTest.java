package edu.project.sample.spring.mvc.test;

import org.junit.Test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import edu.project.springmvc.entities.*;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class EduTest {
    @Test
    public void testMethod() {
        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder(11);
        String passwordAdmin = bCryptPasswordEncoder.encode("admin");
        String passwordUser = bCryptPasswordEncoder.encode("user");

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("SecurityUnit");
        EntityManager em = emf.createEntityManager();

        EntityTransaction tx = em.getTransaction();
        tx.begin();
        Group groupUsers = new Group("users");
        Group groupAdministrators = new Group("administrators");
        em.persist(groupUsers);
        em.persist(groupAdministrators);

        User admin = new User("admin", passwordAdmin, true);
        User user = new User("user", passwordUser, true);
        em.persist(admin);
        em.persist(user);

        GroupMember groupMemberAdmin = new GroupMember(admin, groupAdministrators);
        GroupMember groupMemberUser = new GroupMember(user, groupUsers);
        em.persist(groupMemberAdmin);
        em.persist(groupMemberUser);

        GroupAuthorities groupAuthorities1 = new GroupAuthorities(groupUsers, "ROLE_USER");
        GroupAuthorities groupAuthorities2 = new GroupAuthorities(groupAdministrators, "ROLE_USER");
        GroupAuthorities groupAuthorities3 = new GroupAuthorities(groupAdministrators, "ROLE_ADMIN");
        em.persist(groupAuthorities1);
        em.persist(groupAuthorities2);
        em.persist(groupAuthorities3);
        tx.commit();

        System.out.println(passwordAdmin);
        System.out.println(passwordUser);
    }
}
