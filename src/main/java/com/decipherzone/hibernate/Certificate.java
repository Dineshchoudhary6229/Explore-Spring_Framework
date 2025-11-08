//Embedding certificate class field  as column in student table with @Embeddable and
// @Embedded annotation

package com.decipherzone.hibernate;
import jakarta.persistence.Embeddable;

@Embeddable              // this is use to make this class fields embedded in Student
public class Certificate {
    private String course;
    private int duration;

    public Certificate() {
    }

    public Certificate(String course, int duration) {
        this.course = course;
        this.duration = duration;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}
