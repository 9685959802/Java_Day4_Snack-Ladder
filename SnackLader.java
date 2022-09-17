package snacklader;

public class SnackLader {
	static int positionUC1 = 1;
	int positionUC2 = (int) ((Math.random() * 6) + 1);
public static void main(String []args) {
	final int position = 0;
	
	System.out.println("Snacklader simulator");
	
	byte player = 1;
	
	//uc1
	
	System.out.println("Game Starts ...");
	System.out.println("Number of Players " + player);
	System.out.println("Position : On Square" + position);
	
	//uc2
		SnackLader dice = new SnackLader();
		dice.diceRolled();
		//UC3
		
		
	SnackLader opt = new SnackLader();
	    opt.OptionCheck();

}
void OptionCheck() {
	int  positionUC3 = (int) ((Math.random() * 6) + 1);
	int checkOption = (int) (Math.random() * 3);
	
	
switch(checkOption) {

case 0 : System.out.println("No Play!...same position");
		 break;
case 1 : System.out.println("Yayyy...you climbed a ladder");
		 positionUC1 = positionUC2 + positionUC3;
         System.out.println("Position : On Square " + positionUC1 );
		 break;
case 2 : System.out.println("Oops...snake there");
		 positionUC1 = positionUC2 - positionUC3;
         if (positionUC1 <= 0)
        	 positionUC1 = 1;
         System.out.println("Position : On Square " + positionUC1);
         break;
}
}



	void diceRolled() {
			int new_position = (int) ((Math.random() *6)+1);
			System.out.println("Player moved to "+ new_position);				
	
	}
	void OptionCheck() {
		int  positionUC3 = (int) ((Math.random() * 6) + 1);
		int checkOption = (int) (Math.random() * 3);
		      
	switch(checkOption) {
	
	case 0 : System.out.println("No Play!...same position");
			 break;
	case 1 : System.out.println("Yayyy...you climbed a ladder");
			 positionUC3 = positionUC3 + positionUC2;
	         System.out.println("Position : On Square [" + positionUC3 + "]");
			 break;
	default : System.out.println("Oops...snake there");
			 positionUC3 = positionUC2 - positionUC3;
	         if (positionUC3 <= 0)
	        	 positionUC3 = 1;
	         System.out.println("Position : On Square [" + positionUC3 + "]");
	         break;
			}
	}
	void tillHundred() {
		 int positionUC4 = (int) ((Math.random() * 6) + 1);
		 do {
			 positionUC4 = positionUC4 + positionUC4; 
//			 System.out.println("Position : On Square [" + positionUC4 + "]");
		 }while(positionUC4 < 99);
		 if(positionUC4 >= 100)
			 System.out.println("Congrates you reached On Square : 100");
	 }
	 
	 void exactHundred() {
		 int positionUC5 = 1;
		 for (int i = 1; i <= 100; i++)
		 {
			 positionUC5 = i;
		 }
		 if(positionUC5 == 100)
			 System.out.println("Congrates player one has won :)");
	 }
	 void countDiceNum() {
		 int positionUC6 = (int) ((Math.random() * 6) + 1);
		 int count = 1;
		 while(positionUC6 <= 100) {
			 
			 positionUC6 = positionUC6 + positionUC6;  
			 count++;
		      }
		 System.out.println("Dice thrown " + (count+1) + " numbers of time to reach 100");
		 }
	 
	static void playerOne(){
		
		String player1name;
		
		int positionUC7 = (int) ((Math.random() * 6) + 1);
		for(int i = 0; positionUC7 < 100 ; i++)
		{
			int newposition = (int) ((Math.random() * 6) + 1); 
			if(positionUC7 + newposition <= 100)
			{
				positionUC7 = positionUC7 + newposition;
			}
		}
		
		String player2name;
		
		int positionUC8 = (int) ((Math.random() * 6) + 1);
		for(int i = 0; positionUC8 < 100 ; i++)
		{
			int newposition = (int) ((Math.random() * 6) + 1); 
			if(positionUC8 + newposition <= 100)
			{
				positionUC8 = positionUC8 + newposition;
			}
		}
		if(positionUC7 > positionUC8)
			System.out.println("Congrates " + player1name + " you won");
		else
			System.out.println("Congrates " + player2name + " you won");
		
	    }
	  }
}
	 
		
	


	
