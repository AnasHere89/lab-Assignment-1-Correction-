
class Main{
public static void main(String[] args){
Artist a = new Artist("Chris");
a.display();
Artwork a1 = new Artwork("Exception",1999);
Artwork a2 = new Artwork("Exception",1999,a);
a2.displayAll();
}
}