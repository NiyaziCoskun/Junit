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
     post{


        always  {
                    emailext body: '', recipientProviders: [buildUser()], subject: '', to: 'omeryttnc@gmail.com'         }

        cleanWs()
     }
 }

}
