package com.neoteric.java_29102024.collectionpractice;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.*;

public class MapPractice {
    public static void main(String[] args) {
        Logger logger = LogManager.getLogger(MapPractice.class);

        Map<String,Integer> marks = new HashMap<>();
        marks.put("Telugu",70);
        marks.put("English",80);
        marks.put("Hindi",70);
        marks.put("Maths",80);
        marks.put("Science",70);
        marks.put("Social",60);

      Set<Map.Entry<String,Integer>> entrySet = marks.entrySet();    //  Entryset()  object of  set reference of entry
      Iterator <Map.Entry<String,Integer>> iterator = entrySet.iterator();

  while (iterator.hasNext()){
    Map.Entry<String,Integer> entry =  iterator.next();
    logger.info( " using Iterator "+ entry.getKey() + " value: " +entry.getValue());
  }

  marks.entrySet().stream().forEach(entry2->
      logger.info(" using Streams " +entry2.getKey() + "value: " +entry2.getValue()));



        Map<String,Integer> sortedMarks  = new TreeMap<>();
        sortedMarks.put("Telugu",70);
        sortedMarks.put("English",80);
        sortedMarks.put("Hindi",70);
        sortedMarks.put("Maths",80);
        sortedMarks.put("Science",70);
        sortedMarks.put("Social",60);

        sortedMarks.entrySet().stream().forEach(entry3->
                logger.info(" sorted using Tree Map " +entry3.getKey() + "value: " +entry3.getValue()));
    }
}
