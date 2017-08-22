// メインクラス
import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame{

	public static void main(String[] args){
		MyFrame frame= new MyFrame("パスワード管理ツール");
		frame.setVisible(true);
	}

	MyFrame(String title){
		setTitle(title);
		setBounds(100, 100, 640, 480);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel panel1 = new JPanel();
		panel1.setBackground(Color.WHITE);
	}
}

