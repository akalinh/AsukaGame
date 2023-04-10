package com.plantgame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.io.IOException;

public class Plant extends JPanel implements MouseMotionListener {
	private boolean alive = true;
	ImageIcon role = new ImageIcon("images\\text.png");
	int roleX=0;//����ͼƬһ��ʼ��������ͼ�е�X����
	int roleY=0;//����ͼƬһ��ʼ��������ͼ�е�Y����
	int newroleX = roleX;//�ƶ������������ͼ�е�X����λ�ã����·���paint�����ｫ�������ͼƬ���룩
	int newroleY = roleY;
	int roleWidth =50;//����ͼƬ�Ŀ�
	int roleHeight = 50;//����ͼƬ�ĸ�

	public Plant() throws IOException {
	}

	public boolean getAlive() {
		return alive;
	}
	public void setAlive(boolean alive) {
		this.alive = alive;
	}
	public Rectangle getRect() {
		return new Rectangle(roleX, roleY, roleWidth, roleHeight);
	}

//
	public void paint(Graphics g) {             //��ͼ
		super.paint(g);
		g.drawImage(role.getImage(),roleX,roleY,roleWidth,roleHeight,null);
	}


	public void mouseDragged(MouseEvent e) {        //�����������

//		newroleX = e.getX()-roleWidth/2;               //�ж�ͼƬ�ƶ���Χ�����������ͼƬ����
//		newroleY = e.getY()-roleHeight/2;
//
//		//System.out.println("�ƶ�����"+e.getX()+","+e.getY()+","+newroleX+","+newroleY);
//		//1500��900Ϊ��ͼ�ĸߺͿ�
//		if((newroleX+roleWidth>1500)&&(newroleY+roleHeight>900))     //�ж����½�
//		{/*X,Yֵ�����ı�*/}
//
//		else if((newroleX<0)&&(newroleY<0))                            //�ж����Ͻ�
//		{/*X,Yֵ�����ı�*/}
//
//		else if((newroleX+roleWidth>1500)&&(newroleY<0))             //�ж����Ͻ�
//		{/*X,Yֵ�����ı�*/}
//
//		else if((newroleY+roleHeight>900)&&(newroleX<0))             //�ж����½�
//		{/*X,Yֵ�����ı�*/}
//
//		else if((newroleX+roleWidth>1500)           //�ж����Ե���ұ�Ե
//				||
//				(newroleX<0)) {
//			roleY = newroleY;
//			repaint(roleX,roleY,roleWidth,roleHeight);
//		}
//
//		else if((newroleY+roleHeight>900)       //�ж��ϱ�Ե���±�Ե
//				||
//				(newroleY<0)){
//			roleX = newroleX;
//			repaint(roleX,roleY,roleWidth,roleHeight);
//		}
//		else {                                     //δ����Χֵ����
//			roleX = newroleX;
//			roleY = newroleY;
//			repaint(roleX,roleY,roleWidth,roleHeight);
//		}
	}
	public void mouseMoved(MouseEvent e) {        //����ƶ�������
		//�����ж�ͬ��
		newroleX = e.getX()-roleWidth/2;
		newroleY = e.getY()-roleHeight/2;

		//System.out.println("�ƶ�����"+e.getX()+","+e.getY()+","+newroleX+","+newroleY);

		if((newroleX+roleWidth>1500)&&(newroleY+roleHeight>900))
		{/*X,Yֵ�����ı�*/}

		else if((newroleX<0)&&(newroleY<0))
		{/*X,Yֵ�����ı�*/}

		else if((newroleX+roleWidth>1500)&&(newroleY<0))
		{/*X,Yֵ�����ı�*/}

		else if((newroleY+roleHeight>900)&&(newroleX<0))
		{/*X,Yֵ�����ı�*/}

		else if((newroleX+roleWidth>1500)
				||
				(newroleX<0)) {
			roleY = newroleY;
			repaint(roleX,roleY,roleWidth,roleHeight);
		}

		else if((newroleY+roleHeight>900)
				||
				(newroleY<0)){
			roleX = newroleX;
			repaint(roleX,roleY,roleWidth,roleHeight);
		}
		else {
			roleX = newroleX;
			roleY = newroleY;
			repaint(roleX,roleY,roleWidth,roleHeight);
		}
	}
}


