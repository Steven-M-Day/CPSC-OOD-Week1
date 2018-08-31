
public class PookiesCookies {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cookie cookie = new PeanutButter();
		System.out.println(cookie.getDescription() + " $" + String.format("%,.2f",cookie.cost()));
		
		Cookie cookie2 = new ChocolateChip();
		System.out.println(cookie2.getDescription() + " $" + String.format("%,.2f",cookie2.cost()));

		Cookie cookie3 = new Sugar();
		cookie3 = new Frosting(cookie3);
		cookie3 = new Sprinkles(cookie3);
		System.out.println(cookie3.getDescription() + " $" + String.format("%,.2f",cookie3.cost()));
		
		Cookie cookie4 = new Sugar();
		cookie4 = new Glaze(cookie4);
		cookie4 = new CinnamonSugar(cookie4);
		System.out.println(cookie4.getDescription() + " $" + String.format("%,.2f", cookie4.cost()));
	}

}
