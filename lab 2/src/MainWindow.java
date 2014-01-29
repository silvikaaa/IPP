
import java.awt.EventQueue;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel; 
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JTextArea;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.List;


public class MainWindow {

		private JFrame frame;
        private JTextField txtUserName;
        private JLabel lblUserName;
        private JLabel lblCheeses; 
        private JLabel lblMeat;
        private JLabel lblVegetables; 
        private JButton btnNext;
        private JButton btnBack;
        private JCheckBox chckbxFeta;
        private JCheckBox chckbxParmesan;
        private JCheckBox chckbxMozarella;
        private JCheckBox chckbxDorBlue;
        private JCheckBox chckbxEdam; 
        private JCheckBox chckbxBrnz;
        private JCheckBox chckbxBacon;
        private JCheckBox chckbxProsciutto;
        private JCheckBox chckbxSalami;
        private JCheckBox chckbxChickenBreast;
        private JCheckBox chckbxHam;
        private JCheckBox chckbxFreshMushrooms;
        private JCheckBox chckbxSmokedMushrooms;
        private JCheckBox chckbxRedOnion;
        private JCheckBox chckbxRucola;
        private JCheckBox chckbxGarlic;
        private JCheckBox chckbxTomatoes;
        private JCheckBox chckbxParsley;
        private JCheckBox chckbxCorn;
        private JCheckBox chckbxMarinatedGogoshars;
        private JCheckBox chckbxChiliPepper;
        private JTextArea txtbxResult;
        private boolean secondPage = false, thirdPage = false;
        private List<String> ingridients = new ArrayList<String>();
        private List<JCheckBox> checkBoxes = new ArrayList<JCheckBox>();
        private List<JLabel> Labels = new ArrayList<JLabel>();
        /**
         * Launch the application.
         */
        public static void main(String[] args) {
                EventQueue.invokeLater(new Runnable() {
                        public void run() {
                                try {
                                        MainWindow window = new MainWindow();
                                        window.frame.setVisible(true);
                                } catch (Exception e) {
                                        e.printStackTrace();
                                }
                        }
                });
        }

        /**
         * Create the application.
         */
        public MainWindow() {
                initialize();
                
        } 

