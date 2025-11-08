//OnetoOne mapping

package com.decipherzone.mapping.OnetoOne;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.io.IOException;

public class MapApp {

    public static void main(String[] args) throws IOException {

        // Load configuration and create SessionFactory
        Configuration cfg = new Configuration().configure("Hibernate-OnetoOne.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();

        //Creating Question object
        Question q1= new Question();
        q1.setQuestionId(10);
        q1.setQuestion("What is java");



        //Creating answer object
        Answer ans1= new Answer();
        ans1.setAnswerId(100);
        ans1.setAnswer("java is programming language ");

        q1.setAnswer(ans1);

        Question q2= new Question();
        q2.setQuestionId(11);
        q2.setQuestion("What is full form of jvm");

        Answer ans2= new Answer();
        ans2.setAnswerId(111);
        ans2.setAnswer("java virtual machine ");

        q2.setAnswer(ans2);

// to save objects use this Session
        Session session= factory.openSession();
// want to changes in  physical database  and permanently so use transaction
        session.beginTransaction();

//save question object
        session.persist(q1);
        session.persist(q2);
//        session.persist(ans1);      //instead of this use @OneToOne((cascade = CascadeType.ALL))
//        session.persist(ans2);      //in Question class on field Answer answer.



        session.getTransaction().commit();
//fetching from database but we must know question id
        Question question = (Question) session.get(Question.class,11);
        System.out.println(question.getQuestion());
        System.out.println(question.getAnswer().getAnswer());

        session.close();
        factory.close();

        System.out.println("Code checked , all working😊....");
    }
}
