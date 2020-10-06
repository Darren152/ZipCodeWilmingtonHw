import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class TestPeople {

    @Test
    public void addTest(){
        List<Person> personList = new ArrayList<>();
        personList.add(0,new Person("Darren", 299));
        personList.add(1,new Person("Yasmin", 302));
        personList.add(2,new Person("Jadyn", 307));

        People people = new People();
        people.add(personList);

        Assert.assertEquals(personList.get(0),people.findById(299));
        Assert.assertEquals(3, people.count());
    }

    @Test
    public void removeTest() {
        List<Person> personList = new ArrayList<>();
        personList.add(0, new Person("Darren", 299));
        personList.add(1, new Person("Yasmin", 302));
        personList.add(2, new Person("Jadyn", 307));

        People people = new People();
        people.add(personList);
        people.remove(299);
        people.remove(personList.get(0));

        Assert.assertEquals(1, people.count());
    }

    @Test
    public void findByIdTest(){
        List<Person> personList = new ArrayList<>();
        personList.add(0, new Person("Darren", 299));
        personList.add(1, new Person("Yasmin", 302));
        personList.add(2, new Person("Jadyn", 307));

        People people = new People();
        people.add(personList);

        Assert.assertEquals(personList.get(1), people.findById(302));
    }
}
