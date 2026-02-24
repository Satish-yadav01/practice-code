package designpattern.creational.abstractfactory;

import designpattern.creational.abstractfactory.factory.UIFactory;
import designpattern.creational.abstractfactory.ui.UI;

public class AbstractFactoryMain {
    public static void main(String[] args) {
        UI dark = UIFactory.getInstance("DARK");
        dark.createButton().createButton();
        UI light = UIFactory.getInstance("LIGHT");
        light.createButton().createButton();
    }
}
