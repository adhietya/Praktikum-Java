
import javax.swing.JOptionPane;

public class DataTypes{
 public static void main(String[] args){

 String namaDepan = "Muhammad";
 String namaTengah = "Adhietya";
 String namaBelakang = "Rafflie";
 int usia = 20;
 int targetTahunKuliah = 3;
 double ipk = 3.88888888;
 char nilaiAbjad = 'A';
 boolean tampan = true;
 
 System.out.println("Nama depan : " + " "
	+ namaDepan +" "
	 + namaTengah +" "
	 +namaBelakang);

 System.out.println("Usia : " + usia + " Tahun");
 System.out.println("Usia ketika lulus : " + (usia + targetTahunKuliah) + " Tahun");
 JOptionPane.showMessageDialog(null, "Hai " + namaDepan +" "
	+ namaTengah +" "
	+namaBelakang);

 }
}