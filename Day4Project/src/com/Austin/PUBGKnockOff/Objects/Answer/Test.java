package com.Austin.PUBGKnockOff.Objects.Answer;

/**
 * @author ubunt on 2/25/2023.
 * @project Day4Project
 */
public class Test {
    public static void main(String[] args) {
        Player a = new Player("A");
        Player b = new Player("B");
        //创建枪，把枪给a
        Gun gun = new Gun();
        a.Pickup(gun);
        //创建弹匣
        Clips clips = new Clips();
        a.loadClip(clips);
        //给弹匣上15发子弹
        Bullet bullet = new Bullet();
        for (int i = 1; i <= 15; i++) {
            clips.putBullet(bullet);
        }

        //连续开枪
        for (int i = 1; i <= 20; i++) {
            if(i%2==0){
                a.shot(b);
            }else {
                System.out.println("a放了一个空枪，没打到");
            }
        }
    }
}
