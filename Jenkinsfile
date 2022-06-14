
@Library('june02Lib') _
import codeInsrc.*

pipeline {
    agent any;
    stages {
        stage('01') {
                  steps {
                     
               
                script { 
                     def d = new doIt(this)
			
			def String name = "Lei"
			d.a_method(name)
			d.showName(firstName:"Lei", lastName:"zhu")
			
                  Student st = new Student(); 
      st.StudentID = 1;
		
      st.Marks1 = 10; 
      st.name="Joe"; 
		
      println(st.name); 
      println(st.DisplayMarks()); 
		
                }
            }
        }

    }
}
