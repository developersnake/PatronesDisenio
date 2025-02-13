package org.example;

import org.example.abstractfactory.impl.AbstractProductFactory;
import org.example.abstractfactory.impl.ConcreteProductAFactory;
import org.example.abstractfactory.impl.ConcreteProductBFactory;
import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(Main.class.getName());

        var factory = new AbstractProductFactory();

        //var productA = factory.getProduct(new ConcreteProductAFactory());
        //var productB = factory.getProduct(new ConcreteProductBFactory());


        var productA = factory.getProductById("ProductA");
        var productB = factory.getProductById("ProductB");

        logger.info("ProductA: " + productA.commonMethod());
        logger.info("ProductB: " + productB.commonMethod());
    }
}