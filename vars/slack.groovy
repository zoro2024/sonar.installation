
def call(String configFile) {
    def sendSlackMessage() {
        def config = readProperties file: configFile

        // Accessing configuration values
        def slackChannelName = config['SLACK_CHANNEL_NAME']
        def actionMessage = config['ACTION_MESSAGE']

        // Use the configuration values in the slackSend step
        slackSend(channel: slackChannelName, color: 'good', message: actionMessage)
    }
    
    // Call the function to send the Slack message
  //  sendSlackMessage()