package com.Austin.PUBGKnockOff.Objects;

/**
 * @author ubunt on 2/23/2023.
 * @project Day4Project
 */
public class Clips extends Bullets{
    private int bullets = 30;

    public Clips() {
    }

    public Clips(int bullets) {
        this.bullets = bullets;
    }

    public Clips(int damage, int bullets) {
        super(damage);
        this.bullets = bullets;
    }

    public int getBullets() {
        return bullets;
    }


    public void MagDrill(){
        int b1 = getBullets();
        System.out.println("Drilling");
        System.out.println("Reloaded "+ b1 +" bullets");
    }
}
