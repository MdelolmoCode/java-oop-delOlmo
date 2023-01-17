package com.example;

public class Main {
    public void main(String[] args){

        // producto creado desde 0
        Product product1 = new Product("producto 1", 23,5.25);

        Product product2 = new Product("producto 2", 75, 3.99)

        // producto vacio

        // Product product2 = new Product();

        // rellenar con setters

        // System.out.println("Añade nombre producto 2: " + product2.setName());
        // System.out.println("Añade ID producto 2: " + product2.setId());
        // System.out.println("Añade precio producto 2: " + product2.setPrice());

        // crear y rellenar producto con iteracion. (no sé hacerlo aún)
        /*
        for(int i=3, i<=5, i++){
            System.out.println("Añade nombre producto " + i ": " + product2.setName());
        }*/

        // crear 3 productos restantes

        Product product3 = new Product("producto 3", 1,20.22);
        Product product4 = new Product("producto 4", 80,10.50);
        Product product5 = new Product("producto 5", 3,1.05);
    }
}
