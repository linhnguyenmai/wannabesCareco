public class Student {
    public String studentManagementNumber;
    public Integer coverageScore;
    public Integer age;
    public String className;

    public Student(String studentManagerNumber, Integer coverageScore, Integer age, String className) {
        this.studentManagementNumber = studentManagerNumber;
        this.coverageScore = coverageScore;
        this.age = age;
        this.className = className;
    }

    public void checkAge(){
        if (age<18){
            System.out.println("Age is under 18. Please enter a valid age.");
        }
    }

    public void checkCoverageScore(){
        if (coverageScore>=8){
            System.out.println("Student who gets the schoolarship");
        }
    }

    public void checkClass(){
        if (className != "A" && className != "C"){
            System.out.println("Please enter a valid class.");
        }
    }

}
