package com.example;

public class Product {

    // atributos encapsulados
    private String name;
    private Integer id;
    private Double price;

    // constructores
    // constructor vacio
    public Product() {
    }

    public Product(String name, Integer id, Double price) {
        this.name = name;
        this.id = this.id;
        this.price = price;
    }

    // métodos GETTER. devuelven atributo

    public String getName() {
        return name;
    }

    public Integer getId() {
        return id;
    }

    public Double getPrice() {
        return price;
    }

    // métodos SETTER. poner atributo

    public void setName(String name) {
        this.name = name;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
