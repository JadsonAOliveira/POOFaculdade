package br.edu.ifs.academico;
import java.util.ArrayList;
import java.util.Scanner;

public class Aplicativo {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);
        ArrayList<Aluno> alunos = new ArrayList<Aluno>();
        ArrayList<Professor> professores = new ArrayList<Professor>();
        ArrayList<Psicologo> psicologos = new ArrayList<Psicologo>();
        ArrayList<Tecnico> tecnicos = new ArrayList<Tecnico>();
        ArrayList<Inspetor> inspetores = new ArrayList<Inspetor>();
        ArrayList<Avaliador> avaliadores = new ArrayList<Avaliador>();
        ArrayList<AlunoAssistido> alunosAssistidos = new ArrayList<AlunoAssistido>();

        String nome, dataNascimento, localNascimento;
        char sexo;
        long cpf;

        Menu menu = new Menu();
        System.out.println(menu.getMenu());

        int opcao = leitura.nextInt();

        while (opcao != 0) {

            switch (opcao) {
                case 1:
                    System.out.println("Cadastrar Aluno");
                    System.out.println("CPF");
                    cpf = leitura.nextLong(); 
                    Aluno aluno = new Aluno(cpf);                                                        
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
                    System.out.println("Notas");
                    double nota1 = leitura.nextInt();
                    aluno.setNota1(nota1);
                    double nota2 = leitura.nextInt();
                    aluno.setNota2(nota2);
                    double nota3 = leitura.nextInt();
                    aluno.setNota3(nota3);
                    
                    alunos.add(aluno);                  
                    break;
                case 2:
                    System.out.println("Cadastrar Professor");
                    System.out.println("CPF");
                    cpf = leitura.nextLong();
                    Professor professor = new Professor(cpf);
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

                    professores.add(professor); 
                    break;
                case 3:
                    System.out.println("Cadastrar Psicologo");
                    System.out.println("CPF");
                    cpf = leitura.nextLong();
                    Psicologo psicologo = new Psicologo(cpf);
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

                    psicologos.add(psicologo); 
                    break;
                case 4:
                    System.out.println("Cadastrar Tecnico");
                    System.out.println("CPF");
                    cpf = leitura.nextLong();
                    Tecnico tecnico = new Tecnico(cpf);
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

                    tecnicos.add(tecnico); 
                    break;
                case 5:
                	System.out.println("Cadastrar Inspetor");
                	System.out.println("CPF");
                    cpf = leitura.nextLong();
                	Inspetor inspetor = new Inspetor(cpf);
                	System.out.println("Nome");
                	nome = leitura.next();
                	inspetor.setNome(nome);
                	System.out.println("Sexo");
                	sexo = leitura.next().charAt(0);
                	inspetor.setSexo(sexo);
                	System.out.println("Data de Nascimento");
                	dataNascimento = leitura.next();
                	inspetor.setDataNascimento(dataNascimento);
                	System.out.println("Local de Nascimento");
                	localNascimento = leitura.next();
                	inspetor.setLocalNascimento(localNascimento);
                	System.out.println("Cidade de atuacao");
                	String cidade = leitura.next();
                	inspetor.setCidade(cidade);
                	System.out.println("Nivel");
                	int nivel = leitura.nextInt();
                	inspetor.setNivel(nivel);
                	
                	inspetores.add(inspetor);
                	break;
                case 6:
                	System.out.println("Cadastrar Avaliador");
                	System.out.println("CPF");
                    cpf = leitura.nextLong();
                	Avaliador avaliador = new Avaliador(cpf);
                	System.out.println("Nome");
                	nome = leitura.next();
                	avaliador.setNome(nome);
                	System.out.println("Sexo");
                	sexo = leitura.next().charAt(0);
                	avaliador.setSexo(sexo);
                	System.out.println("Data de Nascimento");
                	dataNascimento = leitura.next();
                	avaliador.setDataNascimento(dataNascimento);               	
                	System.out.println("Local de Nascimento");
                	localNascimento = leitura.next();
                	avaliador.setLocalNascimento(localNascimento);
                	System.out.println("Quantidade de bancas");
                	int qtd_bancas = leitura.nextInt();
                	avaliador.setQtd_bancas(qtd_bancas);
                	System.out.println("Area de atuacao");
                	String area_atuacao = leitura.next();
                	avaliador.setArea_atuacao(area_atuacao);
                	
                	avaliadores.add(avaliador);
                	break;
                case 7:
                	System.out.println("Cadastrar Aluno Assistido");
                	System.out.println("CPF");
                    cpf = leitura.nextLong();
                	AlunoAssistido alunoAssistido = new AlunoAssistido(cpf);
                	System.out.println("Nome");
                	nome = leitura.next();
                	alunoAssistido.setNome(nome);
                	System.out.println("Sexo");
                	sexo = leitura.next().charAt(0);
                	alunoAssistido.setSexo(sexo);
                	System.out.println("Data de Nascimento");
                	dataNascimento = leitura.next();
                	alunoAssistido.setDataNascimento(dataNascimento);
                	System.out.println("Local de Nascimento");
                	localNascimento = leitura.next();
                	alunoAssistido.setLocalNascimento(localNascimento);
                	System.out.println("Necessidade Particular");
                	String necessidadeParticular = leitura.next();
                	alunoAssistido.setNecessidadeParticular(necessidadeParticular);
                	System.out.println("Bolsa");
                	double bolsa = leitura.nextDouble();
                	alunoAssistido.setBolsa(bolsa);
                	System.out.println("Data Inicio Assistencia");
                	String dataInicioAssistencia = leitura.next();
                	alunoAssistido.setDataInicioAssistencia(dataInicioAssistencia);
                	System.out.println("Data Final Assistencia");
                	String dataFinalAssistencia = leitura.next();
                	alunoAssistido.setDataFimAssistencia(dataFinalAssistencia);
                	System.out.println("Assistente");
                	String assistente = leitura.next();
                	alunoAssistido.setAssistente(assistente);
                	
                	alunosAssistidos.add(alunoAssistido);
                	break;
                	
                case 11:
                    System.out.println("Listar Alunos");
                    System.out.println(alunos.toString());
                    break;
                case 12:
                    System.out.println("Listar Professores");
                    System.out.println(professores.toString());
                    break;
                case 13:
                    System.out.println("Listar Psicologos");
                    System.out.println(psicologos.toString());
                    break;
                case 14:
                    System.out.println("Listar Tecnicos");
                    System.out.println(tecnicos.toString());
                    break;
                case 15:
                	System.out.println("Listar Inspetores");
                	System.out.println(inspetores.toString());
                	break;
                case 16:
                	System.out.println("Listar Avaliadores");
                	System.out.println(avaliadores.toString());
                	break;
                case 17:
                	System.out.println("Listar Alunos Assistidos");
                	System.out.println(alunosAssistidos.toString());
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
