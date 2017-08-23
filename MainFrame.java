// メインクラス
import javax.swing.*;
//import javax.swing.border.*;
import java.awt.*;

public class MainFrame extends JFrame{

	public static void main(String[] args){
		MainFrame frame= new MainFrame("パスワード管理ツール");
		frame.setVisible(true);
	}

	MainFrame(String title){
		setTitle(title);
		setBounds(100, 100, 640, 480);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel panel1 = new JPanel();
		panel1.setBackground(Color.WHITE);

		// テキストフィールド作成
		JTextField text1 = new JTextField("ユーザ名を入力");
		text1.setColumns(15);
		text1.setBounds(100,100,100,100);

		panel1.add(text1);

		Container contentPane = getContentPane();
		contentPane.add(panel1, BorderLayout.CENTER);

	}
}

