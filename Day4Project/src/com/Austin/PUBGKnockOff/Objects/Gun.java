package com.Austin.PUBGKnockOff.Objects;

/**
 * @author ubunt on 2/23/2023.
 * @project Day4Project
 */
public class Gun extends Clips {
    private int clips = 2;

    public Gun() {
    }

    public Gun(int clips) {
        this.clips = clips;
    }

    public void Reload(){
        System.out.println("Reloading...");
    }

    public void shoot(){
        System.out.println("Shooting!");
    }

}
