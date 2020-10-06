import org.junit.Assert;
import org.junit.Test;

public class TestPerson {

    @Test
    public void constructorTest(){
        Person person = new Person("Darren", 229);
        Assert.assertEquals("Darren", person.getName());
        Assert.assertEquals(229, person.getId());
    }

    @Test
    public void setNameTest(){
        Person person = new Person("Darren", 229);
        person.setName("Reema");
        Assert.assertEquals("Reema", person.getName());
    }
}
