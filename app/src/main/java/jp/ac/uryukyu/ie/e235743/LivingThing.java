package jp.ac.uryukyu.ie.e235743;


public class LivingThing {
    private String name;
    private int hitPoint;
    private int attack;
    private boolean dead;

    public LivingThing(String _name, int _hitPoint, int _attack){
        this.setName(_name);
        this.setHitPoint(_hitPoint);
        this.setAttack(_attack);
        this.setDead(this.dead);
        System.out.printf("%sのHPは%d。攻撃力は%dです。\n", _name, _hitPoint, _attack);
    }
    //setter
    public void setName(String _name){
        this.name = _name;
    }
    public void setHitPoint(int _hitPoint){
        this.hitPoint = _hitPoint;
    }
    public void setAttack(int _attack){
        this.attack = _attack;
    }
    public void setDead(boolean _dead){
        this.dead = _dead;
    }

    //getter
    public String getName(){
        return this.name;
    }
    public int getHitPoint(){
        return this.hitPoint;
    }
    public int getAttack(){
        return this.attack;
    }
    public boolean isDead(){
        return this.dead;
    }


    public void attack(LivingThing opponent){
        if(hitPoint > 0){
            int damage = (int)(Math.random() * attack);
            System.out.printf("%sの攻撃！%sに%dのダメージを与えた！！\n", name, opponent.getName(), damage);
            opponent.wounded(damage);
        }else{
            
        }
    }

    public void wounded(int damage){
        hitPoint -= damage;
        if( hitPoint < 0 ) {
            dead = true;
            System.out.printf("%sは倒れた。\n", name);
        }
    }
}
