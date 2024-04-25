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

        stage('Docker Image Build') {
            steps {
                sh 'docker build -t custom-nginx-image .'
            }
        }

        stage('Docker Container Run') {
            steps {
                sh 'docker run -d -p 8000:8000 custom-nginx-image'
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
