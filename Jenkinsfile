@Library('june02Lib@main') _
import codeInsrc.*
pipeline {
    agent any;
    stages {
        stage('01') {
            steps {
                script {
                
                 def x= new doIt("stage 01")
                    println x
                }
                //println doItLei("stage 01")
              //  executeScript()
            }
        }
        stage('02') {
            steps {
              script {
                
                 def x= new doIt("stage 02")
                    println x
                }
            }
        }
    }
}
