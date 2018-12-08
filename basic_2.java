//基本形
class クラス名{
	型名　フィールド名;
	public static void main(String[] args){
		型名　識別変数
		System.out.println(出力したい文字); //自動的に改行される
		System.out.print(出力したい文字); //改行されない
	}
	}
	
	/*一つ以上のクラスが必要*/
	/*出力したい文字について
	　' ' 文字
	　" "文字列
	　数字の場合は数字のみ*/
	/*8進数…数字の前に０をつける
	16進数…数字の前に０ｘをつける*/
	
	
//キーボードからの入力
　import java.io.*;
class クラス名{
	public static void main(String[] args) throws IOException{
	
	BufferedReader br =
	new BufferedReader(new InputStreamReader(System.in));
	//2回続けて入力 
	String str1 = br.readLine();//キーボードから入力した文字列をstrに読み込む
	String str2 = br.readLine();//数値を読み込む
	
	int num1 = Integer.parseInt(str2);//str2が数値のときint 型の変数に読み込む
	
	double num2 = Double.parseDouble(str2);//double型に読み込む
	//計算結果を表したい式には””をつけない
	System.out.println("変数num1の値は"+ num1+"です");
	System.out.println("変数num1に２足した数は"+(num1+2)+"です");
	
	}
}
/*
2進数で表記したときのケタを左または右指定数だけずらす
　<<...左シフト
　>>...右シフト
　>>>...符号なし右シフト
前置インクリメント....++a 先に＋１する
後置インクリメント....a++　あとに＋１する
*/
/* 
 if文...ｃと同じ
  switch...ｃと同じ
  　　　　入力文字によって場合分けする場合　char res = str.charAt(0)で文字列から文字を取り出す
  条件演算子　(条件)? trueのときの式1:falseのときの式2
  while文,do~while文...cと同じ
  continue...繰り返し内の処理を飛ばして、ブロックの先頭位置に戻って次の処理を続ける
*/

/*配列について
　型名[]　配列変数名；
　配列変数名 = new 型名[要素数];

配列の初期化
　int[] 変数名={ 各要素 };
配列の長さを知る
　配列変数名.length
　配列変数名[].length....多次元配列において要素の長さが異なる場合の個々の配列要素の長さを知る
多次元配列について
　型名[][] 配列変数名;
    配列変数名 = new 型名[要素数][要素数];
*/




