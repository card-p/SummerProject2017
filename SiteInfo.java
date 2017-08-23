// webサイト情報

public class SiteInfo(){

	String pageName;
	String pageId;
	String pagePass;

	// コンストラクタ
	SiteInfo(String name, String id, String pass){
		pageName = name;
		pageId = id;
		pagePass = pass;
	}

	String getPagename(){
		return pageName;
	}
}

