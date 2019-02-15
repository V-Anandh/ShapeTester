class Box {
	int lB;
	int hB;
	int wB;
	public Box(int lB, int wB, int hB){
		this.lB = lB;
		this.hB = hB;
		this.wB = wB;
}
	public double volume(){
		double volVal;
		return volVal = lB*wB*hB;
		}
	public double surfaceArea(){
		double surfVal;
		return surfVal =  (2*hB*wB) +( 2 * hB * lB )+( 2 * wB* lB);
		}
		
	}
