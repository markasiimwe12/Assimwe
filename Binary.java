package Binary;

class DecimaltoBinary
{
	public static void main(String[] args) {
		
		int i=1, binary=0, rem;
		int num = 5;
		
		System.out.println("Decimal: "+ num);
		
		
		while(num!=0){
		    rem = num%2;
		    binary += i*rem;    
		    num = num/2;
		    i=i*10;
		}
		
		System.out.println("finally you will get to binary number ");
		System.out.println("Binary: "+ binary);
		
	}
}
