package com.Austin.PUBGKnockOff.Objects;

import java.util.Random;

/**
 * @author ubunt on 2/23/2023.
 * @project Day4Project
 */
public class Player extends Gun{
    private String name;
    private int HP = 100;
    private String gun;

    public Player() {
    }

    public Player(String name, int HP, String gun) {
        this.name = name;
        this.HP = HP;
        this.gun = gun;
    }

    public String getName() {
        return name;
    }

    public int getHP() {
        return HP;
    }

    public int setHP(int HP) {
        this.HP = HP;
        return HP;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void Pickup(){
        System.out.println("Find a gun to pick up");
        System.out.println("Press 'E' to pick up a gun.");
    }
    @Override
    public void Reload(){
        super.Reload();
        System.out.println("Gun reloaded");
    }

    public int shoot(Player player) {
        Random ran = new Random();
        int chance = ran.nextInt(100);
        if (chance > 50) {
            System.out.println("Enemy hit!");
            player.setHP(HP);
            return player.setHP(HP - 10);
        } else {
            System.out.println("Shoot missed!");
            return player.setHP(HP);
        }
    }
}
