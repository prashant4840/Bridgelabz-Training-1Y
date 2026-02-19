 class Truck extends Vehicle implements Insurable {

    private String insurancePolicyNumber;

    public Truck(String number, double rate, String policyNo) {
        super(number, "Truck", rate);
        this.insurancePolicyNumber = policyNo;
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days * 1.2;   // extra heavy vehicle charge
    }

    @Override
    public double calculateInsurance() {
        return getRentalRate() * 0.15;   // 15% insurance
    }

    @Override
    public String getInsuranceDetails() {
        return "Truck Insurance Policy: " + insurancePolicyNumber;
    }
}