package techmaster;

import java.util.ArrayList;

public class MonthlyUsage {
    public Customer Customer;
    public int CallMinutes;
    public int SmsCount;

    public MonthlyUsage(Customer customer, int callMinutes, int smsCount) {
        Customer = customer;
        CallMinutes = callMinutes;
        SmsCount = smsCount;
    }
    public ArrayList<Float> CaculdateMonthlyUsage(MonthlyUsage usage) throws Exception{
        Customer customer =  new Customer();
        ArrayList<Float> mothlyUsage = customer.caculdateUsage(this.Customer, this.CallMinutes, this.SmsCount);
        return mothlyUsage;
    }
    
}
