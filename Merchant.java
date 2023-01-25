package SFProjects.Role_Playing_Game;

public class Merchant implements Seller {
    //Метод для продажи
    @Override
    public String sell(Goods goods) {
        String result = "";
        if (goods == Goods.POTION) {
            result = "potion";
        }
        if (goods == Goods.WEAPON) {
            result = "sword";
        }
        if (goods == Goods.ARMOR) {
            result = "vest";
        }
        return result;
    }

    //Энам для товаров
    public enum Goods {
        POTION, WEAPON, ARMOR
    }
}
