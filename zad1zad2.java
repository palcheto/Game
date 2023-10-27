package Game;

public class zad1zad2 {

    public abstract class Character {
        private String name;
        private int health;
        private int power;
        private String race;

        public Character(String name, int health, int power, String race) {
            this.name = name;
            this.health = health;
            this.power = power;
            this.race = race;
        }

        public abstract void attack(Character target);

        public abstract void defend(int attackPower);

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getHealth() {
            return health;
        }

        public void setHealth(int health) {
            this.health = health;
        }

        public int getPower() {
            return power;
        }

        public void setPower(int power) {
            this.power = power;
        }

        public String getRace() {
            return race;
        }

        public void setRace(String race) {
            this.race = race;
        }
    }

    public class Paladin extends Character {
        public Paladin(String name, int health, int power) {
            super(name, health, power, "Paladin");
        }

        @Override
        public void attack(Character target) {

        }

        @Override
        public void defend(int attackPower) {
        }
    }

    public class Amazon extends Character {
        public Amazon(String name, int health, int power) {
            super(name, health, power, "Amazon");
        }
        @Override
        public void attack(Character target) {
        }
        @Override
        public void defend(int attackPower) {
        }
    }
    public class Barbarian extends Character {
        public Barbarian(String name, int health, int power) {
            super(name, health, power, "Barbarian");
        }
        @Override
        public void attack(Character target) {

        }

        @Override
        public void defend(int attackPower) {

        }
    }
    public class Necromancer extends Character {
        public Necromancer(String name, int health, int power) {
            super(name, health, power, "Necromancer");
        }
        @Override
        public void attack(Character target) {
        }

        @Override
        public void defend(int attackPower) {

        }
    }
    public class Witch extends Character {
        public Witch(String name, int health, int power) {
            super(name, health, power, "Witch");
        }
        @Override
        public void attack(Character target) {

        }
        @Override
        public void defend(int attackPower) {

        }
    }

}
