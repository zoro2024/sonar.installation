def call() {
    (message: 'Do you want to continue', ok: 'Yes', submitter: 'admin')
    sh 'ansible-playbook -i host install.yml'
}
