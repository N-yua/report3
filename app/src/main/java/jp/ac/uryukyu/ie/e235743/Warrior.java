package jp.ac.uryukyu.ie.e235743;

public class Warrior extends Hero{
	public Warrior(String name, int maximumHP, int attack) {
        super(name, maximumHP, attack);
    }
    
    public void attackWithWeponSkill(LivingThing opponent){
        if(super.isDead() == false){
            int damage = (int)(opponent.getAttack() * 3/2);
            System.out.printf("%sの攻撃！ウェポンスキルを発動！%sに%dのダメージを与えた！！\n", getName(), opponent.getName(), damage);
            opponent.wounded(damage);
        }else{
            
        }
    }
}
