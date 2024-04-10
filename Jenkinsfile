pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }
        stage('Build') {
            steps {
                // Use Maven to build your project
                sh 'mvn clean install'
            }
        }
        stage('Test') {
            steps {
                // Run tests if applicable
                sh 'mvn test'
            }
        }
        stage('Deploy') {
            steps {
                // Add your deployment steps here
                // For example, deploying to a server or a repository
            }
        }
    }
    post {
        success {
            // Actions to take after successful build
        }
        failure {
            // Actions to take after build failure
        }
    }
}
