package br.edu.ifs.academico;
import java.util.Scanner;

public class Aplicativo {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);
        Aluno[] alunos = new Aluno[10];
        Professor[] professores = new Professor[10];
        Psicologo[] psicologos = new Psicologo[10];
        Tecnico[] tecnicos = new Tecnico[10];

        int contAluno = 0, contProfessor = 0, contPsicologo = 0, contTecnico = 0;
        String nome, dataNascimento, localNascimento;
        char sexo;

        Menu menu = new Menu();
        System.out.println(menu.getMenu());

        int opcao = leitura.nextInt();

        while (opcao != 0) {

            switch (opcao) {
                case 1:
                    System.out.println("Cadastrar Aluno");
                    Aluno aluno = new Aluno();
                    System.out.println("Nome");
                    nome = leitura.next();
                    aluno.setNome(nome);
                    System.out.println("Sexo");
                    sexo = leitura.next().charAt(0);
                    aluno.setSexo(sexo);
                    System.out.println("Data de Nascimento");
                    dataNascimento = leitura.next();
                    aluno.setDataNascimento(dataNascimento);
                    System.out.println("Local de Nascimento");
                    localNascimento = leitura.next();
                    aluno.setLocalNascimento(localNascimento);

                    alunos[contAluno] = aluno;
                    contAluno++;
                    break;
                case 2:
                    System.out.println("Cadastrar Professor");
                    Professor professor = new Professor();
                    System.out.println("Nome");
                    nome = leitura.next();
                    professor.setNome(nome);
                    System.out.println("Sexo");
                    sexo = leitura.next().charAt(0);
                    professor.setSexo(sexo);
                    System.out.println("Data de Nascimento");
                    dataNascimento = leitura.next();
                    professor.setDataNascimento(dataNascimento);
                    System.out.println("Local de Nascimento");
                    localNascimento = leitura.next();
                    professor.setLocalNascimento(localNascimento);
                    System.out.println("Formacao");
                    String formacao = leitura.next();
                    professor.setFormacao(formacao);

                    professores[contProfessor] = professor;
                    contProfessor++;
                    break;
                case 3:
                    System.out.println("Cadastrar Psicologo");
                    Psicologo psicologo = new Psicologo();
                    System.out.println("Nome");
                    nome = leitura.next();
                    psicologo.setNome(nome);
                    System.out.println("Sexo");
                    sexo = leitura.next().charAt(0);
                    psicologo.setSexo(sexo);
                    System.out.println("Data de Nascimento");
                    dataNascimento = leitura.next();
                    psicologo.setDataNascimento(dataNascimento);
                    System.out.println("Local de Nascimento");
                    localNascimento = leitura.next();
                    psicologo.setLocalNascimento(localNascimento);
                    System.out.println("Carga Horaria");
                    int carga_horaria = leitura.nextInt();
                    psicologo.setCarga_horaria(carga_horaria);
                    System.out.println("CRP");
                    int numero_conselho = leitura.nextInt();
                    psicologo.setNumero_conselho(numero_conselho);

                    psicologos[contPsicologo] = psicologo;
                    contPsicologo++;
                    break;
                case 4:
                    System.out.println("Cadastrar Tecnico");
                    Tecnico tecnico = new Tecnico();
                    System.out.println("Nome");
                    nome = leitura.next();
                    tecnico.setNome(nome);
                    System.out.println("Sexo");
                    sexo = leitura.next().charAt(0);
                    tecnico.setSexo(sexo);
                    System.out.println("Data de Nascimento");
                    dataNascimento = leitura.next();
                    tecnico.setDataNascimento(dataNascimento);
                    System.out.println("Local de Nascimento");
                    localNascimento = leitura.next();
                    tecnico.setLocalNascimento(localNascimento);
                    System.out.println("Cargo");
                    String cargo = leitura.next();
                    tecnico.setCargo(cargo);
                    System.out.println("Empresa");
                    String empresa = leitura.next();
                    tecnico.setEmpresa(empresa);
                    System.out.println("Numero de contrato");
                    int num_contrato = leitura.nextInt();
                    tecnico.setNum_contrato(num_contrato);

                    tecnicos[contTecnico] = tecnico;
                    contTecnico++;
                    break;
                case 11:
                    System.out.println("Listar Alunos");
                    for(int i = 0; i < contAluno; i++){
                        System.out.println(alunos[i].toString());
                    }
                    break;
                case 12:
                    System.out.println("Listar Professores");
                    for(int i = 0; i < contProfessor; i++){
                        System.out.println(professores[i].toString());
                    }
                    break;
                case 13:
                    System.out.println("Listar Psicologos");
                    for(int i = 0; i < contPsicologo; i++){
                        System.out.println(psicologos[i].toString());
                    }
                    break;
                case 14:
                    System.out.println("Listar Tecnicos");
                    for(int i = 0; i < contTecnico; i++){
                        System.out.println(tecnicos[i].toString());
                    }
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Digite uma opcao valida");
            }

            System.out.println(menu.getMenu());
            opcao = leitura.nextInt();
        }
        System.out.println("Programa encerrado");
    }
}
