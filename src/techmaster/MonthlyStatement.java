package techmaster;

import java.util.ArrayList;

public class MonthlyStatement {
    public float CallCost;
    public float SmsCost;
    public float TotalCost;
    public final int INDEX_TOTALCOST = 2;

    public MonthlyStatement() {
    }
    public void Generate(MonthlyUsage usage) throws Exception {
        //this.TotalCost = usage.CaculdateMonthlyUsage(usage).get(2);
        ArrayList<Float> mothlyStatement = usage.CaculdateMonthlyUsage(usage);
        this.TotalCost = mothlyStatement.get(INDEX_TOTALCOST);
    }
    
}
