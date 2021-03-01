package TEST;

public class personne {
String nom;
String prenom;
public personne(String nom, String prenom) {
	super();
	this.nom = nom;
	this.prenom = prenom;
}

public void setNom(String nom) {
	this.nom = nom;
}
public String getPrenom() {
	return prenom;
}
public void setPrenom(String prenom) {
	this.prenom = prenom;
}
@Override
public String toString() {
	return "personne [nom=" + nom + ", prenom=" + prenom + "]";
}

}
