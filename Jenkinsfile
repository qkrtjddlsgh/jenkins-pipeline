pipeline {
  agent any
  stages {
    stage('build') {
      steps {
        sh 'mvn clean package tomcat:redeploy -P production -D maven.test.skip=true'
      }
    }

    stage('get gcloud credential') {
      steps {
        echo 'gcloud container clusters get-credentials mpay-prd --region asia-northeast3 --project lguplus-toy-project'
      }
    }
    
    stage('deploy') {
      steps {
        echo 'skaffold run --tag $BUILD_ID --cache-artifacts=false'
      }
    }

  }
}
