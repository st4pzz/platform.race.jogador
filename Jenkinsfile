pipeline {
    agent any
    stages {
        stage('Jenkins jogador') {
            steps {
                echo 'Jenkins jogador'
            }
        }
        stage('Build') { 
            steps {
                sh 'mvn clean install'
            }
        }      
    }
}