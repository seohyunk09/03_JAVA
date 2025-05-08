package javastudy.ch17.sec04.exam01;


import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
class Product {
    private int pno;
    private String name;
    private String company;
    private int price;
}
