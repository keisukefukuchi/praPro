package projava;

public class InstanceMethod {
    record Student(String name,int englishScore, int mathScore){}

    public static void main(String[] args) {
        Student kis = new Student("kis", 60,80);
        int average = average(kis);
        System.out.println("平均点は、%dです。".formatted(average));
    }

    static int average(Student s) {
        return (s.englishScore() + s.mathScore())/2;
    }
}
