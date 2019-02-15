class Sphere{
	int r;

	public Sphere(int r){
		this.r = r;

}
	public double volume(){
		double volVal;
		return volVal = (1.33333) * (Math.PI * Math.pow(r,3));
		}
	public double surfaceArea(){
		double surfVal;
		return surfVal =  4 * Math.PI * (r*r);
		}
}