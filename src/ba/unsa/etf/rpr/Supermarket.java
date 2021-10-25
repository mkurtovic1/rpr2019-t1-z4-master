package ba.unsa.etf.rpr;

public class Supermarket {
    Artikl[] artikli=new Artikl[100];
    int n=0;
    public Artikl[] getArtikli(){
        return artikli;
    }
    public int getN(){
        return n;
    }
    public Artikl izbaciArtiklSaKodom(String kod){
        for(int i=0; i<n; i++){
            if(artikli[i].getKod().equals(kod)){
                Artikl b=new Artikl(artikli[i].getNaziv(), artikli[i].getCijena(), artikli[i].getKod());
                for(int j=i; j<n-1; j++)
                    artikli[j]=artikli[j+1];
                n--;
                return b;
            }
        }
        return null;
    }
    public boolean dodajArtikl(Artikl b){
        if(n>1000)
            return false;
        artikli[n+1]=new Artikl (b.getNaziv(), b.getCijena(), b.getKod());
        return true;
    }
}