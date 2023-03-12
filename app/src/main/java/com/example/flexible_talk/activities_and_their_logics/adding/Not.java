package com.example.flexible_talk.activities_and_their_logics.adding;

import java.util.Random;

public class Not {

    private String nickName;
    private int pp;
    private String doing;

    public Not(String nickName, int pp, String doing) {
        this.nickName = nickName;
        this.pp = pp;
        this.doing = doing;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public void setPp(int pp) {
        this.pp = pp;
    }

    public void setDoing(String doing) {
        this.doing = doing;
    }

    public String getNickName() {
        return nickName;
    }

    public int getPp() {
        return pp;
    }

    public String getDoing() {
        return doing;
    }


    private static final String[] doings = {"подписался",
            "добавил комментарий в ваше обсуждение",
            "ответил на ваш комментарий"};
    private static final Random random = new Random();

    public static String getRandomDoing() {
        return doings[random.nextInt(doings.length)];
    }
}
