package Consumer;

public class Test {

public static void main(String[] args) {
	Common c = new Common();
	Producer p= new Producer(c);
	Consumer c1= new Consumer(c);
	
	p.start();
	
	c1.start();
	
}
}
