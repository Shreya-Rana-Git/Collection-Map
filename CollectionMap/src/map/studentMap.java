package map;

import java.util.HashMap;

public class studentMap {

	public static void main(String[] args) {
		//arrays of student id and marks
		String studentIds[]= {"S1","S2","S3"};
		Integer studentMarks[]= {89,80,90};
		
		//declaring the map
		HashMap<String, Integer> student = new HashMap<>();
		
		//add key and values in the map
		for(int i=0;i<studentIds.length;i++) {
			student.put(studentIds[i], studentMarks[i]);
		}
		
		//displaying the size of map
		System.out.println("The size of the student map : "+ student.size());
		
		//displaying the map
		student.forEach((key,value)->{
			System.out.println("Student Id: "+ key+" , Marks: "+value);
		});

	}

}
