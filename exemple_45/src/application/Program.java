package application;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Program {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
		
		//Using map(Predicate<T>)
		Stream<Integer> st1 = list.stream().map(x -> x * 10);
		System.out.println(Arrays.toString(st1.toArray()));
		
		//using Stream.of
		Stream<String> st2 = Stream.of("Maria", "João", "Pedro");
		System.out.println(Arrays.toString(st2.toArray()));
		
		//Using iterate
		Stream<Integer> st3 = Stream.iterate(0, x -> x + 2 );
		System.out.println(Arrays.toString(st3.limit(10).toArray()));
		
		//Fibonacci Sequency
		Stream<Long> fs = Stream.iterate(new Long[]{0L, 1L}, x -> new Long[]{x[1], x[0] + x[1]}).map(x -> x[0]);
      	System.out.println("Fibonacci Sequence:");
		System.out.println(Arrays.toString(fs.limit(10).toArray()));
		
	}
}
