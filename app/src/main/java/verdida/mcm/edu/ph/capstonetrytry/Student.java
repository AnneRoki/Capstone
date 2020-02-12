package verdida.mcm.edu.ph.capstonetrytry;

public class Student {

    private String name;
    private String sex;
    private String address;
    private String edulvl;
    private String subject;
    private int id=00000000;
    private String bio;


    public Student(int id,String name,String bio, String sex, String address,String edulvl,String subject){
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
}
