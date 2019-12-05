def call(String imageName = 'image') {
  sh 'bundle exec rake spec'
}