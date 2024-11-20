package com.neoteric.java_29102024.product;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.function.Predicate;

public class ProductServiceUsingLinkedList {
    private static  final Logger logger =  LogManager.getLogger(ProductServiceUsingLinkedList.class);
    public static void main(String[] args) {


        LinkedList<Product> linkedList = new LinkedList();

        Product product1 = new Product(1, 200, "keyboard");
        Product product2 = new Product(2, 150, "mouse");
        Product product3 = new Product(3, 50000, "laptop");
        Product product4 = new Product(4, 200, "keyboard");
         linkedList.add(product1);
        linkedList.add(product2);
        linkedList.add(product3);
        linkedList.add(product4);
        int startIndex = 0;
        int endIndex=linkedList.size();


// using for loop
        for(startIndex=0;startIndex<endIndex;startIndex++){
          Product currentProduct = linkedList.get(startIndex);
         logger.info( "using normal forloop"+currentProduct.getName().hashCode());

        }

        // using iterator

       Iterator<Product> productIterator = linkedList.iterator();
        for(;productIterator.hasNext();){
        //    linkedList.add(product4); it does not allow the concurrent modification
           Product product = productIterator.next();
           logger.info(" using iterator" + product.hashCode());
        }




  // using Streams
        linkedList.stream().forEach(product ->
                    logger.info(" using streams  " + product.getName().hashCode())

        );


      // apply filter
        Predicate<Product> productPredicate = product ->
           product.getName().equals("keyboard");


             linkedList.stream().filter(productPredicate).
              forEach(product ->
              logger.info(" matching product Keyboard with ProductId" + product.getName()));

           logger.info(" matching product" + linkedList.stream().filter(productPredicate).count());  // count


    }
}

