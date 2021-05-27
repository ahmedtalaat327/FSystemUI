import java.awt.Dimension;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

import FSystemFramework.BarLibary.ToolBar;
import FSystemFramework.ButtonLibrary.Button;
import FSystemFramework.ButtonLibrary.FlatButton;
import FSystemFramework.CheckUnitsLibrary.CheckBox;
import FSystemFramework.CheckUnitsLibrary.CheckBox.CustomBooleanCellEditor;
import FSystemFramework.CheckUnitsLibrary.CheckBox.CustomBooleanCellRenderer;
import FSystemFramework.FontLibrary.FontSylePicker;
import FSystemFramework.GridTableVewLibrary.TableView;
import FSystemFramework.LabelViewLibrary.LabelItem;
import FSystemFramework.LabelViewLibrary.LabelTableView;
import FSystemFramework.LabelViewLibrary.LabelView;
import FSystemFramework.LabelViewLibrary.LabelTableView.CustomStringColorfullCellRenderer;
import FSystemFramework.ListedViewLibrary.ListBox;
import FSystemFramework.ListedViewLibrary.ListTableBox;
import FSystemFramework.ListedViewLibrary.ListTableBox.ComboBoxCellEditor;
import FSystemFramework.ListedViewLibrary.ListTableBox.ComboBoxCellRenderer;
import FSystemFramework.ScrollPaneLibrary.ScrollPane;
import FSystemFramework.TextFieldLibrary.TextField;
import FSystemFramework.WindowLibrary.Window;



public class WindowExample {
	/**
     * @param args the command line arguments
     */
     private String styleType = "dark";
    
     private final String arrOfLabeles[] = {"Ahmed","Joe","Nabil","Sam"};
     
     private final String[] columnNames = {"First Name",
             "Last Name",
             "Sport",
             "# of Years",
             "Vegetarian"};
     
