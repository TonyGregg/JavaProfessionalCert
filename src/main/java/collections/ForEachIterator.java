package collections;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ForEachIterator {
	public static void main(String []arg){
		List<Integer> myList = new ArrayList<Integer>();
		for(int i=0; i<10; i++) {
			myList.add(i);
		}
		for (Integer integer : myList) {
			System.out.println(integer);
		}
		
		
		myList.forEach(new Consumer<Integer>() {

			@Override
			public void accept(Integer t) {
				// TODO Auto-generated method stub
				System.out.println("For each anonymous class value "+t);
				
			}
			
		});
		
		//traversing with Consumer interface implementation
		MyConsumer myConsumer = new MyConsumer();
		myList.forEach(myConsumer);
		
	}

}
