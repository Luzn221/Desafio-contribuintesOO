package entities;



public class TaxPlayer {

  private Double salaryIncome;
  private Double servicesIncome;
  private Double capitalIncome;
  private Double healthSpeding;
  private Double educationSpeding;

  public TaxPlayer() {
  }

  public TaxPlayer(
      Double salaryIncome,
      Double servicesIncome,
      Double capitalIncome,
      Double healthSpeding,
      Double educationSpeding) {
    this.salaryIncome = salaryIncome;
    this.servicesIncome = servicesIncome;
    this.capitalIncome = capitalIncome;
    this.healthSpeding = healthSpeding;
    this.educationSpeding = educationSpeding;
  }

  public Double getSalaryIncome() {
    return salaryIncome;
  }

  public Double getServicesIncome() {
    return servicesIncome;
  }

  public Double getCapitalIncome() {
    return capitalIncome;
  }

  public Double getHealthSpeding() {
    return healthSpeding;
  }

  public Double getEducationSpeding() {
    return educationSpeding;
  }

  public Double salaryTax() {
    if (this.salaryIncome / 12 < 3000) {
      return 0.0;
    }else if(this.salaryIncome / 12 <= 5000){
      return getSalaryIncome() * 10 / 100;
    }else{
      return getSalaryIncome() * 20 / 100;
    }
  }
  public Double servicesTax(){
    if(getServicesIncome() == 0.00){
      return 0.0;
    }else{
      return getServicesIncome() * 15 / 100;
    }
  }
  public Double capitalTax(){
    if(getCapitalIncome() == 0){
      return 0.0;
    }else{
      return getCapitalIncome() * 20 / 100;
    }
  }
  public Double grossTax(){
    return salaryTax() + servicesTax() + capitalTax();
  }
  public Double taxRebate(){
    if((grossTax() * 30 / 100) < educationSpeding + healthSpeding){
      return grossTax() * 30 / 100;
    }else{
      return educationSpeding + healthSpeding;
    }
  }
  public Double netTaX(){
    return grossTax() - taxRebate();
  }
  public String toString() {
    return "Imposto bruto total: "
    + String.format("%.2f%n",grossTax())
    + "Abatimento : "
    + String.format("%.2f%n",taxRebate())
    + "Imposto devido: "
    + String.format("%.2f%n",netTaX())
    + '\n';
  }
  
}
