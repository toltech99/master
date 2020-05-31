package temps;
/**
 * Clase Temps de "La Meva Solució" de l'excercici M03 UF4 E03 Temps
 * @author Toni Aguilar
 *
 */
public class Temps {
	private int anys;
	private int mesos;
	private int dies;
	private int hora;
	private int minut;
	private int segon;
	
	public Temps() {
		this.setAnys(0);
		this.setMesos(0);
		this.setDies(0);
		this.setHora(0);
		this.setMinut(0);
		this.setSegon(0);
	}
	
	public Temps(int anys, int mesos, int dies, int hora, int minut, int segon) {
		this.setAnys(anys);
		this.setMesos(mesos);
		this.setDies(dies);
		this.setHora(hora);
		this.setMinut(minut);
		this.setSegon(segon);
	}
	
	public Temps suma (Temps param) {
		return Temps.suma(this, param);
	}
	
	public static Temps suma (Temps param1 , Temps param2) {
		return new Temps (
				param1.getAnys()+param2.getAnys(),
				param1.getMesos()+param2.getMesos(),
				param1.getDies()+param2.getDies(),
				param1.getHora()+param2.getHora(), 
				param1.getMinut()+param2.getMinut(), 
				param1.getSegon()+param2.getSegon());
	}
	
	public Temps inverteix() {
		return new Temps(
				-1*this.getAnys(),
				-1*this.getMesos(),
				-1*this.getDies(),
				-1*this.getHora(), 
				-1*this.getMinut(), 
				-1*this.getSegon());
	}
	
	public Temps resta (Temps param) {
		return Temps.suma(this,param.inverteix());
	}
	
	public static Temps resta (Temps param1 , Temps param2) {
		return Temps.suma (param1, param2.inverteix());
	}

	
	
	public int getHora() {
		return this.hora;
	}	
	public void setHora(int param) {
		int dies = (int)Math.floor(param/24);
		int hores = param%24;
	
		if ((hores < 0) && (this.getDies()>0)) {
			hores += 60;
			dies -= 1;
		}
		if ((hores > 0) && (this.getDies()<0)) {
			hores -= 60;
			dies += 1;
		}
		
		this.setDies(this.dies + dies);
		this.hora = hores;

	}
	
	public int getMinut() {
		return this.minut;
	}
	
	public void setMinut(int param) {
		int hores = (int)Math.floor(param/60);
		int minuts = param%60;
	
		if ((minuts < 0) && (this.getHora()>0)) {
			minuts += 60;
			hores -= 1;
		}
		if ((minuts > 0) && (this.getHora()<0)) {
			minuts -= 60;
			hores += 1;
		}
		
		this.setHora(this.hora + hores);
		this.minut = minuts;
	}
	
	public int getSegon() {
		return segon;
	}
	
	public void setSegon(int param) {
		int minuts = (int)Math.floor(param/60);
		int segons = param%60;

		if ((segons < 0) && (this.getMinut()>0)) {
			segons += 60;
			minuts -=1;
		}
		if ((segons > 0) && (this.getMinut()<0)) {
			segons -= 60;
			minuts +=1;
		}

		this.setMinut(this.minut + minuts);
		this.segon = segons;
	}
	
	
	
	public int getAnys() {
		return anys;
	}

	public void setAnys(int anys) {
		this.anys = anys;
	}

	public int getMesos() {
		return mesos;
	}

	public void setMesos(int param) {
		int anys = (int)Math.floor(param/12);
		int mesos = param%12;
	
		if ((mesos < 0) && (this.getAnys()>0)) {
			mesos += 12;
			anys -= 1;
		}
		if ((mesos > 0) && (this.getAnys()<0)) {
			mesos -= 12;
			anys += 1;
		}
		
		this.setAnys(this.anys + anys);
		this.mesos = mesos;
	}

	public int getDies() {
		return dies;
	}

	public void setDies(int param) {
		int mesos = (int)Math.floor(param/30);
		int dies = param%30;

		if ((dies < 0) && (this.getMesos()>0)) {
			dies += 60;
			mesos -=1;
		}
		if ((dies > 0) && (this.getMesos()<0)) {
			dies -= 60;
			mesos +=1;
		}

		this.setMesos(this.mesos + mesos);
		this.dies = dies;
	}

	public String toString() {
		return 	this.getAnys() + ":" +
				String.format("%02d", this.getMesos())+ ":" + 
				String.format("%02d", this.getDies())+ "-" +
				String.format("%02d",this.getHora()) + ":" + 
				String.format("%02d",this.getMinut()) + ":" + 
				String.format("%02d",this.getSegon());
	}

}
