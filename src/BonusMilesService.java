public class BonusMilesService {
    public int calculate(int price) {
        int oneMiles = 20;
        int cost = price / oneMiles;
        return cost;
    }
}
