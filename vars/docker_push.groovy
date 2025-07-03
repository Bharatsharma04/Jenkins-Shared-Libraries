def call(String Project, String ImageTag, String dockerHubUser){
  withCredentials([usernamePassword(credentialsID: 'DockerHubCred', passwordVariable: 'dockerHubPass', usernameVariable: 'dockerHubUser')]){
    sh "docker login -u ${dockerhubuser} -p ${dockerhubpass}"
  }
  sh "docker push ${dockerhubuser}/${Project}:${ImageTag}"
}
