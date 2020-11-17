package MonstersGame;

import java.util.Random;

public class FireMonster extends Monster implements FireAttack{
    public FireMonster(String name) {
        super(name);
        setMaxAtkPower(12);
    }

    @Override
    public int attack() {
        int chance = new Random().nextInt(100 - 1) + 1;
        if(chance < 30) {
            System.out.println("<-FIRE ATTACK->");
            return fireAttack();
        } else {
            return new Random().nextInt(15 - 1) + 1;
        }
    }

    @Override
    public int fireAttack() {
        return 24;
    }


}
