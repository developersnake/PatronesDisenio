package org.example.abstractfactory;

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
