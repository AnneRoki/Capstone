package verdida.mcm.edu.ph.capstonetrytry;

public class Subject {

    private int id=00000000;// id number of the subject
    private String lvl;// academic lvl of the subject
    private String desc;// description of the subject
    private int category;// category which the subject belongs to

    public Subject (int id, String lvl,String desc,int category){
        this.id=id;
        this.lvl=lvl;
        this.desc=desc;
        this.category=category;
    }


    public String getLvl(){
        return this.lvl=lvl;
    }



    public String getDesc(){
        return this.desc=desc;
    }



    public int getId(){
        return this.id=id;
    }



    public int getCategory(){
        return this.category=category;
    }
    public void setid(int id){
        this.id=id;
    }
    public void setlvl(String lvl){
        this.lvl=lvl;
    }
    public void setdesc(String desc){
        this.desc=desc;
    }
    public void setcategory(int category){
        this.category=category;
    }

}
