package com.Austin.PUBGKnockOff.Objects;

/**
 * @author ubunt on 2/23/2023.
 * @project Day4Project
 */
public class PUBGTest {
    public static void main(String[] args) {
        //Clips clips = new Clips();
        //clips.MagDrill();

        Player player1 = new Player();
        Player player2 = new Player();
        player1.setName("John");
        player2.setName("Enemy");
        player1.Pickup();
        for (int hp = player2.getHP();hp>0;){
            hp = player1.shoot(player2);
        }
    }
}
