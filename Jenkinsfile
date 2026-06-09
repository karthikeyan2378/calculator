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

        stage('Docker Push') {
            steps {
                sh 'docker tag calculator-app karthikeyanml/calculator-app:${BUILD_NUMBER}'
                sh 'docker push karthikeyanml/calculator-app:${BUILD_NUMBER}'
            }
        }

        stage('Deploy to Kubernetes') {
            steps {
                sh 'kubectl apply -f k8s/'
            }
        }
    }
}