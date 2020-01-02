package Composite_Pattern;

public class Company {
    public static void main(String[] args) {
        CompanyDiretory Man_composite = new CompanyDiretory();
        Manager man = new Manager("Ah Slek");
        Man_composite.addEmployee(man);

        CompanyDiretory CEO_composite = new CompanyDiretory();
        CEO ceo = new CEO("Ah Slang");
        CEO_composite.addEmployee(ceo);

        CompanyDiretory directory = new CompanyDiretory();
        directory.addEmployee(Man_composite);
        directory.addEmployee(CEO_composite);
        directory.showInfo();
    }
}
