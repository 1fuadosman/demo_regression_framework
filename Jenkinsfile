node('master') {
   stage('Checkout') {
   //ToDO: need the repsoitory here
    git ''
   }

   stage('Build') {
    sh 'mvn clean'
    sh 'mvn compile'
    sh 'chmod 777 target/classes/webDrivers/geckodriver'
    sh 'chmod 777 target/classes/webDrivers/chromedriver'
   }

   stage('Test') {
    sh 'mvn verify -DBrowserType=Chrome -DAUT=https://www.facebook.com/'
   }

   stage('Cucumber report') {
           cucumber buildStatus: 'FAILED',
                   fileIncludePattern: '**/*.json',
                   trendsLimit: 10,
                   sortingMethod: 'ALPHABETICAL'
       }

}