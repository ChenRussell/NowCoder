package com.nowcoder.testClass;

public class TestClass extends AbstractSuperClass implements InterfaceSuperClass{
	
//	public static void main(String[] args) {
//		
//		SubClass sc = new SubClass();
//		System.out.println(sc.a);
//		sc.getSuperInfo();
//		sc.printInfo();
//	}
//	public final String finalString;
	
	public static void main(String args[]) {
		String s;
//		System.out.println(s);		// �����ж���ľֲ����������ʼ��,������벻ͨ��
        Thread t=new Thread(){
        public void  run(){
            dianping();
             
        }
    };
    t.run();	// start�����Żᴴ�����߳�,run()����ֻ�Ǽ򵥵ķ�������
    System.out.print("dazhong");
    }
    static void dianping(){
        System.out.print("dianping");
        String dd = "dd";
}
	
	/**
	 * ���������ز����������б���ͬ,����ֵ��ͬ
	 * @param a
	 * @param b
	 * @return
	 */
	public int f1(int a,int b) {
		return a+b;
	}
	
	public double f1(double a,int b) {
		return 1.0;
	}

	/**
	 * ������ͽӿ���ĳ��󷽷��������Ҫʵ��
	 */
	@Override
	public int interface1(int a, int b) {
		// TODO Auto-generated method stub
		return 0;
	}


	/**
	 * ����abstract�������:һ��ʵ���䳬�������abstract����,����������Ҳ����Ϊabstract��,
	 * ��ȫ��ʵ�ֳ��󷽷������ν�����������
	 */
	@Override
	public int abstract1(int a, int b) {
		return 0;
	}

	@Override
	public void abstract2() {
	}

}