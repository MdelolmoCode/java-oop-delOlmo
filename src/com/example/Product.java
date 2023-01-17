package com.example;

public class Product {

    // atributos encapsulados
    private String name;
    private Integer ID;
    private Double price;

    // constructores
    // constructor vacio
    public Product() {
    }

    public Product(String name, Integer id, Double price) {
        this.name = name;
        this.id = id;
        this.price = price;
    }

    // métodos GETTER. devuelven atributo
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getID() {
        return ID;
    }

    // métodos SETTER. poner atributo

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
