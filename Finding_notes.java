import java.util.Scanner;
class Finding_notes 
{
	public static void main(String[] args) 
	{Scanner sc=new Scanner(System.in);
	System.out.println("Enter amount :");
	int amt=sc.nextInt();
	System.out.println("<-------------------Information about number of possible Currency Notes---------------->");
	note(amt);
	}
	static void note(int amt ){
	
	if (amt>500||amt>200||amt>100||amt>50||amt>20||amt>10||amt>5||amt>2||amt>1)
	{
		if (amt>=500)
		{
			int notes500=amt/500;
			System.out.println("500 rupees notes:"+notes500);
			int rem1=amt%500;
			if (rem1>=200)
			{
				int notes200=rem1/200;
				System.out.println("200 rupees notes:"+notes200);
				int rem2=rem1%200;
				if (rem2>=100)
				{
					int notes100=rem2/100;
					System.out.println("100 rupees notes:"+notes100);
					int rem3=rem2%100;
					if (rem3>=50)
					{
						int notes50=rem3/50;
						System.out.println("50 rupees notes:"+notes50);
						int rem4=rem3%50;
						if (rem4>=20)
						{
							int notes20=rem4/20;
							System.out.println("20 rupees notes:"+notes20);
							int rem5=rem4%20;
							if (rem5>=10)
							{
								int notes10=rem5/10;
								System.out.println("10 rupees notes:"+notes10);
								int rem6=rem5%10;
								if (rem6>=5)
								{
									int coin5=rem6/5;
									System.out.println("5 rupee coins:"+coin5);
									int rem7=rem6%5;
									if (rem7>=2)
									{
										int coin2=rem7/2;
										System.out.println("2 rupee coins:"+coin2);
										int rem8=rem7%2;
										if (rem8==1)
										{
											int coin1=rem8;
											System.out.println("1 rupee coins:"+coin1);
										}
									}
									else if (rem7<2)
									{
										Finding_notes.coin2(rem7);
									}
								}
								else if (rem6<5)
								{
									Finding_notes.coin5(rem6);
								}
								
							}
							else if (rem5<10)
							{
								Finding_notes.note10(rem5);
							}

						}
						else if (rem4<20)
						{
							Finding_notes.note20(rem4);
						}
					}
					else if (rem3<50)
					{
						Finding_notes.note50(rem3);
					}
				}
				else if (rem2<100)
				{
					Finding_notes.note100(rem2);
				}
			}
			else if (rem1<200)
			{
				Finding_notes.note200(rem1);

			}
		}else if (amt<500)
		{
			Finding_notes.note500(amt);

		}

	}else{
		System.out.println("invalid input");
	}



	}
 public static void note500(int amt){
           		int rem1=amt%500;
			if (rem1>=200)
			{
				int notes200=rem1/200;
				System.out.println("200 rupees notes:"+notes200);
				int rem2=rem1%200;
				if (rem2>=100)
				{
					int notes100=rem2/100;
					System.out.println("100 rupees notes:"+notes100);
					int rem3=rem2%100;
					if (rem3>=50)
					{
						int notes50=rem3/50;
						System.out.println("50 rupees notes:"+notes50);
						int rem4=rem3%50;
						if (rem4>=20)
						{
							int notes20=rem4/20;
							System.out.println("20 rupees notes:"+notes20);
							int rem5=rem4%20;
							if (rem5>=10)
							{
								int notes10=rem5/10;
								System.out.println("10 rupees notes:"+notes10);
								int rem6=rem5%10;
								if (rem6>=5)
								{
									int coin5=rem6/5;
									System.out.println("5 rupee coins:"+coin5);
									int rem7=rem6%5;
									if (rem7>=2)
									{
										int coin2=rem7/2;
										System.out.println("2 rupee coins:"+coin2);
										int rem8=rem7%2;
										if (rem8==1)
										{
											int coin1=rem8;
											System.out.println("1 rupee coins:"+coin1);
										}
									}
									else if (rem7<2)
									{
										Finding_notes.coin2(rem7);
									}
								}
								else if (rem6<5)
								{
									Finding_notes.coin5(rem6);
								}
								
							}
							else if (rem5<10)
							{
								Finding_notes.note10(rem5);
							}

						}
						else if (rem4<20)
						{
							Finding_notes.note20(rem4);
						}
					}
					else if (rem3<50)
					{
						Finding_notes.note50(rem3);
					}
				}
				else if (rem2<100)
				{
					Finding_notes.note100(rem2);
				}
			}
			else if (rem1<200)
			{
				Finding_notes.note200(rem1);

			}
	}//note500 {}
	public static void note200(int rem1){
			int rem2=rem1%200;
				if (rem2>=100)
				{
					int notes100=rem2/100;
					System.out.println("100 rupees notes:"+notes100);
					int rem3=rem2%100;
					if (rem3>=50)
					{
						int notes50=rem3/50;
						System.out.println("50 rupees notes:"+notes50);
						int rem4=rem3%50;
						if (rem4>=20)
						{
							int notes20=rem4/20;
							System.out.println("20 rupees notes:"+notes20);
							int rem5=rem4%20;
							if (rem5>=10)
							{
								int notes10=rem5/10;
								System.out.println("10 rupees notes:"+notes10);
								int rem6=rem5%10;
								if (rem6>=5)
								{
									int coin5=rem6/5;
									System.out.println("5 rupee coins:"+coin5);
									int rem7=rem6%5;
									if (rem7>=2)
									{
										int coin2=rem7/2;
										System.out.println("2 rupee coins:"+coin2);
										int rem8=rem7%2;
										if (rem8==1)
										{
											int coin1=rem8;
											System.out.println("1 rupee coins:"+coin1);
										}
									}
									else if (rem7<2)
									{
										Finding_notes.coin2(rem7);
									}
								}
								else if (rem6<5)
								{
									Finding_notes.coin5(rem6);
								}
								
							}
							else if (rem5<10)
							{
								Finding_notes.note10(rem5);
							}

						}
						else if (rem4<20)
						{
							Finding_notes.note20(rem4);
						}
					}
					else if (rem3<50)
					{
						Finding_notes.note50(rem3);
					}
				}
				else if (rem2<100)
				{
					Finding_notes.note100(rem2);
				}
	}//note 200{}
	public static void note100(int rem2){
			int rem3=rem2%100;
					if (rem3>=50)
					{
						int notes50=rem3/50;
						System.out.println("50 rupees notes:"+notes50);
						int rem4=rem3%50;
						if (rem4>=20)
						{
							int notes20=rem4/20;
							System.out.println("20 rupees notes:"+notes20);
							int rem5=rem4%20;
							if (rem5>=10)
							{
								int notes10=rem5/10;
								System.out.println("10 rupees notes:"+notes10);
								int rem6=rem5%10;
								if (rem6>=5)
								{
									int coin5=rem6/5;
									System.out.println("5 rupee coins:"+coin5);
									int rem7=rem6%5;
									if (rem7>=2)
									{
										int coin2=rem7/2;
										System.out.println("2 rupee coins:"+coin2);
										int rem8=rem7%2;
										if (rem8==1)
										{
											int coin1=rem8;
											System.out.println("1 rupee coins:"+coin1);
										}
									}
									else if (rem7<2)
									{
										Finding_notes.coin2(rem7);
									}
								}
								else if (rem6<5)
								{
									Finding_notes.coin5(rem6);
								}
								
							}
							else if (rem5<10)
							{
								Finding_notes.note10(rem5);
							}

						}
						else if (rem4<20)
						{
							Finding_notes.note20(rem4);
						}
					}
					else if (rem3<50)
					{
						Finding_notes.note50(rem3);
					}

		
	}//100{}
	public static void note50(int rem3){
			int rem4=rem3%50;
						if (rem4>=20)
						{
							int notes20=rem4/20;
							System.out.println("20 rupees notes:"+notes20);
							int rem5=rem4%20;
							if (rem5>=10)
							{
								int notes10=rem5/10;
								System.out.println("10 rupees notes:"+notes10);
								int rem6=rem5%10;
								if (rem6>=5)
								{
									int coin5=rem6/5;
									System.out.println("5 rupee coins:"+coin5);
									int rem7=rem6%5;
									if (rem7>=2)
									{
										int coin2=rem7/2;
										System.out.println("2 rupee coins:"+coin2);
										int rem8=rem7%2;
										if (rem8==1)
										{
											int coin1=rem8;
											System.out.println("1 rupee coins:"+coin1);
										}
									}
									else if (rem7<2)
									{
										Finding_notes.coin2(rem7);
									}
								}
								else if (rem6<5)
								{
									Finding_notes.coin5(rem6);
								}
								
							}
							else if (rem5<10)
							{
								Finding_notes.note10(rem5);
							}

						}
						else if (rem4<20)
						{
							Finding_notes.note20(rem4);
						}
		
	}//50{}
	public static void note20(int rem4){
		int rem5=rem4%20;
							if (rem5>=10)
							{
								int notes10=rem5/10;
								System.out.println("10 rupees notes:"+notes10);
								int rem6=rem5%10;
								if (rem6>=5)
								{
									int coin5=rem6/5;
									System.out.println("5 rupee coins:"+coin5);
									int rem7=rem6%5;
									if (rem7>=2)
									{
										int coin2=rem7/2;
										System.out.println("2 rupee coins:"+coin2);
										int rem8=rem7%2;
										if (rem8==1)
										{
											int coin1=rem8;
											System.out.println("1 rupee coins:"+coin1);
										}
									}
									else if (rem7<2)
									{
										Finding_notes.coin2(rem7);
									}
								}
								else if (rem6<5)
								{
									Finding_notes.coin5(rem6);
								}
								
							}
							else if (rem5<10)
							{
								Finding_notes.note10(rem5);
							}
		



	}//20{}
	public static void note10(int rem5){
					int rem6=rem5%10;
								if (rem6>=5)
								{
									int coin5=rem6/5;
									System.out.println("5 rupee coins:"+coin5);
									int rem7=rem6%5;
									if (rem7>=2)
									{
										int coin2=rem7/2;
										System.out.println("2 rupee coins:"+coin2);
										int rem8=rem7%2;
										if (rem8==1)
										{
											int coin1=rem8;
											System.out.println("1 rupee coins:"+coin1);
										}
									}
									else if (rem7<2)
									{
										Finding_notes.coin2(rem7);
									}
								}
								else if (rem6<5)
								{
									Finding_notes.coin5(rem6);
								}


	}//10{}
	public static void coin5(int rem6){
			int rem7=rem6%5;
									if (rem7>=2)
									{
										int coin2=rem7/2;
										System.out.println("2 rupee coins:"+coin2);
										int rem8=rem7%2;
										if (rem8==1)
										{
											int coin1=rem8;
											System.out.println("1 rupee coins:"+coin1);
										}
									}
									else if (rem7<2)
									{
										Finding_notes.coin2(rem7);
									}
		




	}//5{}
	public static void coin2(int rem7)
		{
		int rem8=rem7%2;
	      if (rem8==1)
			{
			int coin1=rem8;
			System.out.println("1 rupee coins:"+coin1);
		     }
		
	    }


}//class parntheisies