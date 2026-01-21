package com.techwithdeep.kafka.model;

public class Course {
    private String courseId;
    private String title;
    private String tutor;
    private double price;

    public Course(){

    }

    public Course(String courseId, String title, String tutor, double price) {
        this.courseId = courseId;
        this.title = title;
        this.tutor = tutor;
        this.price = price;
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTutor() {
        return tutor;
    }

    public void setTutor(String tutor) {
        this.tutor = tutor;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseId='" + courseId + '\'' +
                ", title='" + title + '\'' +
                ", tutor='" + tutor + '\'' +
                ", price=" + price +
                '}';
    }
}
