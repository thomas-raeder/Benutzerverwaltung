public class Benutzerverwaltung {

    private BinarySearchTree<Benutzerprofil> tree;

    public BinarySearchTree<Benutzerprofil> getTree() {
        return tree;
    }

    public Benutzerverwaltung() {
        tree = new BinarySearchTree<Benutzerprofil>();
    }

    public void nutzerAnlegen(String pName, String pPW){
        Benutzerprofil p = new Benutzerprofil(pName, pPW);
        this.tree.insert(p);
    }

    public void nutzerLoeschen(String name){
        Benutzerprofil p = new Benutzerprofil(name, "");
        tree.remove(p);
    }

    public static void main(String[] args){
        Benutzerverwaltung program = new Benutzerverwaltung();
        program.nutzerAnlegen("Mustafa", "12345678");
        program.nutzerAnlegen("Suhana", "123456");
        program.nutzerAnlegen("Rouven", "password");
        program.nutzerAnlegen("Hendrik", "password");
        program.nutzerAnlegen("Levin", "password");
        program.nutzerAnlegen("Ronja", "password");
        program.nutzerAnlegen("Henning", "password");
        program.nutzerAnlegen("Benjamin", "password");
        program.nutzerAnlegen("Arne", "password");
        new SuchBaumZeichner(800,600,program.getTree());
        program.nutzerLoeschen("Hendrik");
        new SuchBaumZeichner(800,600,program.getTree());
    }
}
