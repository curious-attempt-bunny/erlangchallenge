class BootStrap {
	def init = { servletContext ->
     	def erlang = new Topic("Erlang").save()
     	erlang.addToPuzzles(new Puzzle(question:'[105,116,115,97,115] ++ [116,114,105,110,103]', answer:'itsastring').save())
     	erlang.addToPuzzles(new Puzzle(question:'"if this string is a list then what is the sum of the elements of this list"', answer:'6824').save())
	}
    def destroy = {
    }
} 
