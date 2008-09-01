class Puzzle {
	String question
	String answer
	
	static hasMany = [ratings:UserPuzzleRating]
	static belongsTo = [topic:Topic]
}
