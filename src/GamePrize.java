interface GamePrize{
static final String FIRSTPRIZE = "Gold";

	static final String SECONDPRIZE = "Silver";
	static final String THIRDPRIZE = "Bronze";
}
public final class GamePrize implements
Athlete {
	public GamePrize (int id) {}
	public void winner() {
		medal = FIRSTPRIZE;
	}
private String medal;
}
