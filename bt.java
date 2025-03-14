import java.util.Scanner;

abstract class HinhHoc {
    static final float pi = 3.14f ;
    public String ten ;
    public float chuVi;
    public float dienTich;
    public float theTich;

    public void hinhHoc(){
        
    }
    public void xuatTen(){
        System.out.println("\n========"+ten+"=======\n");
    }

    public void inChuVi(){
        System.out.println("Chu vi=" +chuVi);
    }
    public void inDienTich(){
        System.out.println("Dien Tich ="+dienTich);
    }
    public void inTheTich(){
        System.out.println("The Tich ="+theTich);
    }

}
class HinhTron extends HinhHoc {
    private float banKinh;

    public void HinhTron(){
    this.banKinh = 3.5f;

    }
    public void nhapBanKinh(){
        System.out.println("nhap ban kinh ");
        Scanner bankinh = new Scanner(System.in);
        banKinh = bankinh.nextFloat();

        bankinh.close();
    }
    public float tinhChuVi(){
        chuVi = 2*pi*banKinh;
    
    }
    public void tinhDienTich(){
        dienTich = pi*banKinh*banKinh;      

    }

class HinhTru extends HinhTron {
        private float chieuCao;
        public void nhapChieuCao(){
            System.out.println("nhap chieu cao");
            Scanner chieucao = new Scanner(System.in);
            chieuCao = chieucao.nextFloat();

            chieucao.close();

        }
    }   
}
public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    HinhTron tron = new HinhTron
}

