pipeline {
    agent any

    stages {
        stage('Clone Repository') {
            steps {
                git 'https://github.com/hoisurendra/spring-boot-example.git'
            }
        }

        stage('Build') {
            steps {
                script {
                    sh 'mvn clean install -DskipTests'
                }
            }
        }

        stage('Test') {
            steps {
                script {
                    sh 'mvn test'
                }
            }
        }

        stage('Publish Results') {
            steps {
                archiveArtifacts artifacts: '**/target/*.jar', allowEmptyArchive: true
                junit '**/target/surefire-reports/*.xml'
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
