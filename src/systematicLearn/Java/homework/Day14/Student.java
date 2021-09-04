package systematicLearn.Java.homework.Day14;

/**
 * @author lnh
 * @date 2021年06月19日 16:26
 */
public class Student {
    private int id;
    private Sex sex;
    private String name;
    private int classid;
    private int grades;

    public Student(int id, Sex sex, String name, int classid, int grades) {
        this.id = id;
        this.sex = sex;
        this.name = name;
        this.classid = classid;
        this.grades = grades;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getClassid() {
        return classid;
    }

    public void setClassid(int classid) {
        this.classid = classid;
    }

    public int getGrades() {
        return grades;
    }

    @Override
    public String toString() {
        return "Student{" + id +
                "-" + sex +
                "-'" + name + '\'' +
                "-" + classid +
                "-" + grades +
                '}';
    }

    public void setGrades(int grades) {
        this.grades = grades;
    }

    public static void main(String[] args) {
        Student s1=new Student(1108,Sex.WOMAN,"Eve",11,99);
        Student s2=new Student(1109,Sex.MAN,"Adam",11,99);
        Student s3=new Student(1110,Sex.MAN,"Alex",11,90);
        Student s4=new Student(1111,Sex.WOMAN,"Andy",11,89);
        Student s5=new Student(1112,Sex.MAN,"Frank",11,79);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
        System.out.println(s5);
    }
}
enum Sex{
    MAN,WOMAN
}