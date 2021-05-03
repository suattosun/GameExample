
public class GamerCheckManager implements GamerCheckService {

	@Override
	public boolean checkGamer(Gamer gamer) {
		if(gamer.getTcNo() == "123456789")
		{
			return true;
		}
		return false;
		
	}

	

}
