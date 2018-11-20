public class FavoritesMediaLib
{
    public static void main()
    {
    String songInfo = MediaFile.readString();
    while (songInfo != null)
     {
       String songInfo2 = songInfo.substring(0,songInfo.indexOf("|"));
       System.out.println(songInfo2); 
       songInfo = songInfo.substring(songInfo.indexOf("|") + 1);
    }
    }
}