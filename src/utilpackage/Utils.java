package src.utilpackage;

public class Utils {
    
    private static Runtime rt = Runtime.getRuntime();
	
	public static long printHeap(int idx) {
		rt.gc();
		long t = rt.totalMemory();
		long f = rt.freeMemory();
		long u = t - f;
		System.out.println(String.format("%d HEAP:%,8d bytes", idx, u));
		return u;
	}
	
	public static long printHeap() {
		rt.gc();
		long t = rt.totalMemory();
		long f = rt.freeMemory();
		long u = t - f;
		System.out.println(String.format("HEAP:%,8d bytes", u));
		return u;
	}

	public static void printArray(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if(i+1 < arr.length) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }
}
