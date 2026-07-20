package Kyokasho.chap6.Sample6_09;

record Clothes(int id, String brand) {
/*
    // 標準コンストラクタ
    // 例1
    Clothes(int id, String brand) {
        this.id = id;
        this.brand = brand;
    }

    // 例2
    Clothes(int id, String brand) {
        this.id = id;
        this.brand = brand.trim();
    }
*/

    // コンパクトコンストラクタ
    // 例3
    Clothes {
        id = id > 0 ? id : 0;
    //  this.brand = brand;
    }
}
