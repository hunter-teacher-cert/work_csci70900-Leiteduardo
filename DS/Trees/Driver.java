
import java.io.*;
import java.util.*;


public class Driver {
	public static void main(String[] args) {
		BSTrees t = new BSTrees();

		t.seed();
    //t.insert();
		
		int value;
    int front;
		//value = t.search(10);
		//System.out.println(value);
		//value = t.search(15);
		//System.out.println(value);
		//front = t.insert(17);
		//value = t.search(17);
		//System.out.println(value);
		//missing stuff from the video- going back to watching video
    try {
			value = t.search(17);
			System.out.println(value);
    } catch (NullPointerException e) {
		System.out.println("17 not in tree");
    }
		
	}
}
