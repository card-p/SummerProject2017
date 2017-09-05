import javax.swing.*;
import javax.swing.*;

public class Main extends JFrame {
    public String[] PanelNames = {"mainf", "menuf"};

    MainFrame mainf = new MainFrame(this);
    MenuFrame menuf = new MenuFrame(this);

    public Main () {
        setTitle("パスワード管理アプリ");
        setBounds(100, 100, 640, 480);
        this.add(mainf); mainf.setVisible(true);
        this.add(menuf); menuf.setVisible(true);
    }

    public void PanelChange(JPanel jPanel, String str){
        String name = jPanel.getName();
        if(name==PanelNames[0]){
            mainf = (MainFrame)jPanel;
            mainf.setVisible(false);
        }else if(name==PanelNames[1]){
            menuf = (MenuFrame)jPanel;
            menuf.setVisible(false);
        }

        if(str==PanelNames[0]){
            mainf.setVisible(true);
        }else if(str==PanelNames[1]){
            menuf.setVisible(true);
        }
    }


    public static void main (String[] args) {
        Main mainSys = new Main();
        mainSys.setDefaultCloseOperation(EXIT_ON_CLOSE);
        mainSys.setVisible(true);

		User loginUser = new User();
		loginUser.sql();
    }
}
