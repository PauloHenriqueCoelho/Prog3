enum NivelAcesso {
    BASICO,
    INTERMEDIARIO,
    ADMIN
}

class Usuario {
    protected String nome;
    protected NivelAcesso nivel;

    public Usuario(String nome, NivelAcesso nivel) {
        this.nome = nome;
        this.nivel = nivel;
    }

    public void verificarPermissao(String recurso) {
        boolean permitido = false;

        if (this.nivel == NivelAcesso.BASICO) {
            if (recurso.equals("CONSULTAR")) {
                permitido = true;
            }
        } else if (this.nivel == NivelAcesso.INTERMEDIARIO) {
            if (recurso.equals("CONSULTAR") || recurso.equals("EDITAR")) {
                permitido = true;
            }
        } else if (this.nivel == NivelAcesso.ADMIN) {
            if (recurso.equals("CONSULTAR") || recurso.equals("EDITAR") || recurso.equals("GERENCIAR_USUARIOS")) {
                permitido = true;
            }
        }

        if (permitido) {
            System.out.println("Acesso LIBERADO para " + this.nome + " (" + this.nivel + ") no recuso: " + recurso);
        } else {
            System.out.println("Acesso NEGADO para " + this.nome + " (" + this.nivel + ") no recurso: " + recurso);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("TESTE DE NIVEL DE ACESO");

        Usuario u1 = new Usuario("Joao", NivelAcesso.BASICO);
        Usuario u2 = new Usuario("Maria", NivelAcesso.INTERMEDIARIO);
        Usuario u3 = new Usuario("Roberto", NivelAcesso.ADMIN);

        System.out.println("\nTestando usario Basico:");
        u1.verificarPermissao("CONSULTAR");
        u1.verificarPermissao("EDITAR");
        u1.verificarPermissao("GERENCIAR_USUARIOS");

        System.out.println("\nTestando usuario Intermedario:");
        u2.verificarPermissao("CONSULTAR");
        u2.verificarPermissao("EDITAR");
        u2.verificarPermissao("GERENCIAR_USUARIOS");

        System.out.println("\nTestando usuario Admin:");
        u3.verificarPermissao("CONSULTAR");
        u3.verificarPermissao("EDITAR");
        u3.verificarPermissao("GERENCIAR_USUARIOS");
    }
}

