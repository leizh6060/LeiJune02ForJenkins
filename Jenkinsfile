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
                println doItLei("stage 02")
             //   executeScript()
            }
        }
    }
}
