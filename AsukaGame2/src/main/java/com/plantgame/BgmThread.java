package com.plantgame;

import javazoom.jl.player.Player;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class BgmThread extends Thread {
    //ʹ���߳������Ƶ�Ĳ���

    public void run() {
        String filename = "bgm.mp3";
        try {
            BufferedInputStream buffer = new BufferedInputStream(new FileInputStream(filename));
            Player player = new Player(buffer);
            player.play();
        } catch (Exception ignored) {
        }
    }
    public static void bgmstart(){
        //ѭ������bgm
        while(true) {
            BgmThread bgmThread = new BgmThread();
            bgmThread.start();
            try {
                BgmThread.sleep(181000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            BgmThread.interrupted();
        }
    }
}

