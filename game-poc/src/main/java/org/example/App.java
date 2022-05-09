package org.example;

import java.util.Scanner;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        Scanner sc = new Scanner(System.in);
        String input = "";
        Player p = PlayerFactory.createNewKnight("Raulzito");
/*      p.getCardList().stream().forEach(System.out::println);
        p.getStatusList().forEach((status, value) -> System.out.println(status + " = " + value));
        p.equip(p.getEquipmentList().get(0));
        p.getCardList().stream().forEach(System.out::println);
        p.getStatusList().forEach((status, value) -> System.out.println(status + " = " + value));
*/
        Game game = GameFactory.getGame(DungeonName.RATS_CAVE, p);
        while (!input.equals("exit")) {
            input = sc.next();
            printGameStatus(game);
        }
    }

    private static void printGameStatus(Game game) {
        System.out.println("*******************************");
        System.out.println("*           * " + game.getDungeon().getDungeonName());
        System.out.println("*           * " + game.getDungeon().getActiveEvent().getClass().getSimpleName());
        System.out.println("*                             *");
        System.out.println("*                             *");
        System.out.println("*                             *");
        System.out.println("*                             *");
        System.out.println("*                             *");
        System.out.println("*                             *");
        System.out.println("*    -------------------      *");
        System.out.println("*                             *");
        System.out.println("*                             *");
        System.out.println("*                             *");
        System.out.println("*                             *");
        System.out.println("*   *" + game.getPlayerMap().values() + "*   *");
        System.out.println("*                             *");
        System.out.println("*                             *");
        System.out.println("*                             *");
        System.out.println("*******************************");


    }
}
