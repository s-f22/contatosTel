public class TesteContatos {
  public static void main(String[] args) {

    Contatos c1 = new Contatos();
    Contatos c2 = new Contatos();
    Contatos c3 = new Contatos();

    c1.setNome("Jessica");
    c1.setNroTelefone("(11)91234-1234");

    c2.setNome("Ana");
    c2.setNroTelefone("(11)98765-4321");

    c3.setNome("João");
    c3.setNroTelefone("(11)99999-8888");

    c1.ExibirInfos();
    c2.ExibirInfos();
    c3.ExibirInfos();

  }
}
