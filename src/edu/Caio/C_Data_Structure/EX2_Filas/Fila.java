package edu.Caio.C_Data_Structure.EX2_Filas;

public class Fila {
    private No refEntradaFila1;

    public Fila(){
        this.refEntradaFila1 = null;
    }

    public boolean vazio(){
        return refEntradaFila1 == null? true: false;
    }


    public void enqueue(No novoNo){
        novoNo.setRefNo(refEntradaFila1);
        refEntradaFila1 = novoNo;
    }

    public No first(){
        if(!this.vazio()){
            No primeiroNO = refEntradaFila1;

            while(true){
                if(primeiroNO.getRefNo() != null){
                    primeiroNO = primeiroNO.getRefNo();
                }else{
                    break;
                }
            }

            return primeiroNO;

        }

        return null;
    }

    public No dequeue(){
        if(!this.vazio()){
            No primeiroNo = refEntradaFila1;
            No noAux = refEntradaFila1;

            while(true){
                if(primeiroNo.getRefNo() != null){
                    noAux = primeiroNo;
                    primeiroNo = primeiroNo.getRefNo();
                }else{
                    noAux.setRefNo(null);
                    break;
                }
            }

            return primeiroNo;
        }

        return null;
    }

    @Override
    public String toString() {
        String stringRetornoi = "";
        No noAuxiliar = refEntradaFila1;
        if(refEntradaFila1 != null){
            while(true){
                stringRetornoi +="[No{objeto="+ noAuxiliar.getObject() +"}]--->";
                if(noAuxiliar.getRefNo() != null){
                    noAuxiliar = noAuxiliar.getRefNo();
                }else{
                    stringRetornoi += "null";
                    break;
                }
            }
        }else{
            stringRetornoi = "null";
        }

        return stringRetornoi;

    }


}