     private final Object[][] data = {
    		    {"Kathy", "Smith",
    		     "Snowboarding", new Integer(22), new Boolean(false)},
    		    {"John", "Doe",
    		     "Rowing", new Integer(8), new Boolean(true)},
    		    {"Sue", "Black",
    		     "Knitting", new Integer(12), new Boolean(false)},
    		    {"Jane", "White",
    		     "Speed reading", new Integer(0), new Boolean(true)},
    		    {"Joke", "Brown",
    		     "Pool", new Integer(10), new Boolean(false)},
    		    {"Radi", "Kame",
        		     "Cycl", new Integer(20), new Boolean(false)},
    		    {"Kadi", "Loaw",
            		     "Swim", new Integer(14), new Boolean(true)},
    		    };
   private void loadAllPaint(){ 
	   
	     
			// Register our fonts 
			new FontSylePicker().setAllFontsIn();
		
	   
       //Initial the window with | Tab size , Resize ability , Dialoge state , Parent layer in (dialog case)
       Window windowMainMenu = new Window(26,true,false,null);
       //Set window primary size
       windowMainMenu.setPrimarySize(1200, 500);
       //Set style dark or light
       windowMainMenu.setColor(styleType);
       //Set title
       windowMainMenu.setTitlewindow("Mainwindow Demo Version");
       //Load the children painters
       windowMainMenu.loadChilds();
       
       
       //Initial scrollPane with | Refreshed layer pane (solve paint bug)
       ScrollPane scrollPaneTest = new ScrollPane(windowMainMenu.layers);
       //Set scrollpane location
       scrollPaneTest.setLocation(20, 120);
       //Set Size
       scrollPaneTest.setPrimarySize(270, 350);
       //Set color style
       scrollPaneTest.setColor(styleType);
       //Add elements
       scrollPaneTest.addLabelnfo("First label");
       scrollPaneTest.addLabelnfo("Second label");
       //Add array of elements  
       scrollPaneTest.provideWholeArr(arrOfLabeles);
       windowMainMenu.layers.add(scrollPaneTest.ParentLayerOfScrollPane,3,1);
       
           
       
       
       //Initial the button with |Type native or the blue one , The parent , Refreshed layer pane (solve paint bug)
       Button buttonTest = new Button(false,windowMainMenu.layers);
       //Set button location
       buttonTest.setLocation(320, 120);
       //Set the primary size
       buttonTest.setPrimarySize(120, 27);
       //Set the title
       buttonTest.setTitle("Ok");
       //Set disabled button
       buttonTest.disabledVersion();
       //Make window as a parent to add the button
       windowMainMenu.layers.add(buttonTest.mainButtonLayer,3,1);
       
        buttonTest.buttonBody.addMouseListener(new MouseAdapter() {
                public void mouseClicked(MouseEvent e) {
                    System.out.println(scrollPaneTest.selectedString);
                }});
       
       Button buttonTest1 = new Button(true,windowMainMenu.layers);
       buttonTest1.setLocation(320, 160);
       buttonTest1.setPrimarySize(120, 27);
       buttonTest1.setTitle("Add Label");
       buttonTest1.setColor(styleType);
      
       windowMainMenu.layers.add(buttonTest1.mainButtonLayer,3,1);
       
        
       
       
        TextField textFieldTest = new TextField(true, windowMainMenu.layers);
        textFieldTest.setLocation(200, 60);
        textFieldTest.setPrimarySize(200, 28);
        textFieldTest.setColor(styleType);
        textFieldTest.setTitle("Name of item here!");
        textFieldTest.textFiledBody.setEnabled(false);
        textFieldTest.setToolTip("Type a name to be added ex: Adam",200,28);
        windowMainMenu.layers.add(textFieldTest.textFiledBody,3,1);
        
        
        
        
        
         
          
       LabelView labelTest = new LabelView(1, windowMainMenu.layers);
       labelTest.setLocation(20, 60);
       labelTest.setSize(180, 85);
       labelTest.setColor(styleType);
       labelTest.setSizeFont(14);
       labelTest.setText("Demo UI macOS in JAVA!");
       windowMainMenu.layers.add(labelTest.labelViewBody,3,1);
       
       
       ListBox listBoxTest = new ListBox(windowMainMenu.layers);
       listBoxTest.setLocation(300,220);
       listBoxTest.setPrimarySize(180, 23);
       listBoxTest.setColor(styleType);
       
       listBoxTest.boxListBody.addItem("Ahmed");
       listBoxTest.boxListBody.addItem("Safi");
       listBoxTest.boxListBody.addItem("lamsss");
       listBoxTest.boxListBody.addItem("Jack");
       listBoxTest.boxListBody.addItem("Samr");
       listBoxTest.boxListBody.addItem("Jadd");
       listBoxTest.boxListBody.addItem("Ahmed");
       listBoxTest.boxListBody.addItem("Safi");
       listBoxTest.boxListBody.addItem("lamsss");
       listBoxTest.boxListBody.addItem("Jack");
       listBoxTest.boxListBody.addItem("Samr");
       listBoxTest.boxListBody.addItem("Jadd");
       listBoxTest.boxListBody.addItem("Ahmed");
       listBoxTest.boxListBody.addItem("Safi");
       listBoxTest.boxListBody.addItem("la88888888888888888888888msss");
       listBoxTest.boxListBody.addItem("Jack");
       listBoxTest.boxListBody.addItem("Samr");
       listBoxTest.boxListBody.addItem("Jadd");
       windowMainMenu.layers.add(listBoxTest.boxListBody,3,1);
       
       
       
       buttonTest1.buttonBody.addMouseListener(new MouseAdapter() {
           public void mouseClicked(MouseEvent e) {
                 if(textFieldTest.getTextIn().length()>0){
                scrollPaneTest.addLabelnfo(textFieldTest.getTextIn());
                 }else{
                	  scrollPaneTest.addLabelnfo(listBoxTest.boxListBody.getSelectedItem().toString());
                 }
                 buttonTest.enabledVersion();
                 textFieldTest.textFiledBody.setEnabled(true);
           }});
      
       
       TableView tableViewTest = new TableView(windowMainMenu.layers,columnNames,data);
       tableViewTest.setPreferedSize(600, 300);
       tableViewTest.setLocation(500, 100);
       tableViewTest.setColor(styleType);
       tableViewTest.solveGraphics(windowMainMenu.layers);
       tableViewTest.tableBody.getTableHeader().setReorderingAllowed(false);
       //---------------------------- column choices--------------
       String[] m = new String[] {"Rowing", "Snowboarding", "Knitting", "Speed reading"
 			  ,"Pool","Swim","Soccer","Cycl"};
       tableViewTest.tableBody.getColumnModel().getColumn(2).setCellRenderer(new ListTableBox(110,m,styleType).new ComboBoxCellRenderer());           
       tableViewTest.tableBody.getColumnModel().getColumn(2).setCellEditor(new ListTableBox(110,m,styleType).new ComboBoxCellEditor());
       //---------------------------- column numbers -----------------------
       tableViewTest.tableBody.getColumnModel().getColumn(3).setCellRenderer(new LabelTableView().new CustomStringColorfullCellRenderer());           
       //tableViewTest.tableBody.getColumnModel().getColumn(3).setCellEditor(new LabelTableView().new CustomStringCellEditor());
       //--------------------------- column checkbox --------------------------
       tableViewTest.tableBody.getColumnModel().getColumn(4).setCellRenderer(new CheckBox(styleType).new CustomBooleanCellRenderer());           
       tableViewTest.tableBody.getColumnModel().getColumn(4).setCellEditor(new CheckBox(styleType).new CustomBooleanCellEditor());
       windowMainMenu.layers.add(tableViewTest.scrollPane,3,1);
     
       
       
       
       
     
        Button buttonTest2 = new Button(false,windowMainMenu.layers);
        buttonTest2.setLocation(tableViewTest.scrollPane.getX(), tableViewTest.scrollPane.getY()-50);
        buttonTest2.setPrimarySize(220, 27);
        buttonTest2.setTitle("Open table in new window");
        buttonTest2.setColor(styleType);
        buttonTest2.disabledVersion();
        windowMainMenu.layers.add(buttonTest2.mainButtonLayer,3,1);
         
       
       
        
        
        CheckBox checkBoxTest1 = new CheckBox(null);
        checkBoxTest1.setFontSize(12);
        checkBoxTest1.setLocation(new Point (buttonTest2.mainButtonLayer.getX()+buttonTest2.mainButtonLayer.getWidth()+25,buttonTest2.mainButtonLayer.getY()));
        checkBoxTest1.setSize(new Dimension(150,28));
        checkBoxTest1.setDarkStyle(styleType);
        checkBoxTest1.setTitle("Enable open buttton");
        checkBoxTest1.loadChild( windowMainMenu.layers);
       // checkBoxTest1.checkBody.setEnabled(false);
        checkBoxTest1.checkBody.addItemListener(new ItemListener() {    
             public void itemStateChanged(ItemEvent e) {                 
          if(!buttonTest2.disabledState){
        	  buttonTest2.disabledVersion();
          }else{
        	  buttonTest2.enabledVersion();
          }
             }    
          });  
        
        
        
        windowMainMenu.layers.add(checkBoxTest1.checkBody,3,1);
        
        
        CheckBox checkBoxTest2 = new CheckBox(null);
        checkBoxTest2.setFontSize(12);
        checkBoxTest2.setLocation(new Point (checkBoxTest1.checkBody.getX()+checkBoxTest1.checkBody.getWidth()+25,checkBoxTest1.checkBody.getY()));
        checkBoxTest2.setSize(new Dimension(200,28));
        checkBoxTest2.setDarkStyle(styleType);
        checkBoxTest2.setTitle("Uncheck another checkbox");
        checkBoxTest2.loadChild( windowMainMenu.layers);
        checkBoxTest2.checkBody.setSelected(true);
        checkBoxTest2.checkBody.addItemListener(new ItemListener() {    
             public void itemStateChanged(ItemEvent e) {                 
          if(!checkBoxTest2.checkBody.isSelected()){
        	  checkBoxTest1.checkBody.setSelected(true);
          }else{
        	  checkBoxTest1.checkBody.setSelected(false);
          }
             }    
          });  
        
        
        
        windowMainMenu.layers.add(checkBoxTest2.checkBody,3,1);
        
        
        BufferedImage icon64 = null;
		try {
			icon64 = ImageIO.read(this.getClass().getResource("/images/printer-symb.png"));
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
        FlatButton fbuttonTest = new FlatButton(windowMainMenu.layers,icon64);
        fbuttonTest.setLocation(windowMainMenu.layers.getWidth()-40,windowMainMenu.layers.getHeight()-35);
        fbuttonTest.setPrimarySize(30, 27);
        fbuttonTest.setTitle("");
        
        fbuttonTest.setColor(styleType);
        fbuttonTest.setToolTip("Click here to print", 120, 28);
       // fbuttonTest.disabledVersion();
        windowMainMenu.layers.add(fbuttonTest.mainButtonLayer,3,1);
         
	      
	       ToolBar toolBar = new ToolBar(windowMainMenu.layers, windowMainMenu.header.getHeight(),
	        		new String[]{"File","Edit","Save","About"});
	        toolBar.setColor(styleType);
	        toolBar.setOptionsButtonsValues(new  LabelItem [][] {{new LabelItem(styleType,false,"Open"),new LabelItem(styleType,false,"Cut"),new LabelItem(styleType,false,"Save as"),new LabelItem(styleType,false,"About this app")},
	                                                        	{new LabelItem(styleType,false,"Close"),new LabelItem(styleType,false,"Copy"),new LabelItem(styleType,false,"Reset"),null},
	                                                        	{null,new LabelItem(styleType,false,"Delete"),null,null}
	                                                            });
	     //   toolBar.optionsButtons[1][0].setMenu();
	       // toolBar.optionsButtons[2][1].setMenu();
	        windowMainMenu.layers.add(toolBar.barBody,3,1);
        
        
       windowMainMenu.layers.repaint();
       windowMainMenu.layers.revalidate();
       //Alyaws call with animation before window is visible to register all handlers
       windowMainMenu.withAnimation(windowMainMenu.winBody);
       windowMainMenu.winBody.setVisible(true);
       windowMainMenu.viewShadow(windowMainMenu.winBody);
   
    }
     
    public static void main(String[] args) {
      new WindowExample().loadAllPaint();
    }
    
}
