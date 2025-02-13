package org.example.abstractfactory.impl;

import org.example.abstractfactory.AbstractProduct;

public class ProductB implements AbstractProduct {
    @Override
    public String commonMethod() {
        return "ProductB";
    }
}
