//
// OneDive
// The purpose of this class is to describe one class 
// 
// Author: Nekesa Mercy
// Date: 11/02/16
//
package divingCompetitionPackage;

public class OneDiveClass {
	
	
	//declare attributes 
	private String name;			// the name of the diver 
	private int competitonNum;		// the competition number for the diver 
	private double[ ]allScores;		// all the scores for one diver from all the judges 
	private double degreeOfDifficulty;	// the degree of difficulty for the dive 
	private double finalScore;		// the final score for the diver 
	private double oneScore;		// one score for the diver from the judge  
	private double maxScore;		// the maximum score the diver 
	private double minScore;		// the minimum score for the diver 
	
	//declare constants here 
	private double MAXIMUMSCORE = 10.0;
	private double MINIMUMSCORE = 0.0;
	private double MAXIMUMDEGDIFFICULTY = 3.8;
	private double MINIMUMDEGREEDIFFICULTY = 1.2;
	private double NUMTOMULTIPLY = 0.6;
	private int NUMJUDGES = 7;
	
	// OneDive 
	// the purpose of this method is to initialize all attributes
	// Input: none 
	// Return: none 
	//
	public void OneDive( ){
		int cntr;
		name = "none yet";
		competitonNum = 0;
		degreeOfDifficulty = 0.0;
		finalScore = 0.0;
		maxScore = 0.0;
		minScore = 0.0;
		oneScore = 0.0;
		
		//create space for the array
		allScores = new double[NUMJUDGES];
		
		for(cntr = 0; cntr < allScores.length; ++cntr){
			
			allScores[cntr] = 0;
			
		}// end for
		
	}// end OneDive 
	
	//
	// OneDive 
	// the purpose of this method is to initialize all new attributes 
	//
	// Input: nme					// the name
	//		  compNum				// the competetion number
	//		  sc					// scores
	//		  allSc					// array for all the scores for one person
	//		  degDiff				// the degree of difficulty 
	//		  finSc					// the final score
	// Return: none 
	//
	public void OneDive(String nme, int compNum, double[]allsc, double degDiff, double finSc ){
		
		int cntr;
		name = nme;
		competitonNum = compNum;
		degreeOfDifficulty = degDiff;
		finalScore = finSc;

		allScores = new double[NUMJUDGES];
		
		for(cntr = 0; cntr < allScores.length; ++cntr){
			
			allScores[cntr] = allsc[cntr];
			
		}// end for 
			
	}// end OneDive 
	
	//
	// setName
	// The purpose of this method is to set a new name for the diver 
	//
	// input: nme				// the new name
	// return: none
	//
	public void setName(String nme){
		
		name = nme;
		
	}// end setName
	
	//
	// setCompetitionNum
	// The purpose of this method is to set a new value for the competition number for the diver 
	//
	// input: compNum				// the new competition number
	// return:none
	//
	public void setCompetitionNum(int compNum){
		
		competitonNum = compNum;
		
	}// end competitionNum
	
	//
	// setDegreeOfDIfficulty 
	// The purpose of this method is to set new values for the degree of difficulty
	//
	// input: degreeOfDifficulty			// the array for the new value for the degree of difficulty 
	// return: none
	//
	public void setDegreeOfDifficulty(double degDiff){
		
		degreeOfDifficulty = degDiff;
		
	}// end setDegreeOfDifficulty
	
	//
	// getName
	// The purpose of this method is to return the name
	//
	// input: none
	// return: name					// the name
	//
	public String getName( ){
		
		return(name);
	}// end getName
	
	//
	// getCompetitionNum
	// The purpose of this method is to return the competition number 
	//
	// input: none
	// return: competitionNum				// the competition number 
	//
	public int getCompetitionNum( ){
		
		return(competitonNum);
	}// end getCompetitionNum
	
	//
	// getAllScores
	// The purpose of this method is to return the array for all the scores for one diver
	//
	// input: none
	// return: allScores				// all the scores for one diver 
	//
	public double[] getAllScore( ){
		
		return(allScores);
		
	}// end getAllSocres
	
	//
	// getDegreeOfDifficulty
	// The purpose of this method is to return the value for the degree of difficulty 
	//
	// input: none
	// return: degreeOfDifficulty					// the value for the degree of difficulty 
	//
	public double getDegreeOfDifficulty( ){
		
		return(degreeOfDifficulty);
		
	}// end getDegreeOfDifficulty
	
	//
	// getFinalScore
	// The purpose of this method is to return the final score for the diver 
	//
	// input: none
	// return: finalScore				// the final score for the diver 
	//
	public double getFinalScore( ){
		
		return(finalScore);
		
	}// end getFinalScore
	
