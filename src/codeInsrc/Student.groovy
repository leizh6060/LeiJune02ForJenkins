package codeInsrc

class Student extends Person { 
   int StudentID 
   int Marks1; 
	
   //public Student() { 
    //  super(); 
   //}
	Student(StudentID,Marks1){
	this.StudentID = StudentID
	this.Marks1 = Marks1
	}
	
   def DisplayMarks(String Marks1) { 
      println(Marks1); 
   }  
} 
