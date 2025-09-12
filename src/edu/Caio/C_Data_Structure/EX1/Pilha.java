package edu.Caio.C_Data_Structure.EX1;

public class Pilha {


    private No refNoEntrada;

    public Pilha(){
        this.refNoEntrada = null;
    }

    public void push(No novoNo){
        No refAux = refNoEntrada;
        refNoEntrada = novoNo;
        refNoEntrada.setRefNo(refAux);
    }

    public No top(){
        return refNoEntrada;
    }
    public No pop(){
        if(!this.isEmpty()){
            No noPoped = refNoEntrada;
            refNoEntrada = refNoEntrada.getRefNo();
        }

        return null;
    }

    public boolean isEmpty(){
        if(refNoEntrada == null){
            return true;
        }else{
            return false;
        }

    }

    @Override
    public String toString() {
        String stringReturn = "---------------------------\n";
        stringReturn +=  "        pilha\n";
        stringReturn += "---------------------------\n";

        No noAuxiliar = refNoEntrada;

        while(true){
            if(noAuxiliar != null){
                stringReturn += "NO[dado = " +  noAuxiliar.getDado() + "}]\n";
                noAuxiliar = noAuxiliar.getRefNo();
            }else{
                break;
            }
        }

        stringReturn += "---------------------------\n";
        return stringReturn;
    }
}
