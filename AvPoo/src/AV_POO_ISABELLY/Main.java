package AV_POO_ISABELLY;

public class Main {
    public static void main(String[] args) throws Exception {
    
        Universidade u = new Universidade("UFJF", "Juiz de Fora");

        //ADICIONANDO DEPARTAMENTOS:
        Departamento Eng = new Departamento("Engenharia da Computação", "Lado um", 1);
        Departamento Eng1 = new Departamento("Biomedicina", "Lado dois", 2);
        Departamento Eng2 = new Departamento("Biotecnologia", "Lado três", 3);
        Departamento Eng3 = new Departamento("Engenharia da Software", "Lado quatro", 4);
        Departamento Eng4 = new Departamento("Cibersegurança", "Lado cinco", 5);

        //ADICIONANDO FUNCIONÁRIOS:
        Pessoa p = new Pessoa("Ana", "000.000.000-00");
        Pessoa p1 = new Pessoa("Julia", "111.111.111-11");
        Pessoa p2 = new Pessoa("Maria", "222.222.222-22");
        Pessoa p3 = new Pessoa("Joao", "333.333.333-33");
        Pessoa p4 = new Pessoa("Sakura", "444.444.444-44");
        Pessoa p5 = new Pessoa("Inosuke", "555.555.555-55");
        Pessoa p6 = new Pessoa("Zenitsu", "666.666.666-66");
        Pessoa p7 = new Pessoa("Hori", "777.777.777-77");
        Pessoa p8 = new Pessoa("Beatrice", "888.888.888-88");
        Pessoa p9 = new Pessoa("Mariana", "999.999.999-99");


        //ADICIONANDO DEPARTAMENTOS A UNIVERSIDADE:
        u.addDepartamento(Eng);
        u.addDepartamento(Eng1);
        u.addDepartamento(Eng2);
        u.addDepartamento(Eng3);
        u.addDepartamento(Eng4);

        //ADICIONANDO FUNCIONÁRIOS AOS DEPARTAMENTOS:
        Eng.addFuncionario(p1);
        Eng.addFuncionario(p2);
        Eng1.addFuncionario(p3);
        Eng1.addFuncionario(p4);
        Eng2.addFuncionario(p5);
        Eng2.addFuncionario(p6);
        Eng3.addFuncionario(p7);
        Eng3.addFuncionario(p8);
        Eng4.addFuncionario(p9);
        Eng4.addFuncionario(p);

        //SOBRE A UNIVERSIDADE ( TUDO ):
        u.sobre();

        //TESTANDO FUNÇÕES DE REMOÇÃO:
        u.removerDepartamento(Eng1);
        Eng2.removerFuncionario(p1);

        //VIZUALIZANDO NOVAMENTE SOBRE:
        u.sobre();

    }
}
