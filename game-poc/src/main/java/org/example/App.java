package org.example;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        Player p = PlayerFactory.createNewKnight("Raulzito");
        p.getCardList().stream().forEach(System.out::println);
        p.getStatusList().forEach((status, value) -> System.out.println(status + " = " + value));
        p.equip(p.getEquipmentList().get(0));
        p.getCardList().stream().forEach(System.out::println);
        p.getStatusList().forEach((status, value) -> System.out.println(status + " = " + value));


    }
}
