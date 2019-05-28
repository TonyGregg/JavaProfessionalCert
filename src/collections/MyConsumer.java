package collections;

import java.util.function.Consumer;

//Consumer implementation that can be reused
class MyConsumer implements Consumer<Integer>{

	@Override
	public void accept(Integer t) {
		System.out.println("Consumer impl Value::"+t);
	}


}