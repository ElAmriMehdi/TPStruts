package presentation;

import java.util.ArrayList;
import java.util.List;

import models.banque;

import com.opensymphony.xwork2.ActionSupport;


public class BanqueAction extends ActionSupport {
	
	private List<banque>BanqueList = new ArrayList<banque>();
	
	public BanqueAction(){
		BanqueList.add(new banque("AWB", 10000000.0, "CASA"));
		BanqueList.add(new banque("AWB", 20000000.0, "RABAT"));
		BanqueList.add(new banque("AWB", 30000000.0, "TANGER"));
		BanqueList.add(new banque("AWB", 40000000.0, "MARRAKECH"));
		BanqueList.add(new banque("AWB", 50000000.0, "AGADIR"));
	}
	
	public List<banque> getBanqueList() {
		return BanqueList;
	}

	public void setBanqueList(List<banque> banqueList) {
		BanqueList = banqueList;
	}
	
	public String AjouterBanque(){
		BanqueList.add(new banque("AWB", 50000000.0, "TestAjouterBanque"));
		return "SUCCESS";
	}
	public String AfficherListe(){
		return "SUCCESS";
		
	}

}
