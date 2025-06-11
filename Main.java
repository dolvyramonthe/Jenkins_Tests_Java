class Main {
    public static void main(String[] args) {
        try {
            // Vérification du nombre d'arguments
            if (args.length != 3) {
                System.out.println("Usage: java Main <nombre1> <nombre2> <opération>");
                System.exit(1);
            }

            // Validation des nombres
            if (!isNumeric(args[0]) || !isNumeric(args[1])) {
                System.out.println("Les arguments doivent être numériques");
                System.exit(1);
            }

            int a = Integer.parseInt(args[0]);
            int b = Integer.parseInt(args[1]);
            String op = args[2];

            // Exécution des opérations
            switch (op) {
                case "+":
                    System.out.println(a + b);
                    break;
                case "-":
                    System.out.println(a - b);
                    break;
                case "*":
                    System.out.println(a * b);
                    break;
                case "/":
                    if (b == 0) {
                        System.out.println("Erreur: Division par zéro");
                        System.exit(1);
                    }
                    System.out.println(a / b);
                    break;
                default:
                    System.out.println("Opération non supportée. Utilisez +, -, * ou /");
                    System.exit(1);
            }
        } catch (Exception e) {
            System.out.println("Erreur: " + e.getMessage());
            System.exit(1);
        }
    }

    // Méthode pour vérifier si une chaîne est numérique
    private static boolean isNumeric(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
