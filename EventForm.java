/*
* EventForm 1.0
* MVN UNIVERSITY
* Developer Name
****> Manish Sharma (16cs1007@mvn.edu.in)
****>  Vikash (vk133006@gmail.com)
****>   Gaurav Kumar (16cs1004@mvn.edu.in)
****>    Soumitya Chauhan (soumityachauhan@gmail.com) 
*/

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.filechooser.*;
class EventForm
{
	static String filepath;
	static JTextArea tx;
	static String st;
	static	String s2;
	static	String letminVal;
	static	String longmaxVal;
	static	String depthVal;
	static	String magniVal;
	static	String megtypeval;
	static int count;

	EventForm()
	{	
	}
	public static void main(String args[])
	{
		//Creating Frame
		JFrame f=new JFrame("EventSelection 1.0");

		//creating file label
		JLabel l=new JLabel("File");
		l.setBounds(20,20,30,30);

		//browse textField
		JTextField tx=new JTextField();
		tx.setBounds(50,25,360,25);
		tx.setEditable(false); 


		//creating Date label
		JLabel l1=new JLabel("Date");
		l1.setBounds(20,60,50,30);;

		//creating From label
		JLabel l2=new JLabel("From");
		l2.setBounds(20,90,30,30);

		//from textField
		JTextField tx1=new JTextField();
		tx1.setBounds(60,90,180,25);


		//creating  label
		JLabel l16=new JLabel("YYYY-MM");
		l16.setBounds(250,85,100,30);

		//creating label
		JLabel l3=new JLabel("To");
		l3.setBounds(20,135,30,30);

		//To textFiled
		JTextField tx2=new JTextField();
		tx2.setBounds(60,140,180,25);

		//creating label
		JLabel l17=new JLabel("YYYY-MM");
		l17.setBounds(250,135,100,30);

		//creating label
		JLabel l4=new JLabel("Latitude (0- 40)");
		l4.setBounds(20,180,130,30);

		//creating label
		JLabel l5=new JLabel("Min");
		l5.setBounds(20,210,30,30);

		//creating textfield
		JTextField mintx=new JTextField();
		mintx.setBounds(60,210,180,25);

		//creating label
		JLabel l6=new JLabel("Max");
		l6.setBounds(250,210,30,30);

		JTextField maxtx=new JTextField();
		maxtx.setBounds(290,210,180,25);

		//creating label
		JLabel l7=new JLabel("Longitude (60-100)");
		l7.setBounds(20,250,130,30);

		//creating label
		JLabel l8=new JLabel("Min");
		l8.setBounds(20,280,30,30);

		JTextField min2tx=new JTextField();
		min2tx.setBounds(60,280,180,25);

		//creating label
		JLabel l9=new JLabel("Max");
		l9.setBounds(250,280,30,30);

		JTextField max2tx=new JTextField();
		max2tx.setBounds(290,280,180,25);

		//creating label
		JLabel l10=new JLabel("Magnitude (0.0-9.3)");
		l10.setBounds(20,320,130,30);

		//creating label
		JLabel l11=new JLabel("Min");
		l11.setBounds(20,350,30,30);

		JTextField min3tx=new JTextField();
		min3tx.setBounds(60,350,180,25);

		//creating label
		JLabel l12=new JLabel("Max");
		l12.setBounds(250,350,30,30);

		JTextField max3tx=new JTextField();
		max3tx.setBounds(290,350,180,25);

		JLabel l18=new JLabel("Magnitude Type");
		l18.setBounds(20,385,100,30);

		String s[]={"OneM","W","s","b","L","c","All Mag."};
		JComboBox box=new JComboBox(s);
		box.setBounds(120,387,100,25);

		//creating label
		JLabel l13=new JLabel("Depth in Km (0-700)");
		l13.setBounds(20,420,130,30);

		//creating label
		JLabel l14=new JLabel("Min");
		l14.setBounds(20,450,30,30);

		JTextField min4tx=new JTextField();
		min4tx.setBounds(60,450,180,25);

		//creating label
		JLabel l15=new JLabel("Max");
		l15.setBounds(250,450,30,30);

		JTextField max4tx=new JTextField();
		max4tx.setBounds(290,450,180,25);


		JLabel l19=new JLabel("Region");
		l19.setBounds(20,480,70,30);

		JRadioButton r1=new JRadioButton("Yes");
		JRadioButton r2=new JRadioButton("No");
		r1.setBounds(80,480,50,30);
		r2.setBounds(80,505,50,30);
		ButtonGroup bg=new ButtonGroup();
		bg.add(r1);bg.add(r2);

		
		//creating Browse Button
		JButton b1=new JButton("Browse");
		b1.setBounds(420,23,100,30);

		//creating fetch Button
		JButton b2=new JButton("Fetch");
		b2.setBounds(210,540,100,30);

		//Creating Button for developer name
		JButton b3=new JButton("?");
		b3.setBounds(490,540,30,30);
		b3.setMargin(new Insets(0,0,0,0));
		f.add(b3);

		b3.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent eou)
			{
				JFrame contact=new JFrame();
				JOptionPane.showMessageDialog(null,"Manish Sharma (8168583202)\nVikash (8800672019)\nSoumitya Chauhan (9547147881)\nGaurav Kumar (9136367200)","Developed By",JOptionPane.INFORMATION_MESSAGE);
			}
		});

		EventForm f1=new EventForm();

		//adding all element to frame
		f.add(l);
		f.add(l1);
		f.add(l2);
		f.add(l3);
		f.add(l4);
		f.add(l5);
		f.add(l6);
		f.add(l7);
		f.add(l8);
		f.add(l9);
		f.add(l10);
		f.add(l11);
		f.add(l12);
		f.add(l13);
		f.add(l14);
		f.add(l15);
		f.add(l16);
		f.add(l17);
		f.add(l18);
		f.add(l19);

		f.add(r1);
		f.add(r2);

		f.add(box);	

		f.add(b2);
		f.add(b1);

		f.add(tx);		
		
		f.add(mintx);
		f.add(maxtx);

		f.add(min2tx);
		f.add(max2tx);

		f.add(min3tx);
		f.add(max3tx);

		f.add(min4tx);
		f.add(max4tx);
		
		f.add(tx1);
		f.add(tx2);		

		f.setResizable(false);
		f.setSize(550,620);
		f.setLayout(null);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		//for ui of file chooser
		try
		{
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		}catch(Exception eav){}

		//browse
		b1.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e)
		 	{			    	
				JFileChooser j = new JFileChooser();
				j.setCurrentDirectory(new java.io.File(".")); 
				int r = j.showOpenDialog(null);  
			    if (r == JFileChooser.APPROVE_OPTION) 
			    { 
			        File f=j.getSelectedFile();    
			        filepath=f.getPath();    

			        //adding path browse textField
			        tx.setText(filepath);
				}
			}
		});

		//fetch
		b2.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e)
			{
				try
				{ 
				 	BufferedReader br=new BufferedReader(new FileReader(filepath));
					PrintStream o=new PrintStream(new File("outbul.txt"));
	
					//for date
					String FromDate=tx1.getText();
					String FromDate1=FromDate.replace("-","");
					int From=Integer.parseInt(FromDate1);
							
					String ToDate=tx2.getText();
					String ToDate1=ToDate.replace("-","");
					int To=Integer.parseInt(ToDate1);

					//For calculating Month
					String monthFrom=FromDate.substring(5,7);
					if(monthFrom.equals("01"))
					{
						monthFrom="JANUARY";
					}
					else if(monthFrom.equals("02"))
					{
						monthFrom="FEBRUARY";
					}
					else if(monthFrom.equals("03"))
					{
						monthFrom="MARCH";
					}
					else if(monthFrom.equals("04"))
					{
						monthFrom="APRIL";
					}
					else if(monthFrom.equals("05"))
					{
						monthFrom="MAY";
					}
					else if(monthFrom.equals("06"))
					{
						monthFrom="JUNE";
					}
					else if(monthFrom.equals("07"))
					{
						monthFrom="JULY";
					}
					else if(monthFrom.equals("08"))
					{
						monthFrom="AUGUST";
					}
					else if(monthFrom.equals("09"))
					{
						monthFrom="SEPTEMBER";
					}
					else if(monthFrom.equals("10"))
					{
						monthFrom="OCTOBER";
					}
					else if(monthFrom.equals("11"))
					{
						monthFrom="NOVEMBER";
						}
					else if(monthFrom.equals("12"))
					{
						monthFrom="DECEMBER";
					}

					String monthTo=ToDate.substring(5,7);
					if(monthTo.equals("01"))
					{
						monthTo="JANUARY";
					}
					else if(monthTo.equals("02"))
					{
						monthTo="FEBRUARY";
					}
					else if(monthTo.equals("03"))
					{
						monthTo="MARCH";
					}
					else if(monthTo.equals("04"))
					{
						monthTo="APRIL";
					}
					else if(monthTo.equals("05"))
					{
						monthTo="MAY";
					}
					else if(monthTo.equals("06"))
					{
						monthTo="JUNE";
					}
					else if(monthTo.equals("07"))
					{
						monthTo="JULY";
					}
					else if(monthTo.equals("08"))
					{
						monthTo="AUGUST";
					}
					else if(monthTo.equals("09"))
					{
						monthTo="SEPTEMBER";
					}
					else if(monthTo.equals("10"))
					{
						monthTo="OCTOBER";
					}
					else if(monthTo.equals("11"))
					{
						monthTo="NOVEMBER";
					}
					else if(monthTo.equals("12"))
					{
						monthTo="DECEMBER";
					}

					//for Calculating region is selected or not
					String reginGui="";
					if(r1.isSelected())
					{
						reginGui="Yes";
					}
					else if(r2.isSelected())
					{
						reginGui="No";
					}

					// for letitude
					String letmin=mintx.getText();
					int b=Integer.parseInt(letmin);
					String cb=String.format("%02d",b);
					String s=(cb+"000");
					int letmincon=Integer.parseInt(s);

					String letmax=maxtx.getText();
					int a=Integer.parseInt(letmax);
					String ca=String.format("%02d",a);
					String sa=(ca+"000");
					int letmaxcon=Integer.parseInt(sa);
							

					//for longitude
					String longmin=min2tx.getText();
					int one=Integer.parseInt(longmin);
					String convert=String.format("%03d",one);
					String convert2=(convert+"000");
					int longmincon=Integer.parseInt(convert2);

					String longmax=max2tx.getText();
					int two=Integer.parseInt(longmax);
					String convert3=String.format("%03d",two);
					String convert4=(convert3+"000");
					int longmaxcon=Integer.parseInt(convert4);



					//for depth
					String depthmin=min4tx.getText();
					int depthToint1=Integer.parseInt(depthmin);
					String depthTostring1=String.format("%03d",depthToint1);
					int depthminConvert=Integer.parseInt(depthTostring1);

					String depthmax=max4tx.getText();
					int depthToint2=Integer.parseInt(depthmax);
					String depthTostring2=String.format("%03d",depthToint2);
					int depthmaxConvert=Integer.parseInt(depthTostring2);

					// for megnitude
					String megnitudeMin=min3tx.getText();
					String megnitudemin1=megnitudeMin.replace(".","");
					int megnitudemin2=Integer.parseInt(megnitudemin1);

					String megnitudeMax=max3tx.getText();
					String megnitudemax1=megnitudeMax.replace(".","");
					int megnitudemax2=Integer.parseInt(megnitudemax1);


					//For meg type
					String megType=box.getSelectedItem().toString();
					String ok="";
					String meg2="";
					String meg3="";
					if(megType.equals("W")||megType.equals("w"))
					{
						megType="w";
					}
					else if(megType.equals("b")||megType.equals("B"))
					{
						megType="b";
					}
					else if(megType.equals("L")||megType.equals("l"))
					{
						megType="l";
					}
					else if(megType.equals("OneM"))
					{
						megType="wblsc ";
						ok="true";
					}
					else if(megType.equals("s")||megType.equals("S"))
					{
						megType="s";
					}
					else if(megType.equals("c")||megType.equals("C"))
					{
						megType="c";
					}
					else if(megType.equals("All Mag."))
					{
						megType="wblsc ";
					}

					//For catlog upper part Print
					count=0;
					System.setOut(o);
					System.out.println("");
					System.out.println("          LIST OF EARTHQUAKES FROM IMD CATALOGUE       ");
					System.out.println("                   OCCURRING BETWEEN                   ");
					System.out.println("           LATITUDE    "+letmin+".00 TO  "+letmax+".00 Deg. N");
					System.out.println("           LONGITUDE  "+longmin+".00 TO "+longmax+".00 Deg. E");
					System.out.println("     FOR THE PERIOD "+monthFrom+"  ,"+FromDate.substring(0,4)+" TO "+monthTo+"      ,"+ToDate.substring(0,4));
					System.out.println("              (MAGNITUDE "+megnitudeMin+" BETWEEN "+megnitudeMax+")");
					System.out.println(" ------------------------------------------------------------------------------");
					System.out.println(" Year Mon Day Origin-time Latitude Longitude Depth Magnitude/type      Region");
					System.out.println("              Hr Min Sec  (Deg.N)  (Deg.E)   (km.)    Agency   ");
					System.out.println("               (in UTC)                                ");
					System.out.println(" ------------------------------------------------------------------------------");

					//int count2=0;

					while((st=br.readLine())!=null)
					{
						//count2+=1;  These line are commented for some reasons
						//if (count2>=14421) 
						//{
							if(!st.isEmpty() && st.trim().length()>0)
							{
								s2=st.substring(6,12);//for date
								int check=Integer.parseInt(s2);

								letminVal=st.substring(21,26);//for letitude
								int check2=Integer.parseInt(letminVal);

								longmaxVal=st.substring(27,33);//for longitude
								int check3=Integer.parseInt(longmaxVal);
								
								depthVal=st.substring(34,37);//for depth
								int check4=Integer.parseInt(depthVal);

								magniVal=st.substring(37,39);//for megnitude
								int check5=Integer.parseInt(magniVal);

								//for megnitude type
								megtypeval=st.substring(39,40).toLowerCase();


								if(From<=check && check<=To && letmincon<=check2 && check2 <=letmaxcon && longmincon<=check3 && check3<=longmaxcon && depthminConvert<=check4 && check4<=depthmaxConvert && megnitudemin2<=check5 && check5<=megnitudemax2 && megType.contains(megtypeval))
								{

									//for date
									String Date=" "+st.substring(6,10)+" "+st.substring(10,12)+"  "+st.substring(12,14);

									//for Time
									String Min="  "+st.substring(14,16)+" "+st.substring(16,18)+" "+st.substring(18,20)+"."+st.substring(20,21);

									//for letitude
									String let=st.substring(21,23)+"."+st.substring(23,26);
									double d=Double.parseDouble(let);
									double letroundOff=Math.round(d*100.0)/100.0;
									String letabc=String.valueOf(letroundOff);
									String space="    ";
									if(letabc.length()==5)
									{
										space="    ";
									}
									else if(letabc.length()==4)
									{
										space="     ";
									}
									else if(letabc.length()==3)
									{
										space="      ";
									}
														

									//for longitude
									String lon=st.substring(27,30)+"."+st.substring(30,33);
									double dot=Double.parseDouble(lon);
									double longroundOff=Math.round(dot*100.0)/100.0;
									String longabc=String.valueOf(longroundOff);
									String space2="     ";
									if(longabc.length()==5)
									{
										space2="     ";
									}
									else if(longabc.length()==4)
									{
										space2="      ";
									}
									else if(longabc.length()==3)
									{
										space2="       ";
									}

									//for depth
									String dep=st.substring(34,37);
									int depInt=Integer.parseInt(dep);
									String depabc=String .valueOf(depInt);
									String space3="  ";
									if(depabc.length()==3)
									{
										space3="  ";
									}
									else if(depabc.length()==2)
									{
										space3="   ";
									}
									else if(depabc.length()==1)
									{
										space3="    ";
									}

									//for first Megnitude
									String meg=st.substring(37,38)+"."+st.substring(38,40);

									//Agency name
									String Age=" "+st.substring(40,43);

									if(ok.equals("true"))
									{
										meg2=" ";
										meg3=" ";

									}
									else
									{
										//second megnitude
										meg2="  "+st.substring(43,44)+"."+st.substring(44,45)+st.substring(45,46)+" "+st.substring(46,49);

										//Third megnitude
										meg3="  "+st.substring(49,50)+"."+st.substring(50,51)+st.substring(51,52)+" "+st.substring(52,55);

									}	
									
									

									//Region
									int length=st.length();
									String Region="";
									if(reginGui.equals("Yes"))
									{
										Region="          "+st.substring(56,length);
									}
									else if(reginGui.equals("No"))
									{
										Region=" ";
									}
									System.setOut(o);
									System.out.println(Date+Min+"   "+letroundOff+space+longroundOff+space2+depInt+space3+meg+Age+meg2+meg3+Region);
									count+=1;
								}
							}
							
						//}
										
					}
					//For print the Lower part of the Catlog
					System.out.println("");
					System.out.println(" ----------------------------------------------------");
					System.out.println(" Total number of events:         "+count);	
					o.close();
					String Close="True";
					if(Close.equals("True"))
					{
						JFrame dialog=new JFrame();
						JOptionPane.showMessageDialog(dialog,"File Successfully Generated");
					}

				}catch(Exception aee)
				{
					System.out.println(aee);
				}				  
			}
		}); 	
	}
}