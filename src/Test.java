
public class Test {
	
	public static void main(String[] args) {
		
//		コンストラクタ１を使ったインスタンス化
		Person taro = new Person();
		taro.name = "taro";
		taro.age = 18;
		System.out.println(taro.name);
		System.out.println(taro.age);
		
//		コンストラクタ２を使ったインスタンス化
		Person jiro = new Person("jiro", 20);
		System.out.println(jiro.name);
		System.out.println(jiro.age);
		
//		コンストラクタ３を使ったインスタンス化
		Person saburo = new Person("saburo");
		System.out.println(saburo.name);
		System.out.println(saburo.age);
		
//		コンストラクタ４を使ったインスタンス化
		Person nanashi = new Person(25);
		System.out.println(nanashi.name);
		System.out.println(nanashi.age);
		
//		コンストラクタ５を使ったインスタンス化
		Person hanako = new Person(17, "hanako");
		System.out.println(hanako.name);
		System.out.println(hanako.age);
	}

}
