package com.controller;


public class Test {
	
	public void data(String a) {
		
	}

	public void data(String a, String b) {
		
	}

	public static void main(String[] args) {
		A a = new B();
		a.msg();
		a.m();
		a.abi();
	}
	
}
class A implements C {
	public void msg() {
		System.out.println("Class A");
	}
	
	public void abi() {
		System.out.println("Abi");
	}
	
	@Override
	public void m() {
		System.out.println("Interface C");
	}
}

class B extends A {
	public void msg() {
		System.out.println("Class B");
	}
	public void thiru() {
		System.out.println("Thiru");
	}
}

interface C{
	void m();
}