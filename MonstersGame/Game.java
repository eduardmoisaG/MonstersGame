package MonstersGame;

import java.util.Random;

public class Game {
    private Monster monster1;
    private Monster monster2;

    public Game(Monster monster1, Monster monster2) {
        this.monster1 = monster1;
        this.monster2 = monster2;
    }

    public void startGame() {
        int whoStarts = new Random().nextInt(2);

        boolean ended = false;
            if(whoStarts == 0) {
                attacks(monster1, monster2);
            } else {
                attacks(monster2, monster1);
            }

        System.out.println("The game has ended!\n");

        System.out.println("Monsters Hp: \n");

        System.out.println(monster1.getName().toUpperCase() + " -> " + monster1.getHp());
        System.out.println(monster2.getName().toUpperCase() + " -> " + monster2.getHp());

    }

    public void attacks(Monster monster1, Monster monster2) {
        int m1atk = 0;
        int m2atk = 0;

        while(true) {
            m1atk = monster1.attack();
            System.out.println(monster1.getName() + " deals " + m1atk + " damage!");
            monster2.setHp(m1atk);

            if (!monster2.checkHp()) {
                System.out.println('\n' + monster1.getName() + " won!\n");
                break;
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            m2atk = monster2.attack();
            System.out.println(monster2.getName() + " deals " + m2atk + " damage!");
            monster1.setHp(m2atk);
            if (!monster1.checkHp()) {
                System.out.println('\n' + monster2.getName() + " won!\n");
                break;
            }
            System.out.println("-----------------------");

        }
    }
}
