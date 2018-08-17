package exam2017;
import java.util.Arrays;

public class UnsignedInt {
	private boolean[] thisInt;
	private boolean[] thisIntRev;
	
	public UnsignedInt (int thisInt) {
		this.thisIntRev = new boolean[10];
		toBoolArrRev(thisInt);
		
	}
	
	public UnsignedInt (boolean[] thisInt) {
		this.thisInt = new boolean[10];
		this.thisInt = thisInt;
	}
	
	private void toBoolArrRev(int thisInt) {
		
		int i = 0;
		while (thisInt > 0){
		    if ( thisInt % 2 == 1 ) {
		    	this.thisIntRev[i] = true;
		    } else {
		    	this.thisIntRev[i] = false;
			}
		    i++;
		    thisInt /= 2;
		}
		rev();
	}
	
	private void rev() {
		thisInt = new boolean[10];
		for (int i = 0; i < thisIntRev.length; i++) {
			thisInt[i] = thisIntRev[thisIntRev.length - i - 1];
		}
	}
	
	public UnsignedInt AND (UnsignedInt uint) {
		boolean[] result = new boolean[10];
		boolean[] thisArr = thisInt;
		boolean[] newArr = uint.getThisInt();
		
		for (int i = 0; i < thisArr.length; i++) {
			if (thisArr[i] && newArr[i]) {
				result[i] = true;
			} else {
				result[i] = false;
			}
		}
		
		return new UnsignedInt(result);
	}
	
	public UnsignedInt OR (UnsignedInt uint) {
		
		boolean[] result = new boolean[10];
		boolean[] thisArr = thisInt;
		boolean[] newArr = uint.getThisInt();
		
		for (int i = 0; i < thisArr.length; i++) {
			if (thisArr[i] || newArr[i]) {
				result[i] = true;
			} else {
				result[i] = false;
			}
		}
		
		return new UnsignedInt(result);
		
	}
	
	public UnsignedInt NOT () {
		
		boolean[] result = new boolean[10];
		
		for (int i = 0; i < thisInt.length; i++) {
				result[i] = !thisInt[i];
		}
		
		return new UnsignedInt(result);
		
	}
	
	public UnsignedInt NAND (UnsignedInt uint) {
		
		return AND(uint).NOT();
		
	}
	
	public UnsignedInt NOR (UnsignedInt uint) {
		return OR(uint).NOT();
	}
	
	public String toString() {
		
		StringBuffer strbuf = new StringBuffer();
		for (int i = 0; i < thisInt.length; i++) {
			if (thisInt[i] == false) {
				strbuf.append("0");
			} else {
				strbuf.append("1");
			}
		}
		
		return strbuf.toString();
	}
	
	public int toDecimalRep() {
		return Integer.parseInt(this.toString(), 2);
	}
	
	public boolean[] getThisInt() {
		return thisInt;
	}

	public void setThisInt(boolean[] thisInt) {
		this.thisInt = thisInt;
	}
	
	public void printArr() {
		
		for (int i = 0; i < thisInt.length; i++) {
			System.out.println(thisInt[i]);
		}
	}

}
