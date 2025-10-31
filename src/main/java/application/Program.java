package application;

import entities.Product;
import util.UpperCaseName;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));

        //a função map aplica uma função a cada elemento da stream
        //gerando uma nova stream com elementos transformados
        //o map só funciona para stream, e não para list
        //por isso convertemos para stream : list.stream()
        //depois convertendo a stream para list de novo : collect(Collectors.toList()
        //reference method com metodo estático
        //Product::nonStaticUpperCaseName vai aplicar
        //o metodo nao estático a cada elemento da lista
        List<String> names = list.stream().map(Product::nonStaticUpperCaseName).collect(Collectors.toList());

        names.forEach(System.out::println);

    }
}
