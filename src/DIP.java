interface RecommendationStrategy{
    void getRecommendations();
}

class RecentlyAdded implements RecommendationStrategy{
    @Override
    public void getRecommendations() {
        System.out.println("Showing Recently Added");
    }
}
class Trending implements RecommendationStrategy{
    @Override
    public void getRecommendations() {
        System.out.println("Showing Trending Added");
    }
}
class GenreBased implements RecommendationStrategy {
    @Override
    public void getRecommendations() {
        System.out.println("Showing content based on your favorite genres...");
    }
}
class RecommendationEngine{
    private RecommendationStrategy strategy;
    public RecommendationEngine(RecommendationStrategy strategy){
        this.strategy = strategy;
    }
    public void recommend(){
        strategy.getRecommendations();
    }
}
public class DIP {
    public static void main(String [] args){
        RecommendationEngine engine = new RecommendationEngine(new Trending());
        engine.recommend();
    }
}
