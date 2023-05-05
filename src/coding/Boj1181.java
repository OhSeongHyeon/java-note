package src.coding;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/*
    단어 정렬
    알파벳 소문자로 이루어진 N개의 단어가 들어오면 아래와 같은 조건에 따라 정렬하는 프로그램을 작성하시오.
    1.길이가 짧은 것부터
    2.길이가 같으면 사전 순으로 단, 중복된 단어는 하나만 남기고 제거해야 한다.
 */
public class Boj1181 {

    public static final String[] input = {"but", "i", "wont", "hesitate", "no", "more", "no", "more", "it", "cannot", "wait", "im", "yours"};
    public static final int INPUT_LENGTH = input.length;

	public static void main(String[] args) {
    	strArrNSortApi(input);
        hashSetNSortApi(input);
        treeSetNSortApi(input);
        System.out.println("i, im, it, no, but, more, wait, wont, yours, cannot, hesitate" + " 정답");
    }

    // 방법 1 String Array
    public static void strArrNSortApi(String[] arr){
        String[] words = Arrays.copyOf(arr, arr.length);
        
        Arrays.stream(words)
            .distinct()
            .sorted((w1, w2) -> {
                if(w1.length() != w2.length()) { // 길이가 짧은 것부터
                    return w1.length() - w2.length();
                }
                return w1.compareTo(w2); // 길이가 같으면 사전 순서
            })
            .forEach(w -> System.out.print(w + ", "));

        System.out.println("Array length: " + words.length);
        System.out.print("String[] words: ");
        for(String s : words){
            System.out.print(s + ", ");
        }
        System.out.println("원본은 안건듬");
    }

    // 방법 2 HashSet
    public static void hashSetNSortApi(String[] arr){
        Set<String> words = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            words.add(arr[i]);
        }

        words.stream()
            .sorted((w1, w2) -> {
                if(w1.length() == w2.length()) {
                    return w1.compareTo(w2);
                }
                return Integer.compare(w1.length(), w2.length());
            })
            .forEach(w -> System.out.print(w + ", "));
        
        System.out.println("HashSet length: " + words.size());
    }

    // 방법 3 TreeSet
    public static void treeSetNSortApi(String[] arr){
        Set<String> words = new TreeSet<>();

        for (int i = 0; i < arr.length; i++) {
            words.add(arr[i]);
        }

        words.stream()
        		.sorted((w1, w2) -> w1.length() - w2.length())
        		.forEach(w -> System.out.print(w + ", "));
        
        System.out.println("TreeSet length: " + words.size());
    }
}