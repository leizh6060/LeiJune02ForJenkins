@Library('june02Lib@main') _
import codeInsrc.*
    
pipeline {
    agent any;
    stages {
        stage('01') {
                  steps {
                     
               
                script { 
                     def d = new doIt(this)
			
			d.a_method()
                   //def x= new MultiMethod(name);
		
                }
            }
        }

    }
}
