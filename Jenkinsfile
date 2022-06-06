@Library('june02Lib@main') _
import codeInsrc.*
pipeline {
    agent any;
    stages {
        stage('01') {
            steps {
                script {
                
                 def x= new doIt()
                    println x
                }
                //println doItLei("stage 01")
              //  executeScript()
            }
        }
        stage('02') {
            steps {
              script {
                
                 def x= new doIt()
                    println x
                }
            }
        }
    }
}
