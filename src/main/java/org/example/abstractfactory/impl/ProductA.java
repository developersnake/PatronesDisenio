package org.example.abstractfactory.impl;

import org.example.abstractfactory.AbstractProduct;

public class ProductA implements AbstractProduct {
    @Override
    public String commonMethod() {
        return "ProductA";
    }
}
