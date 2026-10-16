package exercicios.e3.q3;

import java.util.Optional;

public class MaquinaBanho {
    private final int maximoAgua = 30;
    private final int maximoShampoo = 10;
    private final int consumoBanhoAgua = 10;
    private final int consumoBanhoShampoo = 2;
    private final int consumoLimpezaAgua = 3;
    private final int consumoLimpezaShampoo = 1;
    private final int minimoAgua = 0;
    private final int minimoShampoo = 0;
    private boolean limpa = true;
    private int agua = 0;
    private int shampoo = 0;
    private Pet pet = null;

    
    private Boolean isLimpa(){
        return this.limpa;
    }
    private Boolean isSuja(){
        return ! this.limpa;
    }

    public boolean verificarPet(){
        if(this.pet != null){
            System.out.println("\n A máquina não tem pet dentro.\n");
            return false;
        }
        System.out.printf("\n %s está dentro da máquina.\n", this.pet.getNome());
        return true;
    }

    public void verificarAgua(){
        System.out.printf("\n Água disponível: %s l \n", this.agua);
        if (this.agua < this.consumoBanhoAgua) System.out.printf("\n Consumo de Água por banho: %s l \n", this.consumoBanhoAgua);
        if (this.agua < this.consumoLimpezaAgua) System.out.printf("\n Consumo de Água por limpeza: %s l \n", this.consumoBanhoAgua);
    }

    public void verificarShampoo(){
        System.out.printf("\n Shampoo disponível: %s l \n", this.shampoo);
        if (this.shampoo < this.consumoBanhoShampoo) System.out.printf("\n Consumo de Shampoo por banho: %s l \n", this.consumoBanhoShampoo);
        if (this.shampoo < this.consumoLimpezaShampoo) System.out.printf("\n Consumo de Shampoo por limpeza: %s l \n", this.consumoBanhoShampoo);
    }


    public boolean colocarPet(String nomePet){
        if(this.verificarPet()){
            System.out.println("\n Não é possível colocar pet na máquina, pois a máquina já tem um pet.\n");
            return false;
        } else if(isSuja()){
            System.out.println("\n Não é possível colocar pet na máquina, pois a máquina está suja.\n");
            return false;
        } else 
        this.pet = new Pet(nomePet);
        this.verificarPet();
        return true;
    }

    public boolean retirarPet(){
        if(!this.verificarPet()){
            System.out.println("\n Não é possível retirar pet da máquina, A máquina não tem um pet.\n");
            verificarAgua();
            return false;
        }
        if(this.pet.isSujo()){
            this.limpa = false;
            System.out.printf("\n %s está sendo retirado ainda sujo, a máquina ficou suja.\n", this.pet.getNome());
        }
        String nomePet = this.pet.getNome();
        this.pet = null;
        System.out.printf("\n %s foi retirado da máquina.\n", nomePet);
        this.verificarPet();
        return true;
    }

    public boolean darBanho (){
        if(!this.verificarPet()){
            System.out.println("\n Não é possível dar banho no pet, A máquina não tem um pet.\n");
            verificarAgua();
            return false;
        } else if(this.pet.isLimpo()){
            System.out.printf("\n Não é possível dar banho no pet, %s já está limpo.\n",this.pet.getNome());
            return false;
        } else if(this.agua < consumoBanhoAgua){
            System.out.println("\n Não é possível dar banho no pet, Não tem água suficiente para o banho .\n");
            verificarAgua();
            return false;
        } else if(this.shampoo < consumoBanhoShampoo){
            System.out.println("\n Não é possível dar banho no pet, Não tem shampoo suficiente para o banho .\n");
            verificarShampoo();
            return false;
        }
        this.agua -= this.consumoBanhoAgua;
        this.shampoo -= this.consumoBanhoShampoo;
        this.pet.setLimpo(true);
        System.out.printf("\nBanho concluído, %s está limpo.\n",this.pet.getNome());
        verificarAgua();
        verificarShampoo();
        return true;
    }

    public boolean limparMaquina(){
        if(this.verificarPet()){
            System.out.println("\n Não é possível limpar a máquina, pois a máquina tem um pet.\n");
            return false;
        } else if(this.isLimpa()){
            System.out.println("\n Não é possível limpar a máquina, pois a máquina já está limpa.\n");
            return false;
        } else if(this.agua < consumoLimpezaAgua){
            System.out.println("\n Não é possível limpar a máquina, Não tem água suficiente para a limpeza.\n");
            verificarAgua();
            return false;
        } else if(this.shampoo < consumoLimpezaShampoo){
            System.out.println("\n Não é possível limpar a máquina, Não tem shampoo suficiente para a limpeza.\n");
            verificarShampoo();
            return false;
        }
        this.agua -= this.consumoLimpezaAgua;
        this.shampoo -= this.consumoLimpezaShampoo;
        this.limpa = true;
        System.out.println("\n Limpeza da máquina concluída.\n");
        verificarAgua();
        verificarShampoo();
        return true;
    }

    public boolean abastecerAgua(){
        int litrosAbastecer = 2;
        int faltando = this.maximoAgua - this.agua;
        if(faltando == 0){
            System.out.println("\n Não é possível abastecer água, o nível de água já está no máximo.\n");
            return false;
        }
        if( faltando < litrosAbastecer) litrosAbastecer = faltando;
        this.agua += litrosAbastecer;
        System.out.printf("\n Água abastecida: %s l \n", litrosAbastecer);
        this.verificarAgua();
        return true;
    }

    public boolean abastecerShampoo(){
        int litrosAbastecer = 2;
        int faltando = this.maximoShampoo - this.shampoo;
        if(faltando == 0){
            System.out.println("\n Não é possível abastecer shampoo, o nível de shampoo já está no máximo.\n");
            return false;
        }
        if( faltando < litrosAbastecer) litrosAbastecer = faltando;
        this.shampoo += litrosAbastecer;
        System.out.printf("\n Shampoo abastecida: %s l \n", litrosAbastecer);
        this.verificarShampoo();
        return true;
    }

}
