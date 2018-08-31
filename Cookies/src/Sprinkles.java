
public class Sprinkles extends ToppingDecorator {
	Cookie cookie;
	
	public Sprinkles(Cookie cookie) {
		this.cookie = cookie;
	}
	
	public String getDescription() {
		return cookie.getDescription() + ", Sprinkles";
	}
	
	public double cost() {
		return cookie.cost() + .10;
	}
}
