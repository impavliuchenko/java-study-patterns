package patterns.builder;

public class VisitCardWebsiteBuilder extends WebsiteBuilder {
    @Override
    public void buildName() {
        website.setName("Epam");
    }

    @Override
    public void buildCms() {
        website.setCms(Cms.ALIFRESKO);
    }

    @Override
    public void buildPrice() {
        website.setPrice(1200);
    }
}
