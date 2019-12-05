package org.foo

def printColor1() {
  ansiColor('xterm') {
    sh "echo '**************************'"
    sh 'echo "color output test"'
    sh "echo '**************************'"
  }
}

def printColor2() {
  ansiColor('xterm') {
    sh "echo '**************************'"
    sh 'echo "color output test2"'
    sh "echo '**************************'"
  }
}

return this