	//
	// printData
	// The purpose of this method is to print out all the attributes of the class
	//
	// Input: none
	// return: none
	public void printData(){
		int cntr;
		
		System.out.println("The name of the diver is " + name);
		System.out.println("The competition number for the diver is " + competitonNum);
		
		for(cntr = 0; cntr < allScores.length; ++cntr){
			
			System.out.println("The scores for the diver are " + allScores[cntr]);
			
		}// end for 
		
		System.out.println("The degree of difficulty is  " + degreeOfDifficulty);
		System.out.println("The final score for the diver is " + finalScore);
		
	}// end printData
	
	
	//
	// inputDiverinfo
	// The purpose of this method is to input the diver's information
	//
	// input: none 
	// return: none
	public void inputDiverInfo( ){
		
		//input the name of the diver 
		name = MyUtilityClass.inputString("Enter the name of the diver");
		
		//input the competition number of the diver
		competitonNum = MyUtilityClass.inputInteger("Enter the competition number of the diver");
		
	}// end inputDiverInfo 
		
	
	//
	// inputAllScores
	// The purpose of this method is to input all scores for all the judges for the diver
	//
	// Input: none
	// return : none
	//
	public void inputAllScores( ){
		int cntr;
		
			for(cntr = 0; cntr < allScores.length; ++cntr){
				do{
					if((allScores[cntr] >= MINIMUMSCORE) ||(allScores[cntr] <= MAXIMUMSCORE)){
					
						allScores[cntr] = MyUtilityClass.inputDouble("Enter the score for the diver ");
				
					}// end if
					else{
						
						System.out.println("Error, invalid socre " + allScores[cntr]);
					}// end else 
					
				}while((allScores[cntr] < MINIMUMSCORE) ||(allScores[cntr] > MAXIMUMSCORE) );
			}// end for
			
		
	}// end inputAllScores 
	
	//
	// inputValidDegreeOfDificulty 
	// The purpose of this method is to input a valid degree of difficulty for the dive 
	//
	// Input: none 
	// return : none
	//
	public void inputValidDegreeOfDifficulty( ){
		
		do{
			if((degreeOfDifficulty >= MINIMUMDEGREEDIFFICULTY)||(degreeOfDifficulty <=  MAXIMUMDEGDIFFICULTY )){
			
				degreeOfDifficulty = MyUtilityClass.inputDouble("Enter the degree of difficulty for the diver ");
			}// end if 
			else{
				System.out.println("Error, invalid number for degree of difficulty " + degreeOfDifficulty);
			}// end else 
			
		}while((degreeOfDifficulty < MINIMUMDEGREEDIFFICULTY)||(degreeOfDifficulty > MAXIMUMDEGDIFFICULTY ));
		
		
	}// end inputValidDegreeOfDifficulty 
	
	//
	//	findMaxScoreOneDive
	//
	//	The purpose of this method is to find the highest score for one diver
	//
	//	Input:	allScores 			// array that holds all scores for one diver
	//	
	//	REturn:	maxScore				// highest score for that bowler
	//
	
	public  double findMaxScoreOneDive(double[] allScores){
		
		int cntr;
		for (cntr = 0; cntr < allScores.length; ++cntr)
		{
			if (allScores[cntr] > maxScore)
			{
				maxScore = allScores[cntr];
			}// end if 
		}// end for 
		return(maxScore);
		
	}// end findMaxScoreOneDive
	
	//
	//	findMinScoreOneDive
	//
	//	The purpose of this method is to find the lowest score for one diver 
	//
	//	Input:	allScores				// array that holds all scores for one diver 
	//	
	//	REturn:	minScore				// lowest score for one diver 
	//
	
	public double findMinScoreOneDive(double[]allScores){
		int cntr;
		
		for (cntr = 0; cntr < allScores.length;++cntr)
		{
			if (allScores[cntr] < minScore)
			{
				minScore = allScores[cntr];
			}// end if 
		}// end for 
		
		return(minScore);
		
	}// end findMinScoreOneDive
	
	
	
	// calculateScore
	// The purpose of this method is to calculate the score of the diver based on the scores from the judges and the degree of difficulty 
	//
	// Input: allScores					// all the scores from all the judges from one diver
	//		  degreeOfDifficulty 		// the value for the level of difficulty for the dive
	//		  maxScore 					// the maximum score 
	//		  minScore					// the minimum score 
	// return : finalScore 				// over all score for the diver based on the scores from the judges 
	//
	public double calculateFinalScore( ){
		//declare variables 
		double sumExtremes;
		double totalFinal;
		double firstTotal;
		double total;
		int cntr;
		
		//initialize variables 
		sumExtremes = 0.0;
		totalFinal = 0.0;
		firstTotal = 0.0;
		total = 0;
		
		//calculate the sum of the minimum and maximum
		
		sumExtremes = maxScore + minScore;
		
		//find the total score for all the scores 
		for(cntr = 0; cntr < allScores.length; cntr++ ){
			
			total += allScores[cntr];
			
		}// end for 
		
		//subtract the sum of the max and min from the total score 
		firstTotal = total - sumExtremes;
		
		//multiply the new total by the degree of difficulty 
		
		totalFinal = firstTotal * degreeOfDifficulty;
		
		//multiply that score by the generic number to multiply the total 
		finalScore = totalFinal * NUMTOMULTIPLY;
		
		return(finalScore);
	}// end calculateScore 
	
	//
	// runOneDiveClass
	// The purpose of this method is to run the one dive class
	//
	// Input : none
	// Return: none 
	//
	public void runOneDiveClass( ){
		int cntr;
		
		//input diver information 
		inputDiverInfo();
		
		//input the degree of difficulty 
		inputValidDegreeOfDifficulty( );
		
		//input the scores from the judges 
		inputAllScores( );
		
		
		//calculate the score
		calculateFinalScore( );
		
		
		//print data
		printData( );
		
	}// end runOneDiveClass

}// end OneDiveClass
