package com.Austin.PUBGKnockOff.Objects.Answer;

/**
 * @author ubunt on 2/25/2023.
 * @project Day4Project
 */
public class Gun extends Clips{
    private Clips clips;

    public Gun() {
    }
    //装弹匣方法
    public void loadClips(Clips clips){
        this.clips = clips;
        System.out.println("弹匣装好了");
    }

    public Clips getClips() {
        return clips;
    }

    //开枪方法
    public void shot(Player player) {
        if(clips != null){ //弹匣不为空表示有子弹
            //有子弹可以射击，那么调用出弹方法
            Bullet bullet = clips.popBullet();
            if(bullet != null){ //子弹非空，可以打中玩家
                bullet.hit(player);
                //System.out.println("枪打中了"+player.getName());
            }else {
                System.out.println("放了个空枪");
            }
        }else {
            System.out.println("弹匣没有子弹");
        }
    }
}
