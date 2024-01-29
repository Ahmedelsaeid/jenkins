// vars/customBuildFunction.groovy

def call() {
    // Logic for the build stage
    echo 'Building the application...'
    // Add your build commands or scripts here
   stages {
        stage('Checkout') {
            steps {
                script {
                    git branch: 'main', url: 'https://github.com/Ahmedelsaeid/spring-boot-app'
                }
            }
        }
}
