import org.foo.Zot

def call(String imageName = 'image') {
  def z = new Zot()
  echo 'do hoge1'
  z.printPwd()
  echo 'do hoge2'
}