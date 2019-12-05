import org.foo.ColorOutput

def call(String imageName = 'image') {
  def co = new ColorOutput()
  echo 'do put color message1'
  co.printColor1()
  echo 'do put color message2'
  co.printColor2()
  echo 'do put color message2'
}