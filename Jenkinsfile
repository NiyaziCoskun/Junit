pipeline  {
    agent any

    tools{
     maven '3.8.4'

    }

    stages{
     stage('Build'){
       steps{
         bat 'mvn test -P myTag'

         }
       }
     }
     post {
         failure {
           emailext([
               body: "${projectName} build failed, see: ${env.BUILD_URL}",
               mimeType: "text/html",
               replyTo: "<reply-email>",
               recipientProviders: [[$class: "CulpritsRecipientProvider"]],
               subject: "${projectName} build (${sourceBranch}) - Failure",
               to: "${omeryttnc@gmail.com,omeryttnc@hotmail.com}"
           ])
         }
         always {
           deleteDir()
         }
       }

}
