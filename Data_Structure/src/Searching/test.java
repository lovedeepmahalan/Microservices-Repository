package Searching;

import java.util.Optional;
import java.util.function.Predicate;

public class test{
public static void main(String[] args){
//Creating an Optional Object with data
Optional<String> nonEmptyGender=Optional.of("male");

//Creating an Empty Optional Object
Optional<String> emptyGender=Optional.empty();
System.out.println("Lambda Expression :: "+nonEmptyGender.map(s->s.toUpperCase()));

System.out.println("Metho Reference"+nonEmptyGender.map(String::toUpperCase));

System.out.println();
System.out.println("Lambda Expression :: "+ emptyGender.map(s->s.toUpperCase()));

System.out.println("Method Reference ::"+emptyGender.map(String::toUpperCase));
System.out.println();
Predicate<String> p1 = gender-> gender.equals("MALE");
System.out.println(nonEmptyGender.filter(p1));
System.out.println(nonEmptyGender.filter(gender->

gender.equals("male")));

System.out.println(nonEmptyGender.filter(gender->

gender.equalsIgnoreCase("male")));
System.out.println();
}
}