// import one.two.three.Utils

void call(Map context = [:]) {

  def utils = library('shared2').one.two.three.Utils.new(this)
  
  echo utils.SLACK_GOOD

}
