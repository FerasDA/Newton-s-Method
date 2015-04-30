class Newton  {

    public static void main(String[] args) {
    	double[] x;
    	x = new double[11];
    	x[0] = 0.00001;
    	double xx,fx, dfx;
    	for (int i = 0; i < 10; i++) {
      		xx = x[i];
    		//fx = (xx/18) - (1/Math.cos(xx)) ;
    		//dfx = (1/18) - ((1/Math.cos(xx))*(Math.tan(xx)));
    		fx = Math.log(xx);
    		dfx = 1/xx;
    		x[i+1] = xx - (fx/dfx);
    	}
    	
    	for (int j=0; j < 11; j++) {
    		System.out.println(x[j]);
    	}
    	
    	
    }
    

}