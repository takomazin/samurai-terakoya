package kadai_015;

//車クラス
public class Car_Chapter15 {
	
	// フィールド（内部データ）
	private int gear = 1;  // 1速から5速のギアを表す
	
	private int speed = 10;  //ギアチェンジ後の速度を表す
	
	//ギアの値により速度を変える
	public void gearChange( int afterGear ) {
		System.out.println("ギア" + gear + "から" + afterGear + "に切り替えました");
		gear = afterGear;
	}
	
	
	//ギアチェンジ後の速度を表示する
	public void run() {
		if(gear <= 5 && gear >= 1 ) {
			System.out.println("速度は時速" + gear*speed + "Kmです");
		}else {
			System.out.println("速度は時速"+ speed + "Kmです");
		}
	}

}
