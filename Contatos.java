public class Contatos {

  private String Nome;
  private String nroTelefone;

  public void setNome(String nome) {
    Nome = nome;
  }

  public void setNroTelefone(String nroTelefone) {
    this.nroTelefone = nroTelefone;
  }


  public void ExibirInfos() {
    System.out.printf("Nome do contato %s\n", Nome);
    System.out.printf("Nro do contato %s\n", nroTelefone);
  }
  
}