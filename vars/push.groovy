def call(String Project, String ImageTag, String dockerhubuser){
  withCredentials([usernamePassword(credentialsId: 'JenkinsCred', passwordVariable: 'dockerPass', usernameVariable: 'dockerUser')]) {
      sh "docker login -u ${dockerUser} -p ${dockerPass}"
  }
  sh "docker push ${dockerUser}/${Project}:${ImageTag}"
}
