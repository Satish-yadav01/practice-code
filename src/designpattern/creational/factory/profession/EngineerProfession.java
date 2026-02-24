package designpattern.creational.factory.profession;

public class EngineerProfession implements Profession {
    @Override
    public String getProfession() {
        return "Engineer Profession";
    }

    @Override
    public String workHour() {
        return "8 hr Only";
    }
}
