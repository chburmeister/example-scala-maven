package eu.christophburmeister.playground.scalaexample 

class Happiness() {
	private var happy: Boolean = false
	
	def isHappy: Boolean = happy	
	
	def switchMood() {
		happy = !happy
	}
}

