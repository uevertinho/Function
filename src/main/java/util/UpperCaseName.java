package util;

import entities.Product;

import java.util.function.Function;

public class UpperCaseName implements Function<Product, String> {

    //Função para transformar os nomes da lista para caixa alta
    @Override
    public String apply(Product p) {
        return p.getName().toUpperCase();
    }
}
