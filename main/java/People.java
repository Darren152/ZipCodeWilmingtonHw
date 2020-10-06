import java.util.Iterator;
import java.util.List;

public class People implements Iterable<Person> {
    private List<Person> personList;

    public void add(List<Person> person){
        this.personList = person;
    }

    public Person findById(long id){
        for (Person person : personList){
            if(person.getId()==(id)){
                return person;
            }
        }
        return null;
    }

    public boolean contains(Person person){
        return this.personList.contains(person);
    }

    public List<Person> remove(Person person){
        personList.remove(person);
        return personList;
    }

    public void remove(long id){
        personList.removeIf(person -> person.getId() == id);
    }

    public void removeAll(List<Person> person){
        personList.removeAll(person);
    }

    public int count(){
        return personList.size();
    }

    public Person[] toArray(){
        return personList.toArray(new Person[0]);
    }

    public Iterator iterator(){
        return personList.listIterator();
    }

}