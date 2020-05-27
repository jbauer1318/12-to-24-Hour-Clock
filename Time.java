class Time {

   private int hrs;
   private int mins;
   private int secs;

    public Time(){
    	hrs = 0;
    	mins = 0;
    	secs = 0;
    }

    public Time(int h, int m, int s) {
        hrs = h;
        mins = m;
        secs = s;
    }

    public int getHrs() {
        return hrs;
    }

    public int getMins() {
        return mins;
    }

    public int getSecs() {
        return secs;
    }

    public void setTime(int h, int m, int s){
    	hrs = (h >= 0 && h < 24)? h : 0;
    	mins = (m >= 0 && m < 60)? m : 0;
    	secs = (s >= 0 && s < 60)? s : 0;
    }


    public void printMilitary (){
    	
    	System.out.print((hrs < 10? "0": "") + hrs + ":");
    	System.out.print((mins < 10? "0": "") + mins + ":");
    	System.out.println((secs < 10? "0": "") + secs + "  ");  
    }

    public void printStandard(){

    	System.out.print((hrs == 0 || hrs == 12? 12: hrs % 12) + ":");
    	System.out.print((mins < 10? "0": "") + mins + ":");
    	System.out.print((secs < 10? "0": "") + secs + " ");
    	System.out.println((hrs < 12? "AM": "PM"));
    }

   
    public String toString() {
    	return hrs + ":" + mins + ":" + secs;
    }

    public boolean equal(Time otherTime){
    	return(hrs == otherTime.hrs && mins == otherTime.mins && secs == otherTime.secs);
    	
    }
    
    public boolean lessThan(Time t){
    	return (hrs < t.hrs || hrs == t.hrs && mins < t.mins || hrs == 
    			t.hrs && mins== t.mins && secs < t.secs);
    }

    public void copy(Time otherTime){
    	hrs = otherTime.hrs;
    	mins = otherTime.mins;
    	secs = otherTime.secs;
    }

    public Time getCopy(){
        return new Time(hrs, mins, secs);
    }

    
    public void incrementHrs() {
    	hrs++;
    	if(hrs > 23)
    	hrs = 0;
    }
    
    public void incrementMins() {
    	mins++;
    	if(mins > 59){
    	mins = 0;
    	incrementHrs();
    	}
    }
    
    public void advanceSecs(){
    	secs++;
    	
    	if(secs > 59){
    	secs = 0;
    	incrementMins();
    	}
    }
    

   

    public boolean notEquals(Time otherTime) {
        return !equal(otherTime);
    }

    public boolean lessOrEquals(Time otherTime) {
        return equal(otherTime) || lessThan(otherTime);
    }

    public boolean greaterThan(Time otherTime) {
        return !lessOrEquals(otherTime);
    }

    public boolean greaterOrEquals(Time otherTime) {
        return greaterThan(otherTime) || equal(otherTime);
    }


}
