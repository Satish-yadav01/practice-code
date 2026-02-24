package designpattern.creational.abstractfactory.ui;

import designpattern.creational.abstractfactory.button.Button;
import designpattern.creational.abstractfactory.button.DarkButton;
import designpattern.creational.abstractfactory.textbox.DarkTextBox;
import designpattern.creational.abstractfactory.textbox.TextBox;

public class DarkUI implements UI {
    @Override
    public Button createButton() {
        System.out.println("creating instance of DarkButton");
        return new DarkButton();
    }

    @Override
    public TextBox createTextBox() {
        return new DarkTextBox();
    }
}
