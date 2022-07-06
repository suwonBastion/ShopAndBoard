package vo;

public class ActionForward {
	private String path;
	private boolean redirect;
	
	public ActionForward(String string, boolean b) {
		this.path = string;
		this.redirect = b;
	}

	public String getPath() {
		return path;
	}
	
	public void setPath(String path) {
		this.path=path;
	}
	
	public boolean isRedirect() {
		return redirect;
	}
	
	public void setRedirect(boolean redirect) {
		this.redirect=redirect;
	}
}
