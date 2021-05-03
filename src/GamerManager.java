
public class GamerManager implements GamerService {

	GamerCheckService gameCheckService;
	
	public GamerManager(GamerCheckManager gameCheckManager) {
	 
		this.gameCheckService = gameCheckManager;
	}

	@Override
	public void add(Gamer gamer) {
		if(gameCheckService.checkGamer(gamer))
		{
			System.out.println("Oyuncu Kaydedildi:" + gamer.getName());
		}
		else {
			System.out.println("Do�ru olmayan Kullan�c�");
		}
	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println("Oyuncu silindi:" + gamer.getName());
		
	}

	@Override
	public void update(Gamer gamer) {
		System.out.println("Oyuncu g�ncellendi:" + gamer.getName());
		
	}

}
