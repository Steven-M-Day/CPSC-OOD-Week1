// Cookie topping: Frosting
public class Frosting extends ToppingDecorator {
	Cookie cookie;
	
	public Frosting(Cookie cookie) {
		this.cookie = cookie;
	}
	
	public String getDescription() {
		return cookie.getDescription() + ", Frosting";
	}
	
	public double cost() {
		return cookie.cost() + .30;
	}
}
