package application;

public class BooleanOR {

	public static void main(String[] args) {
		// == , !=, !, &&, ||

		boolean isRaining = true; // 비가오는가?
		boolean mightRain = false; // 비가올수도있는가?
		boolean takeUmbrella = false; // 우산을쓴다?

		takeUmbrella = isRaining || mightRain;

		System.out.println(takeUmbrella);

	}

}
