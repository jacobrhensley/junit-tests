import java.util.ArrayList;

public class Student {
    String firstName;
    String lastName;
    Long id;
    ArrayList<Integer> grades;


    public Student(String firstName, String lastName, Long id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.grades = new ArrayList<>();
    }

//    public Student(){
//        this.grades = new ArrayList<>();
//    }

    // returns the student's id
    public long getId() {
        return this.id;
    }

    public void setId(Long id){
        this.id = id;
    }

    // returns the student's name
    public String getName() {
        return this.firstName + " " + this.lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    // adds the given grade to the grades list
    public void addGrade(int grade) {
        this.grades.add(grade);
    }

    // returns the average of the students grades
    public double getGradeAverage() {
        Long gradesSum = 0L;
        for(int grade : grades){
           gradesSum += grade;
        }
        return gradesSum/ grades.size();
    }

}

