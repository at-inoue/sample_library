import org.foo.Zot

def z = new Zot()

def call(String imageName = 'image') {
  echo 'do hoge1'
  z.printPwd()
  echo 'do hoge2'
}