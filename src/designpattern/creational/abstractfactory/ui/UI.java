package designpattern.creational.abstractfactory.ui;

import designpattern.creational.abstractfactory.button.Button;
import designpattern.creational.abstractfactory.textbox.TextBox;

public interface UI {
    Button createButton();
    TextBox createTextBox();
}
