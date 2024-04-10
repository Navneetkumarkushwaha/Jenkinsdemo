[3:59 PM] Navneet Kushwaha
pipeline {

    agent any
 
    stages {

        stage('Build') {

            steps {

                // Use Maven as the build tool

                sh 'mvn clean package'

            }

        }
 
        stage('Test') {

            steps {

                // Run demo test cases

                sh 'mvn test'

            }

            post {

                // Fail the pipeline if tests fail

                always {

                    junit 'target/surefire-reports/**/*.xml'

                }

            }

        }
 
        stage('Deploy') {

            steps {

                // Deploy to a local server (modify as needed)

                sh 'scp target/my-application.war user@server:/path/to/deploy'

            }

        }
 
        stage('Clean Up') {

            steps {

                // Clean up temporary files

                sh 'mvn clean'

            }

        }

    }
 
    // Display a graphical representation of the pipeline stages

    post {

        always {

            script {

                if (currentBuild.result == null) {

                    currentBuild.result = 'SUCCESS'

                }

                if (currentBuild.result == 'FAILURE') {

                    currentBuild.result = 'FAILED'

                }

                updateGitlabCommitStatus name: 'jenkins', state: "${currentBuild.result.toLowerCase()}", buildState: "${currentBuild.result.toLowerCase()}", allowFailure: true

            }

        }

    }

}
