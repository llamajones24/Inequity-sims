import java.util.Scanner;

public class Paper_code_link {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("Number of strategy initializations?"); 
		double numberOfInitializedStrategies = s.nextDouble(); 
		
		System.out.println("Number of plays for each set of initial strategies?"); 
		int numberOfPlays = s.nextInt();
		
		
		System.out.println("Input the contribution and demand payoff"); 
		
		System.out.println("Payoff for shirking?"); 
		double lowContributionPayoff = s.nextDouble();
	
		System.out.println("Payoff for working?");
		double medContributionPayoff = s.nextDouble();
		
		System.out.println("Payoff for toiling?");
		double highContributionPayoff = s.nextDouble();
		
		System.out.println("Low demand?"); 
		double lowDemand = s.nextDouble();
		
		System.out.println("Med demand?");
		double medDemand = s.nextDouble();
		
		System.out.println("High demand");
		double highDemand = s.nextDouble();
		
		System.out.println("Note that equilibria may need to be made explicit in the program manually");
		
		

		
		long numberOfLLHHEquilibria = 0;
		long numberOfLMHMEquilibria = 0;
		long numberOfLHLHEquilibria = 0;
		long numberOfMLMHEquilibria = 0;
		long numberOfMMMMEquilibria = 0;
		 long numberOfLHHLEquilibria =0;
		 long numberOfLowEquilibria =0;
		 long numberOfLH_LxOrHLEquilibria =0;
		 long numberOfLM_LxOrHMEquilibria =0;
		
		
		for(int i=0; i<numberOfInitializedStrategies;i++){
		
		//Choose initial strategy distribution for population 1
        double y_1=Math.random();
        double y_2=Math.random();
        double y_3=Math.random();
        double y_4=Math.random();
        double y_5=Math.random();
        double y_6=Math.random();
        double y_7=Math.random();
        double y_8=Math.random();
        double y_9=Math.random();
        
        double z_1 = -Math.log(y_1);
        double z_2 = -Math.log(y_2);
        double z_3 = -Math.log(y_3);
        double z_4 = -Math.log(y_4);
        double z_5 = -Math.log(y_5);
        double z_6 = -Math.log(y_6);
        double z_7 = -Math.log(y_7);
        double z_8 = -Math.log(y_8);
        double z_9 = -Math.log(y_9);
		
        double Z = z_1+z_2+z_3+z_4+z_5+z_6+z_7+z_8+z_9;
        
        double proportionLL1 = z_1/Z;
        double proportionLM1 = z_2/Z;
        double proportionLH1 = z_3/Z;
        double proportionML1 = z_4/Z;
        double proportionMM1 = z_5/Z;
        double proportionMH1 = z_6/Z;
        double proportionHL1 = z_7/Z;
        double proportionHM1= z_8/Z;
        double proportionHH1 = z_9/Z;
        
		//Choose initial strategy distribution for population 2
        y_1=Math.random();
        y_2=Math.random();
        y_3=Math.random();
        y_4=Math.random();
        y_5=Math.random();
        y_6=Math.random();
         y_7=Math.random();
         y_8=Math.random();
         y_9=Math.random();
        
         z_1 =-Math.log(y_1);
         z_2 =-Math.log(y_2);
         z_3 =-Math.log(y_3);
         z_4 =-Math.log(y_4);
         z_5 =-Math.log(y_5);
         z_6 =-Math.log(y_6);
         z_7 =-Math.log(y_7);
         z_8 =-Math.log(y_8);
         z_9 =-Math.log(y_9);
		
         Z = z_1+z_2+z_3+z_4+z_5+z_6+z_7+z_8+z_9;
        
         double proportionLL2 = z_1/Z;
         double proportionLM2 = z_2/Z;
         double proportionLH2 = z_3/Z;
         double proportionML2 = z_4/Z;
         double proportionMM2 = z_5/Z;
         double proportionMH2 = z_6/Z;
         double proportionHL2 = z_7/Z;
         double proportionHM2= z_8/Z;
         double proportionHH2 = z_9/Z;
        
         for(int j=0;j<numberOfPlays;j++){
        	 
        	 
        	 double expectedPayoff_LL1 = (proportionLL2*lowContributionPayoff+proportionLM2*lowContributionPayoff+proportionLH2*lowContributionPayoff)+(proportionML2*lowContributionPayoff+proportionMM2*lowContributionPayoff+proportionMH2*lowContributionPayoff)+(proportionHL2*(lowContributionPayoff+lowDemand)+proportionHM2*(lowContributionPayoff+lowDemand)+proportionHH2*(lowContributionPayoff+lowDemand));
        	 double expectedPayoff_LM1 = (proportionLL2*lowContributionPayoff+proportionLM2*lowContributionPayoff+proportionLH2*lowContributionPayoff)+(proportionML2*lowContributionPayoff+proportionMM2*lowContributionPayoff+proportionMH2*lowContributionPayoff)+(proportionHL2*(lowContributionPayoff+medDemand)+proportionHM2*(lowContributionPayoff+medDemand)+proportionHH2*lowContributionPayoff);
        	 double expectedPayoff_LH1 = (proportionLL2*lowContributionPayoff+proportionLM2*lowContributionPayoff+proportionLH2*lowContributionPayoff)+(proportionML2*lowContributionPayoff+proportionMM2*lowContributionPayoff+proportionMH2*lowContributionPayoff)+(proportionHL2*(lowContributionPayoff+highDemand)+proportionHM2*(lowContributionPayoff)+proportionHH2*lowContributionPayoff);
        	 double expectedPayoff_ML1 = (proportionLL2*medContributionPayoff+proportionLM2*medContributionPayoff+proportionLH2*medContributionPayoff)+(proportionML2*(medContributionPayoff+lowDemand)+proportionMM2*(medContributionPayoff+lowDemand)+proportionMH2*(medContributionPayoff+lowDemand))+(proportionHL2*(medContributionPayoff+lowDemand)+proportionHM2*(medContributionPayoff+lowDemand)+proportionHH2*(medContributionPayoff+lowDemand));
        	 double expectedPayoff_MM1 = (proportionLL2*medContributionPayoff+proportionLM2*medContributionPayoff+proportionLH2*medContributionPayoff)+(proportionML2*(medContributionPayoff+medDemand)+proportionMM2*(medContributionPayoff+medDemand)+proportionMH2*(medContributionPayoff))+(proportionHL2*(medContributionPayoff+medDemand)+proportionHM2*(medContributionPayoff+medDemand)+proportionHH2*(medContributionPayoff)); 
        	 double expectedPayoff_MH1 = (proportionLL2*medContributionPayoff+proportionLM2*medContributionPayoff+proportionLH2*medContributionPayoff)+(proportionML2*(medContributionPayoff+highDemand)+proportionMM2*medContributionPayoff+proportionMH2*medContributionPayoff)+(proportionHL2*(medContributionPayoff+highDemand)+proportionHM2*medContributionPayoff+proportionHH2*medContributionPayoff);
        	 double expectedPayoff_HL1 = (proportionLL2*(highContributionPayoff+lowDemand)+proportionLM2*(highContributionPayoff+lowDemand)+proportionLH2*(highContributionPayoff+lowDemand))+(proportionML2*(highContributionPayoff+lowDemand)+proportionMM2*(highContributionPayoff+lowDemand)+proportionMH2*(highContributionPayoff+lowDemand))+(proportionHL2*(highContributionPayoff+lowDemand)+proportionHM2*(highContributionPayoff+lowDemand)+proportionHH2*(highContributionPayoff+lowDemand));
        	 double expectedPayoff_HM1 = (proportionLL2*(highContributionPayoff+medDemand)+proportionLM2*(highContributionPayoff+medDemand)+proportionLH2*(highContributionPayoff))+(proportionML2*(highContributionPayoff+medDemand)+proportionMM2*(highContributionPayoff+medDemand)+proportionMH2*(highContributionPayoff))+(proportionHL2*(highContributionPayoff+medDemand)+proportionHM2*(highContributionPayoff+medDemand)+proportionHH2*(highContributionPayoff));
        	 double expectedPayoff_HH1 = (proportionLL2*(highContributionPayoff+highDemand)+proportionLM2*highContributionPayoff+proportionLH2*highContributionPayoff)+(proportionML2*(highContributionPayoff+highDemand)+proportionMM2*highContributionPayoff+proportionMH2*highContributionPayoff)+(proportionHL2*(highContributionPayoff+highDemand)+proportionHM2*highContributionPayoff+proportionHH2*highContributionPayoff);
        	 
        	 double expectedPayoff_LL2 = (proportionLL1*lowContributionPayoff+proportionLM1*lowContributionPayoff+proportionLH1*lowContributionPayoff)+(proportionML1*lowContributionPayoff+proportionMM1*lowContributionPayoff+proportionMH1*lowContributionPayoff)+(proportionHL1*(lowContributionPayoff+lowDemand)+proportionHM1*(lowContributionPayoff+lowDemand)+proportionHH1*(lowContributionPayoff+lowDemand));
        	 double expectedPayoff_LM2 = (proportionLL1*lowContributionPayoff+proportionLM1*lowContributionPayoff+proportionLH1*lowContributionPayoff)+(proportionML1*lowContributionPayoff+proportionMM1*lowContributionPayoff+proportionMH1*lowContributionPayoff)+(proportionHL1*(lowContributionPayoff+medDemand)+proportionHM1*(lowContributionPayoff+medDemand)+proportionHH1*lowContributionPayoff);
        	 double expectedPayoff_LH2 = (proportionLL1*lowContributionPayoff+proportionLM1*lowContributionPayoff+proportionLH1*lowContributionPayoff)+(proportionML1*lowContributionPayoff+proportionMM1*lowContributionPayoff+proportionMH1*lowContributionPayoff)+(proportionHL1*(lowContributionPayoff+highDemand)+proportionHM1*(lowContributionPayoff)+proportionHH1*lowContributionPayoff);
        	 double expectedPayoff_ML2 = (proportionLL1*medContributionPayoff+proportionLM1*medContributionPayoff+proportionLH1*medContributionPayoff)+(proportionML1*(medContributionPayoff+lowDemand)+proportionMM1*(medContributionPayoff+lowDemand)+proportionMH1*(medContributionPayoff+lowDemand))+(proportionHL1*(medContributionPayoff+lowDemand)+proportionHM1*(medContributionPayoff+lowDemand)+proportionHH1*(medContributionPayoff+lowDemand));
        	 double expectedPayoff_MM2 = (proportionLL1*medContributionPayoff+proportionLM1*medContributionPayoff+proportionLH1*medContributionPayoff)+(proportionML1*(medContributionPayoff+medDemand)+proportionMM1*(medContributionPayoff+medDemand)+proportionMH1*(medContributionPayoff))+(proportionHL1*(medContributionPayoff+medDemand)+proportionHM1*(medContributionPayoff+medDemand)+proportionHH1*(medContributionPayoff)); 
        	 double expectedPayoff_MH2 = (proportionLL1*medContributionPayoff+proportionLM1*medContributionPayoff+proportionLH1*medContributionPayoff)+(proportionML1*(medContributionPayoff+highDemand)+proportionMM1*medContributionPayoff+proportionMH1*medContributionPayoff)+(proportionHL1*(medContributionPayoff+highDemand)+proportionHM1*medContributionPayoff+proportionHH1*medContributionPayoff);
        	 double expectedPayoff_HL2 = (proportionLL1*(highContributionPayoff+lowDemand)+proportionLM1*(highContributionPayoff+lowDemand)+proportionLH1*(highContributionPayoff+lowDemand))+(proportionML1*(highContributionPayoff+lowDemand)+proportionMM1*(highContributionPayoff+lowDemand)+proportionMH1*(highContributionPayoff+lowDemand))+(proportionHL1*(highContributionPayoff+lowDemand)+proportionHM1*(highContributionPayoff+lowDemand)+proportionHH1*(highContributionPayoff+lowDemand));
        	 double expectedPayoff_HM2 = (proportionLL1*(highContributionPayoff+medDemand)+proportionLM1*(highContributionPayoff+medDemand)+proportionLH1*(highContributionPayoff))+(proportionML1*(highContributionPayoff+medDemand)+proportionMM1*(highContributionPayoff+medDemand)+proportionMH1*(highContributionPayoff))+(proportionHL1*(highContributionPayoff+medDemand)+proportionHM1*(highContributionPayoff+medDemand)+proportionHH1*(highContributionPayoff));
        	 double expectedPayoff_HH2 = (proportionLL1*(highContributionPayoff+highDemand)+proportionLM1*highContributionPayoff+proportionLH1*highContributionPayoff)+(proportionML1*(highContributionPayoff+highDemand)+proportionMM1*highContributionPayoff+proportionMH1*highContributionPayoff)+(proportionHL1*(highContributionPayoff+highDemand)+proportionHM1*highContributionPayoff+proportionHH1*highContributionPayoff);
        	 
        	 
        	 double pop1Average= (expectedPayoff_LL1)*proportionLL1+(expectedPayoff_LM1)*proportionLM1+(expectedPayoff_LH1)*proportionLH1+(expectedPayoff_ML1)*proportionML1+(expectedPayoff_MM1)*proportionMM1+(expectedPayoff_MH1)*proportionMH1+(expectedPayoff_HL1)*proportionHL1+(expectedPayoff_HM1)*proportionHM1+(expectedPayoff_HH1)*proportionHH1;
        	 double pop2Average= (expectedPayoff_LL2)*proportionLL2+(expectedPayoff_LM2)*proportionLM2+(expectedPayoff_LH2)*proportionLH2+(expectedPayoff_ML2)*proportionML2+(expectedPayoff_MM2)*proportionMM2+(expectedPayoff_MH2)*proportionMH2+(expectedPayoff_HL2)*proportionHL2+(expectedPayoff_HM2)*proportionHM2+(expectedPayoff_HH2)*proportionHH2;
     
         
        	 proportionLL1 = proportionLL1*(expectedPayoff_LL1/pop1Average);
        	 proportionLM1 = proportionLM1*(expectedPayoff_LM1/pop1Average);
        	 proportionLH1 = proportionLH1*(expectedPayoff_LH1/pop1Average);
        	 proportionML1 = proportionML1*(expectedPayoff_ML1/pop1Average);
        	 proportionMM1 = proportionMM1*(expectedPayoff_MM1/pop1Average);
        	 proportionMH1 = proportionMH1*(expectedPayoff_MH1/pop1Average);
        	 proportionHL1 = proportionHL1*(expectedPayoff_HL1/pop1Average);
        	 proportionHM1 = proportionHM1*(expectedPayoff_HM1/pop1Average);
        	 proportionHH1 = proportionHH1*(expectedPayoff_HH1/pop1Average);
        	 
        	 proportionLL2 = proportionLL2*(expectedPayoff_LL2/pop2Average);
        	 proportionLM2 = proportionLM2*(expectedPayoff_LM2/pop2Average);
        	 proportionLH2 = proportionLH2*(expectedPayoff_LH2/pop2Average);
        	 proportionML2 = proportionML2*(expectedPayoff_ML2/pop2Average);
        	 proportionMM2 = proportionMM2*(expectedPayoff_MM2/pop2Average);
        	 proportionMH2 = proportionMH2*(expectedPayoff_MH2/pop2Average);
        	 proportionHL2 = proportionHL2*(expectedPayoff_HL2/pop2Average);
        	 proportionHM2 = proportionHM2*(expectedPayoff_HM2/pop2Average);
        	 proportionHH2 = proportionHH2*(expectedPayoff_HH2/pop2Average);
         
         } //End all plays
         

         double roundedProportionLL1 = Math.round(proportionLL1*100.0)/100.0;
         double roundedProportionLM1 = Math.round(proportionLM1*100.0)/100.0;
         double roundedProportionLH1 = Math.round(proportionLH1*100.0)/100.0;
         double roundedProportionML1 = Math.round(proportionML1*100.0)/100.0;
         double roundedProportionMM1 = Math.round(proportionMM1*100.0)/100.0;
         double roundedProportionMH1 = Math.round(proportionMH1*100.0)/100.0;
         double roundedProportionHL1 = Math.round(proportionHL1*100.0)/100.0;
         double roundedProportionHM1 = Math.round(proportionHM1*100.0)/100.0;
         double roundedProportionHH1 = Math.round(proportionHH1*100.0)/100.0;
         
         double roundedProportionLL2 = Math.round(proportionLL2*100.0)/100.0;
         double roundedProportionLM2 = Math.round(proportionLM2*100.0)/100.0;
         double roundedProportionLH2 = Math.round(proportionLH2*100.0)/100.0;
         double roundedProportionML2 = Math.round(proportionML2*100.0)/100.0;
         double roundedProportionMM2 = Math.round(proportionMM2*100.0)/100.0;
         double roundedProportionMH2 = Math.round(proportionMH2*100.0)/100.0;
         double roundedProportionHL2 = Math.round(proportionHL2*100.0)/100.0;
         double roundedProportionHM2 = Math.round(proportionHM2*100.0)/100.0;
         double roundedProportionHH2 = Math.round(proportionHH2*100.0)/100.0;
         

         
         if((roundedProportionLL1 ==1 && roundedProportionHH2==1)|| (roundedProportionHH1 ==1 && roundedProportionLL2==1) ){
        	 numberOfLLHHEquilibria = numberOfLLHHEquilibria+1;
        	 }else if((roundedProportionLM1 ==1 && roundedProportionHM2==1)|| (roundedProportionHM1 ==1 && roundedProportionLM2==1) ){
        	 numberOfLMHMEquilibria = numberOfLMHMEquilibria+1;
        	 }else if((roundedProportionML1 ==1 && roundedProportionMH2==1)|| (roundedProportionMH1 ==1 && roundedProportionML2==1) ){
        	 numberOfMLMHEquilibria = numberOfMLMHEquilibria+1;
        	 }else if((roundedProportionMM1 ==1 && roundedProportionMM2==1)|| (roundedProportionMM1 ==1 && roundedProportionMM2==1) ){
        	 numberOfMMMMEquilibria = numberOfMMMMEquilibria+1;        	 
         }else if((roundedProportionLH1 ==1 && roundedProportionHL2==1)|| (roundedProportionHL1 ==1 && roundedProportionLH2==1)){
        	 numberOfLHHLEquilibria = numberOfLHHLEquilibria+1;
        	 
         }else if(roundedProportionLH1+roundedProportionLH2+roundedProportionLM1+roundedProportionLM2+roundedProportionLL1+roundedProportionLL2>=1.96){
        	 numberOfLowEquilibria = numberOfLowEquilibria+1;
        	 

             
         }else if((roundedProportionLH1 == 1 && roundedProportionLH2 + roundedProportionLM2 + roundedProportionLL2 + roundedProportionHL2 >= 0.98 ) || (roundedProportionLH2 == 1 && roundedProportionLH1 + roundedProportionLM1 + roundedProportionLL1 + roundedProportionHL1 >= 0.98 ) ){
        	 numberOfLH_LxOrHLEquilibria = numberOfLH_LxOrHLEquilibria+1;
             
         }else if((roundedProportionLM1 == 1 && roundedProportionLH2 + roundedProportionLM2 + roundedProportionLL2 + roundedProportionHM2 >= 0.98 ) || (roundedProportionLM2 == 1 && roundedProportionLH1 + roundedProportionLM1 + roundedProportionLL1 + roundedProportionHM1 >= 0.98 ) ){


             
             numberOfLM_LxOrHMEquilibria = numberOfLM_LxOrHMEquilibria+1;
         }else{

        	 
         }
         
		}
		
 		double proportionOfLLHHEquilibria = ((double) numberOfLLHHEquilibria)/numberOfInitializedStrategies;
 		double proportionOfLMHMEquilibria = ((double) numberOfLMHMEquilibria)/numberOfInitializedStrategies;
 		double proportionOfMLMHEquilibria = ((double) numberOfMLMHEquilibria)/numberOfInitializedStrategies;
 		double proportionOfMMMMEquilibria = ((double) numberOfMMMMEquilibria)/numberOfInitializedStrategies;
		double proportionOfLHHLEquilibria = ((double) numberOfLHHLEquilibria)/numberOfInitializedStrategies;

		
 		System.out.println("The proportion of runs ending in a LLHH equilibrium was " + proportionOfLLHHEquilibria);
 		System.out.println("The proportion of runs ending in a LMHM equilibrium was " + proportionOfLMHMEquilibria);
 		System.out.println("The proportion of runs ending in a LHHL equilibrium was " + proportionOfLHHLEquilibria);
 		System.out.println("The proportion of runs ending in a MLMH equilibrium was " + proportionOfMLMHEquilibria);
 		System.out.println("The proportion of runs ending in a MMMM equilibrium was " + proportionOfMMMMEquilibria);

	}

}
