package Designpattern;

public class Connection {
private String Url;
private String Uname;
private String Pass;

public Connection (String Url,String Username, String Pass) {
	this.Url=Url;
	this.Uname=Uname;
	this.Pass=Pass;}
	
	public void commit() {
		System.out.println("commit");}
	
	public void rollback() {
		System.out.println("rollback");
	
	
	
}

}
