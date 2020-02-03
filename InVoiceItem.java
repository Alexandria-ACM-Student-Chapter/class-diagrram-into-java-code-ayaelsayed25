
public class InVoiceItem {
    private String id;
    private String desc;
    private int qty;
    private double unitPrice;
    
    public InVoiceItem(String id, String desc, int qty, double unitPrice)
    {
        this.id = id;
        this.desc = desc;
        this.qty = qty;
        this.unitPrice = unitPrice;
    }
    
    public String getID()
    {
        return id;
    }
    public String getDesc()
    {
        return desc;
    }
    public int getQty()
    {
        return qty;
    }
    public double getUnitPrice()
    {
        return unitPrice;
    }
    public void setQty(int qty)
    {
        this.qty = qty;
    }
    public void setUnitPrice(double unitPrice)
    {
        this.unitPrice = unitPrice;
        
    }
    public double getTotal()
    {
        return unitPrice * qty;
    }
    public String toString()
    {
        String myString2 = "InVoiceItem [ ID: " + getID() + ", Desc: " + getDesc() + ", qty = " + getQty() + ", Unit Price = " + getUnitPrice() +"]" ;
        return myString2;
    }
    
}
