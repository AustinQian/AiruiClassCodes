package com.Austin;

import java.util.Scanner;

public class IfDemo0 {
        public static void main(String[] args){
            //创建输入对象
            Scanner sc = new Scanner(System.in);
            //提示用户输入信息
            System.out.println("请输入你的语文成绩:");
            int score1 = sc.nextInt();
            System.out.println("请输入你的数学成绩:");
            int score2 = sc.nextInt();
            //1，如果两门课都超过95分，就可以被奖励一部游戏机
            //if(score1 >= 95 && score2 >= 95){
            //System.out.println("考的非常好，奖励一台游戏机!");
            //}
            //2，如果两门课都超过90分，奖励玩2小时游戏，否则没有奖励
		/*
		if(score1 >=90 && score2 >= 90){
			System.out.println("奖励玩2个小时游戏！");
		}else{
			System.out.println("没有奖励！");
		}*/
            //3，如果两门课都超过95分，奖励游戏机，都超过80分，奖励游戏2小时，其他没奖励
		/*
		if(score1 >= 95 && score2 >= 95){
			System.out.println("考的非常好，奖励一台游戏机!");
		}else if(score1 >=80 && score2 >= 80){
			System.out.println("奖励玩2个小时游戏！");
		}else{
			System.out.println("没有奖励！");
		}
		*/
            //4,if的嵌套使用
            //先看语文成绩，是否超过了90分，再看数学成绩，如果也超过90分，奖励玩游戏2小时，
            //如果数学超过80分，只能玩游戏1个小时，否则没有奖励
            //如果语文没超过90分，也没奖励
            if(score1 >= 90){
                //判断数学
                if(score2 >= 90 ){
                    System.out.println("奖励玩2个小时游戏！");
                }else if(score2 >= 80){
                    System.out.println("奖励玩1个小时游戏！");
                }else{
                    System.out.println("没有奖励！");
                }

            }else{
                System.out.println("没有奖励！");
            }
        }

}
