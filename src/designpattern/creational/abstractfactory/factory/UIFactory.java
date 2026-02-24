package designpattern.creational.abstractfactory.factory;

import designpattern.creational.abstractfactory.ui.DarkUI;
import designpattern.creational.abstractfactory.ui.LightUI;
import designpattern.creational.abstractfactory.ui.UI;

public class UIFactory {
    public static UI getInstance(String instanceName) {
        return switch (instanceName.toUpperCase()) {
            case "DARK" -> new DarkUI();
            case "LIGHT" -> new LightUI();
            default -> null;
        };
    }
}
