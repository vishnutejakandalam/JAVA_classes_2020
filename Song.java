
class Song_class
{
    String name;
    float duration;
    void print()
    {   
        System.out.println("The song name is "+name+" and the duration is "+duration);
    }
}

class Main
{
    public static void main(String[] args) {
        Song_class song = new Song_class();
        Song_class s = song;
        Song_class song1 = new Song_class();
        song.name = "Master";
        song.duration = 122;
        song1.name = "kutti story!";
        song1.duration = 92;
        song1.print();
        song.print();
        s.print();

    }
}