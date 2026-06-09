pipeline {
    agent any

    stages {

        stage('Build and Test') {
            steps {
                sh './gradlew clean build'
            }
        }

        stage('Docker Build') {
            steps {
                sh 'docker build -t calculator-app .'
            }
        }
    }
}