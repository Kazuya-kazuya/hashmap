package hashmap;

import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		//DBをXMLMapで生成
		Map<String, Object> memberDB = new XMLMap();
		Map<String, Object> kazuya = new XMLMap();
		kazuya.put("ID", "1");
		kazuya.put("name", "kazuya");
		kazuya.put("hobby", "soccer");
		memberDB.put(kazuya.get("ID").toString(), kazuya);
		Map<String, Object> nakayama = new XMLMap();
		nakayama.put("ID", "2");
		nakayama.put("name", "nakayama");
		nakayama.put("hobby", "baseball");
		memberDB.put(nakayama.get("ID").toString(), nakayama);
		Map<String, Object> tetsuya = new XMLMap();
		tetsuya.put("ID", "3");
		tetsuya.put("name", "tetsuya");
		tetsuya.put("hobby", "mahjong");
		memberDB.put(tetsuya.get("ID").toString(), tetsuya);
		//XML形式で出力
		System.out.println(memberDB);
	}

}

class XMLMap extends HashMap<String, Object>{
	//XML形式で出力
	public String toString() {
		String str = "";
		for(String key : this.keySet()) {
			str += "<" + key + ">" + "\n";
			str += this.get(key).toString() + "\n";
			str += "</" + key + ">" + "\n";
		}
		return str;
	}
}