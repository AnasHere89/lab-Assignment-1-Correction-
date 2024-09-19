class Artwork{
private String title;
private int year;
private Artist artist;

Artwork(Artwork a){
this.title=a.gettitle();
this.year=a.getyear();
this.artist=a.getartist();
this.artist=new Artist(a.getartist());
}

Artwork(String title,int year,Artist artist){
this.title=title;
this.year=year;
this.artist=artist;}

Artwork(String title,int year){
this.title=title;
this.year=year;}

public void settitle(String title){
this.title=title;} 

public void setyear(int year){
this.year=year;}

public String gettitle(){
return title;}

public int getyeart(){
return year;}

public Artist getartist(){
return artist;}

public void displayAll(){
System.out.println("The title of the artwork is:"+title);
System.out.println("The year that the artwork was published:"+year);
System.out.println("The name of the artist is "+artist.getartist);
}
}