import javax.swing.*;
//import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class MenuFrame extends JPanel{
	Main mainSys;
    JPanel panel1;
    JPanel panel2;
    

	MenuFrame(Main m){
		mainSys = m;
        this.setName("menuf");
		this.setSize(400, 300);
		this.setLayout(new BoxLayout(this, BoxLayout.X_AXIS));

        // サイトリストパネル
        panel1 = new JPanel();
        panel1.setMaximumSize(new Dimension(300, 480));

        Jbutton
        // サイトリストパネル
        panel2 = new JPanel();
        panel2.setMaximumSize(new Dimension(340, 480));


        this.add(panel1);
        this.add(panel2);





	}

	public void pc(String str){
		mainSys.PanelChange((JPanel)this, str);
    }
}
