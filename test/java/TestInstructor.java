import org.junit.Assert;
import org.junit.Test;

public class TestInstructor {

    @Test
    public void implementationTest(){
        Student student = new Student("Darren", 299, 40);
        Student[] students = new Student[4];
        students[0] = new Student("Jadyn", 304, 35);
        students[1] = new Student("Dean", 303, 40);
        students[2] = new Student("Yasmin", 300, 30);
        students[3] = new Student("Asher", 301, 30);

        Instructor instructor = new Instructor("Mikaila", 100);
        instructor.teach(student,30);
        instructor.lecture(students,120);

        Assert.assertEquals(30, 30,0);
        Assert.assertEquals(120,120,0);
    }

    @Test
    public void inheritanceTest(){
        Instructor instructor = new Instructor("Peter", 201);
        instructor.setName("Mikaila");

        Assert.assertEquals("Mikaila", instructor.getName());
    }

    @Test
    public void teachTest(){
        Student student = new Student("Darren", 299, 40);
        Instructor instructor = new Instructor("Marsu", 190);
        instructor.teach(student, 15);

        Assert.assertEquals(55, student.getTotalStudyTime(),0);
    }

    @Test
    public void lectureTest(){
        Student[] javaStudents = new Student[2];
        javaStudents[0] = new Student("Darren", 299, 0);
        javaStudents[1] = new Student("Raymundo", 306, 0);

        Instructor instructor = new Instructor("Pro", 210);
        instructor.lecture(javaStudents, 50);

        Assert.assertEquals(25, javaStudents[0].getTotalStudyTime(),0);
        Assert.assertEquals(25, javaStudents[1].getTotalStudyTime(),0);
    }
}
