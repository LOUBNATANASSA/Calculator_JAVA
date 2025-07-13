pipeline {
    agent any

    stages {
        stage('Cloner le projet') {
            steps {
                echo 'Le code est déjà cloné automatiquement par Jenkins avec Jenkinsfile.'
            }
        }

        stage('Lister les fichiers') {
            steps {
                bat 'dir'
            }
        }

        stage('Exécuter un message') {
            steps {
                echo 'Pipeline exécuté depuis le Jenkinsfile du dépôt GitHub 💡'
            }
        }
    }
}
