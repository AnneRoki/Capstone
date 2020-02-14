package verdida.mcm.edu.ph.capstonetrytry;

public class User {
    //Student user
    private String name;
    private String sex;
    private String address;
    private String edulvl;// academic lvl
    private String subject;
    private int id=00000000;//student id
    private String bio;
    //Teacher user
    private int id1=00000000;
    private String name1;
    private String sex1;
    private String address1;
    private String spec1;//subject specialization
    private String edulvl1;// highest academic lvl attained
    private double rate1;
    private int hrs1=0;
    private int min1=0;
    private String bio1;


    public User(int id, String name, String bio, String sex, String address, String edulvl, String subject){
        this.name=name;
        this.id=id;
        this.sex=sex;
        this.address=address;
        this.edulvl=edulvl;
        this.subject=subject;
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
    public String getEdulvl(){
        return this.edulvl=edulvl;
    }
    public String getSubject(){
        return this.subject=subject;
    }
    public String getBio(){
        return this.bio=bio;
    }




    public User(int id1, String name1, String bio1, String sex1, String address1, String spec1, String edulvl1, double rate1, int hrs1, int min1){
        this.address1=address1;
        this.edulvl1=edulvl1;
        this.hrs1=hrs1;
        this.min1=min1;
        this.id1=id1;
        this.name1 =name1;
        this.rate1=rate1;
        this.sex1=sex1;
        this.spec1=spec1;
        this.bio1=bio1;
    }
    public String getName1(){
        return this.name1 = name1;
    }
    public String getSex1(){
        return this.sex1=sex1;
    }
    public String getAddress1(){
        return this.address1=address1;
    }
    public String getSpec1(){
        return this.spec1=spec1;
    }
    public String getEdulvl1(){
        return this.edulvl1=edulvl1;
    }
    public double getRate1(){
        return this.rate1=rate1;
    }
    public int getHrs1(){
        return this.hrs1=hrs1;
    }
    public int getMin1(){
        return this.min1=min1;
    }
    public String getBio1(){
        return this.bio1=bio1;
    }

}
