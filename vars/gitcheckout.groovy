def call() {
    def repoUrl = 'https://github.com/zoro2024/sonar.installation.git'
    def branch = 'main'

    checkout([$class: 'GitSCM',
              branches: [[name: "refs/heads/$branch"]],
              userRemoteConfigs: [[url: repoUrl]]
    ])
}
