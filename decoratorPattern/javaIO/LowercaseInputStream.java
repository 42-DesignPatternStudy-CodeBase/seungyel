package decoratorPattern.javaIO;

import java.io.*;
 
// InputStream을 상속한 Abstract Decorator인 FilterInputStream을 상속한다.
public class LowercaseInputStream extends FilterInputStream {
 
 protected LowercaseInputStream(InputStream in) {
  super(in);
 }
  
 @Override
 public int read() throws IOException {
  int c = super.read();
  return (c == -1 ? c : Character.toLowerCase((char)c));
 }
  
 @Override
 public int read(byte[] b, int off, int len) throws IOException {
  int result = super.read(b, off, len);
  for (int i = off; i < off + result; i++) {
   b[i] = (byte) Character.toLowerCase((char)b[i]);
  }
  return result;
 }
 
}
 