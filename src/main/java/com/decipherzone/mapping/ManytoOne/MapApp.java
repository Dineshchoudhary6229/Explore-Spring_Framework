package com.decipherzone.mapping.ManytoOne;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MapApp {
    public static void main(String[] args) throws IOException {


        SessionFactory factory = new Configuration()
                .configure("Hibernate-ManytoOne.cfg.xml")
                .buildSessionFactory();

//        //Creating Question object
//        Question q3= new Question();
//        q3.setQuestionId(11);
//        q3.setQuestion("What is java");
//
//
//
//        //Creating multiple answers of same question
//       Answer ans3= new Answer();
//        ans3.setAnswerId(100);
//        ans3.setAnswer("java is programming language ");
//        ans3.setQuestion(q3);
//
//
//        Answer ans4= new Answer();
//        ans4.setAnswerId(110);
//        ans4.setAnswer("with the help of java we can create softwares");
//        ans4.setQuestion(q3);
//
//        Answer ans5= new Answer();
//        ans5.setAnswerId(120);
//        ans5.setAnswer("java has different types of frameworks");
//        ans5.setQuestion(q3);
//
//
//
//        List<Answer> list= new ArrayList<Answer>();
//        list.add(ans3);
//        list.add(ans4);
//        list.add(ans5);
//
//        q3.setAnswers(list);

// to save objects use this Session
        Session session= factory.openSession();
// want to changes in  physical database  and permanently so use transaction
        session.beginTransaction();



//save question object
//        session.persist(q3);
//        session.persist(ans3);
//        session.persist(ans4);
//        session.persist(ans5);

//to retrieve/fetch  question data in console
        Question q= (Question) session.get(Question.class,11);
        System.out.println(q.getQuestion());

//to retrieve/fetch answers in console through list we use for loop or for each loop
        for(Answer a: q.getAnswers()){
            System.out.println(a.getAnswer());
        }

        session.getTransaction().commit();

        session.close();
        factory.close();

        System.out.println("Code checked , all working😊....");
    }
}


