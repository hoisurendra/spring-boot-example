pipeline {
    agent any

    stages {
        stage('Clean') {
            steps {
                sh 'mvn clean'
            }
        }

        stage('Compile') {
            steps {
                sh 'mvn compile'
            }
        }

        stage('Package') {
            steps {
                sh 'mvn package'
            }
        }

        stage('Install') {
            steps {
                sh 'mvn install'
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
