class student2 extends inheritance2 {
    protected String name;
    protected String address;
    protected String program;
    protected int year;
    protected String toString;


    public student2 (String name, String address, String program,int year) {
        this.name = name;
        this.address = address;
        this.program = program;
        this.year = year;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public void setProgram(String program) {
        this.program = program;
    }
    public void setyear(int year) {
        this.year = year;
    }
    public String getName() {
        return name;
    }
    public String getAddress() {
        return address;
    }
    public String getProgram() {
        return program;
    }
    public int getYear() {
        return year;
    }
    public String toString(){
        return "Hello I am "+ name + " I Lived in "+ address +"." + " I am " + year + " year of BSIT.";
    }
    
}