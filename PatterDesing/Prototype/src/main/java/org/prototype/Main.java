package org.prototype;

import org.prototype.prototype.PriceList;
import org.prototype.prototype.Product;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        PriceList priceList = new PriceList("Lista normal");
        List<Product> productList = List.of(
                new Product("Computadora", 650.0),
                new Product("Mouse", 50.0),
                new Product("Teclado", 100.0),
                new Product("Impresora", 500.0)
        );
        priceList.setProductList(productList);
        System.out.println(priceList);

        PriceList priceList2 = (PriceList) priceList.clone();
        priceList2.setName("Lista Preferencial");
        for (Product product: priceList2.getProductList()){
            product.setPrice(product.getPrice()*0.9);
        }

        System.out.println(priceList2);

        PriceList priceList3 = (PriceList) priceList.deepClone();
        priceList3.setName("Lista Descuentos");
        System.out.println(priceList3);

    }
}