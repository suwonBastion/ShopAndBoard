package action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import svc.DogCartAddService;
import vo.ActionForward;

public class DogCartAddAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		DogCartAddService dogCartAddService = new DogCartAddService();
		int id =Integer.parseInt(request.getParameter("id"));
		
		Dog cartDog =dogCartAddService.getCartDog(id);
		dogCartAddService.assCart(request,cartDog);
		ActionForward forward= new ActionForward("dogCartList.dog",true);
		return forward;
	}

}
