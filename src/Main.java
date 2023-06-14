public class Main {

    public static void main(String[] args) {
        Basket ivan = new Basket();
        ivan.add("Пиво", 60, 4, 0.5);
        ivan.add("Семечки", 30, 2);
        ivan.add("Макароны", 75, 5,0.7);
        ivan.print("Корзина с продуктами: ");

        Basket anna = new Basket();
        anna.add("Шампунь", 100,2);
        anna.add("Печенье", 65,3);
        anna.print("\n" + "Корзина с продуктами: ");

        System.out.println("\n" + "Общее количество всех товаров: " + Basket.getTotalNumberOfProducts());
        System.out.println("Общая стоимость всех товаров: " + Basket.getTotalCost());
        System.out.println("Средняя цена всех товаров: " + Basket.averageProductPrice());
        System.out.println("Средняя стоимость корзины: " + Basket.averageCostOfTheBasket());
    }

}
