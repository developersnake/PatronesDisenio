package org.example.abstractfactory.impl;

import org.example.abstractfactory.AbstractFactory;
import org.example.abstractfactory.AbstractProduct;

public class ConcreteProductAFactory implements AbstractFactory {
    @Override
    public AbstractProduct createAbstractProduct() {
        return new ProductA();
    }
}
