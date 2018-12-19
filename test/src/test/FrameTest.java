package test;

import java.awt.EventQueue;

/**
 * 测试基本框架类
 * @author CQY
 *
 */
public class FrameTest {
	public static void main(String[] args) {
		//匿名内部类开启一个线程
		EventQueue.invokeLater(new Runnable() {
			
			@Override
			public void run() {
			
			}
		});
	}
}
