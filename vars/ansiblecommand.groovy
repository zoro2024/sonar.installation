def call() {
    sh 'ansible-playbook -i host install.yml'
}
