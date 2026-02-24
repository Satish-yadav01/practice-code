package designpattern.creational.abstractfactory.textbox;

public class LightTextBox implements TextBox {
    @Override
    public void createTextBox() {
        System.out.println("Creating a light text box");
    }
}
