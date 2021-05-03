
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gamer gamer = new Gamer(1, "Ali", "Aða", "123456789", "04/08/2020");
		GamerService gamerService = new GamerManager(new GamerCheckManager());
		gamerService.add(gamer);

	}

}
