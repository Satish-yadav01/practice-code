package designpattern.creational.factory.profession;

public class TeacherProfession implements Profession {
    @Override
    public String getProfession() {
        return "Teacher profession";
    }

    @Override
    public String workHour() {
        return "3hr Only";
    }
}
