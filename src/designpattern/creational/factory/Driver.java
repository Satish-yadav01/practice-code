package designpattern.creational.factory;

import designpattern.creational.factory.factory.ProfessionFactory;
import designpattern.creational.factory.profession.Profession;

import java.util.ArrayList;

public class Driver {
    public static void main(String[] args) {
        Profession teacher = new ProfessionFactory().getProfession("teacher");

        System.out.println(teacher.getProfession());
        System.out.println(teacher.workHour());
    }
}
