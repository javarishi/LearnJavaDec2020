package com.h2kinfosys.day12;

public class TestNestedClasses {

	public static void main(String[] args) {
		OuterClass.InnerClass inCls = new OuterClass().new InnerClass();
		OuterClass.StaticInnerClass staticInClas = new OuterClass.StaticInnerClass();
	}

}
