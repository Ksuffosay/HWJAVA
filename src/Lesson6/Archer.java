package Lesson6;

public class Archer {

    public class Archer extends Player {

        private int mana;
        private int range;
        private int dexterity;

        private int costEscape = 45;

        public Archer(String name, float health, int mana, int range, int dexterity, float speed, String gender) {
            super(name, health, speed, gender);
            this.mana = mana;
            this.range = range;
            this.dexterity = dexterity;
        }

        @Override
        public void attack() {
            System.out.println(name + " has attack enemy on " + dexterity * range);
        }

        public void escapeFormBattle() {
            if (mana < costEscape) {
                return;
            }

            if (health < 20) {
                mana -= costEscape;
                System.out.println(name + " has escape from battle");
            }
        }

        public void methodA() {
            System.out.println("methodA");
        }
    }

}
