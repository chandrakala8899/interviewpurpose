package com.neoteric.java_29102024.product;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.*;
import java.util.function.Predicate;

public class ProductServiceUsingHashMap {
    private static final Logger logger = LogManager.getLogger(ProductServiceUsingHashMap.class);
    public static void main(String[] args) {

        HashMap<Integer,Product> productHashMap = new HashMap<>();
        Product product1 = new Product(1, 200, "keyboard");
        Product product2 = new Product(3, 150, "mouse");
        Product product3 = new Product(2, 50000, "laptop");
        Product product4 = new Product(4, 200, "keyboard");

        productHashMap.put(product1.getproductId(),product1);
        productHashMap.put(product2.getproductId(),product2);
        productHashMap.put(product3.getproductId(),product3);
        productHashMap.put(product4.getproductId(),product4);


      int productIdKey = 3;
      Product productValue = productHashMap.get(productIdKey);

      if(productValue!= null)
          logger.info(" productValue " + productIdKey +  " :" + productValue.getName());

     // using  For loop
        for(Map.Entry<Integer,Product> entry : productHashMap.entrySet()){
            Product product = entry.getValue();
           logger.info(" using For loop " + product.getName().hashCode());
        }

        Predicate<Product> productPredicate = product ->
                product.getName().equals("keyboard");

  // for loop with Predicate
        for(Product product : productHashMap.values()) {
            if (productPredicate.test(product)) {
               logger.info(" Matching Product KeyBoard with Product Id " + product.getproductId());
            }
        }

    //Using Iterator

        Predicate<Map.Entry<Integer, Product>> productPredicate1 = entry -> entry.getValue().getName().contains("key");

        // Get the entry set and iterate
        Set<Map.Entry<Integer, Product>> entryset = productHashMap.entrySet();
        Iterator<Map.Entry<Integer, Product>> entry = entryset.iterator();

        for(;entry.hasNext();) {
            Map.Entry<Integer, Product> entrymap = entry.next();
            if (productPredicate1.test(entrymap)) {
                logger.info(entrymap.getKey()+ " -> " + entrymap.getValue());
            }
          logger.info("Iterator " + entrymap.hashCode());
        }

         // using Streams

        productHashMap.entrySet().stream().forEach(entry1->
                    logger.info(entry1.getKey() + " " + entry1.getValue() ));


   // using streams with filter
        productHashMap.values().stream().filter(productPredicate).forEach(product ->
                        logger.info(" Matching Product KeyBoard with Product Id " + product.getproductId()));

        logger.info(" Matching Product " +  productHashMap.values().stream().filter(productPredicate).count()); //count

        // sorting convert map into Treemap
        TreeMap<Integer,Product> sortedMap1 = new TreeMap<>(productHashMap);
        logger.info("   sorted keys ");
        Iterator <Map.Entry<Integer,Product>> treeMapIterator =  sortedMap1.entrySet().iterator();
        for(;treeMapIterator.hasNext();){
            Map.Entry<Integer,Product> entry1= treeMapIterator.next();
            logger.info("  Sorting using Tree Map object as a key " +  " Key: "+entry1.getKey() +"Value:  " + entry1.getValue()) ;

        }

        TreeMap<Product,Integer> sortedMap2 = new TreeMap<Product,Integer>();
        logger.info(" sorted keys ");
        sortedMap2.put(product1,4);
        sortedMap2.put(product2,3);
        sortedMap2.put(product3,2);
        sortedMap2.put(product4,1);



      Iterator <Map.Entry<Product,Integer>> treeMapIterator1 =  sortedMap2.entrySet().iterator();
      for(;treeMapIterator.hasNext();){
          Map.Entry<Product,Integer> enrty = treeMapIterator1.next();
          logger.info("  Sorting " +  " Key: "+enrty.getKey() +"Value:  " + enrty.getValue()) ;

      }

    //  iterate using key
        Iterator<Product> productkeyIterator = sortedMap2.keySet().iterator();
      for(;productkeyIterator.hasNext();){
        Product product  = productkeyIterator.next();
        logger.info("key:" + product);
      }
        Iterator<Integer> valueIterator = sortedMap2.values().iterator();

        for(;valueIterator.hasNext();) {
            Integer value = valueIterator.next();
          logger.info("Value: " + value);
        }
        System.out.println("Product " + sortedMap2.keySet());
        System.out.println("Product values " + sortedMap2.values());




    }

}
