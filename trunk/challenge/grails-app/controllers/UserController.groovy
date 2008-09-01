class UserController {
	def openidService

	def login = { }
	
	def loggedin = {
		def openId = openidService.getIdentifier(session)
		session.user = User.findByOpenId(openId)
		if (!session.user) session.user = new User(openId:openId).save()
		
		redirect(uri:'/')
	}

}
