class Book {
    private int Book_Num;
    private String Title;
    private int Book_price;
    
    public void setNum(int num){
        this.Book_Num = num;
    }
    public int getNum(){
        return Book_Num;
    }
    public void setTitle(String s_title){
        this.Title = s_title;
    }
    public String gettitle(){
        return Title;
    }
    public void setPrice(int price){
        this.Book_price = price;
    }
    public int getprice(){
        return Book_price;
    }
}