public class Library {
    int admNo;
    String book;
    int penaltyAmount;
    int examFees;


    public Library(int admNo, String book, int penaltyAmount, int examFees) {
        this.admNo = admNo;
        this.book = book;
        this.penaltyAmount = penaltyAmount;
        this.examFees = examFees;
    }

    public int getAdmNo() {
        return admNo;
    }

    public void setAdmNo(int admNo) {
        this.admNo = admNo;
    }

    public String getBook() {
        return book;
    }

    public void setBook(String book) {
        this.book = book;
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
        return "Library{" +
                "admNo=" + admNo +
                ", book='" + book + '\'' +
                ", penaltyAmount=" + penaltyAmount +
                ", examFees=" + examFees +
                '}';
    }
}
