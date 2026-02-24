package designpattern.creational.abstractfactory.textbox;

public class DarkTextBox implements TextBox {
    @Override
    public void createTextBox() {
        System.out.println("Creating Dark Text Box");
    }
}
