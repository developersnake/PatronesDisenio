package org.example.abstractfactory.impl;

import org.example.abstractfactory.AbstractFactory;
import org.example.abstractfactory.AbstractProduct;

public class ConcreteProductBFactory implements AbstractFactory {
    @Override
    public AbstractProduct createAbstractProduct() {
        return new ProductB();
    }
}
