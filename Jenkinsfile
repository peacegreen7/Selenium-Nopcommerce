pipeline {
    agent any
    stages {
        stage('Start Selenium Grid') {
            steps {
                sh 'docker-compose up -d'
            }
        }
        stage('Run Tests') {
            steps {
                sh 'mvn clean test'
            }
        }
        stage('Stop Selenium Grid') {
            steps {
                sh 'docker-compose down'
            }
        }
    }
}
