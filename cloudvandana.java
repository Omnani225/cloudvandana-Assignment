package Java;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class cloudvandana {

	public static void main(String[] args) {
        List<Integer> myArray = new ArrayList<>();
        myArray.add(1);
        myArray.add(2);
        myArray.add(3);
        myArray.add(4);
        myArray.add(5);
        myArray.add(6);
        myArray.add(7);

        Collections.shuffle(myArray);
        System.out.println(myArray);


	}

}

