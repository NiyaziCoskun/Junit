pipeline  {
    agent any

    tools{
     maven '3.8.4'
    }
    stages{
     stage('Build'){
       steps{
         bat "mvn clean install"
         }
       }

       stage('mail'){
       steps{
            emailext body: '', recipientProviders: [buildUser()], subject: '', to: 'omeryttnc@gmail.com'         }
       }
     }
     post{
        always  {
        cleanWs()
     }
 }

}
