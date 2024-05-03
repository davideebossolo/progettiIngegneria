import java.util.ArrayList;
import java.util.List;

// Definizione della classe Storia che gestisce l'albero di scenari
public class Storia {
    static class Node {
        Scenario scenario;
        List<Node> children;

        // Il costruttore prende un oggetto Scenario invece di un valore intero
        public Node(Scenario scenario) {
            this.scenario = scenario;
            this.children = new ArrayList<>();
        }

        // Metodo per aggiungere un figlio al nodo
        public void addChild(Node child) {
            this.children.add(child);
        }
    }

    Node root;

    public Storia() {
        root = null;
    }

    // Metodo per aggiungere nodi all'albero utilizzando oggetti Scenario
    public void addScenario(Scenario scenario, Node parent) {
        if (parent == null) {
            if (root == null) {
                root = new Node(scenario);
            } else {
                // gestione dell'errore o logica specifica se il nodo radice esiste già
            }
        } else {
            Node newNode = new Node(scenario);
            parent.addChild(newNode);
        }
    }

    // Metodo per traversare l'albero e stampare la descrizione di ogni scenario
    public void traverse(Node node) {
        if (node != null) {
            System.out.println(node.scenario.getDescription());
            for (Node child : node.children) {
                traverse(child);
            }
        }
    }
}

// Classe Scenario che definisce le caratteristiche di ciascun scenario

