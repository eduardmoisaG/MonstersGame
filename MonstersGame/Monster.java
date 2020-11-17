package MonstersGame;

public abstract class Monster {
    private String name;
    private int hp = 100;
    private int maxAtkPower;

    public Monster(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return this.hp;
    }

    public void setHp(int damage) {
        this.hp -= damage;
    }

    public int getMaxAtkPower() {
        return this.maxAtkPower;
    }

    public void setMaxAtkPower(int power) {
        this.maxAtkPower = power;
    }

    public abstract int attack();

    public boolean checkHp() {
        if(hp > 0) return true;
        return false;
    }
}
