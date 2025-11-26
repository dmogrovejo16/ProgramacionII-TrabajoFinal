package Parsons.Capitulo7.LogicGatesExample;

public class FullAdderTest {
	public static void main(String[] args)
	{
		FullAdder fullAdder= new FullAdder();
		
		int[] input1 = {1,1,1,1};
		int[] input2 = {1,1,1,1};
		
		fullAdder.setInput(input1,input2);
		
		System.out.println("Result from full adder is "
				+ fullAdder.getResult()[0]+","+fullAdder.getResult()[1]+","+fullAdder.getResult()[2]+","+fullAdder.getResult()[3]);
				System.out.println("Carry value from full adder is "
				+ fullAdder.getCarry());
				
	}
}
