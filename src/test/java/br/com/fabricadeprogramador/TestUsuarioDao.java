package br.com.fabricadeprogramador;

import br.com.fabricadeprogramador.persistencia.entidade.Usuario;
import br.com.fabricadeprogramador.persistencia.jdbc.UsuarioDAO;

public class TestUsuarioDao {
	public static void main(String[] args) {
		testExcluir();
	}

	public static void testCadastrar() {
		// Criando usuário
		Usuario usu = new Usuario();
		usu.setNome("jãozão");
		usu.setLogin("teste");
		usu.setSenha("123");

		// Cadastrando usuário no banco de dados
		UsuarioDAO usuDAO = new UsuarioDAO();
		usuDAO.cadastrar(usu);

		System.out.println("Cadastrado com sucesso!");
	}

	public static void testExcluir() {
		// Criando usuário
		Usuario usu = new Usuario();
		usu.setId(10);

		// Cadastrando usuário no banco de dados
		UsuarioDAO usuDAO = new UsuarioDAO();
		usuDAO.excluir(usu);

		System.out.println("Exluido com sucesso!");
	}

	public static void testAlterar() {
		// Criando usuário
		Usuario usu = new Usuario();
		usu.setId(10);
		usu.setNome("jãozão da silva");
		usu.setLogin("jzaoss");
		usu.setSenha("12345678");

		// Cadastrando usuário no banco de dados
		UsuarioDAO usuDAO = new UsuarioDAO();
		usuDAO.alterar(usu);

		System.out.println("Alterado com sucesso!");
	}
}
