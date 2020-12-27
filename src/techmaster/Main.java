package techmaster;

public class Main {

    public static void main(String[] args) throws Exception {
        MonthlyUsage monthlyUsage = new MonthlyUsage(new Customer(), 100, 500);
        monthlyUsage.Customer.Type = CustomerType.PayAsYouGo;
        MonthlyStatement monthlyStatement = new MonthlyStatement();

        monthlyStatement.CallCost = 1;
        monthlyStatement.Generate(monthlyUsage);

        System.out.println(monthlyStatement.TotalCost);
    }
}
