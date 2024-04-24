pipeline {
    agent any

    stages {
        stage('Maven Build Stage') {
            steps {
                sh 'mvn clean package'
            }
        }
    }

    post {
        success {
            echo 'Build is Success'
        }

        failure {
            echo 'Build is Failure'
        }
    }
 }
