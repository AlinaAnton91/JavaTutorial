package accessControlPart1;

public class Alex {

    //Exista mai multe tipuri de access control in Java: public, private, protected, default
    //In acelasi pachet, public & protected & default sunt la acelasi nivel indiferent ca e vorba de mostenire sau de un obiect
    //La mosternire in pachete diferite, default nu mai apare. Public si Protected sunt prezente
    //La creare de obiect in pachete diferite, nici Protected nu mai este prezent, ramane doar Public



    public void metodaPublica() {

    }

    private void metodaPrivata() {

    }

    protected void metodaProtected() {

    }

    void metodaDefault() {

    }
}
