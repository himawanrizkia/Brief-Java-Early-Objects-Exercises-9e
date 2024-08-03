/*
PRACTICE EXERCISES E2_17
Using the Picture class of Worked Example 2.2, write a HalfSizePicture program that loads a picture
and shows it at half the original size, centered in the window.
--
Pastikan sudah mendownload Picture.java dari student companion.
Jika ada file gambar lain, silakan ganti "black.jpeg" menjadi nama file yang akan digunakan.
Nama program HalfSizePicture diganti menjadi E2_17
*/
public class E2_17
{
    public static void main(String[] args)
    {
        //munculkan gambar
        Picture pics = new Picture();
        pics.load("black.jpeg");

        //kecilkan dengan membagi ukuran dengan 2 (setengahnya)
        int skala = 2;
        int tinggiBaru = pics.getHeight() / skala;
        int lebarBaru = pics.getWidth() / skala;

        //scale
        pics.scale(lebarBaru,tinggiBaru);

        //move to center, bisa dengan menggunakan tinggi dan lebar baru dibagi 2
        pics.move(lebarBaru/skala, tinggiBaru/skala);

    }
}

