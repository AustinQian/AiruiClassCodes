package com.Austin.PUBGKnockOff.Objects.Answer;

import com.Austin.PUBGKnockOff.Objects.Bullets;

/**
 * @author ubunt on 2/25/2023.
 * @project Day4Project
 */
public class Clips{
    private Bullet[] bullets; //30发子弹
    //创建了弹匣对象后，这个弹匣可以装30发子弹，在这里要调用装弹方法
    private int num; //当前子弹的数量
    public Clips(){
        this.bullets = new Bullet[30];
        this.num = 0;
    }

    public int getNum() {
        return num;
    }

    //装弹
    public void putBullet(Bullet bullet){
        if(bullets.length == num){
            System.out.println("弹匣子弹装满了");
        }else {
            bullets[num] = bullet;
            num++;
            System.out.println("弹夹已经装了"+num+"颗子弹");
        }
    }

    //出弹
    public Bullet popBullet(){
        if(num==0){
            System.out.println("弹匣中没子弹了");
            return null;
        }else {
            //每出弹一次，子弹--
            Bullet bullet = bullets[num-1];
            num--;
            System.out.println("弹匣还剩"+num+"个子弹");
            return bullet;
        }
    }
}
