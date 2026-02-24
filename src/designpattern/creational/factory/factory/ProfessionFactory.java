package designpattern.creational.factory.factory;

import designpattern.creational.factory.profession.DoctorProfession;
import designpattern.creational.factory.profession.EngineerProfession;
import designpattern.creational.factory.profession.Profession;
import designpattern.creational.factory.profession.TeacherProfession;

public class ProfessionFactory {

    public Profession getProfession(String profession) {
        if (profession == null || profession.isBlank()) {
            throw new IllegalArgumentException("Profession must not be null or empty.");
        }
        return switch (profession.toUpperCase()) {
            case "TEACHER" -> new TeacherProfession();
            case "ENGINEER" -> new EngineerProfession();
            case "DOCTOR" -> new DoctorProfession();
            default -> null;
        };
    }
}
