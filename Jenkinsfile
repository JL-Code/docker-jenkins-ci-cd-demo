#!groovy

pipeline {
    agent any
    tools {
        maven 'apache-maven-3.6.2'
        jdk 'JDK1.8'
    }
    stages {
        stage('init') {
            steps {
                sh '''
                    echo "PATH = ${PATH}"
                    echo "M2_HOME = ${M2_HOME}"
                '''
            }
        }
        stage('checkout') {
            steps {
                git 'https://github.com/JL-Code/docker-jenkins-ci-cd-demo.git'
            }
        }

        stage('maven') {
            steps {
                sh 'mvn clean package -Dmaven.test.skip'
            }
            post {
                success {
                    archiveArtifacts artifacts: 'target/*.jar', fingerprint: true
                }
            }
        }
    }
}