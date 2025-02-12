package org.example.abstractfactory;

public class ConcreteProductAFactory implements AbstractFactory {
    @Override
    public AbstractProduct createAbstractProduct() {
        return new ProductA();
    }
}
