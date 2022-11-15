package com.tns.program1;
import java.util.*;
import java.util.stream.*;

public class StreamPip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// intermediate operation
		//map,filter,sorted
		
		//map
		List<String>names=Arrays.asList("Rakesh","Ravi","Ganesh","Vignesh");
		List<String> addend=names.stream().map(a->a+" kit").collect(Collectors.toList());
		List<Boolean> starts=names.stream().map(b->b.startsWith("V")).collect(Collectors.toList());
		System.out.println(addend);
		System.out.println(starts);
		
		//filter
		List<String> ends=names.stream().filter(b->b.endsWith("h")).collect(Collectors.toList());
		System.out.println(ends);
		
		
		//sorted
		List<String>names4=Arrays.asList("Rakesh","Ravi","Ganesh","Vignesh");
		List<String> like=names.stream().sorted().collect(Collectors.toList());
		System.out.println(like); 
		
		//Terminal Operations
		//collect,forEach,reduce
		
		List<Integer> num=Arrays.asList(7,8,4,6,7,4,5,9);
		
		//using Set
		Set<Integer> square =
		         num.stream().map(x->x*x).collect(Collectors.toSet());
		    System.out.println(square);
		    // foreach
		    num.stream().map(x->x*x).forEach(y->System.out.println(y));
		    System.out.println("--------------------");
		    //reduce method 
		    //here 0 is initial value
		    int even =num.stream().filter(x->x%2==0).reduce(0,(ans,i)-> ans+i);
		    System.out.println(even);
	}

}
