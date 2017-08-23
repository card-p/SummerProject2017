// 繝｡繧､繝ｳ繧ｯ繝ｩ繧ｹ
import javax.swing.*;
//import javax.swing.border.*;
import java.awt.*;

public class MainFrame extends JPanel{
	Main mainSys;

	MainFrame(Main m){
		mainSys = m;
		// ユーザ名入力フォーム
		JTextField text1 = new JTextField("ユーザ名を入力");
		text1.setColumns(15);
		text1.setBounds(100,100,100,100);

		this.add(text1);

		// Container contentPane = getContentPane();
		// contentPane.add(panel1, BorderLayout.CENTER);
// tintin
	}

	public void pc(String str){
        mainSys.PanelChange((JPanel)this, str);
    }
}
