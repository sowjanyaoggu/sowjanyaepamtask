 double interestAppliedPerTimePeriod;

    public Calci(double principleAmount, double rateOfInterest, double timePeriod, double interestAppliedPerTimePeriod){
        super(principleAmount, rateOfInterest, timePeriod);
        this.interestAppliedPerTimePeriod = interestAppliedPerTimePeriod;
    }

    public double getTotalCompoundInterest(){
        double interestAmount;
        interestAmount = principleAmount * Math.pow((1 + (rateOfInterest /(100.00* interestAppliedPerTimePeriod))), interestAppliedPerTimePeriod * timePeriod);
        return interestAmount;
    }