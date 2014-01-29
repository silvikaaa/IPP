# Laboratory work # 3 #

**The Model View Controller** separates the Calculations and Data from the interface. 


***The Model*** is the class that contains the data and methods needed to use the data. 

***The View*** is the interface.

***The Controller*** coordinates interactions between the Model and View.

I created a simple application which is organized according the Model-View-Controller(MVC) pattern.I tried to make the application as simple as possible.

So there are 3 classes:

-	CalculatorModel.java - performs all the calculations needed and that is it. It doesn’t know the View exists.
-	CalculatorView.java - display what the user sees. It performs no calculations, but instead passes information entered by the user to whomever needs it.
-	CalculatorController.java - this is the only class in the whole application, which knows about the both: model and view, and coordinates interactions between them.

*class CalculatorModel*

	
	public class CalculatorModel {
	
	private int calculationValue;
	
	public void addTwoNumbers(int firstNumber, int secondNumber){
		
		calculationValue = firstNumber + secondNumber;
		
	}
	
	public int getCalculationValue(){
		
		return calculationValue;
		
	}

	
*Calculator Controller*
public class CalculatorController {
	
	private CalculatorView theView;
	private CalculatorModel theModel;
	
	public CalculatorController(CalculatorView theView, CalculatorModel theModel) {
		this.theView = theView;
		this.theModel = theModel;
		
		
		this.theView.addCalculateListener(new CalculateListener());
	}

*CalculatorView*
public class CalculatorView extends JFrame{

	private JTextField firstNumber  = new JTextField(10);
	private JLabel additionLabel = new JLabel("+");
	private JTextField secondNumber = new JTextField(10);
	private JButton calculateButton = new JButton("Calculate");
	private JTextField calcSolution = new JTextField(10);
	
	CalculatorView(){
		
		// Sets up the view and adds the components
		
		JPanel calcPanel = new JPanel();
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(600, 200);
		
		calcPanel.add(firstNumber);
		calcPanel.add(additionLabel);
		calcPanel.add(secondNumber);
		calcPanel.add(calculateButton);
		calcPanel.add(calcSolution);
		
		this.add(calcPanel);
		
		// End of setting up the components --------
		
	}


**Conclusion**

The main advantage of using the MVC pattern is that it makes the code of the user interface more testable.
It makes a very structured approach onto the process of designing the user interface, which in itself contributes to writing clean, testable code, that will be easy to maintain and extend.


