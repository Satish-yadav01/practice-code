package designpattern.creational.factory.profession;

public class DoctorProfession implements Profession {
    @Override
    public String getProfession() {
        return "Doctor Profession";
    }

    @Override
    public String workHour() {
        return "5hr Only";
    }
}
