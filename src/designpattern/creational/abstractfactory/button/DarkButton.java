package designpattern.creational.abstractfactory.button;

public class DarkButton implements Button {
    @Override
    public void createButton() {
        System.out.println("Creating Dark Button!!");
    }
}
