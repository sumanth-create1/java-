class Student {
    private String name;
    private int rollno;

    public void setName(String name) {
        this.name = name;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public String getName() {
        return name;
    }

    public int getRollno() {
        return rollno;
    }
}


class Teacher{ // default access modifiers
    String name;
    String subject;

    public void setName(String name) {
        this.name = name;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getName() {
        return name;
    }

    public String getSubject() {
        return subject;
    }
}

public class accessmodifiers {

    public static void main(String[] args) {
        Student s1 = new Student();

        // s1.setName("satya");
        // s1.setRollno(1);

        // System.out.println(s1.name + " " + s1.rollno);
        // System.out.println(s1.getName() + " " + s1.getRollno()); // private access for this variables so there is no access to this .

        //only classes with only same package can only access it ......

        Teacher t1 = new Teacher(); // deafult access modifiers...........
        t1.setName("govind");
        t1.setSubject("Maths");

        System.out.println("the teacher name is " + t1.name + " and teaches " + t1.subject);
    }
}
