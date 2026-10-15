package exercicios.e3.q2;

public class Carro {
    final private int velocidadeMinima = 0;
    final private int velocidadeMaxima = 120;
    final private int velocidadeMinimaVirar = 1;
    final private int velocidadeMaximaVirar = 40;
    final private int marchaMinima = 0;
    final private int marchaMaxima = 6;
    
    private Boolean ligado = false;
    private int velocidade;
    private int marcha;
    
    
    public Carro() {
        this.iniciar();
    }
    private void iniciar() {
        velocidade = 0;
        marcha = 0;
    }
    public boolean ligar() {
        if (!ligado) {
            this.iniciar();
            ligado = true;
            System.out.println("\nCarro ligado.\n");
            return true;
        } else {
            System.out.println("\nO carro já está ligado.\n");
            return false;
        }
    }

    public boolean desligar() {
        if (!ligado) {
            System.out.println("\nO carro já está desligado.\n");
            return false;
        } else if (velocidade > 0) {
            System.out.println("\nNão é possível desligar o carro em movimento.\n");
            return false;
        } else if (marcha > 0) {
            System.out.println("\nNão é possível desligar o carro com a marcha engatada.\n");
            return false;
        }
        this.iniciar();
        ligado = false;
        System.out.println("\nCarro desligado.\n");
        return true;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public String getMarcha() {
        return (marcha == marchaMinima) ? "Ponto morto" : String.valueOf(marcha);
    }

    public void exibirVelocidade() {
        if (!ligado) {
            System.out.println("\nO carro está desligado, portanto a velocidade é 0 km/h.\n");
            return;
        } 
        System.out.println("\nVelocidade atual: " + velocidade + " km/h\n");
    }

    public void exibirMarcha() {
        System.out.println("\nMarcha atual: " + getMarcha() + "\n");
    }

    private int getVelocidadeMaximaMarcha() {
        switch (marcha) {
            case 1:
                return 20;
            case 2:
                return 40;
            case 3:
                return 60;
            case 4:
                return 80;
            case 5:
                return 100;
            case 6:
                return velocidadeMaxima;
            default:
                return 0;
        }
    }

    private int getVelocidadeMinimaMarcha() {
        switch (marcha) {
            case 1:
                return 0;
            case 2:
                return 21;
            case 3:
                return 41;
            case 4:
                return 61;
            case 5:
                return 81;
            case 6:
                return 101;
            default:
                return 0;
        }
    }

    public boolean acelerar(){
        int velocidadeFutura = velocidade + 1;
        if(!ligado){
            System.out.println("\nNão é possível acelerar o carro desligado.\n");
            return false;
        } else if (marcha == marchaMinima) {
            System.out.println("\nNão é possível acelerar com a marcha em ponto morto.\n");
            return false;
        } else if (velocidadeFutura > velocidadeMaxima) {
            System.out.println("\nVelocidade máxima atingida!\n");
            return false;
        } else if (velocidadeFutura > getVelocidadeMaximaMarcha()) {
            System.out.println("\nNão é possível acelerar além da velocidade máxima da marcha atual.\n");
            System.out.println("\nMude para a próxima marcha se quiser acelerar mais.\n");
            return false;
        }
        velocidade = velocidadeFutura; 
        System.out.println("\nVelocidade aumentada.\n");
        exibirVelocidade();
        return true;
    }

    public boolean diminuir(){
        int velocidadeFutura = velocidade - 1;
        if(!ligado){
            System.out.println("\nNão é possível diminuir velocidade com o carro desligado.\n");
            return false;
        } else if (marcha == marchaMinima) {
            System.out.println("\nNão é possível diminuir velocidade com a marcha em ponto morto.\n");
            return false;
        } else if (velocidadeFutura < velocidadeMinima) {
            System.out.println("\nVelocidade mínima atingida!\n");
            return false;
        } else if (velocidadeFutura < getVelocidadeMinimaMarcha()) {
            System.out.println("\nNão é possível diminuir velocidade além da velocidade mínima da marcha atual.\n");
            System.out.println("\nMude para a marcha anterior se quiser continuar diminuindo a velocidade.\n");
            return false;
        }
        velocidade = velocidadeFutura;
        System.out.println("\nVelocidade reduzida.\n");
        exibirVelocidade();
        return true;
    }

    private boolean virar(String direcao) {
        if (!ligado) {
            System.out.println("\nNão é possível virar com o carro desligado.\n");
            return false;
        } else if (marcha == marchaMinima) {
            System.out.println("\nNão é possível virar o carro com a marcha em ponto morto.\n");
            return false;
        } else if (!(velocidade >= velocidadeMinimaVirar && velocidade <= velocidadeMaximaVirar)) {
            System.out.println("\nSó é possível virar com o carro com velocidade entre " + velocidadeMinimaVirar + "km e " + velocidadeMaximaVirar + "km.\n");
            return false;
        }
        System.out.println("\nVirando para a "+direcao+".\n");
        return true;
    }
    public boolean virarParaDireita() {
        return virar("direita");
    }
    public boolean virarParaEsquerda() {
        return virar("esquerda");
    }

    public boolean proximaMarcha() {
        if (!ligado) {
            System.out.println("\nNão é possível trocar de marcha com o carro desligado.\n");
            return false;
        } else if (marcha == marchaMaxima) {
            System.out.println("\nNão é possível trocar para a próxima marcha, pois já está na marcha máxima.\n");
            return false;
        } else if (velocidade < getVelocidadeMaximaMarcha() && marcha != marchaMinima) {
            System.out.println("\nNão é possível trocar para a próxima marcha, pois a velocidade atual é menor que a velocidade máxima da marcha atual.\n");
            return false;
        }
        if(!(marcha == marchaMinima)) velocidade++;
        marcha++;
        exibirMarcha();
        System.out.println("\nMarcha trocada para: " + getMarcha() + "\n");
        exibirVelocidade();
        return true;
    }

    public boolean reduzirMarcha() {
        if (!ligado) {
            System.out.println("\nNão é possível trocar de marcha com o carro desligado.\n");
            return false;
        } else if (marcha == marchaMinima) {
            System.out.println("\nNão é possível reduzir a marcha, pois já está na marcha mínima.\n");
            return false;
        } else if (velocidade > getVelocidadeMinimaMarcha()) {
            System.out.println("\nNão é possível reduzir a marcha, pois a velocidade atual é maior que a velocidade mínima da marcha atual.\n");
            return false;
        }
        if(!(marcha == 1)) velocidade--;
        marcha--;
        exibirMarcha();
        System.out.println("\nMarcha reduzida para: " + getMarcha() + "\n");
        exibirVelocidade();
        return true;
    }

    public boolean acelerarAteLimiteMarcha() {
        if (!ligado) {
            System.out.println("\nNão é possível acelerar com o carro desligado.\n");
            return false;
        } else if (marcha == marchaMinima) {
            System.out.println("\nNão é possível acelerar com a marcha em ponto morto.\n");
            return false;
        }
        while (acelerar()) {
        }
        System.out.println("\nVelocidade aumentada até o limite da marcha atual.\n");
        exibirVelocidade();
        return true;
    }

    public boolean diminuirAteLimiteMarcha() {
        if (!ligado) {
            System.out.println("\nNão é possível diminuir velocidade com o carro desligado.\n");
            return false;
        } else if (marcha == marchaMinima) {
            System.out.println("\nNão é possível diminuir velocidade com a marcha em ponto morto.\n");
            return false;
        }
        while (diminuir()) {
        }
        System.out.println("\nVelocidade reduzida até o limite da marcha atual.\n");
        exibirVelocidade();
        return true;
    }
}