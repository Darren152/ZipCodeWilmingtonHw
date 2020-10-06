public class Instructor extends Person implements Teacher{

    public Instructor(String name, long id) {
        super(name, id);
    }

    @Override
    public void teach(Learner learner, double numberOfHours) {
        learner.learn(numberOfHours);
    }

    @Override
    public void lecture(Learner[] learner, double numberOfHours) {
        double numberOfHoursPerLearner = numberOfHours / learner.length;
        for(Learner learners: learner){
            learners.learn(numberOfHoursPerLearner);
        }
    }
}
