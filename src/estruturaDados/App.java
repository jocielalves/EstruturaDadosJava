package estruturaDados;

import estruturaDados.Vetor.Vetor;

public class App {
    public static void main(String[] args) throws Exception {
        
        Vetor vetor = new Vetor(5);
        try {
            vetor.adiciona("elemento1");
            vetor.adiciona("elemento2");
            vetor.adiciona("elemento3");
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        

    }
}
