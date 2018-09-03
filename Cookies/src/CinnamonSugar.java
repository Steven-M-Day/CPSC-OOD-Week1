// Cookie topping: Cinnamon and Sugar
public class CinnamonSugar extends ToppingDecorator{
	Cookie cookie;
	
	public CinnamonSugar(Cookie cookie) {
		this.cookie = cookie;
	}
	
	public String getDescription() {
		return cookie.getDescription() + ", Cinnamon and Sugar";
	}
	
	public double cost() {
		return cookie.cost() + .15;
	}
}
