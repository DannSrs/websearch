/**
 * Watches the search queries
 */
public class Snooper {
    private final WebSearchModel model;

    public Snooper(WebSearchModel model) {
        this.model = model;
        model.addQueryObserver(
            new WebSearchModel.QueryFilter() {
                @Override
                public boolean include(String query) {
                    // Retorna true apenas se contiver 'friend'
                    return query.toLowerCase().contains("friend");
                }
            },
            new WebSearchModel.QueryObserver() {
                @Override
                public void onQuery(String query) {
                    System.out.println("Oh Yes! " + query);
                }
            }
        );

    }
}
