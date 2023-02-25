package com.Austin.PUBGKnockOff.Objects.Answer;

/**
 * @author ubunt on 2/25/2023.
 * @project Day4Project
 */
public class Bullet {
    private int damage = 10;

    public void hit(Player player){
        //System.out.println("子弹打中了" + player.getName()+"伤害是"+damage);
        //打中后，玩家掉血
        player.bloodLoss(damage);
    }

}
