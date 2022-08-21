// Jenkinsfile
pipeline {
    agent any

    stages {
        stage('Foo') {
            steps {
                script {
                     DeclarativeFooStage(this).execute('something', false)
                }
            }
        }
    }
}
