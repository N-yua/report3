package jp.ac.uryukyu.ie.e235743;


public class Hero extends LivingThing{

    public Hero(String name, int maximumHP, int attack) {
        super(name, maximumHP, attack);
    }

@Override
    public void wounded(int damage){
        super.wounded(damage);
        System.out.printf("勇者%sは倒れた。\n",getName());
    }
}
    
