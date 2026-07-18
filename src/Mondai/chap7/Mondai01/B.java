package Mondai.chap7.Mondai01;

public interface B extends A {
    @Override
    default boolean search(int[] data, int target) {
        int cnt = 0;
        for ( int i : data) {
            if(i == target) {
                cnt++;
            }
        }
        return cnt > 0;
    }
}
