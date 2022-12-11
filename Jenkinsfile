pipeline {
    agent any
    options {
        ansiColor('xterm')
    }
    stages {
        stage('Build') {
            steps {
                script {
                    log = load "log.groovy"
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