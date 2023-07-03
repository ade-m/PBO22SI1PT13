public class Luar {
    int varLuar = 11;
    void cetakLuar(){
        System.out.println("Ctak " +
        "Nilai Luar = "+ varLuar);
    
    }
    class Dalam {
        int varDalam = 11;
        void cetakDalam(){
            System.out.println("Cetak " + 
                    "Nilai Dalam = "+ varDalam);
            cetakLuar();
        }
    }
}
