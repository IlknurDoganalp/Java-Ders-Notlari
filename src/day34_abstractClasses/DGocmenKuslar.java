package day34_abstractClasses;

public class DGocmenKuslar extends BKuslar{
/*
   Sadece ayrimi belirtmek icin Abstract Olmayan Classlara CONCRETE CLASS denir.

   1- Abstract bir class,
    parenti olan Abstract bir classtaki
    abstract methodlari Implement etmek zorunda degildir.
    Isterse imlement edip ,concrete hale getirir , isterse yok sayar/

    2- Abstract bir silsileden sonra gelen ilk concrete class
    parent veya Grand parend(s) olan abstract classlarda
    concrete yapilmayan tum abstract classlari
    IMPLEMENT ETMEK ZORUNDADIR.


 */

    @Override
    public void hareket() {

    }

    @Override
    public void beslenme() {

    }

    @Override
    public void omur() {

    }
}
