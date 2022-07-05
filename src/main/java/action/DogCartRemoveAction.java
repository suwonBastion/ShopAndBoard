package action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import vo.ActionForward;
import svc.DogCartRemoveService;

public class DogCartRemoveAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		String[] kindArray=request.getParameterValues("remove");
		DogCartRemoveService dogCartRemoveService= new DogCartRemoveService();
		dogCartRemoveService.cartRemove(request,kindArray);
		ActionForward forward = new ActionForward("dogCartList.dog",true);
		return forward;
	}
	
}
