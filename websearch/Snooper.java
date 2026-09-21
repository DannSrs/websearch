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
                        return true; // Aceita tudo temporariamente para não quebrar o código
                    }
                },
                new WebSearchModel.QueryObserver() {
                    @Override
                    public void onQuery(String query) {
                        System.out.println("Query: " + query);
                    }
                });

    }
}
