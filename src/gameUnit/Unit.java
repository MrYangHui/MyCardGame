package gameUnit;

/**
 * @author: YXH
 * @date: 2019/2/26
 * @time: 16:27
 */

/*
  抽象类，游戏中的个体单位。
 */
abstract class Unit {
    private int intOriginalHealth; //原本生命值
    private int intMaxHeal;         //生命值上限
    private int intHealth;          //当前生命值

    public int getIntOriginalHealth() { return intOriginalHealth; }
    public void setIntOriginalHealth(int intOriginalHealth) { this.intOriginalHealth = intOriginalHealth; }

    public int getIntMaxHeal() { return intMaxHeal; }
    public void setIntMaxHeal(int intMaxHeal) { this.intMaxHeal = intMaxHeal; }

    public int getIntHealth() { return intHealth; }
    public void setIntHealth(int intHealth) { this.intHealth = intHealth; }

}
