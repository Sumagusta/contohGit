package dasar.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task {

	public List<String> namaArray() {
		List<String> nama = new ArrayList<String>();
		nama.add("Intan");
		nama.add("Maulida");
		return nama;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<List<String>> triangle = new ArrayList<List<String>>();
		
		

	    List<String> row1 = new ArrayList<String>(1);
	    row1.add("Jeruk");
	    triangle.add(row1);

	    List<String> row2 = new ArrayList<String>(2);
	    row2.add("Pepaya");row2.add("Apel");
	    triangle.add(row2);

	    triangle.add(Arrays.asList("Sirsak","Jambu","Nanas"));
	    triangle.add(Arrays.asList("Buah Naga","Pisang","Avocado","Anggur"));
	    
	    Task nmArr = new Task();
	    
	    List<String> namaArray = nmArr.namaArray();
	    
	    System.out.println("Size = "+ triangle.size()+"\n");
	    for (int i=0; i<namaArray.size();i++)
	        System.out.println(namaArray.get(i));
		
	}

}
