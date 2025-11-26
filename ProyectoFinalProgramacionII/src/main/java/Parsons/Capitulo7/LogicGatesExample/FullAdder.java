package Parsons.Capitulo7.LogicGatesExample;

public class FullAdder {
	AndGate carryAndGate = new AndGate();
	AndGate resultAndGate = new AndGate();
	OrGate orGate = new OrGate();
	OrGate orGate2 = new OrGate();
	OrGate orGate3 = new OrGate();
	NotGate notGate = new NotGate();
	HalfAdder halfAdder= new HalfAdder();
	HalfAdder halfAdder2= new HalfAdder();
	HalfAdder halfAdder3= new HalfAdder();
	HalfAdder halfAdder4= new HalfAdder();
	
	HalfAdder halfAdder5= new HalfAdder();
	HalfAdder halfAdder6= new HalfAdder();
	HalfAdder halfAdder7= new HalfAdder();
	
	private int[] result;
	int ha1,ha2,ha3,ha4,ha5,ha6,ha7,hac1,hac2,hac3,hac4,hac5,hac6,hac7;
	int or1,or2,or3;
	private int[] input1;
	private int[] input2;
	private int carry;
	
	public void setInput(int[] input1, int[] input2) {
		this.input1=input1;
		this.input2=input2;
		result = new int[4];
		halfAdder.setInput(input1[0], input2[0]);
		hac1=halfAdder.getCarry();
		ha1=halfAdder.getResult();
		
		halfAdder2.setInput(input1[0], input2[0]);
		hac2=halfAdder2.getCarry();
		ha2=halfAdder2.getResult();
		
		halfAdder3.setInput(input1[0], input2[0]);
		hac3=halfAdder3.getCarry();
		ha3=halfAdder3.getResult();
		
		halfAdder4.setInput(input1[0], input2[0]);
		hac4=halfAdder4.getCarry();
		ha4=halfAdder4.getResult();
		
		result[3]=ha3;
		
		halfAdder5.setInput(hac4, ha3);
		hac5=halfAdder5.getCarry();
		ha5=halfAdder5.getResult();
		
		this.result[2]=ha5;
		
		or1=orGate3.getOutput(hac5, hac3);
		
		halfAdder6.setInput(or1, ha2);
		hac6=halfAdder6.getCarry();
		ha6=halfAdder6.getResult();
		
		this.result[1]=ha6;
		
		or2=orGate2.getOutput(hac6, hac2);
		
		halfAdder7.setInput(or2, ha1);
		hac7=halfAdder7.getCarry();
		ha7=halfAdder7.getResult();
		
		this.result[0]=ha7;
		
		or3=orGate3.getOutput(hac1, hac7);
		
		carry=or3;
		
	}
	
	public int[] getResult() {
		return result;
	}
	
	public int getCarry() {
		return carry;
	}
	
}
