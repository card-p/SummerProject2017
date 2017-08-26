import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main extends JFrame {
    public String[] PanelNames = {"mainf"};

    MainFrame mainf = new MainFrame(this);

    public Main () {
        setTitle("パスワード管理アプリ");
        setBounds(100, 100, 640, 480);
        this.add(mainf); mainf.setVisible(true);
    }

    public void PanelChange(JPanel jPanel, String str){
        String name = jPanel.getName();
        if(name==PanelNames[0]){
            mainf = (MainFrame)jPanel;
            mainf.setVisible(false);
        }

        if(str==PanelNames[0]){
            mainf.setVisible(true);
        }
    }


    public static void main (String[] args) {
        Main mainSys = new Main();
        mainSys.setDefaultCloseOperation(EXIT_ON_CLOSE);
        mainSys.setVisible(true);

	//	User loginUser = new User();
	//	loginUser.sql();
    }
}
