//
// FurnitureClass
// The purpose of this method is to create the furniture business class
//
// Author: Nekesa Mercy
// Date: 11/2/16
//

package furntiurePurchasePackage;

public class FurnitureClass {

	public static void main(String[] args) {
		//declare variables 
		OneTable tbl;
		int numDrawers;								// the number of drawers 
		
		//initialize variables 
		numDrawers = 0;

		//create new object
		tbl = new OneTable();
				
		//create a table made of cherry wood 
		tbl.setTypeWood("Cherry Wood");

		// no stain table
		tbl.setTypeStain("No stain");
		
		//number of drawers 
		tbl.setNumDrawers(3);
		
		// assign a cost of $1500 to the table 
		tbl.setSalePrice(tbl.TABLEONEPRICE);
				
		//print the data 
		tbl.printData();
				
		System.out.println("");
		System.out.println("");
				
		// create a table made of oak and no drawers with a dark stain
		tbl.setTypeWood("Oak");
				
		// table has no drawers 
		tbl.setNumDrawers(0);
				
		//type of stain 
		tbl.setTypeStain("dark stain");
				
		//assign a cost of $1275 to the table 
		tbl.setSalePrice(tbl.TABLETWOPRICE);
				
		//print data
		tbl.printData();
				
		System.out.println("");
		System.out.println("");
				
		// create a table made of maple
		tbl.setTypeWood("Maple");
				
		// table has a light stain
		tbl.setTypeStain("light stain");
				
		// table has 4 drawers 
		tbl.setNumDrawers(4);
				
		// assign a cost of $500 to the table
		tbl.setSalePrice(tbl.TABLETHREEPRICE);
				
		// print the data
		tbl.printData();
		
	}// end main

}// end FurnitureClass
