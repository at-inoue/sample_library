def checkout() {
  stage("checkout") {
    echo "checkout"
  }
}

def compile() {
  stage("compile") {
    echo "compile"
  }
}

def deploy() {
  stage("deploy") {
    echo "deploy"
  }
}

def tests() {
  stages {
    stage('setup2') {
      steps { echo 'bundle install --quiet' }
    }
    stage('base image2') {
      steps { echo 'docker build base image' }
    }
    stage('test image2') {
      steps { echo 'docker build test image' }
    }
  }
}