public class Student extends Person implements Learner {
    private double totalStudyTime;

    public Student(String name, long id, double totalStudyTime) {
        super(name, id);
        this.totalStudyTime = totalStudyTime;
    }

    @Override
    public void learn(double numberOfHours) {
        totalStudyTime += numberOfHours;
    }

    @Override
    public double getTotalStudyTime() {
        return totalStudyTime;
    }
}

