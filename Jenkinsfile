pipeline {
    agent any
    stages {
        stage('Jenkins Jogador') {
            steps {
                echo 'Jenkins Jogador'
            }
        }
        stage('Build') { 
            steps {
                sh 'mvn clean install'
            }
        }      
    }
}