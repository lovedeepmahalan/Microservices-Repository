package RoughPageForPractice;

import java.util.Optional;
import java.util.function.Function;
public class Test{
	public static void main(String[] args) {
		Function<String,Integer> p=String::length;
		System.out.println(p.apply("Lovedeeo"));
		Optional<String> opt = Optional.of("nitin");
		opt.ifPresent(System.out::println);
	}
}