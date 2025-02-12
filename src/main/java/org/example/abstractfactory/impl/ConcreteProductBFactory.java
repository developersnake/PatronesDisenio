package org.example.abstractfactory;

public class ConcreteProductBFactory implements AbstractFactory {
    @Override
    public AbstractProduct createAbstractProduct() {
        return new ProductB();
    }
}
