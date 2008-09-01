class SecurityFilters {
	def openidService
	
	def filters = {
//  		requireLogin(controller:'*', action:'*') {
//			before = {
//            	if (!session.user && controllerName != 'openid' && actionName != 'login' && actionName != 'loggedin') {
//            		redirect(controller:'user',action:'login')
//                	return false
//               	}
//           	}
//        }
	}
}
