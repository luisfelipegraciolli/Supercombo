package pas.restaurante;

// Padrão Utilizado: Composite


public class Main {
    public static void main(String[] args) {
        // 1. Criação de itens individuais (Folhas)
        Prato hamburguer = new Prato(1, "Hamburguer", 25.0f, "Pão, carne, queijo", 10);
        Prato batataFrita = new Prato(2, "Batata Frita", 15.0f, "Batata, sal", 5);
        Bebida refrigerante = new Bebida(3, "Coca-Cola", 8.0f, 500);
        Bebida suco = new Bebida(4, "Suco de Laranja", 10.0f, 300);

        System.out.println("--- Itens Individuais ---");
        System.out.println(hamburguer.getNome() + ": R$ " + hamburguer.getPreco());

        // 2. Criação de um Combo comum (Composite de itens)
        // Combo 1: Hamburguer + Batata + Refri
        Combo comboClassico = new Combo("Combo Clássico");
        comboClassico.addItem(hamburguer);
        comboClassico.addItem(batataFrita);
        comboClassico.addItem(refrigerante);

        System.out.println("\n--- Combo Simples ---");
        System.out.println(comboClassico.getNome() + " custa: R$ " + comboClassico.getPreco());

        // Combo 2: Apenas Prato Saudável + Suco
        Combo comboSaudavel = new Combo("Combo Fit");
        Prato salada = new Prato(5, "Salada Caesar", 20.0f, "Alface, Frango", 5);
        comboSaudavel.addItem(salada);
        comboSaudavel.addItem(suco);

        // 3. Criação do Mega Combo (Composite de Combos + Itens avulsos)
        Combo megaComboFamilia = new Combo("Mega Combo Família");
        
        // Adiciona os combos criados anteriormente
        megaComboFamilia.addItem(comboClassico);
        megaComboFamilia.addItem(comboSaudavel);
        
        // DEMONSTRAÇÃO DO PROBLEMA RESOLVIDO:
        // Adicionando um item isolado diretamente no MegaCombo
        Prato sobremesaExtra = new Prato(6, "Pudim Gigante", 12.0f, "Leite, ovo", 0);
        megaComboFamilia.addItem(sobremesaExtra);

        System.out.println("\n--- Mega Combo ---");
        System.out.println("Conteúdo do " + megaComboFamilia.getNome() + ":");

        for (int i = 0; i < megaComboFamilia.numItens(); i++) {
            System.out.println(" - " + megaComboFamilia.getItem(i).getNome());
        }

        System.out.println("Preço TOTAL: R$ " + megaComboFamilia.getPreco());
    }
}
