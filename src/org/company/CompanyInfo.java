package org.company;

public class CompanyInfo {

	public void companyName() {

		System.out.println("Infosys");
	}

	public void companyName(String name) {

		System.out.println(name);
	}

	public void companyName(int companycode) {
		System.out.println(companycode);

	}
	
	public void companyAddress() {
	    System.out.println("companyAddress : TNagar Chennai");
		}
	public void companyId() {
		System.out.println("companyId : 1590");
	}

	public void companyName(String name, int companycode) {

		System.out.println("code:" + companycode + '\n' + "name:" + name);

	}

	public static void main(String[] args) {

		CompanyInfo in = new CompanyInfo();
		in.companyName();
		in.companyName("TCS");
		in.companyName(123);
		in.companyName("HCL", 1005);
	}

}
