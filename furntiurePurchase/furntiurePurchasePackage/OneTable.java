//
// OneTable Class
// The purpose of this class is to describe one table 
//
// Author: Nekesa Mercy
// Date: 11/2/26
// 
package furntiurePurchasePackage;

public class OneTable {
	
    //declare attributes 
	private String typeWood;				// the type of wood 
	private String typeStain;				// the type of stain on the wood 
	private int numDrawers;				// the number of drawers on the table 
	private double salePrice;			// the sale price for the table 
	
	//HAVE CONSTANTS HERE 
	final int MAXIMUMDRAWERS = 4;
	final int MINIMUMDRAWERS = 0;
	final double TABLEONEPRICE = 1500.0;
	final double TABLETWOPRICE = 1275.0;
	final double TABLETHREEPRICE = 500.0;
	
	// table
	// The purpose of this method is to initialize all attributes 
	// 
	// input: none 
	// return: none 
	//
	public void table( ){
		typeWood = "none yet";
		typeStain = "none yet";
		numDrawers = 0;
		salePrice = 0.0;
		
	}// end table 
	
	
	// furniture
	// The purpose of this method is to allow new values to be input to initialize the attributes 
	//
	// input: tw								// the type of wood
	//		  ts								// the type of stain
	//		  numD								// the number of drawers
	//		  sp								// the sale price for the type of wood 
	//
	// return: none
	//
	public void table(String tw, String ts, int numD, double sp ){
		typeWood  = tw;
		typeStain = ts;
		numDrawers = numD;
		salePrice  = sp;
		
	}// end table
	
	//
	// setTypeWood
	// The purpose of this method is to set a new value for the type of wood
	//
	// input: tw				// the new type of wood
	// return:none
	//
	public void setTypeWood(String tw ){
		
		typeWood = tw;
		
	}// end setTypeWood
	
	//
	// setTypeStain
	// The purpose of this method is to set a new value for the type of stain
	//
	// input: ts				// the new type of stain
	// return:none
	//
	public void setTypeStain(String ts ){
		
		typeStain = ts;
		
	}// end setTypeStain
	
	//
	// setNumDrawers
	// The purpose of this method is to set a new value for the number of drawers
	//
	// input:numD					// the new number of drawers
	// return: none
	// 
	public void setNumDrawers(int numD ){
		
		do{
			if((numDrawers >= MINIMUMDRAWERS)||(numDrawers <= MAXIMUMDRAWERS)){
				
				//number of drawers 
				numDrawers = numD;
				
			}// end if 
			else {
				System.out.println("Error, invalid number of drawers " + numDrawers);
			}
		}while((numDrawers < MINIMUMDRAWERS)||(numDrawers > MAXIMUMDRAWERS));	
				
	}// end setNumDrawers
	
	//
	// setSalePrice
	// The purpose of this method is to set a new value for the sale price
	//
	// input: sp				// the new sale price
	// return: none
	//
	public void setSalePrice(double sp ){
		
		salePrice = sp;
		
	}// end setSalePrice
	
	//
	// getTypeWood
	// The purpose of this method is to return the type of wood
	//
	// input: none
	// return: typeWood					// the type of wood 
	//
	public String getTypeWood(  ){
		
		return(typeWood);
	}// end getTypeWood 
	
	
	//
	// getTypeStain
	// The purpose of this method is to return the type of stain 
	//
	// input: none
	// return: typeStain				// the type of stain
	//
	public String getTypeStain(  ){
		
		return(typeStain);
	}// end getTypeStain
	
	//
	// getNumDrawers
	// The purpose of this method is to return a value for the number of drawers
	//
	// input: none
	// return: numDrawers				// the number of drawers
	//
	public int getNumDrawers(  ){
		
		return(numDrawers);
	}// end getNumDrawers
	
	
	//
	// getSalePrice
	// The purpose of this method is to return the sale price
	//
	// input: none
	// return: salePrice				// the sale price
	//
	public double getSalePrice(  ){
		
		return(salePrice);
	}// end getSalePrice
	
	//
	// printData
	// the purpose of this method is to print the data
	// 
	// input: none
	// return: none
	public void printData(){
		
		System.out.println("The type of wood is " + typeWood);
		System.out.println("The type of stain is " + typeStain);
		System.out.println("The number of drawers is  " + numDrawers);
		System.out.printf("The sale price is $%.2f", salePrice);
		
	}// end printData
	
	
}// end OneTable class


