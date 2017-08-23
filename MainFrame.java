// 繝｡繧､繝ｳ繧ｯ繝ｩ繧ｹ
import javax.swing.*;
//import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JPanel{
	Main mainSys;
	JTextField text1;
	JTextField text2;
	JButton button1;
	MainFrame(Main m){
		mainSys = m;
		this.setName("mainf");
		this.setSize(400, 300);
		this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));



		// ユーザ名入力フォーム
		text1 = new JTextField(/*"ユーザ名を入力"*/);
		// text1.setColumns(15);
		text1.setMaximumSize(new Dimension(300, 30));

		// パスワード入力フォーム
		text2 = new JTextField(/*"パスワードを入力"*/);
		// text2.setColumns(15);
		text2.setMaximumSize(new Dimension(300, 30));

		// Loginボタン
		button1 = new JButton("Login");
		button1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
				// if (text1.getText().equals("testman") && text2.getText().equals("testman") ) {
					pc(mainSys.PanelNames[1]);
				// }
            }
        });
		// button1.setColumns(15);

		this.add(text1);
		this.add(text2);
		this.add(button1);



		// Container contentPane = getContentPane();
		// contentPane.add(panel1, BorderLayout.CENTER);
// tintin
	}

	public void pc(String str){
		mainSys.PanelChange((JPanel)this, str);
    }
}
