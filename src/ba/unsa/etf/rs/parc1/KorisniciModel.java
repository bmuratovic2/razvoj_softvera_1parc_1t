package ba.unsa.etf.rs.parc1;

import javafx.beans.property.SimpleObjectProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class KorisniciModel {
    private ObservableList<Korisnik> korisnici = FXCollections.observableArrayList();
    private SimpleObjectProperty<Korisnik> trenutniKorisnik = new SimpleObjectProperty<>();

    public KorisniciModel() {
    }

    public void napuni() {
        korisnici.add(new Korisnik("Vedran", "Ljubović", "vljubovic@etf.unsa.ba", "vljubovic", "test", "test"));
        korisnici.add(new Korisnik("Amra", "Delić", "adelic@etf.unsa.ba", "adelic", "test", "test"));
        korisnici.add(new Korisnik("Tarik", "Sijerčić", "tsijercic1@etf.unsa.ba", "tsijercic", "test", "test"));
        korisnici.add(new Korisnik("Rijad", "Fejzić", "rfejzic1@etf.unsa.ba", "rfejzic", "test", "test"));
        trenutniKorisnik.set(null);
    }
    void obrisi (){
        int index = korisnici.indexOf(trenutniKorisnik.get());
        if(korisnici.size()==0 || trenutniKorisnik.get()==null){
            return;
        }
        korisnici.remove(index);
        if(korisnici.size()!=0){
            trenutniKorisnik.set(korisnici.get(0));
        }else trenutniKorisnik.set(null);
    }

    public ObservableList<Korisnik> getKorisnici() {
        return korisnici;
    }

    public void setKorisnici(ObservableList<Korisnik> korisnici) {
        this.korisnici = korisnici;
    }

    public Korisnik getTrenutniKorisnik() {
        return trenutniKorisnik.get();
    }

    public SimpleObjectProperty<Korisnik> trenutniKorisnikProperty() {
        return trenutniKorisnik;
    }

    public void setTrenutniKorisnik(Korisnik trenutniKorisnik) {
        this.trenutniKorisnik.set(trenutniKorisnik);
    }

    public void setTrenutniKorisnik(int i) {
        this.trenutniKorisnik.set(korisnici.get(i));
    }


}
