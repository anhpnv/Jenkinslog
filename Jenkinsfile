@Library('Jenkinslog')_
pipeline {
    agent any
    options {
        ansiColor('xterm')
    }
    stages {
        stage('Build') {
            steps {
                script {
                    echo "2"
                }
            }
        }
        stage('Test'){
            steps {
                script {
                    log.info "Lorem ipsum dolor sit amet, consectetur adipiscing elit."
                }
            }
        }
    }
}