package assignment2.student;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Student {

    @Id
    private String id;
    private String name;
    private int yearEnrolled;
    private String[] courseTaken;
    private int semester;

    public Student() {

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getyearEnrolled() {
        return yearEnrolled;
    }

    public void setyearEnrolled(int yearEnrolled) {
        this.yearEnrolled = yearEnrolled;
    }

    public String[] getcourseTaken() {
        return courseTaken;
    }

    public void setcourseTaken(String[] courseTaken) {
        this.courseTaken = courseTaken;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }
}
