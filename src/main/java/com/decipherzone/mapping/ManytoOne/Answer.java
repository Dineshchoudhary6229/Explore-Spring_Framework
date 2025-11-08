package com.decipherzone.mapping.ManytoOne;

import jakarta.persistence.*;

@Entity
public class Answer {

    @Id
    @Column(name= "Answer_Id")
    private int answerId;

    @Column(name = "Answer")
    private String answer;

  @ManyToOne
  @JoinColumn(name = "Question_id")
    private Question question;

    public Answer() {

    }

    public int getAnswerId() {
        return answerId;
    }

    public void setAnswerId(int answerId) {
        this.answerId = answerId;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }

    public Answer(int answerId, String answer, Question question) {
        this.answerId = answerId;
        this.answer = answer;
        this.question = question;
    }
}
