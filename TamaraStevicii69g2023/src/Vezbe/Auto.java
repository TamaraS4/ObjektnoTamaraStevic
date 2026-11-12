package Vezbe;

public class Auto {

	private int brzina;
	private String marka;
	private boolean ukljucen;
	
	public int getBrzina () {
		return brzina;
	}
	public String getMarka () {
		return marka;
	}
	public boolean isUkljucen () {
		return ukljucen;
	}
	public void setBrzina(int brzina) {
		this.brzina=brzina;
	}
    public void setMarka (String marka) {
	this.marka= marka;
    }
    public void isUkljucen (boolean ukljucen) {
    	this.ukljucen= ukljucen;
    }
    
    
    
    public void ubrzaj (int brzina) {
    	if (ukljucen) {
    		this.brzina += brzina;
    	}
    	}
    	public void stani() {
    		if (ukljucen) {
    			if (brzina < 50) {
    				System.out.println(" Auto ce se zaustaviti za 4 sekunde ");
    		}
    			else if (brzina <= 100) {
    				System.out.println(" Auto ce se zaustaviti za 8 sekundi ");
    			}
    			else {
    				System.out.println(" Auto ce se zaustaviti za 12 sekundi ");
    			}
    		}
    		}
    	public void oAutu() {
			System.out.println("Marka: " + marka);
			if (ukljucen) {
				System.out.println("Auto je ukljucen.");
			}else {
				System.out.println("Auto je iskljucen. ");
			}
			System.out.println( "Trenutna brzina  :" + brzina);
    		
    	}
    		
    	}
    

