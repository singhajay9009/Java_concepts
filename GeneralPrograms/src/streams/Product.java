package streams;

import java.util.List;

class Product{
    int id;
    String name;
    Double price;
    List<String> items;

    public Product(int id, String name, Double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void setItems(List<String> items){
        this.items = items;
    }

    public List<String> getItems(){
        return this.items;
    }
}

