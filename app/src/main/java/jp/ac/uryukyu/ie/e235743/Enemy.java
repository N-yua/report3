package jp.ac.uryukyu.ie.e235743;



public class Enemy extends LivingThing{
    public Enemy(String name, int maximumHP, int attack) {
        super(name, maximumHP, attack);
        
    }

@Override
    public void wounded(int damage){
        super.wounded(damage);
        System.out.printf("モンスター%sは倒れた。\n",getName());
    }
}

