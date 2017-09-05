// 
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
		//
		this.setName("mainf");
		this.setSize(400, 300);
		this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));



		//
		text1 = new JTextField(/*""*/);
		// text1.setColumns(15);
		text1.setMaximumSize(new Dimension(300, 30));

		//
		text2 = new JTextField(/**/);
		// text2.setColumns(15);
		text2.setMaximumSize(new Dimension(300, 30));

		// Login
		button1 = new JButton("Login");
		button1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
				 if (text1.getText().equals("testman") && text2.getText().equals("testman") ) {
					pc(mainSys.PanelNames[1]);
					System.out.println("ログインしました。");
				 }else{
					 System.out.println("ログインに失敗しました。");
				 }
            }
        });

		this.add(text1);
		this.add(text2);
		this.add(button1);



		// Container contentPane = getContentPane();
		// contentPane.add(panel1, BorderLayout.CENTER);
	}

	public void pc(String str){
		mainSys.PanelChange((JPanel)this, str);
    }
}
