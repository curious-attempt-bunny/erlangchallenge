class User {
	String openId
	
	static hasMany = [puzzleRatings:UserPuzzleRating]
	
	static constraints = {
		openId(blank:false, unique:true)
	}
	
	String toString() { openId }
}
