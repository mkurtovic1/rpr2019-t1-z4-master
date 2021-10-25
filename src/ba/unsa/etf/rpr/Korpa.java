package ba.unsa.etf.rpr;

public class Korpa {
    Artikl[] niz=new Artikl[50];
    int n=0;
    public boolean dodajArtikl(Artikl a){
        if(n>50)
            return false;
        niz[n++]=new Artikl(a.getNaziv(), a.getCijena(), a.getKod());
        return true;
    }

    public Artikl[] getArtikli() {
        return niz;
    }
    public Artikl izbaciArtiklSaKodom(String kod){
        int i;
        for(i=0; i<n; i++){
            if(niz[i].getKod().equals(kod)){
                Artikl b=new Artikl(niz[i].getNaziv(), niz[i].getCijena(), niz[i].getKod());
                for(int j=i; j<n-1; j++)
                    niz[j]=niz[j+1];
                n--;
                return b;
            }

        }
        return null;
    }
    public int dajUkupnuCijenuArtikala(){
        int cijena=0;
        for(int i=0; i<n; i++)
            cijena=cijena+niz[i].getCijena();
        return cijena;
    }
}