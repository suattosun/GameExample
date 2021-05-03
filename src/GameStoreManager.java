
public class GameStoreManager implements GameStoreService {

	CampaignService campaignService;
	public GameStoreManager(CampaignService campaignService) {
		
		this.campaignService = campaignService;
	}
	@Override
	public void saleGame(Gamer gamer) {
		campaignService.add();
		System.out.println("oyun satýldý:" + gamer.getName());
		
	}

}
