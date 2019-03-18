package com.example.beerssplit;

import java.util.ArrayList;

public class Beer {
    private String id;
    private String name;
    private String shortDescription;
    private String description;
    private double abv;
    private int ibuMin;
    private int ibuMax;
    private int srmMin;
    private int srmMax;
    private String brewery;

    public Beer() {
    }

    public Beer(String id, String name, String shortDescription, String description, double abv, int ibuMin, int ibuMax, int srmMin, int srmMax, String brewery) {
        this.id = id;
        this.name = name;
        this.shortDescription = shortDescription;
        this.description = description;
        this.abv = abv;
        this.ibuMin = ibuMin;
        this.ibuMax = ibuMax;
        this.srmMin = srmMin;
        this.srmMax = srmMax;
        this.brewery = brewery;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getAbv() {
        return abv;
    }

    public void setAbv(double abv) {
        this.abv = abv;
    }

    public int getIbuMin() {
        return ibuMin;
    }

    public void setIbuMin(int ibuMin) {
        this.ibuMin = ibuMin;
    }

    public int getIbuMax() {
        return ibuMax;
    }

    public void setIbuMax(int ibuMax) {
        this.ibuMax = ibuMax;
    }

    public int getSrmMin() {
        return srmMin;
    }

    public void setSrmMin(int srmMin) {
        this.srmMin = srmMin;
    }

    public int getSrmMax() {
        return srmMax;
    }

    public void setSrmMax(int srmMax) {
        this.srmMax = srmMax;
    }

    public String getBrewery() {
        return brewery;
    }

    public void setBrewery(String brewery) {
        this.brewery = brewery;
    }

    public static ArrayList<Beer> getDummyBeers() {
        ArrayList<Beer> beers = new ArrayList<>();
        beers.add(new Beer("c9u7Eo", "Guinness Generous Ale", "Irish-Style Red Ale", "Inspired by Arthur’s philanthropic legacy and devotion to generous, full-flavored beers, Guinness Generous Ale is special edition holiday beer that was developed in a traditional winter ale style, but with more body and the distinct roast for which Guinness Draught is known. With a rich amber appearance, the vanilla notes accent Guinness Generous Ale’s silky, yet vibrant taste.", 5.6, 20, 28, 11, 18, "Guinness"));
        beers.add(new Beer("GVNZZQ", "Green Valley Wild Hop Lager", "American-Style Premium Lager", "Wild Hop Lager is unique and distinctive. It is made one batch at a time. It does not use any genetically modified products, pesticides or commercial fertilizers. Wild Hop Lager is made from 100% organic barley malt, certified by the USDA and the organic organization Oregon tilth.", 5.0, 6, 15, 2, 6, "Anheuser-Busch InBev"));
        beers.add(new Beer("CwbQiB", "Grand Royal", "Imperial or Double India Pale Ale", "Packed to the brim with Galaxy, 007, and Mosaic hops this Double IPA is big, juicy, and completely satisfying. Notes of tropical fruit and pine are supported by a clean malt backbone.", 8.3, 65, 100, 5, 13, "Zero Gravity Craft Brewery"));
        beers.add(new Beer("24UMt9", "Davey Murray's Best Scotch Ale", "Scotch Ale", "This Scotch Ale is sweet, but not cloying. It's strong, but not brash. It's smooth and smokey, like a good dram among friends. Cheers!\r\n\r\n\\\"O gude ale comes and gude ale goes; Gude ale gars me sell my hose,  Sell my hose, and pawn my shoon- Gude ale keeps my heart aboon!\\\" Cheers to the great Bard of Ayrshire for this ale’s epitaph: There is a beer, whose clarity’s clear, can teach the mash paddle to steer, and fuels the brewer's mad career. This ale within is fine to brew and quick to know, and keenly felt by the friendly glow, and softer flame, of the heartful jolly soul that wears this name. Beer-lover, attend! Whether thy soul soars in fancy’s flight, or on this earthly whole in low pursuit, know water, barley, hops, and yeast are Davey Murray’s root.", 9.5, 25, 35, 15, 30, "Lagunitas Brewing Company"));
        beers.add(new Beer("wC2GDZ", "Torpedo Pilsner - Beer Camp Across America", "American-Style Pilsener", "Torpedo Pilsner is a hop-forward take on the crisp classic lager. We and the folks at Firestone Walker share a passion for New Zealand hop varietals, so we loaded our legendary Hop Torpedo with southern hemisphere hops for a fruity, floral twist on the pilsner style.\r\n\r\nJust down the road from us in California’s Central Coast wine country, this rock star brewery has earned “Mid-size Brewery of the Year” at the World Beer Cup four times. Like us, Firestone is passionate about hops.  Their skill with the ingredient shines in their Pale Series and elsewhere in a long beer lineup driven by a premier brewing team.", 5.2, 25, 40, 3, 6, "Sierra Nevada Brewing Company"));
        beers.add(new Beer("S1oEH9", "CSB ESB", "Extra Special Bitter", "When Ben the laughing dog was much younger, he developed a habit of sticking his nose in people’s crotches to check them out and say Hello. One of his favorite people to do this to coined the term CSB (or, “Crotch Sniffing Bastard”) and so the seed was planted for the name of this beer. A British style ESB with an Laughing Dog twist, it is crisp but malty and at the same time somewhat playful, it is a great beer to have while out sniffing around, or if you are stuck at home on the short leash for maybe sniffing in the wrong places.", 5.2, 30, 45, 8, 14, "Laughing Dog Brewing"));
        beers.add(new Beer("OPM4t8", "Mt. Takhoma Blonde Ale", "Belgian-Style Blonde Ale", "German Pilsner Malt and a touch of flaked wheat are used to produce this light bodied, straw colored ale. Horizon and Glacier hops provide the balance. This beer finishes crisp and dry. Try this with and orange slice. 3.8% ABV", 3.8, 15, 30, 4, 7, "Harmon Brewing Company"));
        beers.add(new Beer("eEWCFd", "Lucky U IPA", "American-Style India Pale Ale", "We like to think this is an ale for everyone who believes you make your own luck. We sure did. And the result is a well-balanced, soulful IPA with just the right amount of hoppiness. An even keeled ale that goes down clean and refreshing, but still lets you know it’s been doted on by the Brewmaster. It's true to it’s IPA heritage, but also highly drinkable. Lucky U. And we seriously mean that.\r\n\r\nYeast: Top Fermented Ale Yeast\r\nMalts: Two Row Pale, Munich, Carmel, Torrified Wheat\r\nHops: Amarillo, Magnum, Perle, Cascade, Apollo, Fuggle, Goldings", 6.2, 50, 70, 6, 14, "Breckenridge Brewery"));
        return beers;
    }
}