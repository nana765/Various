//オブジェクトの作成

 //車クラス
   class Car{
      //フィールド
       int num;
       double gas;
       //メソッドの定義...戻り値(return を使う)がないときvoid,戻り値がint型のときint,戻り値がdouble型のときdouble
       void show(){
       	System.out.println("車のナンバーは"+num+"です");
    	System.out.println("ガソリン量は"+gas+"です");
    }
     
    void showCar(){
    	System.out.println("これから車の情報を表示します");
         show();//自身のメソッドを意味する
    }
		//メソッド（引数ver)
		void setNum(int n){
			num = n;
			System.out.println("ナンバーを"+ num+"にしました");
       
 	   }
 	   void setGas(double g){
 	   	gas = g;
 	   	System.out.println("ガソリンの量は"+gas+"にしました");
 	   }
 	   //メソッド（ 複数の引数ver) 
 	   void setNumGas(int n,double g){
 	   	num = n;
 	   	gas = g;
 	   	System.out.println("車のナンバーを"+num+"にガソリン量を"+gas+"にしました");
 	   }
  }
 	   
 //sample1クラス
   class Sample1{
    	public static void main(String[] args){
    		//オブジェクトの作成
    		Car car1; //Car型の変数宣言
    		car1 = new Car(); 
    		//車のナンバーとガソリン量の代入
    		car1.num = 1234;
    		car1.gas = 20.5;
    		
    	//出力
    	System.out.println("車のナンバーは"+car1.num+"です");
    	System.out.println("ガソリン量は"+car1.gas+"です");
	
    		}
    	}
 //sample2クラス
   class Sample2{
    	public static void main(String[] args){
    		//オブジェクトの作成
    		Car car1; //Car型の変数宣言
    		car1 = new Car(); 
    		//車のナンバーとガソリン量の代入
    		car1.num = 1234;
    		car1.gas = 20.5;
    		
    	//出力（メソッドの呼び出し）
    	car1.show();//メソッドの呼び出し
    	car1.show();//もう一度メソッドの呼び出し
    	    		}
    	}
//sample3クラス
 class Sample3{
    	public static void main(String[] args){
    		//オブジェクトの作成
    		Car car1; //Car型の変数宣言
    		car1 = new Car(); 
    		//車のナンバーとガソリン量の代入
    		car1.num = 1234;
    		car1.gas = 20.5;
    		
    	//出力（クラス内でメソッドを呼び出す）
    	car1.showCar();
    	    		}
    	}
// sample4クラス（引数をもつメソッドを呼び出す）
class Sample4{
 public static void main(String[] args){
    		//オブジェクトの作成
    		Car car1; //Car型の変数宣言
    		car1 = new Car(); 
    		//車のナンバーとガソリン量の代入
    		car1.setNum(4321);
    		car1.setGas(20.5);
    		    	    		}
    	}
// sample5クラス（複数の引数をもつメソッドを呼び出す）
class Sample5{
 public static void main(String[] args){
    		//オブジェクトの作成
    		Car car1; //Car型の変数宣言
    		car1 = new Car(); 
    		//車のナンバーとガソリン量の代入
    		int number = 1234;
    		double gasolin = 20.5;
    		car1.setNumGas(number,gasolin);
    		    	    		}
    	}