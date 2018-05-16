 //車クラス
   class Car{
      //フィールド(privateメンバ)...クラスの外からアクセス出来ないようにすること
       private int num;
       private double gas;
       //コンストラクタの定義
       public Car(){
       	num = 0;
       	gas = 0.0;
       	System.out.println("車を作成しました");
     }       
       
       //メソッドの定義...戻り値(return を使う)がないときvoid,戻り値がint型のときint,戻り値がdouble型のときdouble
       
       //オーバーロード
       public void setCar(int n){
       	num = n;
       	System.out.println("ナンバーを"+num+"にしました");
     }
     public void setCar(double g){
     	gas = g;
     	System.out.println("ガソリン量を"+gas+"にしました"); 
     }
     public void setCar(int n,double g){
     	num = n;
     	 gas = g;
       		System.out.println("ナンバーを"+num+"に、ガソリン量を"+gas+"にしました");
       }
  //publicメンバにはクラスからアクセスできる
       public void setNumGas(int n,double g){
       	if(g>0 && g<1000){
       		num = n;
       		gas = g;
       		System.out.println("ナンバーを"+num+"に、ガソリン量を"+gas+"にしました");
       	}else{
       		System.out.println(g+"は正しいガソリン量ではありません");
       		System.out.println("ガソリン量は"+gas+"です");
       	}
       }
       
      public void show(){
       	System.out.println("車のナンバーは"+num+"です");
    	System.out.println("ガソリン量は"+gas+"です");
    }
    }
  /*
  class Sample1{
  	public static void main(String[] args){
  		Car car1 = new Car();
  		
  		car1.num = 1234;
  		car1.gas = 20.5;
  		car1.show();
  		}
  		}
  */
  class Sample2{
  	public static void main(String[] args){
  		Car car1 = new Car();//オブジェクトを作成するとコンストラクタが呼び出される
  		//このようなアクセスはなくなる（privateメンバにアクセスできない）
  		//car1.num = 1234;
  		//car1.gas = 20.5;
  		
  		car1.setNumGas(1234,20.5);//必ずpublicメンバを呼び出して値を設定
  		car1.show();
  		
  	  	System.out.println("正しくないガソリン量（-10.0)を指定してみます");
  	  	
  	  	car1.setNumGas(1234,-10.0);
  	  	car1.show();
  	  	
  		}
  		}
  
  class Sample3{
  	public static void main(String[] args){
  		Car car1 = new Car();
  		car1.setCar(1234,20.5);//2個の引数を持つメソッドがよびだされる
  		car1.show();
  		
  	  	System.out.println("車のナンバーだけ変更します");
  	  	car1.setCar(2345);
  	  	car1.show();
  	  	
		System.out.println("ガソリン量だけ変更します");  	  	
  	  	car1.setCar(30.5);
  	  	car1.show();
  	 }
  }  	

  	 class Sample4{
  	public static void main(String[] args){
  		Car car1 = new Car();
  		car1.setCar(1234,20.5);//2個の引数を持つメソッドがよびだされる
  		car1.show();
  		
  	  	System.out.println("車のナンバーだけ変更します");
  	  	car1.setCar(2345);
  	  	car1.show();
  	  	
		System.out.println("ガソリン量だけ変更します");  	  	
  	  	car1.setCar(30.5);
  	  	car1.show();
  	 }
  }  	  