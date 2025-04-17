package kadai_028;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter28 {
	
	public String getMyChoice() {
		Scanner sc =new Scanner(System.in);
		String input = sc.next();
		
		while(!input.equals("r") && !input.equals("s") && !input.equals("p")) {
			System.out.println("じゃんけんの手ではありません");
			input = sc.next();
		}
		sc.close();
		return input;
	}
	
	public String getRandom() {
		String[] rsp = {"r","s","p"};
		return rsp[(int)Math.floor(Math.random() * 3)];
	}
	
	public void playGame() {
		HashMap<String,String> jan = new HashMap<String,String>();
		
		jan.put("r","グー" );
		jan.put("s", "チョキ");
		jan.put("p", "パー");
		
		System.out.println("自分のじゃんけんの手を入力しましょう");
		System.out.println("グーはrockのrを入力しましょう");
		System.out.println("チョキはscissorsのsを入力しましょう");
		System.out.println("パーはpaperのpを入力しましょう");
		
		String ply = getMyChoice();
		
		String cpu = getRandom();
		
		System.out.println("自分の手は" + jan.get(ply) + ",対戦相手の手は" + jan.get(cpu));
		
		if(ply.equals(cpu) == true) {
			System.out.println("あいこです");
		}else if((ply.equals("r") && cpu.equals("s")) || (ply.equals("s") && cpu.equals("p")) || (ply.equals("p") && cpu.equals("r"))) {
			System.out.println("自分の勝ちです");
		}else {
			System.out.println("自分の負けです");
		}
	}

}
