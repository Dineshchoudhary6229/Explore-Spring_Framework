//OnetoOne mapping
package com.decipherzone.mapping.OnetoOne;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Answer {

    @Id
    @Column(name= "Answer_Id")
    private int answerId;
    @Column(name = "Answer")
    private String answer;

//Bi-directional mapping now with this as we done in Question and Answer both
// mappedby tells that which class column is used for joining these two
    @OneToOne (mappedBy = "answer")
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

    public Answer(int answerId, String answer) {
        this.answerId = answerId;
        this.answer = answer;
    }
}
