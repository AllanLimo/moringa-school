public class Account {
    int adminNo;
    int feesBal;
    int penaltyAmount;
    int examFees;

    Student allan;


    public Account(int adminNo, int feesBal, int penaltyAmount) {
        this.adminNo = adminNo;
        this.feesBal = feesBal;
        this.penaltyAmount = penaltyAmount;
    }

    public int getAdminNo() {
        return adminNo;
    }

    public void setAdminNo(int adminNo) {
        this.adminNo = adminNo;
    }

    public int getFeesBal() {
        return feesBal;
    }

    public void setFeesBal(int feesBal) {
        this.feesBal = feesBal;
    }

    public int getPenaltyAmount() {
        return penaltyAmount;
    }

    public void setPenaltyAmount(int penaltyAmount) {
        this.penaltyAmount = penaltyAmount;
    }

    public int getExamFees() {
        return examFees;
    }

    public void setExamFees(int examFees) {
        this.examFees = examFees;
    }

    @Override
    public String toString() {
        return "Account{" +
                "adminNo=" + adminNo +
                ", feesBal=" + feesBal +
                ", penaltyAmount=" + penaltyAmount +
                ", examFees=" + examFees +
                '}';
    }
}
