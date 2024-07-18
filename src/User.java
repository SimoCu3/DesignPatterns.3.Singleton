public class User {
    private String nome;
    private int eta;
    private static User instance;

    //Costruttore
    private User() {
        this.nome = "Riccardo";
        this.eta = 27;
    }

    //Getter - Setter
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getEta() {
        return eta;
    }

    public void setEta(int eta) {
        this.eta = eta;
    }

    // Metodo statico per ottenere istanza
    public static User getInstance() {
        if (instance == null) {
            instance = new User();
        }
        return instance;
    }

    // Metodo per stampare le Info
    public void stampaInfo() {
        System.out.println("\nNome: " + nome + " - Età: " + eta);
    }
}
