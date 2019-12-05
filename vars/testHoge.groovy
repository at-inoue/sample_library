@import org.foo.Zot

def call(String imageName = 'image') {
  def z = Zot.new
  echo 'do hoge1'
  z.printPwd()
  echo 'do hoge2'
}