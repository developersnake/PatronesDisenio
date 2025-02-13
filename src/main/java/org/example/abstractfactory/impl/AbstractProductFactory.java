package org.example.abstractfactory.impl;

import org.example.abstractfactory.AbstractFactory;
import org.example.abstractfactory.AbstractProduct;

public class AbstractProductFactory {

    public AbstractProduct getProduct(AbstractFactory factory) {
        return factory.createAbstractProduct();
    }

public AbstractProduct getProductById(String id) {
       if("ProductA".equalsIgnoreCase(id)) {
           return new ConcreteProductAFactory().createAbstractProduct();
       } else {
           return new ConcreteProductBFactory().createAbstractProduct();
       }
    }
}