        /**
         * Initialize the contents of the frame.
         */
        private void initialize() {
                frame = new JFrame("Pizza  ADRIANO");
                frame.getContentPane().setBackground( Color.magenta);
                frame.setSize(500, 500);
                
                
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.getContentPane().setLayout(null);

                
                lblUserName = new JLabel("Name:");
                lblUserName.setBounds(154, 160, 122, 15);
                frame.getContentPane().add(lblUserName);
                
                txtUserName = new JTextField();
                txtUserName.setBounds(204, 158, 136, 19);
                frame.getContentPane().add(txtUserName);
                txtUserName.setColumns(10);
                
                btnNext = new JButton(">");
                btnNext.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent arg0) {
                                Program mediator = new Program(txtUserName.getText(), getChoices());
                                if(!secondPage){
                                        showIngredient();
                                        mediator.flush();
                                }
                                else{
                                        if(!thirdPage){
                                                showPrice();
                                                txtbxResult.setText(mediator.getPrice());
                                        }
                                        else{
                                                txtbxResult.setText(txtbxResult.getText() + "\r\n Order's number is: " + String.valueOf(mediator.getRandomNumber()));
                                                btnNext.setEnabled(false);
                                        }
                                                
                                }
                        }
                });
                btnNext.setBounds(235, 397, 70, 25);
                frame.getContentPane().add(btnNext);
                
                btnBack = new JButton("<");
                btnBack.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent arg0) {
                                Program mediator = new Program(lblUserName.getText(), getChoices());
                                if(thirdPage){
                                        thirdPage = false;
                                        showIngredient();
                                        ingridients.clear();
                                        mediator.flush();
                                }
                                else{
                                        secondPage = false;
                                        showInsertName();
                                        ingridients.clear();
                                        mediator.flush();
                                }
                        }
                });
                btnBack.setEnabled(false);
                btnBack.setBounds(145, 397, 65, 25);
                frame.getContentPane().add(btnBack);
                
                lblCheeses = new JLabel("Cheeses:");
                lblCheeses.setBounds(8,8,129,23);
                frame.getContentPane().add(lblCheeses);
          
    
                
                chckbxFeta = new JCheckBox("Feta");
                chckbxFeta.setBounds(100, 8, 129, 23);
                frame.getContentPane().add(chckbxFeta);
                
                chckbxParmesan = new JCheckBox("Parmesan"); 
                chckbxParmesan.setBounds(100, 38, 129, 23);
                frame.getContentPane().add(chckbxParmesan);
                
                chckbxMozarella = new JCheckBox("Mozarella");
                chckbxMozarella.setBounds(100, 68, 129, 23);
                frame.getContentPane().add(chckbxMozarella);
                
                chckbxDorBlue = new JCheckBox("Dor Blue");
                chckbxDorBlue.setBounds(250, 8, 129, 23);
                frame.getContentPane().add(chckbxDorBlue);
                
                chckbxEdam = new JCheckBox("Edam");
                chckbxEdam.setBounds(250, 38, 129, 23);
                frame.getContentPane().add(chckbxEdam);
                
                chckbxBrnz = new JCheckBox("Brinza");
                chckbxBrnz.setBounds(250, 68, 129, 23);
                frame.getContentPane().add(chckbxBrnz);
                
                
                
                
                lblMeat = new JLabel("Meat:");
                lblMeat.setBounds(8,120,129,23);
                frame.getContentPane().add(lblMeat);
          
                
                chckbxBacon = new JCheckBox("Bacon");
                chckbxBacon.setBounds(100, 120, 129, 23);
                frame.getContentPane().add(chckbxBacon);
                
                chckbxProsciutto = new JCheckBox("Prosciutto");
                chckbxProsciutto.setBounds(100, 150, 129, 23);
                frame.getContentPane().add(chckbxProsciutto);
                
                chckbxSalami = new JCheckBox("Salami");
                chckbxSalami.setBounds(100, 180, 129, 23);
                frame.getContentPane().add(chckbxSalami);
                
                chckbxChickenBreast = new JCheckBox("Chicken Breast");
                chckbxChickenBreast.setBounds(250, 120, 131, 23);
                frame.getContentPane().add(chckbxChickenBreast);
                
                chckbxHam = new JCheckBox("Ham");
                chckbxHam.setBounds(250, 150, 129, 23);
                frame.getContentPane().add(chckbxHam);
                
                
                
                
                lblVegetables = new JLabel("Vegetables:");
                lblVegetables.setBounds(8,230,129,23);
                frame.getContentPane().add(lblVegetables);
                 
                chckbxFreshMushrooms = new JCheckBox("Fresh mushrooms");
                chckbxFreshMushrooms.setBounds(100, 230, 129, 23);
                frame.getContentPane().add(chckbxFreshMushrooms);
                
                chckbxSmokedMushrooms = new JCheckBox("Smoked mushrooms");
                chckbxSmokedMushrooms.setBounds(100, 260, 129, 23);
                frame.getContentPane().add(chckbxSmokedMushrooms);
                
                chckbxRedOnion = new JCheckBox("Red onion");
                chckbxRedOnion.setBounds(100, 290, 129, 23);
                frame.getContentPane().add(chckbxRedOnion);
                
                chckbxRucola = new JCheckBox("Rucola");
                chckbxRucola.setBounds(100, 320, 129, 23);
                frame.getContentPane().add(chckbxRucola);
                
                chckbxGarlic = new JCheckBox("Garlic");
                chckbxGarlic.setBounds(100, 350, 129, 23);
                frame.getContentPane().add(chckbxGarlic);
                
                chckbxTomatoes = new JCheckBox("Tomatoes");
                chckbxTomatoes.setBounds(250, 230, 129, 23);
                frame.getContentPane().add(chckbxTomatoes);
                
                chckbxParsley = new JCheckBox("Parsley");
                chckbxParsley.setBounds(250, 260, 129, 23);
                frame.getContentPane().add(chckbxParsley);
                
                chckbxCorn = new JCheckBox("Corn");
                chckbxCorn.setBounds(250, 290, 129, 23);
                frame.getContentPane().add(chckbxCorn);
                
                chckbxMarinatedGogoshars = new JCheckBox("Marinated Gogoshars");
                chckbxMarinatedGogoshars.setBounds(250, 320, 129, 23);
                frame.getContentPane().add(chckbxMarinatedGogoshars);
                
                chckbxChiliPepper = new JCheckBox("Chili pepper");
                chckbxChiliPepper.setBounds(250, 350, 129, 23);
                frame.getContentPane().add(chckbxChiliPepper);
                
                txtbxResult = new JTextArea();
                txtbxResult.setEditable(false);
                txtbxResult.setBounds(88, 186, 315, 95);
                frame.getContentPane().add(txtbxResult);
                
                //############### MORDOR #################
                Labels.add(lblCheeses); 
                Labels.add(lblMeat);
                Labels.add(lblVegetables);
                checkBoxes.add(chckbxFeta);
                checkBoxes.add(chckbxParmesan);
                checkBoxes.add(chckbxMozarella);
                checkBoxes.add(chckbxDorBlue);
                checkBoxes.add(chckbxEdam);
                checkBoxes.add(chckbxBrnz);
                checkBoxes.add(chckbxBacon);
                checkBoxes.add(chckbxProsciutto);
                checkBoxes.add(chckbxSalami);
                checkBoxes.add(chckbxChickenBreast);
                checkBoxes.add(chckbxHam);
                checkBoxes.add(chckbxFreshMushrooms);
                checkBoxes.add(chckbxSmokedMushrooms);
                checkBoxes.add(chckbxRedOnion);
                checkBoxes.add(chckbxRucola);
                checkBoxes.add(chckbxGarlic);
                checkBoxes.add(chckbxTomatoes);
                checkBoxes.add(chckbxParsley);
                checkBoxes.add(chckbxCorn);
                checkBoxes.add(chckbxMarinatedGogoshars);
                checkBoxes.add(chckbxChiliPepper);
                
                //############### DRAGONS ################
                lblCheeses.setVisible(false);
                lblMeat.setVisible(false);
                lblVegetables.setVisible(false);
                chckbxFeta.setVisible(false);
                chckbxParmesan.setVisible(false);
                chckbxMozarella.setVisible(false);
                chckbxDorBlue.setVisible(false);
                chckbxEdam.setVisible(false);
                chckbxBrnz.setVisible(false);
                chckbxBacon.setVisible(false);
                chckbxProsciutto.setVisible(false);
                chckbxSalami.setVisible(false);
                chckbxChickenBreast.setVisible(false);
                chckbxHam.setVisible(false);
                chckbxFreshMushrooms.setVisible(false);
                chckbxSmokedMushrooms.setVisible(false);
                chckbxRedOnion.setVisible(false);
                chckbxTomatoes.setVisible(false);
                chckbxGarlic.setVisible(false);
                chckbxRucola.setVisible(false);
                chckbxMarinatedGogoshars.setVisible(false);
                chckbxCorn.setVisible(false);
                chckbxParsley.setVisible(false);
                chckbxChiliPepper.setVisible(false);
                txtbxResult.setVisible(false);
        }
        
        private void showInsertName(){
                btnNext.setText(">");
                btnNext.setEnabled(true);
                lblUserName.setVisible(true);
                txtUserName.setVisible(true);
                for(JCheckBox checkbx : checkBoxes)
                        checkbx.setVisible(false);
                txtbxResult.setVisible(false);
                btnBack.setEnabled(false);
        }
        
        private void showIngredient(){
                btnNext.setText(">");
                btnNext.setEnabled(true);
                lblUserName.setVisible(false);
                lblCheeses.setVisible(true);
                lblMeat.setVisible(true);
                lblVegetables.setVisible(true);
                txtUserName.setVisible(false);
                for(JCheckBox checkbx : checkBoxes)
                        checkbx.setVisible(true);
                btnBack.setEnabled(true);
                txtbxResult.setVisible(false);
                secondPage = true;
        }
        
        private void showPrice(){ 
                for(JCheckBox checkbx : checkBoxes)
                        checkbx.setVisible(false);
                lblCheeses.setVisible(false);
                lblMeat.setVisible(false);
                lblVegetables.setVisible(false);
                txtbxResult.setVisible(true);
                btnNext.setText("Order");
                thirdPage = true;
        }
        
        private List<String> getChoices(){
                List<String> ingridients = new ArrayList<String>();
                for(JCheckBox checkbx : checkBoxes){
                        if(checkbx.isSelected()){
                                ingridients.add(checkbx.getText());
                        }
                }
                return ingridients;
        }
}