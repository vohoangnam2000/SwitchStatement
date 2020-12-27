package techmaster;

import java.util.ArrayList;

public class Customer {
    public CustomerType Type;
    public ArrayList<Float> caculdateUsage(Customer customer, int callMinutes, int smsCount) throws Exception{
        ArrayList<Float> payUsage;
        float callCost = 0;
        float smsCost = 0;
        float totalCost;
        switch (customer.Type)
        {
            case PayAsYouGo:
                callCost = 0.12f * callMinutes;
                smsCost = 0.12f * smsCount;
                totalCost = callCost + smsCost;
                break;

            case Unlimited:
                totalCost = 54.90f;
                break;

            default:
                throw new Exception("The current customer type is not supported");
        }
        payUsage = setpayUsage(callCost, smsCost, totalCost);
        return payUsage;
    }
    public ArrayList<Float> setpayUsage(float callCost, float smsCost,float totalCost){
        ArrayList<Float> payUsage =  new ArrayList<>();
        payUsage.add(callCost);
        payUsage.add(smsCost);
        payUsage.add(totalCost);
        return payUsage;
    }
}






