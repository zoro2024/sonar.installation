def call() {
    slackSend channel: 'ninja', color: 'good', message: "SonarQube deployed successfully. Build no: "${BUILD_NUMBER}" job name: "${JOB_NAME}".", tokenCredentialId: 'slack-token', username: 'akshit kapil'
}     
