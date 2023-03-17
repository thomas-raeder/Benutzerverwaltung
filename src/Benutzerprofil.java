public class Benutzerprofil implements ComparableContent<Benutzerprofil> {

    private String benutzername, passwort;

    public Benutzerprofil(String benutzername, String passwort) {
        this.benutzername = benutzername;
        this.passwort = passwort;
    }

    public String getBenutzername() {
        return benutzername;
    }

    @Override
    public String toString() {
        return benutzername;
    }

    @Override
    public boolean isGreater(Benutzerprofil pContent) {
        return this.benutzername.compareTo(pContent.getBenutzername())>0;
    }

    @Override
    public boolean isEqual(Benutzerprofil pContent) {
        return this.benutzername.compareTo(pContent.getBenutzername())==0;
    }

    @Override
    public boolean isLess(Benutzerprofil pContent) {
        return this.benutzername.compareTo(pContent.getBenutzername())<0;
    }
}
