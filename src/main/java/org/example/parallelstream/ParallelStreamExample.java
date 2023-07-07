package org.example.parallelstream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ParallelStreamExample {
  public static void main(String[] args) {

    List<String> listOfNames = Arrays.asList("bod", "gerry", "sam");

    var upperCaseNames = listOfNames.parallelStream()
        .map(String::toUpperCase)
        .collect(Collectors.toList());

    System.out.println(upperCaseNames);


  }
}