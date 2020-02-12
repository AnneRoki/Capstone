package verdida.mcm.edu.ph.capstonetrytry;

public class Teacher {

    private int id=00000000;
    private String name;
    private String sex;
    private String address;
    private String spec;
    private String edulvl;
    private double rate;
    private int hrs=0;
    private int min=0;
    private String bio;
    public Teacher(int id,String name,String bio,String sex,String address,String spec,String edulvl,double rate,int hrs,int min){
        this.address=address;
        this.edulvl=edulvl;
        this.hrs=hrs;
        this.min=min;
        this.id=id;
        this.name=name;
        this.rate=rate;
        this.sex=sex;
        this.spec=spec;
        this.bio=bio;
    }
    public String getName(){
        return this.name=name;
    }
    public String getSex(){
        return this.sex=sex;
    }
    public String getAddress(){
        return this.address=address;
    }
    public String getSpec(){
        return this.spec=spec;
    }
    public String getEdulvl(){
        return this.edulvl=edulvl;
    }
    public double getRate(){
        return this.rate=rate;
    }
    public int getHrs(){
        return this.hrs=hrs;
    }
    public int getMin(){
        return this.min=min;
    }
    public String getBio(){
        return this.bio=bio;
    }
}
