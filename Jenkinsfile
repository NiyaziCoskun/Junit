pipeline  {
    agent any

    tools{
     maven '3.8.4'
    }
    stages{
     stage('Build'){
       steps{
         bat 'mvn test -Dgroups="dev"'

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
