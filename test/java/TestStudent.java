import org.junit.Assert;
import org.junit.Test;

public class TestStudent {

    @Test
    public void implementationTest(){
        Student student = new Student("Darren", 229, 40.5);
        Assert.assertEquals(40.5, student.getTotalStudyTime(),0);
    }

    @Test
    public void inheritanceTest(){
        Student student = new Student("Yasmin", 300, 35);
        Assert.assertEquals("Yasmin", student.getName());
    }

    @Test
    public void learnTest(){
        Student student = new Student("Corey", 301, 40);
        student.learn(5);
        Assert.assertEquals(45, student.getTotalStudyTime(),0);
    }
}
