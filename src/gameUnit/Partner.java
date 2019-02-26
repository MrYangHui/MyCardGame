package gameUnit;

import cards.PartnerCard;

/**
 * @author: YXH
 * @date: 2019/2/26
 * @time: 16:27
 */
public class Partner extends Unit {
    private int intAttack;

    Partner(int attack , int health){
        intAttack = attack;
        this.setIntHealth(health);
    }
    Partner(PartnerCard partnerCard){

    }

    public int getIntAttack() { return intAttack; }
    public void setIntAttack(int intAttack) { this.intAttack = intAttack; }
}
