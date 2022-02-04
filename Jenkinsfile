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
     }
     post{
        always  {
        cleanWs()
     }
 }

}
