package patterns.builder;

public abstract class WebsiteBuilder {

    Website website;

    public void createWebsite(){
        website = new Website();
    }

    public Website getWebsite() {
        return website;
    }

    public abstract void buildName();
    public abstract void buildCms();
    public abstract void buildPrice();
}
