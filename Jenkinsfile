pipeline {
    agent any;
    stages {
        stage('01') {
            steps {
                println doIt("stage 01")
                executeScript()
            }
        }
        stage('02') {
            steps {
                println doIt("stage 02")
                executeScript()
            }
        }
    }
}
