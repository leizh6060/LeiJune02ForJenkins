
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
                   //def x= new MultiMethod(name);
		
                }
            }
        }

    }
}
