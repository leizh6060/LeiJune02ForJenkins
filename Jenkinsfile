// Jenkinsfile
pipeline {
    agent any

    stages {
        stage('Foo') {
            steps {
                script {
                    new DeclarativeFooStage(this).execute('something', false)
                }
            }
        }
    }
}
