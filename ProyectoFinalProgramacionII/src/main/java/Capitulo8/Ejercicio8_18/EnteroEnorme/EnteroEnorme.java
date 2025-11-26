package Capitulo8.Ejercicio8_18.EnteroEnorme;
import java.util.Arrays;
public class EnteroEnorme {
	private int[] dig = new int[40];

	 public EnteroEnorme() {
	 }

	 public EnteroEnorme(String s) {
	  entrada(s);
	 }

	 public void entrada(String s) {
	  Arrays.fill(dig,0);
	  int j = 39;
	  for (int i=s.length()-1;i>=0 && j>=0;i--) {
	   char c = s.charAt(i);
	   if (Character.isDigit(c)) dig[j--] = c - '0';
	  }
	 }

	 public String salida() {
	  String r = "";
	  boolean start = false;
	  for (int i=0;i<40;i++) {
	   if (dig[i]!=0) start = true;
	   if (start) r += dig[i];
	  }
	  if (r.equals("")) return "0";
	  return r;
	 }

	 public EnteroEnorme sumar(EnteroEnorme e) {
	  EnteroEnorme r = new EnteroEnorme();
	  int carry = 0;
	  for (int i=39;i>=0;i--) {
	   int s = dig[i] + e.dig[i] + carry;
	   r.dig[i] = s % 10;
	   carry = s / 10;
	  }
	  return r;
	 }

	 public EnteroEnorme restar(EnteroEnorme e) {
	  EnteroEnorme r = new EnteroEnorme();
	  int borrow = 0;
	  for (int i=39;i>=0;i--) {
	   int s = dig[i] - e.dig[i] - borrow;
	   if (s < 0) {
	    s += 10;
	    borrow = 1;
	   } else borrow = 0;
	   r.dig[i] = s;
	  }
	  return r;
	 }

	 private int comparar(EnteroEnorme e) {
	  for (int i=0;i<40;i++) {
	   if (dig[i] > e.dig[i]) return 1;
	   if (dig[i] < e.dig[i]) return -1;
	  }
	  return 0;
	 }

	 public boolean esIgualA(EnteroEnorme e) {
	  return comparar(e)==0;
	 }

	 public boolean noEsIgualA(EnteroEnorme e) {
	  return comparar(e)!=0;
	 }

	 public boolean esMayorQue(EnteroEnorme e) {
	  return comparar(e)==1;
	 }

	 public boolean esMenorQue(EnteroEnorme e) {
	  return comparar(e)==-1;
	 }

	 public boolean esMayorOIgualA(EnteroEnorme e) {
	  int c = comparar(e);
	  return c==0 || c==1;
	 }

	 public boolean esMenorOIgualA(EnteroEnorme e) {
	  int c = comparar(e);
	  return c==0 || c==-1;
	 }

	 public boolean esCero() {
	  for (int i=0;i<40;i++) if (dig[i]!=0) return false;
	  return true;
	 }

	 public String toString() {
	  return salida();
	 }
}
