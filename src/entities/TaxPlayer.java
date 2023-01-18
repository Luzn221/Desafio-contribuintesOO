package entities;

public class TaxPlayer {
    private Double salaryIncome;
    private Double servicesIncome;
    private Double capitalIncome;
    private Double healthSpeding;
    private Double educationSpeding;

    public TaxPlayer(){}

    public TaxPlayer(Double salaryIncome, Double servicesIncome, Double capitalIncome, Double healthSpeding,
            Double educationSpeding) {
        this.salaryIncome = salaryIncome;
        this.servicesIncome = servicesIncome;
        this.capitalIncome = capitalIncome;
        this.healthSpeding = healthSpeding;
        this.educationSpeding = educationSpeding;
    }

    
}
