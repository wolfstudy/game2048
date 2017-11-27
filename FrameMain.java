package org.game;

import org.view.WinShow;

import javax.swing.*;
import java.awt.*;

/**
 * Created by wolf4j on 17-11-27.
 */
public class FrameMain {
  public static void main(String[] args) {
      WinShow winShow = new WinShow();
      winShow.initView();
      winShow.setTitle("2048[@版权wolf4j所有]");
      winShow.getContentPane().setPreferredSize(new Dimension(400,500));
      //JFrame直接调用setBackground设置背景色不生效
      winShow.getContentPane().setBackground(new Color(0xfaf8ef));
      winShow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      winShow.setResizable(false);//去掉最大化按钮
      winShow.pack();//获得最佳大小
      winShow.setVisible(true);
  }
}
