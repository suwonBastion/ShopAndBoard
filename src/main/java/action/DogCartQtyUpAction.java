package action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import svc.DogCartQtyUPService;
import vo.ActionForward;

public class DogCartQtyUpAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, 
	HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		String kind = request.getParameter("kind");
		DogCartQtyUPService dogCartQtyUPService = new
		DogCartQtyUPService();
		dogCartQtyUPService.upCartQty(kind, request);
		ActionForward forward = new ActionForward("dogCartList.dog", true);
		return forward;
	}


}
