package br.edu.ifs.academico;

public abstract class Menu {

    public static String getMenu(){
        return "****MENU**** \n"
                + "SELECIONE UMA OPÇÃO \n"
                + "01 - Cadastrar Aluno \n"
                + "02 - Cadastrar Professor \n"
                + "03 - Cadastrar Psicólogo \n"
                + "04 - Cadastrar Técnico \n"
                + "05 - Cadastrar Avaliador \n"
                + "06 - Cadastrar Inspetor \n"
                + "\n"
                + "11 - Listar Alunos \n"
                + "12 - Listar Professores \n"
                + "13 - Listar Psicólogos \n"
                + "14 - Listar Técnicos\n"
                + "0 - Sair";

    }
}
