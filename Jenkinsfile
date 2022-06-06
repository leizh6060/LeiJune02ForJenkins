@Library('june02Lib@main') _
import codeInsrc.*
    def doIt = new doIt()
pipeline {
    agent any;
    stages {
        stage('01') {
           when {
                expression { doIt.buildIsUatApproved() }
            }
            steps {
                echo "The build has been approved!!!"
            }
        }

    }
}
