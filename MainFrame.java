// メインクラス
import javax.swing.*;
//import javax.swing.border.*;
import java.awt.*;

public class MainFrame extends JPanel{
	Main mainSys;

	MainFrame(Main m){
		mainSys = m;
		// ���[�U�����̓t�H�[��
		JTextField text1 = new JTextField("���[�U�������");
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
