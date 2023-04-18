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
}
