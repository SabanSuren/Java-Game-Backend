package Entities;

import Abstract.IGameService;

public class Game implements IGameService{
    private int id;
    private String gameName;
    private double gamePrice;
    private String gameDescription;
    private double discount;
    private int unitsInStock;
    private int unitsInOrder;
    private int unitsOutStock;

    public Game(int id, String gameName, double gamePrice, String gameDescription, double discount, int unitsInStock, int unitsInOrder, int unitsOutStock) {
        this.id = id;
        this.gameName = gameName;
        this.gamePrice = gamePrice;
        this.gameDescription = gameDescription;
        this.discount = discount;
        this.unitsInStock = unitsInStock;
        this.unitsInOrder = unitsInOrder;
        this.unitsOutStock = unitsOutStock;
    }

    public Game(int id, String gameName, double gamePrice) {
        super();
        this.id = id;
        this.gameName = gameName;
        this.gamePrice = gamePrice;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    public double getGamePrice() {
        return gamePrice;
    }

    public void setGamePrice(double gamePrice) {
        this.gamePrice = gamePrice;
    }

    public String getGameDescription() {
        return gameDescription;
    }

    public void setGameDescription(String gameDescription) {
        this.gameDescription = gameDescription;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public double getGamePriceAfterDiscount() {
        return this.gamePrice - (this.gamePrice * this.discount / 100);
    }

    public int getUnitsInStock() {
        return unitsInStock;
    }

    public void setUnitsInStock(int unitsInStock) {
        this.unitsInStock = unitsInStock;
    }

    public int getUnitsInOrder() {
        return unitsInOrder;
    }

    public void setUnitsInOrder(int unitsInOrder) {
        this.unitsInOrder = unitsInOrder;
    }

    public int getUnitsOutStock() {
        return unitsOutStock;
    }

    public void setUnitsOutStock(int unitsOutStock) {
        this.unitsOutStock = unitsOutStock;
    }

}
