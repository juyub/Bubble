package bubble.test.ex03;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class BubbleFrame extends JFrame {

	private JLabel backgroundMap;
	private Player player;

	public BubbleFrame() {
		initObject();
		initSetting();
		initListener();
		setVisible(true);

	}

	private void initObject() {
		backgroundMap = new JLabel(new ImageIcon("image/backgroundMap.png"));
		setContentPane(backgroundMap);

		player = new Player();
		add(player);
//		backgroundMap.setSize(100, 100);
//		backgroundMap.setLocation(300, 300);
//		backgroundMap.setSize(1000, 600);
//		add(backgroundMap); //JFrame�� JLabel
	}

	private void initSetting() {
		setSize(1000, 640);
		setLayout(null); // absolute ���̾ƿ�(�����Ӱ� �׸��� �׸� �� �ִ�)

		setLocationRelativeTo(null); // JFrame ��� ��ġ�ϱ�
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // x��ư���� â�� �� �� JVM ���� �����ϱ�
//		setVisible(true);
	}

	private void initListener() {
		addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				// �̺�Ʈ �ڵ鷯
				System.out.println(e.getKeyCode());

				switch (e.getKeyCode()) {
				case KeyEvent.VK_LEFT:
					player.left();
					break;
				case KeyEvent.VK_RIGHT:
					player.right();
					break;
				case KeyEvent.VK_UP:
					player.up();
					break;
//				case KeyEvent.VK_DOWN:
//					player.down();
//					break;
				}
			}
		});
	}

	public static void main(String[] args) {
		new BubbleFrame();
	}
}
