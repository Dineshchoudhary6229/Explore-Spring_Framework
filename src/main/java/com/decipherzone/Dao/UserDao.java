package com.decipherzone.Dao;

import com.decipherzone.model.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Repository
public class UserDao {

    @Autowired
    private SessionFactory sessionFactory;

    private Session getSession() {
        return sessionFactory.getCurrentSession();
    }
    @Transactional
    public int saveUser(User user) {
        Object id = getSession().save(user);
        return Integer.parseInt(id.toString());
    }

    public User getUser(int id) {
        return getSession().get(User.class, id);
    }
// show all users
    public List<User> getAllUsers() {
        return getSession().createQuery("FROM User", User.class).list();
    }

// update the user
    public void updateUser(User user) {
        getSession().merge(user);
    }
//delete the user
    public void deleteUser(int id) {
        User u = getSession().get(User.class, id);
        if (u != null) {
            getSession().remove(u);
        }
    }
}


/* this we use when we use hibernate 5 , tomcat 9 or below and spring 5 then we use Hibernate Template
otherwise we have to remove hibernate template and have to use above configuration
@Repository
public class UserDao {

    @Autowired
    private HibernateTemplate hibernateTemplate;
    public int saveUser(User user){
        int id=(Integer) this.hibernateTemplate.save(user);
        return id;
    }
}
*/