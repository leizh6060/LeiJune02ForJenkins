// Jenkinsfile
@Library('june02Lib') _
import org.*
pipeline {
    agent any

    stages {
        stage('Foo') {
            steps {
                script {
               def d = new     DeclarativeFooStage(this).execute('something', false)
                }
            }
        }
    }
}
