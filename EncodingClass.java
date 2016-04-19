

public class EncodingClass {
  private static byte    byte_value = 101;
  private static short  short_value = 5;
  private static int      int_value = 100000001;
  private static long    long_value = 123456787654321L;

//Tamaños de los diferentes tipos de variables
  final static int byte_size = Byte.SIZE / Byte.SIZE;
  final static int int_size = Integer.SIZE / Byte.SIZE;
  final static int short_size = Short.SIZE / Byte.SIZE;
  final static int long_size = Long.SIZE / Byte.SIZE;

  private final static int mask = 0xFF;

 // Imprime el arreglo de bits
  public static void printByteArray(byte[] val){
    StringBuilder str = new StringBuilder();
    for(byte b : val){
      str.append(b & mask).append(" ");
    }
    System.out.println(str.toString());
  }

  // Codifica a bigEndian: recibe el valor y el tamaño
  public static byte[] encodeBigEndian(long val, int size){
    byte[] ret = new byte[size];
    ret[0] = (byte) val ;
    return ret;
  } 

  public static void main(String[] args){
    // Imprime los valores y tamaños de las variables
    System.out.println("byte:" + byte_size + " short:" + short_size + " int:" + int_size + " long:" + long_size);
    byte[] byte10 = encodeBigEndian(255, byte_size);
    printByteArray(byte10); 
  }
}
