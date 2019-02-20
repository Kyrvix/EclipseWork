package main;

public class World {

	public static void main(String[] args) {
		CatBuilder builder = CatBuilder.getInstance();
		Cat pip = builder.name("Pippa").weight("500").buildCat();
		System.out.println(pip.weight);
		System.out.println(pip.name);
		System.out.println(pip.lives);
		System.out.println("Fat cat in da house");
	}
}
