package com.maisprati.projetoincubacao.service;

import com.maisprati.projetoincubacao.model.Pessoa;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PessoaService {

    private final Map<Integer, Pessoa> pessoas = new HashMap<>();
    private Scanner scanner = new Scanner(System.in);

    private void adicionar() throws ParseException {

        System.out.println("Para seu cadastro preciso de algumas informações: ");
        System.out.println("Seu nome: ");
        var nome = this.scanner.nextLine();
        System.out.println("Seu Telefone: ");
        var telefone = this.scanner.nextLine();
        System.out.println("Sua data de nascimento: ");
        var dataNascimento =
                new SimpleDateFormat("dd/MM/yyyy")
                        .parse(scanner.nextLine()).toInstant()
                        .atZone(ZoneId.systemDefault())
                        .toLocalDate();
        System.out.println("Informe a nota final se for aluno(a), Se não informe 0:");
        var notaFinal = Long.parseLong(this.scanner.nextLine());

        var id = pessoas.values().stream()
                .max(Comparator.comparing(Pessoa::getId))
                .map(Pessoa::getId)
                .orElse(null);

        if (null == id) {
            id = 1;
        } else {
            id++;
        }
        if (notaFinal == 0) {
            pessoas.put(id,
                    new Pessoa(
                            id, nome, telefone, LocalDate.now(), null,
                            dataNascimento, null));
            System.out.println("Pessoa adicionada com sucesso!");
        } else {
            pessoas.put(id,
                    new Pessoa(
                            id, nome, telefone, LocalDate.now(), null,
                            dataNascimento, notaFinal));
            System.out.println("Aluno(a) adicionado(a) com sucesso!");
        }

    }

    private void remover() throws ParseException {
        System.out.println("Informe o ID: ");
        var id = Integer.parseInt(this.scanner.nextLine());

        if (!pessoas.containsKey(id)) {
            System.out.println("Pessoa ou aluno não encontrado.");
        } else {
            System.out.println("Pessoa ou aluno removida com sucesso!");
        }
        Pessoa pessoa = pessoas.remove(id);
    }

    private void atualizar() throws ParseException {
        System.out.println("Informe o ID: ");
        var id = Integer.parseInt(this.scanner.nextLine());

        if (!pessoas.containsKey(id)) {
            System.out.println("Pessoa ou aluno não encontrado.");
        } else {
            System.out.println("Para atualizar seu cadastro preciso de algumas informações: ");
            System.out.println("Seu nome: ");
            var nome = this.scanner.nextLine();
            System.out.println("Seu Telefone: ");
            var telefone = this.scanner.nextLine();
            System.out.println("Sua data de nascimento: ");
            var dataNascimento =
                    new SimpleDateFormat("dd/MM/yyyy")
                            .parse(scanner.nextLine()).toInstant()
                            .atZone(ZoneId.systemDefault())
                            .toLocalDate();
            System.out.println("Informe a nota final se for aluno(a), Se não informe 0: ");
            var notaFinal = Long.parseLong(this.scanner.nextLine());

            Pessoa pessoa = pessoas.get(id);
            if (notaFinal == 0) {
                Pessoa novaPessoa = new Pessoa(
                        id, nome, telefone, pessoa.getDataCadastro(), LocalDate.now(),
                        dataNascimento, null);

                pessoas.replace(id, pessoa, novaPessoa);
                System.out.println("Pessoa atualizada com sucesso!");
            }else {
                Pessoa novaPessoa = new Pessoa(
                        id, nome, telefone, pessoa.getDataCadastro(), LocalDate.now(),
                        dataNascimento, notaFinal);

                pessoas.replace(id, pessoa, novaPessoa);
                System.out.println("Aluno(a) atualizado(a) com sucesso");
            }
        }
    }

    private void mostrarTodos() {
        pessoas.values()
                .forEach(pessoa -> System.out.println(pessoa.toString()));
    }

    public void menu() throws Exception {
        String opcao = "";
        while (!"0".equals(opcao)) {
            System.out.println("================== MENU ==================");
            System.out.println("1 - Adcionar pessoa/aluno(a)");
            System.out.println("2 - Listar todas as pessoas/alunos(as)");
            System.out.println("3 - Atualizar dados de uma pessoa/aluno(a)");
            System.out.println("4 - Remover pessoa/aluno(a)");
            System.out.println("0 - Encerrar sistema");
            System.out.println("Escolha uma das opções: ");
            opcao = scanner.nextLine();

            System.out.println("\n");
            switch (opcao) {
                case "1":
                    this.adicionar();
                    break;
                case "2":
                    this.mostrarTodos();
                    break;
                case "3":
                    this.atualizar();
                    break;
                case "4":
                    this.remover();
                    break;
                default:
                    break;
            }
        }
        System.out.println("SISTEMA FINALIZADO COM SUCESSO!");
        this.scanner.close();
    }

}
