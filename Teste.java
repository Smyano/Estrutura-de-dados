public class Teste {
    
    public static void main(String[] args) {
        VetorObjeto vetor = new VetorObjeto(5);

        Contato c1 = new Contato ("Claudio","(12)37193-4182","claudio@gamil.com \n");
        Contato c2 = new Contato ("Maria","(41)37193-4182","maria@gamil.com\n");
        Contato c3 = new Contato ("Julia","(12)37193-9632","julia@gamil.com");

        try{
            vetor.adiciona(c1);
            vetor.adiciona(c2);
            vetor.adiciona(c3);
        } catch (Exception e) {
            e.printStackTrace();
        } System.out.println("Tamanho vetor" + vetor.tamanho);

        System.out.println(vetor);
    
    }
    
}
