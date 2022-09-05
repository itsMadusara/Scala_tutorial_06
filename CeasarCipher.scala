import scala.io.StdIn.readLine;

object Cipher extends App{
    val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    val en=(c:Char, key:Int, a:String)=>a((a.indexOf(c.toUpper)+key)%a.size);
    val de=(c:Char, key:Int, a:String)=>a((a.indexOf(c.toUpper)-key)%a.size);
    val cipher=(algo:(Char,Int,String)=>Char,s:String,key:Int,a:String)=>s.map(algo(_,key,a))

    val ct=cipher(en,"thisIsThe",5,alphabet);
    val pt=cipher(de,ct,5,alphabet);
    println(ct);
    println(pt);
}