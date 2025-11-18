def call(string ProjectName, ImageTag, string DockerHubUser){
                sh "docker build -t ${DockerHubUser}/${ProjectName}:${ImageTag} ."
}
