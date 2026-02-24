package designpattern.creational.abstractfactory.ui;

import designpattern.creational.abstractfactory.button.Button;
import designpattern.creational.abstractfactory.button.LightButton;
import designpattern.creational.abstractfactory.textbox.LightTextBox;
import designpattern.creational.abstractfactory.textbox.TextBox;

public class LightUI implements UI {
    @Override
    public Button createButton() {
        return new LightButton();
    }

    @Override
    public TextBox createTextBox() {
        return new LightTextBox();
    }
}
