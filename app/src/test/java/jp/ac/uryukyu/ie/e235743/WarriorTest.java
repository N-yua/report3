package jp.ac.uryukyu.ie.e235743;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class WarriorTest {

    @Test
    void attackWithWeponSkill() {
        int defaultHitHp = 100;
        Warrior demoWarrior = new Warrior("デモウォーリアー", defaultHitHp, 100);
        Enemy demoslime = new Enemy("スライムもどき",defaultHitHp, 100);
        
        for(int i = 0; i < 3; i++){
            demoslime.setHitPoint(defaultHitHp);
            demoWarrior.attackWithWeponSkill(demoslime);
            assertEquals((int)demoWarrior.getAttack()*3/2, (defaultHitHp - demoslime.getHitPoint()));
        }
    }
}
