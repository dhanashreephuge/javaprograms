package constructor;
public class StaticExample {
    //static function can access only static variables
	//non static function can access both static and non static variables
	//static function and variables are object independent
   int i=5;
   static int j=10;
   void show()
   {
  	 System.out.println(i+" "+j);
   }
	public static void main(String[] args) {
		StaticExample se=new StaticExample();
		StaticExample se2=new StaticExample();
		se.i++;
		se.j++;
	System.out.println(se.i);//non static
	System.out.println(se2.i);
  System.out.println(se.j);
  System.out.println(se2.j);
	}

}
