pipeline {
    agent any
    stages {
        stage('Jenkins partida') {
            steps {
                echo 'Jenkins partida'
            }
        }
        stage('Build') { 
            steps {
                sh 'mvn clean install'
            }
        }      
    }
}