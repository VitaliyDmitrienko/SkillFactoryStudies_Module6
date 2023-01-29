public class Computer2 {
    private String processor, graphicCard, motherBoardModel;
    private int price;

    public Computer2(String processor, String graphicCard, String motherBoardModel, int price) {
        this.processor = processor;
        this.graphicCard = graphicCard;
        this.motherBoardModel = motherBoardModel;
        this.price = price;
    }
    // Write your code here
    public String getProcessor () {
        return processor;
    }
    public String getGraphicCard () {
        return graphicCard;
    }
    public String getMotherBoardModel () {
        return motherBoardModel;
    }
    public int getPrice () {
        return price;
    }
    public void setProcessor (String processorname) {
        this.processor=processorname;
    }
    public void setGraphicCard (String graphicCardName) {
        this.graphicCard=graphicCardName;
    }
    public void setMotherBoardModel (String motherBoardModelName) {
        this.motherBoardModel=motherBoardModelName;
    }
    public void setPrice (int priceNUM) {
        this.price=priceNUM;
    }
}
