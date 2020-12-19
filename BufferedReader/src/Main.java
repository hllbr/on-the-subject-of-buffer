
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Main {
    
    
    /*
    source =Mustafa Murat Coskun Udemy java eğitimi referans alınmıştır
    
    BufferedeReader FileReader ile aynı işi yapıyor.Performans açısından karşılaştırma yaparsak BufferedReader çok daha yüksek bir Performans sunuyor
    şuan işlem yapılan Dosya boyutu düşük Fakat daha yüksek boyutlarda dosyalarla çalışıldığında BufferedReader tercih etmek daha kullanışlı oalcaktır.
    Farkları == 
    
    FileReader özellikleri = 
    
    *java uygulaması ile harici diske erişim sağlıyoruz .FileReader tüm dosyayı okumak yerine sadece bir karakteri okuyor ve geri geliyor.
    *Bu yapı sebebi ile biz dosyaya bir çok kez erişim yapmış oluyoruz .
    *bu Gidip Gelme Süresinde biz performans Kaybu yaşamış oluyoruz .
    
    EĞER BİZ BU YAPI YERİNE BUFFEREDREADER KULLANIRSAK = 
    
    --Bu yapı kendi içinde bir buffer(küme(kutu) olarak tanımlanabilecek bir yapı meydana getirir) oluşturuyor.
    --dosyaya gidiyor ve \n görene kadar bütün karakterleri okuyor daha sonra buffer'e yerleştiriyor(koyuyor.)ve bu doldurduğu kutu bizim java apimize getiriyor.
    --Daaha sonra biz bunu almış oluyoruz.Bu sebeple biz dosyamıza daha az erişim sağlamış oluyoruz .Yüksek Performansın sebebi budur 
    
    örnek olarak : bir çayevi çalışanı için filereader tepsi olmadan çay servisi yapmak olarak düşünülebilir,
    bufferedreader ise tepsi ile çay servisinin yapılması olarak ifade edilebilir...(örnek Mustafa Murat Coskundan alıntıdır...)
    
    Youtube bir dönem videoların bir bölümünü buffer ediyordu...(izlerken meydana gelecek sürekli donmaların önüne geçmek için böyle bir sistem kullanılıyordu)
    
    BufferedWriter Çalışma Mantığı = biz yazmak istediklerimizi bir buffere yüklüyoruz ve bu şekilde dosyaya koyulmuş oluyor
    BufferedWriter yerine filewriter kullanırsak tek tek yazmamız gerekiyor.
    */
    public static void main(String[] args) throws InterruptedException {
 
        /*    try(Scanner scn = new Scanner(new BufferedReader(new FileReader("ogrenciler.txt")))){
       
            while(scn.hasNextLine()){
           
           String ogrenciBilgisi = scn.nextLine();
           
           String [] array = ogrenciBilgisi.split(",");
           if(array[1].equals("Bilgisayar Mühendisliği")){
               System.out.println("Öğrenci Bilgisi İşleniyor ....");
               Thread.sleep(1500);
               System.out.println("Öğrenci bilgisi = " +ogrenciBilgisi);
           }
                
            }
            
        }catch(FileNotFoundException ex){
            
            System.out.println("Dosya bulunamadı");
            
            Thread.sleep(2000);
            
            System.out.println("bir FileNotFoundException hatası meydana geldi ");
            
        }catch(IOException ex){
            
            System.out.println("Dosya Açılırken bir hata meydana geldi");
            
            Thread.sleep(1500);
            
            System.out.println("bir IOException hatası meydana geldi ");
            
        }*/
        //BufferedWriter == 
        try(BufferedWriter writer = new BufferedWriter(new FileWriter("ogrenci.txt",true))){
            //yazma işlemimiz == 
            writer.write("hllbr is connected,PROTECTED TECHNOLOGY");
        } catch (IOException ex) {
            System.out.println("Dosyaya Yazma İşlemi Gerçekleştirilirken bir IOException hatası meydana geldi");

        }
    }
    
}
