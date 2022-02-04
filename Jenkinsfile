pipeline{
    agent any
    tools{
tool name: '3.8.4', type: 'maven'
    }
    stages{
        stage{
            steps{
                bat "mvn clean install"
                  }
             }
         }
      }
