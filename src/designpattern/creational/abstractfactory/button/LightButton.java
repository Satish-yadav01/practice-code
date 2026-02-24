package designpattern.creational.abstractfactory.button;

public class LightButton implements Button {
    @Override
    public void createButton() {
        System.out.println("Creating Light Button!!");
    }
}
