package MonstersGame;

import java.util.Random;

public class WaterMonster extends Monster implements WaterAttack{

    public WaterMonster(String name) {
        super(name);
        setMaxAtkPower(15);
    }

    @Override
    public int attack() {
        int chance = new Random().nextInt(100 - 1) + 1;
        if(chance < 26) {
            System.out.println("<-WATER ATTACK->");
            return waterAttack();
        } else {
            return new Random().nextInt(15 - 1) + 1;
        }
    }

    @Override
    public int waterAttack() {
        return 30;
    }
}

