/*
PRACTICE EXERCISES E2_18
Using the Picture class of Worked Example 2.2, write a DoubleSizePicture program that loads a picture,
doubles its size, and shows the center of the picture in the window.
--
Pastikan sudah mendownload Picture.java dari student companion.
Jika ada file gambar lain, silakan ganti "black.jpeg" menjadi nama file yang akan digunakan.
Nama program HalfSizePicture diganti menjadi E2_17
*/
public class E2_18
{
    public static void main(String[] args)
    {
        //munculkan gambar
        Picture pics = new Picture();
        pics.load("black.jpeg");

        //perbesar 2 kali
        int skala = 2;
        int tinggiBaru = pics.getHeight() * skala;
        int lebarBaru = pics.getWidth() * skala;

        //scale
        pics.scale(lebarBaru,tinggiBaru);

        //move to center, bisa dengan menggunakan tinggi dan lebar baru dibagi 2
        pics.move(lebarBaru/skala, tinggiBaru/skala);

    }
}

