package HackerRank;
class Parent{
    protected int parentId=0;
    protected static String parentStr="P";
    Parent(){
        this.parentId++;
        Parent.parentStr+='P';
    }
    protected void displayDetails(){
        System.out.println(this.parentId+" "+Parent.parentStr);
    }

}
class Child extends Parent{
    protected int childId;
    protected static String childStr="C";
    Child(){
        this.childId++;
        this.childStr+=this.parentStr;
    }
    protected void displayDetails(){
        super.displayDetails();
        System.out.println(this.childId+" "+Child.childStr);
    }
}
public class GrandChild extends Child {
    private int grandChild;
    private static String grandChildstr="G";
    GrandChild(){
        this.grandChild++;
        GrandChild.grandChildstr+=Child.childStr+Parent.parentStr;

    }
    protected void displayDetails(){
        super.displayDetails();
        System.out.println(this.grandChild+" "+ GrandChild.grandChildstr);
    }
    public static void main(String[] args) {
        Parent parent=new GrandChild();
        parent.displayDetails();
    }
    
}