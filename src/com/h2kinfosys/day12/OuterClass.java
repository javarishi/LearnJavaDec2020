package com.h2kinfosys.day12;

public class OuterClass {
	
	// InnerClass is member of Outerclass
	private String outerClassPrivateVariable = " Outer Class Private Variable ";
	public String outerClassPublicVariable = " Outer Class Public Variable ";
	private static String outerClassPrivateStaticVariable = " Outer Class Private Variable ";
	public static String outerClassPublicStaticVariable = " Outer Class Public Variable ";

	public static void main(String[] args) {
		OuterClass outCls = new OuterClass();
		InnerClass inCls = new OuterClass().new InnerClass();
		System.out.println(inCls.innerClassVariable);
		inCls.tryOuterClassMethod();
		inCls.innerClassMethod();
		
		// Static Inner Class
		OuterClass.StaticInnerClass staticInClas = new OuterClass.StaticInnerClass();
		

	}
	
	public void outerClassMethod() {
		System.out.println("Outer CLass: " + outerClassPrivateVariable);
		System.out.println("Outer CLass: " + outerClassPublicVariable);
	}
	
	public static void outerClassStaticMethod() {
		System.out.println("Outer CLass: " + outerClassPrivateStaticVariable);
		System.out.println("Outer CLass: " + outerClassPublicStaticVariable);
	}
	
	// Normal Inner class 
	class InnerClass {
		String innerClassVariable = null;
		
		public void innerClassMethod() {
			System.out.println("Inside InnerClass Method");
			System.out.println(" Inside InnerClass :: " + outerClassPrivateVariable);
			System.out.println(" Inside InnerClass :: " + outerClassPublicVariable);
		}
		
		public void tryOuterClassMethod() {
			outerClassMethod();
		}
	}
	
	// Static Inner Class
	static class StaticInnerClass{
			String staticInnerClassVariable = null;
		
		public void staticInnerClassMethod() {
			System.out.println("Inside StaticInnerClass Method");
		//	System.out.println(" Inside StaticInnerClass :: " + outerClassPrivateVariable);
		//	System.out.println(" Inside StaticInnerClass :: " + outerClassPublicVariable);
			System.out.println(" Inside StaticInnerClass :: " + outerClassPrivateStaticVariable);
			System.out.println(" Inside StaticInnerClass :: " + outerClassPublicStaticVariable);
		}
		
		public void tryOuterClassMethod() {
			outerClassStaticMethod();
		}
	}
	
	
}


