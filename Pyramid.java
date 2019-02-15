class Pyramid{
	int lP;
	int hP;
	int wP;
	public Pyramid(int lP, int wP, int hP){
		this.lP = lP;
		this.hP = hP;
		this.wP = wP;
}
	public double volume(){
		double volVal;
		return volVal =((lP * wP) * hP)/3;
		}
	public double surfaceArea(){
		double surfVal;
		return surfVal =  (lP*wP)+(lP * Math.sqrt( Math.pow((wP/2),2) + Math.pow(hP,2) ) ) + (wP * (Math.sqrt(Math.pow((lP/2),2) + Math.pow(hP,2) ) ) );
		}
}