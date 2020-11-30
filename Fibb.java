class Fibb {
	public Fibb() {};

	public int fib_r(int r) {
	   if (r == 1) return 1;
	   if (r == 0) return 1;
	   return fib_r(r-1)+fib_r(r-2);
	}

	public int fib_i(int r) {
		int a, b, i;
		a = 1; b = 1;
		for (i = 2; i <= r; i++) {
		   int n = a+b; a = b; b = n;
		}
		return b;
	}

	public static void main(String[] args) {
		Fibb f = new Fibb();
		int n = Integer.parseInt(args[0]);
		System.out.println(n);
		System.out.println(f.fib_r(n));
		System.out.println(f.fib_i(n));
	}
}
