package com.Austin.PUBGKnockOff.Objects.Answer;

/**
 * @author ubunt on 2/25/2023.
 * @project Day4Project
 */
public class Player extends Gun{
    private String name;
    private int HP;
    private Gun gun;

    public Player() {
    }

    public Player(String name) {
        this.name = name;
        this.HP = 100; //血量
        this.gun = null; //没有枪
        System.out.println("玩家" + name + "创建成功！默认血量为"+ HP + "没有枪");
    }

    public String getName() {
        return name;
    }

    //捡枪 this. ->将参数作为对象
    public void Pickup(Gun gun){
        if(this.gun == null){
            this.gun = gun;
            System.out.println("玩家"+name+"拿到了枪");
        }else {
            System.out.println("玩家"+name+"已经有枪了");
        }
    }

    //装弹
    public void loadClip(Clips clip){
        //先判断有没有枪，有枪才能上弹匣
        if(this.gun != null){
            System.out.println("玩家"+name+"正在上弹");
            System.out.println("玩家"+name+"上弹完成");
            //需要传入一个枪类的上弹匣方法
            this.gun.loadClips(clip);
        }
    }
    //开枪方法
    public void shot(Player player){
        //先判断有没有枪，有枪才能开枪，获取被射击对象
        if(this.gun != null){
            if(gun.getClips()==null){ //通过当前的gun调用getClips获取弹匣，判断弹匣是否为空
                System.out.println("枪没有弹匣");
            }else {
                //有弹匣，还要判断弹匣中有没有子弹
                if(gun.getClips().getNum() == 0){
                    System.out.println("弹匣中没子弹");
                }else {
                    //有子弹，可以打中玩家
                    System.out.println("玩家"+name+"打中了"+player.getName());
                    this.gun.shot(player);
                }
            }
        }else {
            System.out.println("玩家"+name+"没有枪，不能开枪");
        }
    }

    public void bloodLoss(int damage){
        //血量和伤害值比较
        if(damage>this.HP ){
            System.out.println("玩家"+name+"已死亡");
        }else {
            this.HP -= damage;
            System.out.println("玩家"+name+"受到"+damage+"伤害。剩余"+this.HP+"血量");
        }
    }
}
