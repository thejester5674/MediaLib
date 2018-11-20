public class LoopingMediaLib
{
   public static void main()
{
   String songInfo = MediaFile.readString();
   for(int i = 0; i < 3; i++)
   {
        //System.out.println(MediaFile.readString());
   }
   while (songInfo != null)
   {
       System.out.println(songInfo);
       songInfo = MediaFile.readString();
   }
}
}