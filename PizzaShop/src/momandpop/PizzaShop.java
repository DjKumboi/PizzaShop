package momandpop;
import java.awt.event.*;
import javax.swing.*;

	public class PizzaShopClass extends JFrame implements ActionListener{

	   private JLabel nameLabel;
	   private JLabel phoneLabel;
	   private JLabel addressLabel;
	   private JLabel landmarkLabel;
	   private JLabel paymentModeLabel;
	   private JLabel amountLabel;
	   private JLabel pizzaSizesLebel;
	   private JLabel pizzaToppingsLabel;
	   private JLabel crustOptionsLabel;
	   private JLabel beveragesLabel;  
	      
	   private JTextField nameTextfield;
	   private JTextField phoneTextfield;
	   private JTextField addressTextfield;
	   private JTextField landmarkTextfield;
	   private JTextField amountTextfield;
	  
	   private ButtonGroup paymentModeBG;
	   private JRadioButton cashJRB;
	   private JRadioButton checksJRB;  
	   private JRadioButton creditCardJRB;
	  
	   private ButtonGroup pizzaSizesBG;
	   private JRadioButton smallJRB;
	   private JRadioButton mediumJRB;
	   private JRadioButton largeJRB;
	   private JRadioButton extraLargeJRB;  
	  
	   private JCheckBox pepperoniJCB;
	   private JCheckBox sausageJCB;
	   private JCheckBox onionJCB;
	   private JCheckBox mushroomJCB;
	  
	   private ButtonGroup crustOptionsBG;
	   private JRadioButton handTossedJRB;
	   private JRadioButton thinCrustJRB;
	   private JRadioButton deepDishJRB;
	  
	   private JCheckBox lemonTeaJCB;
	   private JCheckBox orangeJuiceJCB;
	   private JCheckBox dietPepsiJCB;
	   private JCheckBox hotChocolateJCB;
	      
	   private JButton processOrderButton;
	   private JTextArea result;  
	   private JPanel customerPanel;
	  
	   public PizzaShopClass()
	   {
	       nameLabel = new JLabel("Name: ");
	       phoneLabel = new JLabel("Phone: ");
	       addressLabel = new JLabel("Address: ");
	       landmarkLabel = new JLabel("Landmark: ");
	       paymentModeLabel = new JLabel("Payment mode: ");
	       amountLabel = new JLabel("Amount: $");
	       pizzaSizesLebel = new JLabel("Pizza size: ");
	       pizzaToppingsLabel = new JLabel("Pizza toppings: ");
	       crustOptionsLabel = new JLabel("Crust options @ free: ");
	       beveragesLabel = new JLabel("Beverages: ");      
	      
	       nameTextfield = new JTextField(20);
	       phoneTextfield = new JTextField(20);
	       addressTextfield = new JTextField(20);
	       landmarkTextfield = new JTextField(20);
	       amountTextfield = new JTextField(10);
	                      
	       checksJRB = new JRadioButton("Check");
	       creditCardJRB = new JRadioButton("Credit card");
	       cashJRB = new JRadioButton("Cash");
	       smallJRB = new JRadioButton("Small @ $10.99");
	       mediumJRB = new JRadioButton("Medium @ $12.99");
	       largeJRB = new JRadioButton("Large @ $14.99");
	       extraLargeJRB = new JRadioButton("Extra large @ $16.99");
	       handTossedJRB = new JRadioButton("Hand tossed");
	       thinCrustJRB = new JRadioButton("Thin crust");
	       deepDishJRB = new JRadioButton("Deep dish");
	      
	       pepperoniJCB = new JCheckBox("Topping 1 @ $1.00");
	       sausageJCB = new JCheckBox("Topping 2 @ $1.25");
	       onionJCB = new JCheckBox("Topping 3 @ $1.50");
	       mushroomJCB = new JCheckBox("Topping 4 @ $1.75");
	       lemonTeaJCB = new JCheckBox("Topping 5 @ $1.99");
	       orangeJuiceJCB = new JCheckBox("Drink 1 @ $2.99");
	       dietPepsiJCB = new JCheckBox("Drink 2 @ $3.99");
	       hotChocolateJCB = new JCheckBox("Drink 3 @ $4.99");      
	      
	       processOrderButton = new JButton("Process Order");
	       result = new JTextArea(20, 25);
	       result.setEditable(false);
	      
	       paymentModeBG = new ButtonGroup();      
	       paymentModeBG.add(cashJRB);
	       paymentModeBG.add(checksJRB);      
	       paymentModeBG.add(creditCardJRB);
	      
	       pizzaSizesBG = new ButtonGroup();
	       pizzaSizesBG.add(smallJRB);
	       pizzaSizesBG.add(mediumJRB);
	       pizzaSizesBG.add(largeJRB);
	       pizzaSizesBG.add(extraLargeJRB);
	      
	       crustOptionsBG = new ButtonGroup();      
	       crustOptionsBG.add(handTossedJRB);
	       crustOptionsBG.add(thinCrustJRB);      
	       crustOptionsBG.add(deepDishJRB);
	      
	       customerPanel = new JPanel();
	      
	       customerPanel.add(nameLabel);
	       customerPanel.add(nameTextfield);
	      
	       customerPanel.add(phoneLabel);
	       customerPanel.add(phoneTextfield);
	      
	       customerPanel.add(addressLabel);
	       customerPanel.add(addressTextfield);
	      
	       customerPanel.add(landmarkLabel);
	       customerPanel.add(landmarkTextfield);
	      
	       customerPanel.add(pizzaSizesLebel);
	       customerPanel.add(smallJRB);
	       customerPanel.add(mediumJRB);
	       customerPanel.add(largeJRB);
	       customerPanel.add(extraLargeJRB);
	       smallJRB.setSelected(true);
	      
	       customerPanel.add(pizzaToppingsLabel);
	       customerPanel.add(pepperoniJCB);
	       customerPanel.add(sausageJCB);
	       customerPanel.add(onionJCB);
	       customerPanel.add(mushroomJCB);
	      
	       customerPanel.add(crustOptionsLabel);
	       customerPanel.add(handTossedJRB);
	       customerPanel.add(thinCrustJRB);
	       customerPanel.add(deepDishJRB);
	      
	       customerPanel.add(beveragesLabel);
	       customerPanel.add(lemonTeaJCB);
	       customerPanel.add(orangeJuiceJCB);
	       customerPanel.add(dietPepsiJCB);
	       customerPanel.add(hotChocolateJCB);
	      
	       customerPanel.add(paymentModeLabel);
	       customerPanel.add(cashJRB);
	       customerPanel.add(checksJRB);
	       customerPanel.add(creditCardJRB);      
	       customerPanel.add(amountLabel);
	       customerPanel.add(amountTextfield);
	       cashJRB.setSelected(true);
	      
	       customerPanel.add(processOrderButton);
	      
	       customerPanel.add(result);
	       result.setVisible(false);
	      
	       processOrderButton.addActionListener(this);  
	      
	      
	       add(customerPanel);
	              
	       setTitle("Mom and Pop");
	       setSize(330, 800);
	       setVisible(true);
	       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	   }
	   public static void main(String[] args)
	   {
	       new PizzaShopClass();
	   }
}
