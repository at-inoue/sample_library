package org.foo

def printPwd() {
  sh "echo '**************************'"
  sh 'pwd'
  sh "echo '**************************'"
}

return this
