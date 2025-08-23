import java.util.ArrayList;;

public class A1 {
    public static void main(String[] args) {
        ArrayList <String> arrayList = new ArrayList<String>();
        
        arrayList.add("Elemento A");
        arrayList.add("Elemento C");

        System.out.println(arrayList);

        arrayList.add(1, "Elemento B");

        System.out.println(arrayList);

        

        arrayList.remove(0);
        // arrayList.remove("Elemento C");

        System.out.println(arrayList);

        System.out.println("Tamanho do vetor " + arrayList.size());



        // System.out.println(arrayList.get(1));
    



        // boolean existe = arrayList.contains("Elemento C");
        // if(existe){
        //     System.out.println("Elementos encontrado no vetor");
        // }else{
        //     System.out.println("Elementos nao existe no vetor");
        // }

        //  int posicao = arrayList.indexOf("Elemento C");
        //  if(posicao > -1){
        //     System.out.println("Elementos encontrado na posição n° " + posicao);
        //  } else {
        //     System.out.println("Elementos não existe no vetor");
        //  }
            
        }
}

