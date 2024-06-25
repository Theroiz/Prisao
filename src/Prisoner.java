public class Prisoner {
    public String nome;
    public double altura;
    public int sentenca;
    public Prisoner(String nome,double altura,int setenca)
    {
        System.out.println("Construtor");
        this.nome = nome;
        this.altura = altura;
        this.sentenca = setenca;
    }
    
    public static void pensamento()
    {
        System.out.println("Eu terei minha vingança!");
    }
    public void display(boolean b){
        System.out.println("Nome: "+nome);
        System.out.println("Altura: "+altura);
        System.out.println("Setenca: " +sentenca);
    }
}
