package action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import svc.DogCartQtyDownService;
import vo.ActionForward;

public class DogCartQtyDownAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, 
	HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		String kind = request.getParameter("kind");
		DogCartQtyDownService dogCartQtyDownService = new
		DogCartQtyDownService();
		dogCartQtyDownService.downCartQty(kind, request);
		ActionForward forward = new ActionForward("dogCartList.dog", true);
		return forward;
	}

}
