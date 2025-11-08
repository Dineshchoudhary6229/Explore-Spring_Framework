//OnetoOne mapping
package com.decipherzone.mapping.OnetoOne;

import jakarta.persistence.*;

@Entity
public class Question {

    @Id
    @Column(name= "Question_Id")
    private int questionId;
    @Column(name = "Question")
    private String question;

    // use for one to one mapping i.e one question is mapped to one answer
    //(cascade = CascadeType.ALL) if we use this we don't need to save ans1 and ans2 in MapApp
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "Answer_Id")
    private Answer answer;


    public int getQuestionId() {
        return questionId;
    }

    public void setQuestionId(int questionId) {
        this.questionId = questionId;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public Answer getAnswer() {
        return answer;
    }

    public void setAnswer(Answer answer) {
        this.answer = answer;
    }

    public Question(int questionId, String question, Answer answer) {
        this.questionId = questionId;
        this.question = question;
        this.answer = answer;
    }

    public Question() {
    }
}
