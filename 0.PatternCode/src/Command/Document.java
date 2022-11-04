package Command;

import java.util.ArrayList;

public class Document {
	//Receiver
	private ArrayList<String> contents;
	private String cut = null;
	
	public Document() {
		contents = new ArrayList<String>();
		contents.add("Hello!! SayHello!!");
	}
	
	public void edit(String content) {
		System.out.println("===Edit document===");
		contents.add("#" + content + " - " + contents.size() + " row");
	}
	
	public void paste() {
		System.out.println("===Paste cut's/copy's content===");
		if(cut != null) {
			contents.add(cut);
		}
		else {
			System.out.println("#Paste Error!! Not Value!");
		}
	}
	
	public void copy(int index) {
		System.out.println("===Copy row 2===");
		if(contents.size() >= (index + 1)) {
			cut = contents.get(index);
		}
		else {
			System.out.println("#Copy Error!! Not " + index + " Row");
		}
	}
	
	public void cut(int index) {
		System.out.println("===Cut row 2===");
		if(contents.size() >= (index + 1)) {
			cut = contents.get(index);
			contents.remove(index);
			
			System.out.println("#Remove Number" + (index + 1) + " sentence");
		}
		else {
			System.out.println("#Cut Error!! Not " + index + " Row");
		}
	}
	
	public void print() {
		System.out.println("==========Document Content==========");
		
		for(String content : this.contents) {
			System.out.println(content);
		}
		
		System.out.println("===============E N D===============");
	}
}
