// Cookie topping: Glaze
public class Glaze extends ToppingDecorator {
	Cookie cookie;
	
	public Glaze(Cookie cookie) {
		this.cookie = cookie;
	}
	
	public String getDescription() {
		return cookie.getDescription() + ", Glaze";
	}
	
	public double cost() {
		return cookie.cost() + .20;
	}
}
