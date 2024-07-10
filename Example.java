public class Example {

    public static void main(String[] args) {
        String source = "jerumeh lawrence";
      final int sourceSpace = 25;

    int lengthOfSource = Math.min(sourceSpace, source.length());
      final char[] destination = new char[sourceSpace];

      System.arraycopy(source.toCharArray(), 0, destination, 0 , lengthOfSource);


      for(int i = lengthOfSource;  i < sourceSpace; i++ ){
            destination[i] = ' ';
      }

      System.out.println("destination: " + new String(destination));

}
}