package ArraylistObjectStudentGeneric;

import java.util.ArrayList;
import java.util.List;

public class NewGeneric {public static void main(String[] args) {
	
	
	List <Integer>l= new ArrayList<>();
	l.add(12);
	l.add(15);
	l.add(24);
	l.add(13);
	l.add(108);
	l.add(112);
	l.add(104);


	for(Integer f:l) {System.out.println(f);}
}

}
