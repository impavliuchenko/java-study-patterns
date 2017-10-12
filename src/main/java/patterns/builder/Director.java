package patterns.builder;

public class Director {

    private WebsiteBuilder builder;

    public void setBuilder(WebsiteBuilder builderImplementation){
        builder = builderImplementation;
    }

    public Website buildWebsite(){

        builder.createWebsite();
        builder.buildCms();
        builder.buildName();
        builder.buildPrice();

        Website website = builder.getWebsite();

        return website;
    }
}
