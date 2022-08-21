// Jenkinsfile
@Library('june02Lib') _
import org.foo*

def utils = new Utilities(this)
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
