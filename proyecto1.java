//initializing

import javax.swing.*;
import javax.swing.plaf.ColorUIResource;
import java.awt.Component;
import java.awt.Font;
import java.awt.event.*;
import acm.program.*;
public class proyecto1 extends ConsoleProgram implements ItemListener{
    /**
* 
*/
private static final long serialVersionUID = 1L;
private JComboBox combo1;
    private JComboBox combo2;
    public String asesinato(String fecha ,String edad ,String como_murio ,String asesino) {
     
  return ("fecha de asesinato: "+fecha+ "\nFue asesinado a sus " + edad +" a�os " + como_murio + " \nasesino: " + asesino);
    
     
    }
    public proyecto1() {
        
        combo1=new JComboBox();
       
        combo1.addItem("departamentos");
        combo1.addItem("Amazonas");
        combo1.addItem("Antioquia");
        combo1.addItem("Arauca");
        combo1.addItem("Atlantico");
        combo1.addItem("Bogot� D.C");
        combo1.addItem("Bol�var");
        combo1.addItem("Boyaca");
        combo1.addItem("Caldas");
        combo1.addItem("Caquet�");
        combo1.addItem("Cauca");
        combo1.addItem("Cesar");
        combo1.addItem("Choco");
        combo1.addItem("Cordoba");
        combo1.addItem("Cundinamarca");
        combo1.addItem("Guajira");
        combo1.addItem("Guania");
        combo1.addItem("Guaviare");
        combo1.addItem("Huila");
        combo1.addItem("Magdalena");
        combo1.addItem("Meta");
        combo1.addItem("Nari�o");
        combo1.addItem("Norte De Santander");
        combo1.addItem("Putumayo");
        combo1.addItem("Quindio");
        combo1.addItem("Risaralda");
        combo1.addItem("San Andres Y Providencia");
        combo1.addItem("Santander");
        combo1.addItem("Sucre");
        combo1.addItem("Tolima");
        combo1.addItem("Valle Del Cauca");
        combo1.addItem("Vaupes");
        combo1.addItem("Vichada");
        
        
      
        combo1.addItemListener(this);}
          
   
    public void itemStateChanged(ItemEvent e) {
        if (combo1.getSelectedItem()=="Bol�var") {
         UIManager UI= new UIManager();
         UI.put("OptionPane.background", new ColorUIResource(14,242,242));
         UI.put("Panel.background", new ColorUIResource(16,200,242));
         UIManager.put("OptionPane.messageFont", new Font("Berlin Sans FB Demi", Font.BOLD, 17));
           
         //String Leticia = "<html><body><b style= \"font-size:14;color:black;\">Leticia </b></body></body></html>";
        
         Object[] municipiosBolivar = {"Cartagena"};
         
         String s = (String)JOptionPane.showInputDialog(
                             combo1,
                             "Esta es la capital de Bolivar"
                             ,
                             "BOLIVAR",
                             JOptionPane.PLAIN_MESSAGE,
                             null,
                             municipiosBolivar, "");
        



         if (s=="Cartagena") {
        	    Object[] victimas1 = {"Lister Manuel Rodr�guez Leal", "Erick Bola�o Arteaga", "Luis Alfredo Dautt Tarrifa","Douglas Jinete G�mez", "John Jairo Taborda P�rez", "Andres Avelino Ruiz Rendon" ,  " Katherin Julieth Gonz�lez Moreno"," Jonathan Enrique Campo Berr�o",
        	    		" Manuel Aureliano Sierra P�rez"," Sebasti�n Jim�nez Caballero","Ariel Alfonso Herrera Gonz�lez","Mario Castell�n Gonz�lez","Wilfredo V�squez Villar","Ren� Rodr�guez Ar�valo","Eberto Gonz�lez Rodr�guez","Alexander Taborda Navarro","Juan Carlos Hurtado",
        	    		"Eric Jos� Correa Figueroa", "Aroldo Jos� Orozco Atencio","Norbis Jos� Ortiz","Rolando Madrid Marrugo","Karen Mercedes Ortiz Mart�nez","Henry Peri��n Garc�a","Jes�s Mart�nez Mart�nez","Luis Alberto Coneo de La Rosa","Germ�n Antonio Novoa Boh�rquez",
        	    		"John Luis G�mez Ahumada","Harold Alberto Padilla Carrington","Antonio Carlos Contreras","Rafael Antonio R�os Arredondo","John Freddy Recuero Cabarcas","Julio C�sar Coneo Gonz�lez "," Edwin Cort�s Espitia","Francisco Fernando Campo Berrocal ",
        	    		"Roberto Berr�o Barboza "," Jenniferth Rivera Am�n  "," Jos� David �lvarez Ramos  "," Iris Mar�a Torres Valdez "," Xiomara G�mez Villamizar ","Nelson Guerrero ","Jair Henr�quez Hern�ndez", "Yiber Gonz�lez Santana","Adolfo P�rez Pereira",
        	    		"Yainer Guevara Carrillo","Dagoberto Prens De �vila", "Jos� Miguel D�az Caraballo","�ngelo Jos� D�az Bustos",
       	    		 " Jos� Morales Cervantes", " Eli�cer Simancas Morelo","Franklin G�mez D�az","Henry Juli�n D�az Castro","Luis Carlos Jaramillo Morales","David Enrique Puello Canedo","Deiker de Jes�s De �vila Bar�n",
       	    		 "Gustavo Eliecer Fl�rez Mart�nez","Jaider Manuel Padilla Arias","Miguel Pinto Su�rez","�scar Luis Cuesta All�n","Pedro Manuel Ortega Arrieta "," Arnold Mosquera ","Carolina Girado Rodr�guez ",
       	    		 "Jason Pineda Dautt " ,"Wilfrido Mendoza Trillos ","Jaime G�mez Bravo ","Eloy Cuadro Castro ","�dgar Guzm�n Osorio ","Anselmo de Jes�s Colorado Zuluaga ","Juan Ram�rez V�zquez ","Mart�n Mel�ndez Teher�n ",
       	    		 "Alexander Jos� Primo Ar�valo "," Hermes Parra Chamorro "," Andr�s Said Julio Ballestas "," Santiago Enrique Abraham Mart�nez "," Luis Fernando L�pez "," Silfredo Simarra Ca�ate","Danilo Santos Lan Acosta",
       	    		 "Luis Fernando L�pez Ram�rez"," Heriberto Castro Julio"," Kevinson Castro Blanco","  Mart�n Antonio De Voz Mercado","Juan Manuel Roa Arellano","Arnovis Alexander Rivera","Uberto Rodr�guez Orozco","Ever Luis Morales Mej�a"," Luis Antonio Julio Genes","Kelvis Mauricio Mart�nez Caraballo",
       	    		" Maicer Jos� Ortega Torres","Roger Caraballo D�az","Eli�cer Su�rez","Horacio Padilla De Horta","Edwin Gonz�les Torreglosa","Rodrigo Antonio Corrales Ortiz",	"�scar Luis Mel�ndez","Andr�s Sarmiento Hern�ndez",};
        	    String f = (String)JOptionPane.showInputDialog(
        	                        combo1,
        	                        "Estos son los asesinatos registrados en el 2017 en Cartagena:",
        	                        "CARTAGENA",
        	                        JOptionPane.PLAIN_MESSAGE,
        	                        null,
        	                        victimas1,
        	                    "");
        	    if (f=="Lister Manuel Rodr�guez Leal") {//corregimiento de Pontezuela
        	     JOptionPane.showMessageDialog(combo1,
        	          asesinato("01/01/2017","39","por herida con arma blanca"," Se desconoce "),
        	          "Lister Manuel Rodr�guez Leal",
        	          JOptionPane.PLAIN_MESSAGE);}
        	    //http://www.eluniversal.com.co/sucesos/violento-inicio-de-ano-en-pontezuela-una-rina-deja-un-muerto-y-dos-heridos-243578

        	    if(f=="Erick Bola�o Arteaga"){//La esperanza
        	     JOptionPane.showMessageDialog(combo1,
        	          asesinato("01/02/17","?","por impacto de bala en la espalda y abdomen"," Se desconoce"),
        	          "Erick Bola�o Arteaga",
        	          //http://www.eluniversal.com.co/sucesos/fiesta-termina-en-rina-y-en-homicidio-en-la-esperanza-243635

        	          JOptionPane.PLAIN_MESSAGE);}
        	    if(f=="Luis Alfredo Dautt Tarrifa"){//Los comuneros
        	        JOptionPane.showMessageDialog(combo1,
        	             asesinato("02/12/17","20","por balazo en el costado derecho","'El goyo' "),
        	             "Luis Alfredo Dautt Tarrifa",
        	             JOptionPane.PLAIN_MESSAGE);}
        	    //http://m.eluniversal.com.co/sucesos/rina-deja-un-muerto-en-el-barrio-los-comuneros-243633

        	   if(f=="Douglas Jinete G�mez") {//barrio Escall�n Villa.
        	   JOptionPane.showMessageDialog(combo1,
        	   asesinato("01/13/2017","22","por ataque a cuchilladas","Se desconoce"),
        	   "Douglas Jinete G�mez",
        	   JOptionPane.PLAIN_MESSAGE);}
        	   //http://www.eluniversal.com.co/sucesos/muere-sparring-que-habia-sido-acuchillado-244332


        	    if(f==" John Jairo Taborda P�rez ") {//Barrio la Mar�a
        	   JOptionPane.showMessageDialog(combo1,
        	   asesinato("01/16/2017","34","por disparos"," Jos� Javier de Hoyos Atencio &  Orlando Alvarado P�rez"),
        	   " John Jairo Taborda P�rez ",
        	   JOptionPane.PLAIN_MESSAGE);}
        	//http://www.eluniversal.com.co/salud/capturan-dos-hombres-por-crimen-en-el-barrio-la-maria-244775 
        	    if(f==" Andres Avelino Ruiz Rendon") {//  Mercado de Bazurto.
        	   JOptionPane.showMessageDialog(combo1,
        	   asesinato("01/18/2017","?","por impactos de bala"," Se desconoce"),
        	   " Andres Avelino Ruiz Rendon ",
        	   JOptionPane.PLAIN_MESSAGE);}
        	// http://diariolalibertad.com/sitio/2017/01/18/hombre-asesinado-en-bazurto-estuvo-capturado-por-trafico-de-droga/
        	    if(f==" Katherin Julieth Gonz�lez Moreno") {//  San Fernando.
        	   JOptionPane.showMessageDialog(combo1,
        	   asesinato("01/18/2017","17","por herida en el t�rax con arma blanca"," Jes�s Manuel Rinc�n Santander"),
        	   " Katherin Julieth Gonz�lez Moreno",
        	   JOptionPane.PLAIN_MESSAGE);}
        	// http://www.eluniversal.com.co/sucesos/hombre-asesina-adolescente-de-17-anos-y-se-suicida-en-san-fernando-244753
        	    if(f==" Jonathan Enrique Campo Berr�o") {//  El bosque
        	   JOptionPane.showMessageDialog(combo1,
        	   asesinato("01/18/2017","33","por cinco heridas ocasionadas con arma de fuego: dos en el ment�n, uno en el pecho, otro en el cuello y uno m�s en la clav�cula."," Se desconoce"),
        	   " Jonathan Enrique Campo Berr�o",
        	   JOptionPane.PLAIN_MESSAGE);}
        	// https://www.elheraldo.co/judicial/identifican-cadaver-hallado-en-el-bosque-320615
        	    if(f==" Manuel Aureliano Sierra P�rez") {//  Barrio amberes
        	    	   JOptionPane.showMessageDialog(combo1,
        	    	   asesinato("01/23/2017","42","por varias disparos de arma de fuego."," Se desconoce"),
        	    	   " Manuel Aureliano Sierra P�rez",
        	    	   JOptionPane.PLAIN_MESSAGE);}
        	    //http://www.eluniversal.com.co/sucesos/asesinan-hombre-bordo-de-un-taxi-en-el-barrio-amberes-245059
        	    if(f==" Sebasti�n Jim�nez Caballero") {// Pasacaballos
        	 	   JOptionPane.showMessageDialog(combo1,
        	 	   asesinato("01/27/2017","59","por balazo en la cabeza."," Se desconoce"),
        	 	   " Sebasti�n Jim�nez Caballero",
        	 	   JOptionPane.PLAIN_MESSAGE);}
        	    //http://www.eluniversal.com.co/sucesos/balas-muertos-heridos-y-capturados-una-manana-para-olvidar-245345
        	    if(f =="Ariel Alfonso Herrera Gonz�lez"){//urbanizaci�n La Princesa
        	    	JOptionPane.showMessageDialog(combo1,
        	    			asesinato("01/27/2017","?","por cruce de balas con la policia","Policia(desconocido)"),
        	    			"Ariel Alfonso Herrera Gonz�lez",
        	    			JOptionPane.PLAIN_MESSAGE);}
        	    //http://www.eluniversal.com.co/sucesos/balas-muertos-heridos-y-capturados-una-manana-para-olvidar-245345
        	    if(f =="Mario Castell�n Gonz�lez"){//Barrio La Esperanza
        	    	JOptionPane.showMessageDialog(combo1,
        	    			asesinato("01/29/2017","?","por cuchilladas","Jairo Manuel Herrera Gonz�lez"),
        	    			"Mario Castell�n Gonz�lez",
        	    			JOptionPane.PLAIN_MESSAGE);}
        	    //http://www.eluniversal.com.co/sucesos/la-carcel-alias-el-teta-senalado-de-matar-hombre-en-la-esperanza-245731
        	    if(f =="Wilfredo V�squez Villar"){//corregimiento La Boquilla
        	    	JOptionPane.showMessageDialog(combo1,
        	    			asesinato("02/08/2017","27","por 8 impactos de bala","Jairo Manuel Herrera Gonz�lez"),
        	    			"Wilfredo V�squez Villar",
        	    			JOptionPane.PLAIN_MESSAGE);}
        	    //http://www.eluniversal.com.co/sucesos/investigan-moviles-de-homicidio-de-estudiante-de-contaduria-246305
        	    if(f =="Ren� Rodr�guez Ar�valo"){//corregimiento de Bar�
        	    	JOptionPane.showMessageDialog(combo1,
        	    			asesinato("02/11/2017","22","por varios impactos de bala","Eberto Gonz�lez Rodr�guez"),
        	    			"Ren� Rodr�guez Ar�valo",
        	    			JOptionPane.PLAIN_MESSAGE);}
        	    //http://www.eluniversal.com.co/sucesos/dos-muertos-y-dos-heridos-deja-rina-en-baru-246446
        	    if(f =="Eberto Gonz�lez Rodr�guez"){//corregimiento de Bar�
        	    	JOptionPane.showMessageDialog(combo1,
        	    			asesinato("02/11/2017","40","por machetazos","parientes de Rodr�guez Ar�valo"),
        	    			"Eberto Gonz�lez Rodr�guez",
        	    			JOptionPane.PLAIN_MESSAGE);}
        	    //http://www.eluniversal.com.co/sucesos/dos-muertos-y-dos-heridos-deja-rina-en-baru-246446
        	    if(f =="Alexander Taborda Navarro"){//Olaya Herrera 
        	    	JOptionPane.showMessageDialog(combo1,
        	    			asesinato("02/14/2017","35","por 3 balazos en la cabeza","Alias �el Junior� y �el Yao�."),
        	    			"Alexander Taborda Navarro",
        	    			JOptionPane.PLAIN_MESSAGE);}
        	    //http://www.eluniversal.com.co/sucesos/dos-muertos-y-un-herido-dejan-ataques-bala-en-fredonia-y-olaya-246596
        	    if(f =="Juan Carlos Hurtado"){//sector Playa Blanca
        	    	JOptionPane.showMessageDialog(combo1,
        	    			asesinato("02/14/2017","25","por varios impactos de bala","Se desconoce"),
        	    			"Juan Carlos Hurtado",
        	    			JOptionPane.PLAIN_MESSAGE);}
        	    //http://www.eluniversal.com.co/sucesos/dos-muertos-y-un-herido-dejan-ataques-bala-en-fredonia-y-olaya-246596
        	    if(f =="Eric Jos� Correa Figueroa"){//barrio olaya
        	    	JOptionPane.showMessageDialog(combo1,
        	    			asesinato("02/19/2017","31","por varios impactos de bala","Se desconoce"),
        	    			"Eric Jos� Correa Figueroa",
        	    			JOptionPane.PLAIN_MESSAGE);}
        	    //http://www.eluniversal.com.co/sucesos/asesinan-un-hombre-por-oponerse-un-atraco-246982
        	    if(f =="Aroldo Jos� Orozco Atencio"){//sector Olaya Herrara
        	    	JOptionPane.showMessageDialog(combo1,
        	    			asesinato("02/20/2017","29","por 5 balazos en la espalda","Se desconoce"),
        	    			"Aroldo Jos� Orozco Atencio",
        	    			JOptionPane.PLAIN_MESSAGE);}
        	    //http://www.eluniversal.com.co/sucesos/tres-muertes-violentas-en-hechos-aislados-246967
        	    if(f =="Norbis Jos� Ortiz"){// barrio La Reina
        	    	JOptionPane.showMessageDialog(combo1,
        	    			asesinato("02/20/2017","23","por 3 balazos ","Policia(se desconoce)"),
        	    			"Norbis Jos� Ortiz",
        	    			JOptionPane.PLAIN_MESSAGE);}
        	    //http://www.eluniversal.com.co/sucesos/tres-muertes-violentas-en-hechos-aislados-246967
        	    if(f =="Rolando Madrid Marrugo"){// barrio Nelson Mandela
        	    	JOptionPane.showMessageDialog(combo1,
        	    			asesinato("02/25/2017","16","por 1 balazo en el abdomen ","Policia(se desconoce)"),
        	    			"Rolando Madrid Marrugo",
        	    			JOptionPane.PLAIN_MESSAGE);}
        	    //http://www.eluniversal.com.co/sucesos/mataron-mi-hijo-le-truncaron-el-sueno-de-ser-un-gran-cantante-247379
        	    if(f =="Karen Mercedes Ortiz Mart�nez"){// barrio Nelson Mandela
        	    	JOptionPane.showMessageDialog(combo1,
        	    			asesinato("02/27/2017","30","por varias cuchilladas en el cuello ","Jorge Luis Pedroza Rebolledo"),
        	    			"Karen Mercedes Ortiz Mart�nez",
        	    			JOptionPane.PLAIN_MESSAGE);}
        	    //http://www.eluniversal.com.co/sucesos/asesina-su-exmujer-e-intenta-suicidarse-247521
        	    if(f =="Henry Peri��n Garc�a"){// barrio Nelson Mandela
        	    	JOptionPane.showMessageDialog(combo1,
        	    			asesinato("02/28/2017","22","por herida en el pecho por destornilador "," �Robin�"),
        	    			"Henry Peri��n Garc�a",
        	    			JOptionPane.PLAIN_MESSAGE);}
        	    //http://www.eluniversal.com.co/sucesos/asesinan-dos-hombres-en-hechos-aislados-247601
        		if(f =="Jes�s Mart�nez Mart�nez"){//  motel Para�so del Conde
        	    	JOptionPane.showMessageDialog(combo1,
        	    			asesinato("03/02/2017","57","por apu�aladas "," Margarita Rocha Castro"),
        	    			"Jes�s Mart�nez Mart�nez",
        	    			JOptionPane.PLAIN_MESSAGE);}
        		//https://www.elheraldo.co/bolivar/mujer-mata-punaladas-su-marido-en-un-motel-de-cartagena-333694
        		if(f =="Luis Alberto Coneo de La Rosa"){// mercado de Bazurto 
        	    	JOptionPane.showMessageDialog(combo1,
        	    			asesinato("03/06/2017","43","por un disparo en la espada "," Se desconoce"),
        	    			"Luis Alberto Coneo de La Rosa",
        	    			JOptionPane.PLAIN_MESSAGE);}
        	    	//http://www.eluniversal.com.co/sucesos/un-muerto-y-un-herido-deja-presunto-ataque-sicarial-247991
        	    if(f =="Luis Mariano Pasos Cuadrado"){//  sector de Paseo Bol�var 
        	        	JOptionPane.showMessageDialog(combo1,
        	        			asesinato("03/06/2017","43","por un disparo "," \"Yesid\""),
        	        			"Luis Mariano Pasos Cuadrado",
        	        			JOptionPane.PLAIN_MESSAGE);	}
        	        	//http://www.eluniversal.com.co/sucesos/asesinan-vigilante-en-paseo-bolivar-247995
        	    if(f =="Germ�n Antonio Novoa Boh�rquez"){//  sector de Paseo Bol�var 
        	    	JOptionPane.showMessageDialog(combo1,
        	    			asesinato("03/08/2017","38","por una cuchillada en el cuello"," Se desconoce"),
        	    			"Germ�n Antonio Novoa Boh�rquez",
        	    			JOptionPane.PLAIN_MESSAGE);	}
        	    //http://www.eluniversal.com.co/sucesos/muere-cuidador-de-finca-tras-ser-acuchillado-frente-su-mujer-248238
        	    if(f =="John Luis G�mez Ahumada"){//  barrio Ceballos 
        	    	JOptionPane.showMessageDialog(combo1,
        	    			asesinato("03/13/2017","18","con armas blancas"," Se desconoce"),
        	    			"John Luis G�mez Ahumada",
        	    			JOptionPane.PLAIN_MESSAGE);	}
        	    //http://www.eluniversal.com.co/sucesos/dos-muertos-deja-rina-de-pandillas-en-ceballos-248438
        	    if(f =="Harold Alberto Padilla Carrington"){//  barrio Ceballos 
        	    	JOptionPane.showMessageDialog(combo1,
        	    			asesinato("03/13/2017","20","con armas blancas"," Se desconoce"),
        	    			"Harold Alberto Padilla Carrington",
        	    			JOptionPane.PLAIN_MESSAGE);	}
        	  //http://www.eluniversal.com.co/sucesos/dos-muertos-deja-rina-de-pandillas-en-ceballos-248438
        	    if(f =="Deimer Var�n Baquero"){//  barrio Ceballos 
        	    	JOptionPane.showMessageDialog(combo1,
        	    			asesinato("03/14/2017","23","por impacto de bala"," Se desconoce"),
        	    			"Deimer Var�n Baquero",
        	    			JOptionPane.PLAIN_MESSAGE);	}
        	    //http://www.eluniversal.com.co/sucesos/investigan-muerte-de-militar-cartagenero-248511
        	    
        	    if(f =="Antonio Carlos Contreras"){//  barrio Ceballos 
        	    	JOptionPane.showMessageDialog(combo1,
        	    			asesinato("03/16/2017","34","por varios disparos"," Se desconoce"),
        	    			"Antonio Carlos Contreras.",
        	    			JOptionPane.PLAIN_MESSAGE);	}
        	    //http://www.eluniversal.com.co/sucesos/asesinan-de-varios-tiros-un-hombre-en-el-campestre-248791
        	    if(f =="Rafael Antonio R�os Arredondo"){//  iglesia el recreo
        	    	JOptionPane.showMessageDialog(combo1,
        	    			asesinato("03/17/2017","55","por impactos de bala en el hombro y espalda"," Se desconoce"),
        	    			"Rafael Antonio R�os Arredondo",
        	    			JOptionPane.PLAIN_MESSAGE);	}
        	    //http://www.eluniversal.com.co/sucesos/trece-horas-violentas-en-cartagena-248852
        	    
        	    if(f =="John Freddy Recuero Cabarcas"){//  mercado de bazurto
        	    	JOptionPane.showMessageDialog(combo1,
        	    			asesinato("03/20/2017","20","por impactos de bala "," Policia(desconocido)"),
        	    			"John Freddy Recuero Cabarcas",
        	    			JOptionPane.PLAIN_MESSAGE);	}
        	    //http://www.eluniversal.com.co/sucesos/operativo-contra-ruido-termino-con-un-muerto-249049
        	    if(f =="Julio C�sar Coneo Gonz�lez "){//  barrio
        	    	JOptionPane.showMessageDialog(combo1,
        	    			asesinato("03/21/2017","43","por impactos de bala "," Se desconoce"),
        	    			"Julio C�sar Coneo Gonz�lez ",
        	    			JOptionPane.PLAIN_MESSAGE);	}
        	   //http://www.eluniversal.com.co/sucesos/otra-muerte-tragica-en-la-familia-coneo-249109
        	    if(f =="Edwin Cort�s Espitia "){//  barrio Olaya Herrera
        	    	JOptionPane.showMessageDialog(combo1,
        	    			asesinato("03/24/2017","34","por impactos de bala "," �el Paleta� "),
        	    			" Edwin Cort�s Espitia",
        	    			JOptionPane.PLAIN_MESSAGE);	}
        	    //http://www.eluniversal.com.co/sucesos/dos-muertos-bala-en-olaya-y-la-candelaria-249295
        	    if(f =="Francisco Fernando Campo Berrocal "){//  la candelaria
        	    	JOptionPane.showMessageDialog(combo1,
        	    			asesinato("03/24/2017","31","por 3 balazos en el pecho y uno en el cuello "," Se desconoce "),
        	    			"Francisco Fernando Campo Berrocal ",
        	    			JOptionPane.PLAIN_MESSAGE);	}
        	    //http://www.eluniversal.com.co/sucesos/dos-muertos-bala-en-olaya-y-la-candelaria-249295
        	    if(f =="Roberto Berr�o Barboza "){//  corregimiento de Tierrabaja
        	    	JOptionPane.showMessageDialog(combo1,
        	    			asesinato("03/27/2017","35","por golpizas y machetazos "," Se desconoce "),
        	    			"Roberto Berr�o Barboza ",
        	    			JOptionPane.PLAIN_MESSAGE);	}
        	    //http://www.eluniversal.com.co/sucesos/cinco-asesinatos-en-quince-horas-249484
        	    if(f ==" Jenniferth Rivera Am�n  "){//   barrio Paseo Bol�var
        	    	JOptionPane.showMessageDialog(combo1,
        	    			asesinato("03/27/2017","26","por 1 balazo en el pecho "," Se desconoce "),
        	    			" Jenniferth Rivera Am�n  ",
        	    			JOptionPane.PLAIN_MESSAGE);	}
        	    //http://www.eluniversal.com.co/sucesos/cinco-asesinatos-en-quince-horas-249484
        	    if(f ==" Jos� David �lvarez Ramos "){//   sector de Villa Estrella
        	    	JOptionPane.showMessageDialog(combo1,
        	    			asesinato("03/27/2017","23","por 1 balazo en la cabeza "," Se desconoce "),
        	    			" Jos� David �lvarez Ramos  ",
        	    			JOptionPane.PLAIN_MESSAGE);	}
        	    //http://www.eluniversal.com.co/sucesos/cinco-asesinatos-en-quince-horas-249484
        	    if(f ==" Iris Mar�a Torres Valdez "){//   sector de Villa Estrella
        	    	JOptionPane.showMessageDialog(combo1,
        	    			asesinato("03/28/2017","27","por cuchillada "," F�lix �lvarez Carmona "),
        	    			" Iris Mar�a Torres Valdez ",
        	    			JOptionPane.PLAIN_MESSAGE);	}
        	    //http://www.eluniversal.com.co/sucesos/mata-su-mujer-e-intenta-suicidarse-249541
        	    if(f =="Nelson Guerrero "){//   sector de Villa Estrella
        	    	JOptionPane.showMessageDialog(combo1,
        	    			asesinato("03/28/2017","27","por cuchillada "," Nelson Yesid Guerrero Romero  "),
        	    			"Nelson Guerrero ",
        	    			JOptionPane.PLAIN_MESSAGE);	}
        	    if(f ==" Xiomara G�mez Villamizar "){//    barrio Chiquinquir�. 
        	    	JOptionPane.showMessageDialog(combo1,
        	    			asesinato("03/29/2017","?","por cuchillada "," Luis Manuel Cancio Mercado "),
        	    			" Xiomara G�mez Villamizar ",
        	    			JOptionPane.PLAIN_MESSAGE);	}
        	    if (f=="Jair Henr�quez Hern�ndez") {// sector El Guarapero
        	        JOptionPane.showMessageDialog(combo1,
        	             asesinato("04/02/2017","16","por cuchilladas"," Se desconoce "),
        	             "Jair Henr�quez Hern�ndez",
        	             JOptionPane.PLAIN_MESSAGE);}
        	    //http://www.eluniversal.com.co/sucesos/otro-fin-de-semana-tragico-249998
        	    if (f=="Yiber Gonz�lez Santana") {// sector El Guarapero
        	        JOptionPane.showMessageDialog(combo1,
        	             asesinato("04/02/2017","24","por disparo en la cabeza"," Se desconoce "),
        	             "Yiber Gonz�lez Santana",
        	             JOptionPane.PLAIN_MESSAGE);}
        	    //http://www.eluniversal.com.co/sucesos/otro-fin-de-semana-tragico-249998
        	    if (f=="Adolfo P�rez Pereira") {// sector La Magdalena de Olaya
        	        JOptionPane.showMessageDialog(combo1,
        	             asesinato("04/02/2017","?","por disparos," ,"Policia(Se desconoce) "),
        	             "Yiber Gonz�lez Santana",
        	             JOptionPane.PLAIN_MESSAGE);}
        	    //http://www.eluniversal.com.co/sucesos/otro-fin-de-semana-tragico-249998
        	    if (f=="Yainer Guevara Carrillo") {// sector Flor del Campo
        	        JOptionPane.showMessageDialog(combo1,
        	             asesinato("04/02/2017","18","por herida en el cuello," ,"Se desconoce "),
        	             "Yainer Guevara Carrillo",
        	             JOptionPane.PLAIN_MESSAGE);}
        	    //http://www.eluniversal.com.co/sucesos/otro-fin-de-semana-tragico-249998
        	    if (f=="Dagoberto Prens De �vila") {// sector Flor del Campo
        	        JOptionPane.showMessageDialog(combo1,
        	             asesinato("04/02/2017","45","por impacto de bala," ,"Se desconoce "),
        	             "Dagoberto Prens De �vila",
        	             JOptionPane.PLAIN_MESSAGE);}
        	    //http://www.eluniversal.com.co/sucesos/otro-fin-de-semana-tragico-249998
        	    if (f=="Jos� Miguel D�az Caraballo") {// Olaya Herrera
        	        JOptionPane.showMessageDialog(combo1,
        	             asesinato("04/04/2017","?","por disparos de pistola," ,"Se desconoce "),
        	             "Jos� Miguel D�az Caraballo",
        	             JOptionPane.PLAIN_MESSAGE);}
        	    //http://www.eluniversal.com.co/sucesos/asesinan-dos-hombres-en-olaya-herrera-y-la-esperanza-250124
        	    if (f=="�ngelo Jos� D�az Bustos") {// barrio La Esperanza
        	        JOptionPane.showMessageDialog(combo1,
        	             asesinato("04/09/2017","22","por disparos en la espalda," ,"Se desconoce "),
        	             "�ngelo Jos� D�az Bustos",
        	             JOptionPane.PLAIN_MESSAGE);}
        	    //http://m.eluniversal.com.co/sucesos/lo-matan-jugando-dados-en-una-esquina-250534
        	    if (f==" Jos� Morales Cervantes") {// clemencia
        	        JOptionPane.showMessageDialog(combo1,
        	             asesinato("04/10/2017","22","por machetazo," ,"Se desconoce "),
        	             " Jos� Morales Cervantes",
        	             JOptionPane.PLAIN_MESSAGE);}
        	    //http://www.eluniversal.com.co/sucesos/de-un-machetazo-en-el-cuello-matan-un-hombre-en-clemencia-250609
        	    if (f==" Eli�cer Simancas Morelo") {// olaya
        	        JOptionPane.showMessageDialog(combo1,
        	             asesinato("04/11/2017","?","por impacto de bala," ,"Se desconoce "),
        	             " Eli�cer Simancas Morelo",
        	             JOptionPane.PLAIN_MESSAGE);}
        	    //http://www.eluniversal.com.co/sucesos/caso-aberrante-de-intolerancia-en-olaya-250769
        	    if (f=="Franklin G�mez D�az") {// olaya
        	        JOptionPane.showMessageDialog(combo1,
        	             asesinato("04/12/2017","34","por balazo en la cabeza," ,"Se desconoce "),
        	             "Franklin G�mez D�az",
        	             JOptionPane.PLAIN_MESSAGE);}
        	    //http://caracol.com.co/emisora/2017/04/13/cartagena/1492048944_978599.html
        	  
        	    if (f=="Henry Juli�n D�az Castro") {// barrio la quinta
        	        JOptionPane.showMessageDialog(combo1,
        	             asesinato("04/24/2017","?","por heridas en el hombro izquierdo, el abdomen y el t�rax." ,"Se desconoce "),
        	             "Henry Juli�n D�az Castro",
        	             JOptionPane.PLAIN_MESSAGE);}
        	    //http://www.eluniversal.com.co/sucesos/acabo-la-buena-racha-dos-asesinatos-en-cartagena-251659

        	    if (f=="Luis Carlos Jaramillo Morales") {// barrio vista hermosa
        	        JOptionPane.showMessageDialog(combo1,
        	             asesinato("04/24/2017","55","por cuchillada en el cuello" ,"Se desconoce "),
        	             "Luis Carlos Jaramillo Morales",
        	             JOptionPane.PLAIN_MESSAGE);}
          	    //http://www.eluniversal.com.co/sucesos/acabo-la-buena-racha-dos-asesinatos-en-cartagena-251659
        	    if (f=="David Enrique Puello Canedo") {// barrio vista hermosa
        	        JOptionPane.showMessageDialog(combo1,
        	             asesinato("04/24/2017","26","por golpes propinados" ,"Se desconoce "),
        	             "David Enrique Puello Canedo",
        	             JOptionPane.PLAIN_MESSAGE);}
        	    
        	    // debido a lo ocurrio en Blas de Lezo, fue homicidio culposo y son 21 el numero de muertos (http://www.eluniversal.com.co/sucesos/sube-la-cifra-17-muertos-en-colapso-de-edificio-en-blas-de-lezo-252030)
        	    if(f==" Deiker de Jes�s De �vila Bar�n"){//
        	    	JOptionPane.showMessageDialog(combo1,
        	    			asesinato("05/01/2017","?","por dos balazos","Se desconoce"),
        	    			"Deiker de Jes�s De �vila Bar�n",
        	    			JOptionPane.PLAIN_MESSAGE);}
        	    //http://www.eluniversal.com.co/sucesos/sicarios-matan-un-joven-en-el-barrio-las-lomas-252129
        	    if(f=="Kevin Var�n P�rez"){//barrio Olaya Herrera
        	    	JOptionPane.showMessageDialog(combo1,
        	    			asesinato("05/01/2017","20","por un balazo en la cabeza","Se desconoce"),
        	    			"Kevin Var�n P�rez",
        	    			JOptionPane.PLAIN_MESSAGE);}
        	    //http://www.eluniversal.com.co/sucesos/fallecio-estudiante-del-sena-baleado-por-sicario-252182
        	    if(f=="Gustavo Eliecer Fl�rez Mart�nez"){//
        	    	JOptionPane.showMessageDialog(combo1,
        	    			asesinato("05/04/2017","40","por dos disparos en la cabeza","Se desconoce"),
        	    			"Gustavo Eliecer Fl�rez Mart�nez",
        	    			JOptionPane.PLAIN_MESSAGE);}
        	    //http://www.eluniversal.com.co/sucesos/asesinan-parrillero-de-una-moto-en-olaya-herrera-252365
        	    if(f=="Jaider Manuel Padilla Arias"){//
        	    	JOptionPane.showMessageDialog(combo1,
        	    			asesinato("05/18/2017","14","por acuchillada en el cuello","Se desconoce"),
        	    			"Jaider Manuel Padilla Arias",
        	    			JOptionPane.PLAIN_MESSAGE);}
        	    //http://www.eluniversal.com.co/sucesos/menor-mata-otro-por-un-balon-253415
        	    if(f=="Kevin Torres C�rdoba "){//
        	    	JOptionPane.showMessageDialog(combo1,
        	    			asesinato("05/22/2017","21","por acuchillada ","Se desconoce"),
        	    			"Kevin Torres C�rdoba ",
        	    			JOptionPane.PLAIN_MESSAGE);}
        	    
        	    if(f=="Marlon Contreras Morales"){//
        	    	JOptionPane.showMessageDialog(combo1,
        	    			asesinato("05/26/2017","33","por 7 disparos ","Se desconoce"),
        	    			"Marlon Contreras Morales ",
        	    			JOptionPane.PLAIN_MESSAGE);}
        	    //http://m.aldia.co/mundo-serio/marlon-lo-citaron-en-un-parque-y-lo-asesinaron-de-siete-balazos
				
        	    if(f=="Miguel Pinto Su�rez"){//
        	    	JOptionPane.showMessageDialog(combo1,
        	    			asesinato("05/28/2017","22","por 2 balazos en el pecho ","'el Enano'"),
        	    			"Miguel Pinto Su�rez",
        	    			JOptionPane.PLAIN_MESSAGE);}
        	    //http://www.eluniversal.com.co/sucesos/matan-dos-hombres-en-turbaco-y-la-boquilla-254149
				
        	    if(f=="�scar Luis Cuesta All�n"){//
        	    	JOptionPane.showMessageDialog(combo1,
        	    			asesinato("05/28/2017","?","por impactos de bala ","Se desconoce"),
        	    			"�scar Luis Cuesta All�n",
        	    			JOptionPane.PLAIN_MESSAGE);}
				//http://www.eluniversal.com.co/sucesos/lios-de-trafico-de-drogas-movil-de-ataque-bala-en-el-campestre-254148
        	   
				 if(f=="Pedro Manuel Ortega Arrieta "){//
        	    	JOptionPane.showMessageDialog(combo1,
        	    			asesinato("05/29/2017","?","por cuchillada en el pecho ","Se desconoce"),
        	    			"Pedro Manuel Ortega Arrieta ",
        	    			JOptionPane.PLAIN_MESSAGE);}
				//http://www.eluniversal.com.co/sucesos/asesinan-un-hombre-de-una-cuchillada-en-el-pecho-254188
				if(f==" Arnold Mosquera "){// sector La Estrella de El Poz�n
        	    	JOptionPane.showMessageDialog(combo1,
        	    			asesinato("05/30/2017","16","por cuchillada en el cuello ","Se desconoce"),
        	    			" Arnold Mosquera ",
        	    			JOptionPane.PLAIN_MESSAGE);}
				//http://www.eluniversal.com.co/sucesos/adolescente-es-asesinado-de-una-cuchillada-en-olaya-herrera-254265
				if(f=="Carolina Girado Rodr�guez "){//  barrio San Isidro
        	    	JOptionPane.showMessageDialog(combo1,
        	    			asesinato("05/30/2017","22","por impacto de bala en el rostro "," �el Gordo Coso� "),
        	    			"Carolina Girado Rodr�guez ",
        	    			JOptionPane.PLAIN_MESSAGE);}
				//http://www.eluniversal.com.co/sucesos/quiero-justicia-por-el-asesinato-de-mi-hija-254212
				if(f=="Jaime G�mez Bravo "){//  barrio San Isidro
        	    	JOptionPane.showMessageDialog(combo1,
        	    			asesinato("06/04/2017","28","por balazos ","Se desconoce "),
        	    			"Jaime G�mez Bravo ",
        	    			JOptionPane.PLAIN_MESSAGE);}
        	   //http://www.eluniversal.com.co/sucesos/lo-matan-bala-en-pasacaballos-254614
				if(f=="Jason Pineda Dautt "){//  Henequen
        	    	JOptionPane.showMessageDialog(combo1,
        	    			asesinato("06/03/2017","28","por balazos ","Se desconoce "),
        	    			"Jason Pineda Dautt ",
        	    			JOptionPane.PLAIN_MESSAGE);}
				//http://www.eluniversal.com.co/sucesos/asesinan-dos-hombres-en-henequen-254601
				//en ese enlace se encuentra un N.N
				if(f=="Wilfrido Mendoza Trillos "){//  
        	    	JOptionPane.showMessageDialog(combo1,
        	    			asesinato("06/06/2017","23","por balazos ","Se desconoce "),
        	    			"Wilfrido Mendoza Trillos ",
        	    			JOptionPane.PLAIN_MESSAGE);}
				
				if(f=="Eloy Cuadro Castro "){//  
        	    	JOptionPane.showMessageDialog(combo1,
        	    			asesinato("06/08/2017","56","por golpes con arma contundente","Se desconoce "),
        	    			"Eloy Cuadro Castro ",
        	    			JOptionPane.PLAIN_MESSAGE);}
				//http://www.eluniversal.com.co/sucesos/lo-mataron-de-una-forma-vil-no-lo-merecia-254956

				 
				
				if(f=="�dgar Guzm�n Osorio "){//  
        	    	JOptionPane.showMessageDialog(combo1,
        	    			asesinato("06/15/2017","?","por impacto de bala en las costillas","Alias El Casco "),
        	    			"�dgar Guzm�n Osorio ",
        	    			JOptionPane.PLAIN_MESSAGE);}
				//http://www.eluniversal.com.co/sucesos/asesinan-pensionado-de-la-policia-en-medio-de-un-atraco-255517
				if(f=="Anselmo de Jes�s Colorado Zuluaga "){//  Fredonia
        	    	JOptionPane.showMessageDialog(combo1,
        	    			asesinato("06/17/2017","?","por impacto de bala en la cabeza","Se desconoce "),
        	    			"Anselmo de Jes�s Colorado Zuluaga ",
        	    			JOptionPane.PLAIN_MESSAGE);}
				//http://lasnoticiascartagena.com/2017/06/17/muere-hombre-fue-baleado-frente-negocio-fredonia/
			
				if(f=="Juan Ram�rez V�zquez "){//  Fredonia
        	    	JOptionPane.showMessageDialog(combo1,
        	    			asesinato("06/18/2017","55","por 3 cuchilladas","Se desconoce "),
        	    			"Juan Ram�rez V�zquez ",
        	    			JOptionPane.PLAIN_MESSAGE);}
				//http://www.eluniversal.com.co/sucesos/asesinan-tres-hombres-en-hechos-aislados-entre-cartagena-y-bolivar-255767
				if(f=="Mart�n Mel�ndez Teher�n "){//  Fredonia
        	    	JOptionPane.showMessageDialog(combo1,
        	    			asesinato("06/18/2017","31","por impacto de bala en la cabeza","Se desconoce "),
        	    			"Mart�n Mel�ndez Teher�n ",
        	    			JOptionPane.PLAIN_MESSAGE);}
				//http://www.eluniversal.com.co/sucesos/asesinan-tres-hombres-en-hechos-aislados-entre-cartagena-y-bolivar-255767
				if(f=="Alexander Jos� Primo Ar�valo "){//  Piedra de Bolivar
        	    	JOptionPane.showMessageDialog(combo1,
        	    			asesinato("06/19/2017","38","por acuchilladas","'El Mois�s'"),
        	    			"Alexander Jos� Primo Ar�valo ",
        	    			JOptionPane.PLAIN_MESSAGE);}
				//http://www.eluniversal.com.co/sucesos/tres-hombres-fueron-asesinados-en-la-madrugada-de-este-lunes-festivo-255827
				if(f==" Hermes Parra Chamorro"){//  Barrio el espinal
        	    	JOptionPane.showMessageDialog(combo1,
        	    			asesinato("06/19/2017","47","por acuchilladas","Se desconoce "),
        	    			" Hermes Parra Chamorro ",
        	    			JOptionPane.PLAIN_MESSAGE);}
				//http://www.eluniversal.com.co/sucesos/tres-hombres-fueron-asesinados-en-la-madrugada-de-este-lunes-festivo-255827
				if(f==" Andr�s Said Julio Ballestas"){//  Barrio el espinal
        	    	JOptionPane.showMessageDialog(combo1,
        	    			asesinato("06/19/2017","29","por acuchilladas","'El Franchesco' "),
        	    			" Andr�s Said Julio Ballestas ",
        	    			JOptionPane.PLAIN_MESSAGE);}
				//http://www.eluniversal.com.co/sucesos/tres-hombres-fueron-asesinados-en-la-madrugada-de-este-lunes-festivo-255827
				if(f==" Santiago Enrique Abraham Mart�nez"){//  Piedra de bolivar
        	    	JOptionPane.showMessageDialog(combo1,
        	    			asesinato("06/19/2017","?","por intercambio de disparos","Policia(Se desconoce) "),
        	    			" Santiago Enrique Abraham Mart�nez ",
        	    			JOptionPane.PLAIN_MESSAGE);}
				//http://caracol.com.co/emisora/2017/06/20/cartagena/1497913205_660484.html
				 
				 if(f==" Luis Fernando L�pez"){//  
	        	    	JOptionPane.showMessageDialog(combo1,
	        	    			asesinato("06/25/2017","?","por intercambio de disparos","Se desconoce "),
	        	    			" Luis Fernando L�pez ",
	        	    			JOptionPane.PLAIN_MESSAGE);}
				 //http://lasnoticiascartagena.com/2017/06/25/muere-hombre-herido-bala-rina-bayunca/
				 
				 if(f==" Silfredo Simarra Ca�ate"){//  
	        	    	JOptionPane.showMessageDialog(combo1,
	        	    			asesinato("06/26/2017","50","por balazo en el pecho","Se desconoce "),
	        	    			" Silfredo Simarra Ca�ate",
	        	    			JOptionPane.PLAIN_MESSAGE);}
				 //http://www.eluniversal.com.co/sucesos/matan-balazos-tres-hombres-256352
				
				 if(f=="Danilo Santos Lan Acosta"){//  
	        	    	JOptionPane.showMessageDialog(combo1,
	        	    			asesinato("06/26/2017","18","por varios balazos","�El Tabl�o� "),
	        	    			"Danilo Santos Lan Acosta",
	        	    			JOptionPane.PLAIN_MESSAGE);}
				//http://www.eluniversal.com.co/sucesos/matan-balazos-tres-hombres-256352
				 if(f=="Luis Fernando L�pez Ram�rez"){//  
	        	    	JOptionPane.showMessageDialog(combo1,
	        	    			asesinato("06/26/2017","24","por balazo en el pecho","'El escamoso' "),
	        	    			"Luis Fernando L�pez Ram�rez",
	        	    			JOptionPane.PLAIN_MESSAGE);}
				////http://www.eluniversal.com.co/sucesos/matan-balazos-tres-hombres-256352
				
				 if(f==" Gustavo Castro C�rdenas"){//  
	        	    	JOptionPane.showMessageDialog(combo1,
	        	    			asesinato("06/28/2017","33","por 4 balas","Edwin Enrique Fl�rez "),
	        	    			" Gustavo Castro C�rdenas",
	        	    			JOptionPane.PLAIN_MESSAGE);}
				 if(f==" Heriberto Castro Julio"){//  
	        	    	JOptionPane.showMessageDialog(combo1,
	        	    			asesinato("07/03/2017","51","por heridas en la espalda y en el abdomen","Se desconoce "),
	        	    			" Heriberto Castro Julio",
	        	    			JOptionPane.PLAIN_MESSAGE);}
        	    //http://www.eluniversal.com.co/sucesos/dos-muertos-dejan-rinas-en-baru-y-olaya-herrera-256837
				 if(f==" Kevinson Castro Blanco"){//  
	        	    	JOptionPane.showMessageDialog(combo1,
	        	    			asesinato("07/03/2017","23","por 3 cuchilladas","Se desconoce "),
	        	    			" Kevinson Castro Blanco",
	        	    			JOptionPane.PLAIN_MESSAGE);}
				
				 if(f==" Mart�n Antonio De Voz Mercado"){//  
	        	    	JOptionPane.showMessageDialog(combo1,
	        	    			asesinato("07/04/2017","28","por un machetazo","Se desconoce "),
	        	    			"  Mart�n Antonio De Voz Mercado",
	        	    			JOptionPane.PLAIN_MESSAGE);}
				 //http://www.eluniversal.com.co/sucesos/tres-puentes-festivos-violentos-por-hechos-de-intolerancia-256895
				 if(f=="Juan Manuel Roa Arellano "){//  
	        	    	JOptionPane.showMessageDialog(combo1,
	        	    			asesinato("07/04/2017","19","por balazo en el pecho","'Xavier' "),
	        	    			"Juan Manuel Roa Arellano",
	        	    			JOptionPane.PLAIN_MESSAGE);}
				 //http://www.eluniversal.com.co/sucesos/tres-puentes-festivos-violentos-por-hechos-de-intolerancia-256895
				 if(f=="Arnovis Alexander Rivera "){//  
	        	    	JOptionPane.showMessageDialog(combo1,
	        	    			asesinato("07/07/2017","21","por agresi�n con palos y piedras","Se desconoce "),
	        	    			"Arnovis Alexander Rivera",
	        	    			JOptionPane.PLAIN_MESSAGE);}
				 //http://www.eluniversal.com.co/sucesos/cuatro-muertos-en-sucesos-aislados-257199
				 if(f=="Ever Luis Morales Mej�a "){//  
	        	    	JOptionPane.showMessageDialog(combo1,
	        	    			asesinato("07/09/2017","34","por tres balazos","Se desconoce "),
	        	    			"Ever Luis Morales Mej�a",
	        	    			JOptionPane.PLAIN_MESSAGE);}
				 //http://www.eluniversal.com.co/sucesos/investigan-si-hombre-lo-habrian-matado-en-venganza-por-un-atraco-257336
				 if(f=="Leolegar Enrique de Arco Beltr�n "){//  
	        	    	JOptionPane.showMessageDialog(combo1,
	        	    			asesinato("07/10/2017","37","por impacto de bala","Se desconoce "),
	        	    			"Leolegar Enrique de Arco Beltr�n",
	        	    			JOptionPane.PLAIN_MESSAGE);}
				 //http://www.eluniversal.com.co/sucesos/balazos-asesinan-dos-hombres-en-albornoz-y-nelson-mandela-257387
				 if(f==" Luis Antonio Julio Genes"){//  
	        	    	JOptionPane.showMessageDialog(combo1,
	        	    			asesinato("07/10/2017","25","por impacto de bala en la cabeza","Se desconoce "),
	        	    			" Luis Antonio Julio Genes",
	        	    			JOptionPane.PLAIN_MESSAGE);}
				 //http://www.eluniversal.com.co/sucesos/balazos-asesinan-dos-hombres-en-albornoz-y-nelson-mandela-257387
				 if(f=="Uberto Rodr�guez Orozco"){//  
	        	    	JOptionPane.showMessageDialog(combo1,
	        	    			asesinato("07/16/2017","29","por lluvia de balas","Se desconoce "),
	        	    			"Uberto Rodr�guez Orozco",
	        	    			JOptionPane.PLAIN_MESSAGE);}
				 //http://m.eluniversal.com.co/sucesos/no-hay-pistas-de-sicarios-de-el-pozon-258344
				 
				 //http://www.eluniversal.com.co/sucesos/matan-de-un-balazo-presunto-ladron-257592 (caso nn)
				 if(f=="Kelvis Mauricio Mart�nez Caraballo"){//  
	        	    	JOptionPane.showMessageDialog(combo1,
	        	    			asesinato("07/16/2017","25","por tres balazos","Se desconoce "),
	        	    			"Kelvis Mauricio Mart�nez Caraballo",
	        	    			JOptionPane.PLAIN_MESSAGE);}
				 //http://www.eluniversal.com.co/sucesos/siete-asesinados-en-menos-de-19-horas-257889
				
				 if(f==" Maicer Jos� Ortega Torres"){//  
	        	    	JOptionPane.showMessageDialog(combo1,
	        	    			asesinato("07/16/2017","?","por varios impactos de bala","Se desconoce "),
	        	    			" Maicer Jos� Ortega Torres",
	        	    			JOptionPane.PLAIN_MESSAGE);}
				 //http://www.eluniversal.com.co/sucesos/siete-asesinados-en-menos-de-19-horas-257889
				 if(f=="Roger Caraballo D�az "){//  
	        	    	JOptionPane.showMessageDialog(combo1,
	        	    			asesinato("07/16/2017","19","por varios impactos de bala","Se desconoce "),
	        	    			"Roger Caraballo D�az",
	        	    			JOptionPane.PLAIN_MESSAGE);}
				 //http://www.eluniversal.com.co/sucesos/siete-asesinados-en-menos-de-19-horas-257889
				 
				 if(f=="Eli�cer Su�rez "){//  
	        	    	JOptionPane.showMessageDialog(combo1,
	        	    			asesinato("07/17/2017","25","por dos cuchilladas","Se desconoce "),
	        	    			"Eli�cer Su�rez",
	        	    			JOptionPane.PLAIN_MESSAGE);}
				 //http://www.eluniversal.com.co/sucesos/siete-asesinados-en-menos-de-19-horas-257889
				
				 if(f=="Horacio Padilla De Horta "){//  
	        	    	JOptionPane.showMessageDialog(combo1,
	        	    			asesinato("07/17/2017","?","por varios balazos","�el Ruso� "),
	        	    			"Horacio Padilla De Horta",
	        	    			JOptionPane.PLAIN_MESSAGE);}
				 //http://www.eluniversal.com.co/sucesos/siete-asesinados-en-menos-de-19-horas-257889
				 
				 //http://www.eluniversal.com.co/sucesos/tres-muertos-y-dos-heridos-en-las-ultimas-horas-en-el-pozon-y-turbaco-257901(caso nn)

				 
				
				if(f=="Edwin Gonz�les Torreglosa "){//  
        	    	JOptionPane.showMessageDialog(combo1,
        	    			asesinato("07/21/2017","?","por dos impactos de bala","Se desconoce "),
        	    			"Edwin Gonz�les Torreglosa",
        	    			JOptionPane.PLAIN_MESSAGE);}
				//http://www.eluniversal.com.co/sucesos/asesinan-alias-champeta-en-fredonia-258276
				
				if(f=="Rodrigo Antonio Corrales Ortiz "){//  
        	    	JOptionPane.showMessageDialog(combo1,
        	    			asesinato("07/24/2017","45","por bala perdida","Se desconoce "),
        	    			"Rodrigo Antonio Corrales Ortiz",
        	    			JOptionPane.PLAIN_MESSAGE);}
				//http://www.eluniversal.com.co/sucesos/dos-muertos-bala-en-cartagena-y-arjona-258412
				if(f=="�scar Luis Mel�ndez "){//  
        	    	JOptionPane.showMessageDialog(combo1,
        	    			asesinato("07/25/2017","23","por 4 balazos","Se desconoce "),
        	    			"�scar Luis Mel�ndez",
        	    			JOptionPane.PLAIN_MESSAGE);}
				//http://www.eluniversal.com.co/sucesos/lo-matan-en-venganza-por-un-robo-258594
				
				if(f=="Andr�s Sarmiento Hern�ndez "){//  
        	    	JOptionPane.showMessageDialog(combo1,
        	    			asesinato("07/26/2017","21","por 3 balazos en la cabeza","Se desconoce "),
        	    			"Andr�s Sarmiento Hern�ndez",
        	    			JOptionPane.PLAIN_MESSAGE);}
				//http://www.eluniversal.com.co/sucesos/asesinan-un-hombre-en-el-pozon-y-hallan-dos-cadaveres-en-turbaco-258692
				if(f==" Camilo Andr�s Bossio Hurtado "){//  
        	    	JOptionPane.showMessageDialog(combo1,
        	    			asesinato("07/29/2017","20","por un balazo en el costado derecho","Se desconoce "),
        	    			" Camilo Andr�s Bossio Hurtado",
        	    			JOptionPane.PLAIN_MESSAGE);}
				//http://www.eluniversal.com.co/sucesos/lo-matan-en-el-cumpleanos-de-un-hermano-258891




   }
        }
    }
        
   
public void run() {
     add(combo1,NORTH);
      add(new JButton("cerrar"),NORTH);
     addActionListeners();
}
}
