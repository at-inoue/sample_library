import org.foo.Zot

def call(String imageName = 'image') {
  def z = new Zot()
  log.info("AAAAAAAAAAAAAAAAAAAAAAAA")
  echo 'do hoge1'
  z.printPwd()
  log.warning("BBBBBBBBBBBBBBBBBBBBBBBB")
  echo 'do hoge2'
}