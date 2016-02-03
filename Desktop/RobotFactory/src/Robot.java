import java.util.Comparator;

class Robot implements Comparator<Robot>,Comparable<Robot>{
	private int numberone;
	private int numbertwo;

	public int getNumberone() {
		return numberone;
	}
	public void setNumberone(int numberone) {
		this.numberone = numberone;
	}
	public int getNumbertwo() {
		return numbertwo;
	}
	public void setNumbertwo(int numbertwo) {
		this.numbertwo = numbertwo;
	}

	Robot(){
	}

	Robot(int one,int two){
		this.numberone=one;
		this.numbertwo=two;
	}
	public int compareTo(Robot d){
		return 0;
	}
	@Override
	public int compare(Robot o1, Robot o2) {
		// TODO Auto-generated method stub
		return o1.numberone-o2.numberone;
	}
	public static Comparator<Robot> FirstNumberComparable= new Comparator<Robot>(){
		public int compare(Robot arg0, Robot arg1) {
			int flag = arg0.numberone-arg1.numberone;
			if(flag==0){}
			return flag;
		}
	};
}

