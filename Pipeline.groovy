pipeline {
    agent any
    tools {
        jdk 'Java'
    }
    stages {
         stage('Clone') {
            steps {
                git branch: 'main', url: 'https://github.com/Sasi1406/hello-world-spring-boot.git'
            }
         }
      stage('Build') {
            steps {
                bat 'mvn clean package'
            }
        }
        stage('Docker Image') {
            steps {
                bat 'docker build -f Dockerfile .'
            }
        }
        
    }
}