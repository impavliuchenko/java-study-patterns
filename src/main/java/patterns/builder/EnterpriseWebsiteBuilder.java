package patterns.builder;

public class EnterpriseWebsiteBuilder extends WebsiteBuilder {
    @Override
    public void buildName() {
        website.setName("Global");
    }

    @Override
    public void buildCms() {
        website.setCms(Cms.WORDPRESS);
    }

    @Override
    public void buildPrice() {
        website.setPrice(20000);
    }
}
